package com.chartbeat.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class ChartbeatServiceHandler extends Handler {
    private static final String KEY_LAST_USED_ACCOUNT_ID = "KEY_LAST_USED_ACCOUNT_ID";
    private static final String KEY_LAST_USED_DOMAIN = "KEY_LAST_USED_DOMAIN";
    private static final String TAG = "ChartbeatServiceHandler";
    private static ChartBeatTracker singleton;
    private static String userAgent;
    private WeakReference<Context> context;

    public ChartbeatServiceHandler(WeakReference<Context> weakReference, Looper looper, String str) {
        super(looper);
        this.context = weakReference;
        userAgent = str;
    }

    private void cacheSDKDetailForReinit(String str, String str2) {
        SharedPreferences.Editor edit = this.context.get().getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0).edit();
        edit.putString(KEY_LAST_USED_ACCOUNT_ID, str);
        edit.putString(KEY_LAST_USED_DOMAIN, str2);
        edit.commit();
    }

    private void clearCachedSDKDetail() {
        SharedPreferences.Editor edit = this.context.get().getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0).edit();
        edit.putString(KEY_LAST_USED_ACCOUNT_ID, null);
        edit.putString(KEY_LAST_USED_DOMAIN, null);
        edit.commit();
    }

    private void handleMessageType(String str, Bundle bundle) {
        char c;
        try {
            if (!isSDKInitialized()) {
                Logger.e(TAG, "Chartbeat SDK has not been initialized");
            }
            switch (str.hashCode()) {
                case -2128400538:
                    if (str.equals("ACTION_PAUSE_TRACKER")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -2019069730:
                    if (str.equals("ACTION_SET_SUBDOMAIN")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1746009579:
                    if (str.equals("ACTION_SET_SUBSCRIPTION_STATE")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1450505808:
                    if (str.equals("ACTION_BACKGROUND_TRACKER")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398643729:
                    if (str.equals("ACTION_SET_POSITION")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1198511884:
                    if (str.equals("ACTION_SET_SECTIONS")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -607507904:
                    if (str.equals("ACTION_USER_INTERACTED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -305577087:
                    if (str.equals("ACTION_RESTART_PING_SERVICE")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -166421238:
                    if (str.equals("ACTION_SET_DOMAIN")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -3507486:
                    if (str.equals("ACTION_TRACK_VIEW")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 219850564:
                    if (str.equals("ACTION_STOP_TRACKER")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 946819234:
                    if (str.equals("ACTION_SET_AUTHORS")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1532156003:
                    if (str.equals("ACTION_SET_APP_REFERRER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1594548500:
                    if (str.equals("ACTION_LEFT_VIEW")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1658972287:
                    if (str.equals("ACTION_USER_TYPED")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1677518113:
                    if (str.equals("ACTION_SET_ZONES")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2024650596:
                    if (str.equals("ACTION_SET_VIEW_LOADING_TIME")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    setAppReferrer(bundle);
                    break;
                case 1:
                    stopTracker();
                    break;
                case 2:
                    trackView(bundle);
                    break;
                case 3:
                    userLeftView(bundle);
                    break;
                case 4:
                    userInteracted();
                    break;
                case 5:
                    userTyped();
                    break;
                case 6:
                    setSubdomain(bundle);
                    break;
                case 7:
                    setDomain(bundle);
                    break;
                case '\b':
                    setZones(bundle);
                    break;
                case '\t':
                    setAuthors(bundle);
                    break;
                case '\n':
                    setSubscriptionState(bundle);
                    break;
                case 11:
                    setSections(bundle);
                    break;
                case '\f':
                    setViewLoadTime(bundle);
                    break;
                case '\r':
                    setPosition(bundle);
                    break;
                case 14:
                    pauseTracker();
                    break;
                case 15:
                    singleton.restartPinger();
                    break;
                case 16:
                    backgroundTracker();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleSDKInit(Bundle bundle) {
        if (isSDKInitialized()) {
            return;
        }
        String string = bundle.getString("KEY_ACCOUNT_ID");
        String string2 = bundle.getString("KEY_DOMAIN");
        initSDK(string, string2);
        cacheSDKDetailForReinit(string, string2);
    }

    private void initSDK(String str, String str2) {
        try {
            singleton = new ChartBeatTracker(this.context, str, str2, userAgent, getLooper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isSDKInitialized() {
        ChartBeatTracker chartBeatTracker = singleton;
        return (chartBeatTracker == null || chartBeatTracker.isClientPaused().booleanValue()) ? false : true;
    }

    private void processMessage(Bundle bundle) {
        try {
            String string = bundle.getString("KEY_SDK_ACTION_TYPE");
            if (string.equals("ACTION_INIT_TRACKER")) {
                handleSDKInit(bundle);
            }
            if (!isSDKInitialized()) {
                reInitSDKFromBackground();
            }
            handleMessageType(string, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reInitSDKFromBackground() {
        try {
            SharedPreferences sharedPreferences = this.context.get().getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0);
            String string = sharedPreferences.getString(KEY_LAST_USED_ACCOUNT_ID, null);
            if (string != null) {
                initSDK(string, sharedPreferences.getString(KEY_LAST_USED_DOMAIN, null));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setAuthors(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updateAuthors(bundle.getString("KEY_AUTHORS"));
            }
        }
    }

    public static void setDomain(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updateDomain(bundle.getString("KEY_DOMAIN"));
            }
        }
    }

    public static void setPosition(Bundle bundle) {
        if (!isSDKInitialized()) {
            Logger.e(TAG, "Chartbeat SDK has not been initialized");
            return;
        }
        singleton.updateViewDimensions(bundle.getInt("KEY_POSITION_TOP", -1), bundle.getInt("KEY_WINDOW_HEIGHT", -1), bundle.getInt("KEY_CONTENT_HEIGHT", -1), bundle.getInt("KEY_DOC_WIDTH", -1));
    }

    public static void setSections(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updateSections(bundle.getString("KEY_SECTIONS"));
            }
        }
    }

    public static void setSubdomain(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updateSubdomain(bundle.getString("KEY_SUBDOMAIN"));
            }
        }
    }

    public static void setSubscriptionState(Bundle bundle) {
        if (isSDKInitialized()) {
            singleton.updateSubscriptionState((SubscriptionState) bundle.get("KEY_SUBSCRIPTION_STATE"));
        }
    }

    public static void setViewLoadTime(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updatePageLoadingTime(bundle.getFloat("KEY_VIEW_LOADING_TIME", 0.0f));
            }
        }
    }

    public static void setZones(Bundle bundle) {
        if (isSDKInitialized()) {
            if (singleton.isNotTrackingAnyView()) {
                Logger.e(TAG, "View tracking hasn't started, please call Tracker.trackView() first");
            } else {
                singleton.updateZones(bundle.getString("KEY_ZONES"));
            }
        }
    }

    public static void userInteracted() {
        if (isSDKInitialized()) {
            singleton.userInteractedImpl();
        }
    }

    public static void userLeftView(Bundle bundle) {
        if (isSDKInitialized()) {
            singleton.userLeftViewImpl(bundle.getString("KEY_VIEW_ID"));
        }
    }

    public static void userTyped() {
        if (isSDKInitialized()) {
            singleton.userTypedImpl();
        }
    }

    public void backgroundTracker() {
        if (isSDKInitialized()) {
            singleton.backgroundTracker();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            processMessage(message.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pauseTracker() {
        if (isSDKInitialized()) {
            singleton.stopTracker();
        }
    }

    public void setAppReferrer(Bundle bundle) {
        if (isSDKInitialized()) {
            singleton.setExternalReferrer(bundle.getString("KEY_APP_REFERRER"));
        }
    }

    public void stopTracker() {
        if (isSDKInitialized()) {
            singleton.stopTracker();
            clearCachedSDKDetail();
            singleton = null;
        }
    }

    public void trackView(Bundle bundle) {
        if (isSDKInitialized()) {
            singleton.trackViewImpl(bundle.getString("KEY_VIEW_ID"), bundle.getString("KEY_VIEW_TITLE"), bundle.getInt("KEY_POSITION_TOP", -1), bundle.getInt("KEY_WINDOW_HEIGHT", -1), bundle.getInt("KEY_CONTENT_HEIGHT", -1), bundle.getInt("KEY_DOC_WIDTH", -1));
        }
    }
}
