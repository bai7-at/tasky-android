package com.chartbeat.androidsdk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.chartbeat.androidsdk.ForegroundTracker;
import defpackage.gb8;
import defpackage.jc5;
import defpackage.mb7;
import defpackage.wa8;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Tracker {
    static final String ACTION_BACKGROUND_TRACKER = "ACTION_BACKGROUND_TRACKER";
    static final String ACTION_INIT_TRACKER = "ACTION_INIT_TRACKER";
    static final String ACTION_LEFT_VIEW = "ACTION_LEFT_VIEW";
    static final String ACTION_PAUSE_TRACKER = "ACTION_PAUSE_TRACKER";
    static final String ACTION_RESTART_PING_SERVICE = "ACTION_RESTART_PING_SERVICE";
    static final String ACTION_SET_APP_REFERRER = "ACTION_SET_APP_REFERRER";
    static final String ACTION_SET_AUTHORS = "ACTION_SET_AUTHORS";
    static final String ACTION_SET_DOMAIN = "ACTION_SET_DOMAIN";
    static final String ACTION_SET_POSITION = "ACTION_SET_POSITION";
    static final String ACTION_SET_SECTIONS = "ACTION_SET_SECTIONS";
    static final String ACTION_SET_SUBDOMAIN = "ACTION_SET_SUBDOMAIN";
    static final String ACTION_SET_SUBSCRIPTION_STATE = "ACTION_SET_SUBSCRIPTION_STATE";
    static final String ACTION_SET_VIEW_LOADING_TIME = "ACTION_SET_VIEW_LOADING_TIME";
    static final String ACTION_SET_ZONES = "ACTION_SET_ZONES";
    static final String ACTION_STOP_TRACKER = "ACTION_STOP_TRACKER";
    static final String ACTION_TRACK_VIEW = "ACTION_TRACK_VIEW";
    static final String ACTION_USER_INTERACTED = "ACTION_USER_INTERACTED";
    static final String ACTION_USER_TYPED = "ACTION_USER_TYPED";
    private static final int BACKGROUND_IDLE_WAIT_LIMIT_MS = 4000;
    public static boolean DEBUG_MODE = false;
    static final String KEY_ACCOUNT_ID = "KEY_ACCOUNT_ID";
    static final String KEY_APP_REFERRER = "KEY_APP_REFERRER";
    static final String KEY_AUTHORS = "KEY_AUTHORS";
    static final String KEY_CONTENT_HEIGHT = "KEY_CONTENT_HEIGHT";
    static final String KEY_DOC_WIDTH = "KEY_DOC_WIDTH";
    static final String KEY_DOMAIN = "KEY_DOMAIN";
    static final String KEY_POSITION_TOP = "KEY_POSITION_TOP";
    static final String KEY_SDK_ACTION_TYPE = "KEY_SDK_ACTION_TYPE";
    static final String KEY_SECTIONS = "KEY_SECTIONS";
    static final String KEY_SUBDOMAIN = "KEY_SUBDOMAIN";
    static final String KEY_SUBSCRIPTION_STATE = "KEY_SUBSCRIPTION_STATE";
    static final String KEY_VIEW_ID = "KEY_VIEW_ID";
    static final String KEY_VIEW_LOADING_TIME = "KEY_VIEW_LOADING_TIME";
    static final String KEY_VIEW_TITLE = "KEY_VIEW_TITLE";
    static final String KEY_WINDOW_HEIGHT = "KEY_WINDOW_HEIGHT";
    static final String KEY_ZONES = "KEY_ZONES";
    private static final String TAG = "ChartBeat Tracker";
    private static final int USER_INTERACT_WINDOW_IN_MILLISECONDS = 500;
    private static String accountID;
    private static Context appContext;
    private static gb8 appIdleSubscription;
    private static String domain;
    private static gb8 userInteractSubscription;

    public static void backgroundTracker() {
        if (appContext == null) {
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
        intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_BACKGROUND_TRACKER);
        sendServiceSignal(intent);
    }

    public static void didInit() {
        if (appContext == null && TextUtils.isEmpty(accountID)) {
            throw new IllegalStateException("Chartbeat: SDK has not been initialized with an Account ID");
        }
    }

    public static void didStartTracking() {
        if (appContext == null) {
            throw new IllegalStateException("Chartbeat: View tracking hasn't started, please call Tracker.trackView() in onResume() first");
        }
    }

    private static void monitorAppStatus() {
        try {
            ForegroundTracker.init((Application) appContext);
            ForegroundTracker.get(appContext).addListener(new ForegroundTracker.Listener() { // from class: com.chartbeat.androidsdk.Tracker.1
                @Override // com.chartbeat.androidsdk.ForegroundTracker.Listener
                public void onBackgrounded() {
                    if (Tracker.appIdleSubscription == null || Tracker.appIdleSubscription.isUnsubscribed()) {
                        gb8 unused = Tracker.appIdleSubscription = jc5.q(4000L, TimeUnit.MILLISECONDS).n(new wa8() { // from class: com.chartbeat.androidsdk.Tracker.1.1
                            @Override // defpackage.uc5
                            public void onCompleted() {
                            }

                            @Override // defpackage.uc5
                            public void onError(Throwable th) {
                            }

                            @Override // defpackage.uc5
                            public void onNext(Long l) {
                                Tracker.backgroundTracker();
                            }
                        });
                    }
                }

                @Override // com.chartbeat.androidsdk.ForegroundTracker.Listener
                public void onForegrounded() {
                    Tracker.restartPingService(Tracker.appContext);
                    if (Tracker.appIdleSubscription == null || Tracker.appIdleSubscription.isUnsubscribed()) {
                        return;
                    }
                    Tracker.appIdleSubscription.unsubscribe();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pauseTracker() {
        if (appContext == null) {
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
        intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_PAUSE_TRACKER);
        sendServiceSignal(intent);
    }

    private static void resetUserInteractionMonitor() {
        gb8 gb8Var = userInteractSubscription;
        if (gb8Var == null || gb8Var.isUnsubscribed()) {
            return;
        }
        userInteractSubscription.unsubscribe();
    }

    public static void restartPingService(Context context) {
        try {
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_RESTART_PING_SERVICE);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendServiceSignal(Intent intent) {
        try {
            appContext.startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setAppReferrer(String str) {
        didInit();
        Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
        intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_APP_REFERRER);
        intent.putExtra(KEY_APP_REFERRER, str);
        sendServiceSignal(intent);
    }

    public static void setAuthors(String str) {
        try {
            didInit();
            didStartTracking();
            setAuthorsImpl(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setAuthorsImpl(String str) {
        try {
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_AUTHORS);
            intent.putExtra(KEY_AUTHORS, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDomain(String str) {
        try {
            didInit();
            didStartTracking();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_DOMAIN);
            intent.putExtra(KEY_DOMAIN, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setPosition(int i, int i2, int i3, int i4) {
        try {
            didInit();
            didStartTracking();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_POSITION);
            intent.putExtra(KEY_POSITION_TOP, i);
            intent.putExtra(KEY_WINDOW_HEIGHT, i2);
            intent.putExtra(KEY_CONTENT_HEIGHT, i3);
            intent.putExtra(KEY_DOC_WIDTH, i4);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setPushReferrer(String str) {
        setAppReferrer("push/?id=" + Uri.encode(str));
    }

    public static void setSections(String str) {
        try {
            didInit();
            didStartTracking();
            setSectionsImpl(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setSectionsImpl(String str) {
        try {
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_SECTIONS);
            intent.putExtra(KEY_SECTIONS, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setSubdomain(String str) {
        try {
            didInit();
            didStartTracking();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_SUBDOMAIN);
            intent.putExtra(KEY_SUBDOMAIN, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setUserAnonymous() {
        setUserSubscriptionImpl(SubscriptionState.ANONYMOUS);
    }

    public static void setUserLoggedIn() {
        setUserSubscriptionImpl(SubscriptionState.LOGGED_IN);
    }

    public static void setUserPaid() {
        setUserSubscriptionImpl(SubscriptionState.PAID);
    }

    private static void setUserSubscriptionImpl(SubscriptionState subscriptionState) {
        try {
            didInit();
            didStartTracking();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_SUBSCRIPTION_STATE);
            intent.putExtra(KEY_SUBSCRIPTION_STATE, subscriptionState);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setViewLoadTime(float f) {
        try {
            didInit();
            didStartTracking();
            if (f < 0.0f) {
                Logger.e(TAG, "Page load time cannot be negative");
                return;
            }
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_VIEW_LOADING_TIME);
            intent.putExtra(KEY_VIEW_LOADING_TIME, f);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setZones(String str) {
        try {
            didInit();
            didStartTracking();
            setZonesImpl(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setZonesImpl(String str) {
        try {
            didInit();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_SET_ZONES);
            intent.putExtra(KEY_ZONES, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setupTracker(String str, String str2, Context context) {
        if (str == null) {
            throw new NullPointerException("accountId cannot be null");
        }
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        if (!(context instanceof Application)) {
            throw new IllegalArgumentException("Application level context is required to initialize Chartbeat Android SDK");
        }
        AwsLogger.initInstance(context, str, str2);
        startSDK(str, str2, context);
    }

    private static void startSDK(String str, String str2, Context context) {
        try {
            appContext = context.getApplicationContext();
            monitorAppStatus();
            accountID = str;
            domain = str2;
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_INIT_TRACKER);
            intent.putExtra(KEY_ACCOUNT_ID, str);
            if (str2 != null) {
                intent.putExtra(KEY_DOMAIN, str2);
            }
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void startUserInteractTimer() {
        try {
            gb8 gb8Var = userInteractSubscription;
            if (gb8Var == null || gb8Var.isUnsubscribed()) {
                Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
                intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_USER_INTERACTED);
                sendServiceSignal(intent);
                userInteractSubscription = jc5.q(500L, TimeUnit.MILLISECONDS).i(mb7.b()).n(new wa8() { // from class: com.chartbeat.androidsdk.Tracker.2
                    @Override // defpackage.uc5
                    public void onCompleted() {
                    }

                    @Override // defpackage.uc5
                    public void onError(Throwable th) {
                        Logger.e(Tracker.TAG, th.getMessage());
                    }

                    @Override // defpackage.uc5
                    public void onNext(Long l) {
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopTracker() {
        if (appContext == null) {
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
        intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_STOP_TRACKER);
        sendServiceSignal(intent);
    }

    public static void trackView(Context context, String str, String str2) {
        try {
            didInit();
            if (context == null) {
                throw new NullPointerException("context cannot be null");
            }
            if (str == null) {
                throw new NullPointerException("viewId cannot be null");
            }
            resetUserInteractionMonitor();
            if (str2 == null) {
                str2 = str;
            }
            appContext = context.getApplicationContext();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_TRACK_VIEW);
            intent.putExtra(KEY_VIEW_ID, str);
            intent.putExtra(KEY_VIEW_TITLE, str2);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void userInteracted() {
        try {
            didInit();
            didStartTracking();
            startUserInteractTimer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void userLeftView(String str) {
        try {
            didInit();
            didStartTracking();
            if (str == null) {
                throw new NullPointerException("viewId cannot be null");
            }
            resetUserInteractionMonitor();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_LEFT_VIEW);
            intent.putExtra(KEY_VIEW_ID, str);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void userTyped() {
        try {
            didInit();
            didStartTracking();
            Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
            intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_USER_TYPED);
            sendServiceSignal(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setAuthors(Collection<String> collection) {
        try {
            didInit();
            didStartTracking();
            setAuthorsImpl(StringUtils.collectionToCommaString(collection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setSections(Collection<String> collection) {
        try {
            didInit();
            didStartTracking();
            setSectionsImpl(StringUtils.collectionToCommaString(collection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setZones(Collection<String> collection) {
        try {
            didInit();
            didStartTracking();
            setZonesImpl(StringUtils.collectionToCommaString(collection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void trackView(Context context, String str, String str2, int i, int i2, int i3, int i4) {
        try {
            didInit();
            if (context == null) {
                throw new NullPointerException("context cannot be null");
            }
            if (str != null) {
                resetUserInteractionMonitor();
                if (TextUtils.isEmpty(str2)) {
                    str2 = str;
                }
                appContext = context.getApplicationContext();
                Intent intent = new Intent(appContext, (Class<?>) ChartbeatService.class);
                intent.putExtra(KEY_SDK_ACTION_TYPE, ACTION_TRACK_VIEW);
                intent.putExtra(KEY_VIEW_ID, str);
                intent.putExtra(KEY_VIEW_TITLE, str2);
                intent.putExtra(KEY_POSITION_TOP, i);
                intent.putExtra(KEY_WINDOW_HEIGHT, i2);
                intent.putExtra(KEY_CONTENT_HEIGHT, i3);
                intent.putExtra(KEY_DOC_WIDTH, i4);
                sendServiceSignal(intent);
                return;
            }
            throw new NullPointerException("viewId cannot be null");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
