package com.chartbeat.androidsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.chartbeat.androidsdk.EngagementTracker;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.uc5;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class ChartBeatTracker {
    public static final String CHARTBEAT_PREFS = "com.chartbeat.androidsdk.user";
    private static final long MILLISECONDS_IN_ONE_SECOND = 1000;
    private static final int PING_ENDPOINT_VERSION = 1;
    private static final int SESSION_TOKEN_LENGTH = 30;
    public static final boolean SIMULATE_VERY_SLOW_SERVER = false;
    private static final String TAG = "ChartBeatTracker";
    private static boolean firstPing = true;
    private static Handler handler;
    private static PingService pingService;
    private final AppInfo appInfo;
    private final WeakReference<Context> context;
    private ViewTracker currentViewTracker;
    private final EngagementTracker engagementTracker;
    private String externalReferrer;
    private final PingManager pingManager;
    private PingParams pingParams;
    private String previousToken;
    private int sequentialErrors;
    private final SiteVisitTracker siteVisitTracker;
    private final UserInfo userInfo;
    private boolean isClientPaused = false;
    private long lastSuccessfulPingTime = 0;
    private long lastDecayTime = 0;

    ChartBeatTracker(WeakReference<Context> weakReference, String str, String str2, String str3, Looper looper) {
        this.context = weakReference;
        if (handler == null) {
            handler = new Handler(looper);
        }
        pingService = new PingService(str3);
        AppInfo appInfo = new AppInfo(weakReference.get(), str, str2);
        this.appInfo = appInfo;
        this.userInfo = new UserInfo(weakReference.get());
        this.currentViewTracker = null;
        this.pingManager = new PingManager(this, looper);
        this.engagementTracker = new EngagementTracker();
        this.siteVisitTracker = new SiteVisitTracker(weakReference.get());
        this.pingParams = new PingParams();
        Logger.d(TAG, appInfo.toString());
    }

    private synchronized void addParameterIfRequired(LinkedHashMap<String, String> linkedHashMap, String str, String str2) {
        if (str != null && str2 != null) {
            addParameterIfRequired(linkedHashMap, this.pingParams, str, str2);
        }
    }

    private synchronized void addParametersIfRequired(LinkedHashMap<String, String> linkedHashMap, LinkedHashMap<String, String> linkedHashMap2) {
        for (String str : linkedHashMap2.keySet()) {
            addParameterIfRequired(linkedHashMap, str, linkedHashMap2.get(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePingError(String str, EngagementTracker.EngagementSnapshot engagementSnapshot) {
        this.pingParams.pingError();
        Logger.e(TAG, "Error pinging Chartbeat: " + str);
        this.engagementTracker.lastPingFailed(engagementSnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePingResponseCode(int i, EngagementTracker.EngagementSnapshot engagementSnapshot) {
        try {
            synchronized (this) {
                try {
                    if (handler.getLooper().getThread().isAlive()) {
                        try {
                            boolean isInBackground = ForegroundTracker.get().isInBackground();
                            this.pingParams.pingComplete(i);
                            if (i == 503) {
                                this.sequentialErrors++;
                            } else {
                                this.sequentialErrors = 0;
                            }
                            if (this.sequentialErrors == 3) {
                                this.sequentialErrors = 0;
                                this.pingParams.pingError();
                                this.pingManager.suspendDueToServerBusy();
                            }
                            this.pingManager.setInBackground(isInBackground);
                            if (i == 500 || i == 400 || i == 202) {
                                this.engagementTracker.lastPingFailed(engagementSnapshot);
                                this.pingManager.retryImmediately();
                            }
                            if (i == 200) {
                                this.lastSuccessfulPingTime = System.currentTimeMillis();
                                if (firstPing) {
                                    firstPing = false;
                                }
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void trackNewView(String str, String str2, int i, int i2, int i3, int i4) {
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            this.isClientPaused = false;
            String str7 = this.externalReferrer;
            if (str7 != null) {
                this.externalReferrer = null;
                str3 = str7;
            } else {
                str3 = null;
            }
            ViewTracker viewTracker = this.currentViewTracker;
            if (viewTracker != null) {
                String domain = viewTracker.getDomain();
                String subdomain = this.currentViewTracker.getSubdomain();
                String viewId = this.currentViewTracker.getViewId();
                this.previousToken = this.currentViewTracker.getToken();
                str5 = subdomain;
                str4 = domain;
                str6 = viewId;
            } else {
                str4 = null;
                str5 = null;
                str6 = null;
            }
            this.currentViewTracker = new ViewTracker(str, str2, str4, str5, str6, str3, SecurityUtils.randomChars(30), new ViewDimension(i, i2, i3, i4, i));
            this.pingParams.newView();
            Logger.d(TAG, this.appInfo.toString() + " :: TRACK VIEW :: " + str);
            this.pingParams.addOneTimeParameter(QueryKeys.FORCE_DECAY);
            this.pingParams.addOneTimeParameter(QueryKeys.SCROLL_POSITION_TOP);
            this.pingParams.addOneTimeParameter(QueryKeys.CONTENT_HEIGHT);
            this.pingParams.addOneTimeParameter(QueryKeys.SCROLL_WINDOW_HEIGHT);
            this.pingParams.addOneTimeParameter(QueryKeys.DOCUMENT_WIDTH);
            this.pingParams.addOneTimeParameter(QueryKeys.MAX_SCROLL_DEPTH);
            this.pingManager.restart();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void backgroundTracker() {
        this.pingManager.stop();
        this.engagementTracker.stop();
    }

    synchronized Boolean isClientPaused() {
        return Boolean.valueOf(this.isClientPaused);
    }

    synchronized boolean isNotTrackingAnyView() {
        return this.currentViewTracker == null;
    }

    void ping(boolean z, String str) {
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(30);
            synchronized (this) {
                try {
                    if (this.currentViewTracker == null) {
                        return;
                    }
                    if (z) {
                        this.pingParams.pingReset();
                    }
                    if (this.currentViewTracker.getDomain() != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.HOST, this.currentViewTracker.getDomain());
                    } else {
                        addParameterIfRequired(linkedHashMap, QueryKeys.HOST, this.appInfo.getDomain());
                    }
                    addParameterIfRequired(linkedHashMap, "p", this.currentViewTracker.getViewId());
                    addParameterIfRequired(linkedHashMap, QueryKeys.USER_ID, this.userInfo.getUserID());
                    if (this.currentViewTracker.getSubdomain() != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.SUBDOMAIN, this.currentViewTracker.getSubdomain());
                    } else {
                        addParameterIfRequired(linkedHashMap, QueryKeys.SUBDOMAIN, this.appInfo.getDomain());
                    }
                    addParameterIfRequired(linkedHashMap, QueryKeys.ACCOUNT_ID, this.appInfo.getAccountID());
                    if (this.userInfo.getSubscriptionState() != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.SUBSCRIPTION_INFO, this.userInfo.getSubscriptionState().toString());
                    }
                    addParametersIfRequired(linkedHashMap, this.currentViewTracker.getContentParams());
                    addParameterIfRequired(linkedHashMap, QueryKeys.IS_NEW_USER, this.userInfo.isNewUser() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                    addParameterIfRequired(linkedHashMap, QueryKeys.VISIT_FREQUENCY, this.userInfo.getUserVisitFrequencyString());
                    addParameterIfRequired(linkedHashMap, QueryKeys.TIME_ON_VIEW_IN_MINUTES, this.currentViewTracker.getMinutesInView());
                    addParametersIfRequired(linkedHashMap, this.currentViewTracker.getDimensionParams());
                    addParameterIfRequired(linkedHashMap, QueryKeys.DECAY, str);
                    final EngagementTracker.EngagementSnapshot engagementSnapshot = this.engagementTracker.getEngagementSnapshot();
                    linkedHashMap.put(QueryKeys.READING, engagementSnapshot.reading ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                    linkedHashMap.put(QueryKeys.WRITING, engagementSnapshot.typed ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                    linkedHashMap.put(QueryKeys.IDLING, engagementSnapshot.idle ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                    linkedHashMap.put(QueryKeys.ENGAGED_SECONDS, String.valueOf(engagementSnapshot.totalEngagement));
                    linkedHashMap.put(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, String.valueOf(engagementSnapshot.engagementSinceLastPing));
                    if (this.currentViewTracker.getInternalReferrer() != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.INTERNAL_REFERRER, this.currentViewTracker.getInternalReferrer());
                    }
                    if (this.currentViewTracker.getExternalReferrer() != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.EXTERNAL_REFERRER, this.currentViewTracker.getExternalReferrer());
                    }
                    if (this.currentViewTracker.getInternalReferrer() == null && this.currentViewTracker.getExternalReferrer() == null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.EXTERNAL_REFERRER, "");
                    }
                    addParameterIfRequired(linkedHashMap, QueryKeys.TOKEN, this.currentViewTracker.getToken());
                    addParameterIfRequired(linkedHashMap, QueryKeys.SDK_VERSION, this.appInfo.getSdkVersion());
                    String str2 = this.previousToken;
                    if (str2 != null) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.FORCE_DECAY, str2);
                    }
                    this.lastDecayTime = this.pingManager.expectedNextIntervalInSeconds() * 2 * MILLISECONDS_IN_ONE_SECOND;
                    addParameterIfRequired(linkedHashMap, QueryKeys.VIEW_TITLE, this.currentViewTracker.getViewTitle());
                    linkedHashMap.put(QueryKeys.TIME_ZONE, String.valueOf(-((TimeZone.getDefault().getOffset(new Date().getTime()) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) / 60)));
                    addParameterIfRequired(linkedHashMap, QueryKeys.SCREEN_WIDTH, this.appInfo.getDeviceScreenWidth());
                    addParameterIfRequired(linkedHashMap, QueryKeys.MEMFLY_API_VERSION, String.valueOf(1));
                    if (this.siteVisitTracker.getSiteVisitDepth() > 0) {
                        addParameterIfRequired(linkedHashMap, QueryKeys.SITE_VISIT_REFERRER, this.siteVisitTracker.getSiteVisitReferrer());
                        addParameterIfRequired(linkedHashMap, QueryKeys.SITE_VISIT_DEPTH, Integer.toString(this.siteVisitTracker.getSiteVisitDepth()));
                        addParameterIfRequired(linkedHashMap, QueryKeys.SITE_VISIT_UID, this.siteVisitTracker.getSiteVisitId());
                    }
                    linkedHashMap.put(QueryKeys.END_MARKER, "");
                    String str3 = TAG;
                    Logger.d(str3, "PING! User Data: " + linkedHashMap);
                    if (SystemUtils.isNetworkAvailable(this.context.get())) {
                        pingService.ping(linkedHashMap).m(new uc5() { // from class: com.chartbeat.androidsdk.ChartBeatTracker.1
                            @Override // defpackage.uc5
                            public void onCompleted() {
                            }

                            @Override // defpackage.uc5
                            public void onError(final Throwable th) {
                                if (ChartBeatTracker.handler.getLooper().getThread().isAlive()) {
                                    ChartBeatTracker.handler.post(new Runnable() { // from class: com.chartbeat.androidsdk.ChartBeatTracker.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ChartBeatTracker.this.handlePingError(th.getLocalizedMessage(), engagementSnapshot);
                                        }
                                    });
                                }
                            }

                            @Override // defpackage.uc5
                            public void onNext(final Integer num) {
                                if (ChartBeatTracker.handler.getLooper().getThread().isAlive()) {
                                    ChartBeatTracker.handler.post(new Runnable() { // from class: com.chartbeat.androidsdk.ChartBeatTracker.1.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ChartBeatTracker.this.handlePingResponseCode(num.intValue(), engagementSnapshot);
                                        }
                                    });
                                }
                            }
                        });
                        return;
                    }
                    synchronized (this) {
                        Logger.e(str3, "Not pinging: no network connection detected.");
                        this.pingParams.pingReset();
                        this.engagementTracker.lastPingFailed(engagementSnapshot);
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void restartPinger() {
        try {
            if (!this.isClientPaused) {
                this.pingManager.restart();
            }
            this.pingParams.pingReset();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void setExternalReferrer(String str) {
        try {
            this.externalReferrer = str;
            ViewTracker viewTracker = this.currentViewTracker;
            if (viewTracker != null) {
                viewTracker.updateExternalReferrer(str);
            }
            this.pingParams.addOneTimeParameter(QueryKeys.EXTERNAL_REFERRER);
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void stopTracker() {
        this.pingManager.stop();
        this.engagementTracker.stop();
        this.isClientPaused = true;
    }

    synchronized void trackViewImpl(String str, String str2, int i, int i2, int i3, int i4) {
        ViewTracker viewTracker;
        try {
            try {
                this.engagementTracker.userEnteredView();
                this.userInfo.visited();
                viewTracker = this.currentViewTracker;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (viewTracker != null && viewTracker.isSameView(str)) {
                if (this.isClientPaused) {
                    this.pingManager.restart();
                }
                this.isClientPaused = false;
                if (this.userInfo.isNewUser() && this.currentViewTracker.wasReferredFromAnotherView()) {
                    this.userInfo.markUserAsOld();
                }
                this.pingManager.alive();
            }
            trackNewView(str, str2, i, i2, i3, i4);
            this.siteVisitTracker.trackSiteVisit(this.currentViewTracker.getExternalReferrer());
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void updateAuthors(String str) {
        this.currentViewTracker.updateAuthors(str);
        this.pingParams.addOneTimeParameter(QueryKeys.AUTHOR_G1);
        this.pingManager.alive();
    }

    synchronized void updateDomain(String str) {
        this.currentViewTracker.updateDomain(str);
        this.pingManager.alive();
    }

    synchronized void updateExternalReferrer(String str) {
        this.currentViewTracker.updateExternalReferrer(str);
        this.pingManager.alive();
    }

    synchronized void updateInternalReferrer(String str) {
        this.currentViewTracker.updateInternalReferrer(str);
        this.pingManager.alive();
    }

    synchronized void updatePageLoadingTime(float f) {
        this.currentViewTracker.updatePageLoadingTime(f);
        this.pingManager.alive();
    }

    synchronized void updateSections(String str) {
        this.currentViewTracker.updateSections(str);
        this.pingParams.addOneTimeParameter(QueryKeys.SECTION_G0);
        this.pingManager.alive();
    }

    synchronized void updateSubdomain(String str) {
        this.currentViewTracker.updateSubdomain(str);
        this.pingManager.alive();
    }

    synchronized void updateSubscriptionState(SubscriptionState subscriptionState) {
        this.userInfo.setSubscriptionState(subscriptionState);
    }

    synchronized void updateViewDimensions(int i, int i2, int i3, int i4) {
        this.currentViewTracker.updateDimension(i, i2, i3, i4);
        this.pingParams.addOneTimeParameter(QueryKeys.SCROLL_POSITION_TOP);
        this.pingParams.addOneTimeParameter(QueryKeys.CONTENT_HEIGHT);
        this.pingParams.addOneTimeParameter(QueryKeys.SCROLL_WINDOW_HEIGHT);
        this.pingParams.addOneTimeParameter(QueryKeys.DOCUMENT_WIDTH);
        this.pingParams.addOneTimeParameter(QueryKeys.MAX_SCROLL_DEPTH);
        this.pingManager.alive();
    }

    synchronized void updateZones(String str) {
        this.currentViewTracker.updateZones(str);
        this.pingParams.addOneTimeParameter(QueryKeys.ZONE_G2);
        this.pingManager.alive();
    }

    synchronized void userInteractedImpl() {
        this.engagementTracker.userEngaged();
        this.userInfo.visited();
        this.pingManager.alive();
        Logger.d(TAG, this.appInfo.toString() + " :: USER INTERACTED");
    }

    synchronized void userLeftViewImpl(String str) {
        this.pingManager.setInBackground(true);
        this.engagementTracker.userLeftView();
        Logger.d(TAG, this.appInfo.toString() + " :: USER LEFT");
    }

    synchronized void userTypedImpl() {
        this.engagementTracker.userTyped();
        this.userInfo.visited();
        this.pingManager.alive();
        Logger.d(TAG, this.appInfo.toString() + " :: USER TYPED");
    }

    private synchronized void addParameterIfRequired(LinkedHashMap<String, String> linkedHashMap, PingParams pingParams, String str, String str2) {
        if (pingParams.includeParameter(str)) {
            linkedHashMap.put(str, str2);
        }
    }
}
