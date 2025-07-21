package io.embrace.android.embracesdk.prefs;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import defpackage.c04;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbracePreferencesService implements PreferencesService, ActivityLifecycleListener {
    private static final String AEI_HASH_CODES = "io.embrace.aeiHashCode";
    private static final String BACKGROUND_ACTIVITY_ENABLED_KEY = "io.embrace.bgactivitycapture";
    private static final String CPU_NAME_KEY = "io.embrace.cpuName";
    private static final String CUSTOM_PERSONAS_KEY = "io.embrace.custompersonas";
    public static final Companion Companion = new Companion(null);
    private static final String DART_SDK_VERSION_KEY = "io.embrace.dart.sdk.version";
    private static final String DEVICE_IDENTIFIER_KEY = "io.embrace.deviceid";
    private static final String EGL_KEY = "io.embrace.egl";
    private static final String EMBRACE_FLUTTER_SDK_VERSION_KEY = "io.embrace.flutter.sdk.version";
    private static final String INSTALL_DATE_KEY = "io.embrace.installtimestamp";
    private static final String IS_JAILBROKEN_KEY = "io.embrace.is_jailbroken";
    private static final String JAVA_SCRIPT_BUNDLE_ID_KEY = "io.embrace.jsbundle.id";
    private static final String JAVA_SCRIPT_BUNDLE_URL_KEY = "io.embrace.jsbundle.url";
    private static final String JAVA_SCRIPT_PATCH_NUMBER_KEY = "io.embrace.javascript.patch";
    private static final String LAST_BACKGROUND_ACTIVITY_NUMBER_KEY = "io.embrace.bgactivitynumber";
    private static final String LAST_CRASH_NUMBER_KEY = "io.embrace.crashnumber";
    private static final String LAST_NATIVE_CRASH_NUMBER_KEY = "io.embrace.nativecrashnumber";
    private static final String LAST_SESSION_NUMBER_KEY = "io.embrace.sessionnumber";
    private static final String LAST_USER_MESSAGE_FAILED_KEY = "io.embrace.userupdatefailed";
    private static final String NETWORK_CAPTURE_RULE_PREFIX_KEY = "io.embrace.networkcapturerule";
    private static final String PREVIOUS_APP_VERSION_KEY = "io.embrace.lastappversion";
    private static final String PREVIOUS_OS_VERSION_KEY = "io.embrace.lastosversion";
    private static final String REACT_NATIVE_SDK_VERSION_KEY = "io.embrace.reactnative.sdk.version";
    private static final String REACT_NATIVE_VERSION_KEY = "io.embrace.reactnative.version";
    private static final String SCREEN_RESOLUTION_KEY = "io.embrace.screen.resolution";
    private static final String SDK_CONFIG_FETCHED_TIMESTAMP = "io.embrace.sdkfetchedtimestamp";
    private static final String SDK_DISABLED_KEY = "io.embrace.disabled";
    public static final String SDK_STARTUP_COMPLETED = "startup_completed";
    public static final String SDK_STARTUP_IN_PROGRESS = "startup_entered";
    private static final String SDK_STARTUP_STATUS_KEY = "io.embrace.sdkstartup";
    private static final String SESSION_PROPERTIES_KEY = "io.embrace.session.properties";
    private static final String UNITY_BUILD_ID_NUMBER_KEY = "io.embrace.unity.build.id";
    private static final String UNITY_SDK_VERSION_NUMBER_KEY = "io.embrace.unity.sdk.version";
    private static final String UNITY_VERSION_NUMBER_KEY = "io.embrace.unity.version";
    private static final String USER_EMAIL_ADDRESS_KEY = "io.embrace.useremail";
    private static final String USER_IDENTIFIER_KEY = "io.embrace.userid";
    private static final String USER_IS_PAYER_KEY = "io.embrace.userispayer";
    private static final String USER_PERSONAS_KEY = "io.embrace.userpersonas";
    private static final String USER_USERNAME_KEY = "io.embrace.username";
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final c04 lazyPrefs;
    private final Future<SharedPreferences> preferences;
    private final EmbraceSerializer serializer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbracePreferencesService(BackgroundWorker backgroundWorker, final c04 c04Var, Clock clock, EmbraceSerializer embraceSerializer) {
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(c04Var, "lazyPrefs");
        zq3.h(clock, "clock");
        zq3.h(embraceSerializer, "serializer");
        this.backgroundWorker = backgroundWorker;
        this.clock = clock;
        this.serializer = embraceSerializer;
        this.lazyPrefs = c04Var;
        try {
            Systrace.startSynchronous("trigger-load-prefs");
            Future<SharedPreferences> submit$default = BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.prefs.EmbracePreferencesService$$special$$inlined$traceSynchronous$lambda$1
                @Override // java.util.concurrent.Callable
                public final SharedPreferences call() {
                    try {
                        Systrace.startSynchronous("load-prefs");
                        return (SharedPreferences) c04Var.getValue();
                    } finally {
                    }
                }
            }, 1, (Object) null);
            Systrace.endSynchronous();
            this.preferences = submit$default;
            alterStartupStatus(SDK_STARTUP_IN_PROGRESS);
        } finally {
        }
    }

    private final void alterStartupStatus(final String str) {
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.prefs.EmbracePreferencesService$alterStartupStatus$1
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferences prefs;
                try {
                    Systrace.startSynchronous("set-startup-status");
                    EmbracePreferencesService embracePreferencesService = EmbracePreferencesService.this;
                    prefs = embracePreferencesService.getPrefs();
                    embracePreferencesService.setStringPreference(prefs, "io.embrace.sdkstartup", str);
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
        }, 1, (Object) null);
    }

    private final Set<String> getArrayPreference(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getStringSet(str, null);
    }

    private final boolean getBooleanPreference(SharedPreferences sharedPreferences, String str, boolean z) {
        return sharedPreferences.getBoolean(str, z);
    }

    public static /* synthetic */ void getCustomPersonas$annotations() {
    }

    private final Integer getIntegerPreference(SharedPreferences sharedPreferences, String str) {
        int i = sharedPreferences.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    private final Long getLongPreference(SharedPreferences sharedPreferences, String str) {
        long j = sharedPreferences.getLong(str, -1L);
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    private final Map<String, String> getMapPreference(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        zq3.g(string, "getString(key, null) ?: return null");
        Object fromJson = this.serializer.fromJson(string, (Class<Object>) Map.class);
        if (fromJson != null) {
            return (Map) fromJson;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }

    private final int getNetworkCaptureRuleRemainingCount(String str) {
        return getNetworkCaptureRuleRemainingCount(str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        try {
            try {
                Systrace.startSynchronous("get-prefs");
                SharedPreferences sharedPreferences = this.preferences.get(2L, TimeUnit.SECONDS);
                Systrace.endSynchronous();
                zq3.g(sharedPreferences, "Systrace.traceSynchronou…it.SECONDS)\n            }");
                return sharedPreferences;
            } finally {
            }
        } catch (Throwable unused) {
            return (SharedPreferences) this.lazyPrefs.getValue();
        }
    }

    private final String getStringPreference(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, null);
    }

    private final int incrementAndGetOrdinal(String str) {
        try {
            Integer integerPreference = getIntegerPreference(getPrefs(), str);
            int intValue = (integerPreference != null ? integerPreference.intValue() : 0) + 1;
            setIntegerPreference(getPrefs(), str, intValue);
            return intValue;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private final void setArrayPreference(SharedPreferences sharedPreferences, String str, Set<String> set) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    private final void setBooleanPreference(SharedPreferences sharedPreferences, String str, Boolean bool) {
        if (bool != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, bool.booleanValue());
            edit.apply();
        }
    }

    private final void setIntegerPreference(SharedPreferences sharedPreferences, String str, int i) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    private final void setLongPreference(SharedPreferences sharedPreferences, String str, Long l) {
        if (l != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, l.longValue());
            edit.apply();
        }
    }

    private final void setMapPreference(SharedPreferences sharedPreferences, String str, Map<String, String> map) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, map == null ? null : this.serializer.toJson((EmbraceSerializer) map, (Class<EmbraceSerializer>) Map.class));
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStringPreference(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        alterStartupStatus(SDK_STARTUP_COMPLETED);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void decreaseNetworkCaptureRuleRemainingCount(String str, int i) {
        zq3.h(str, "id");
        setIntegerPreference(getPrefs(), NETWORK_CAPTURE_RULE_PREFIX_KEY + str, getNetworkCaptureRuleRemainingCount(str, i) - 1);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getAppVersion() {
        return getStringPreference(getPrefs(), PREVIOUS_APP_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Set<String> getApplicationExitInfoHistory() {
        return getPrefs().getStringSet(AEI_HASH_CODES, null);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean getBackgroundActivityEnabled() {
        return getBooleanPreference(getPrefs(), BACKGROUND_ACTIVITY_ENABLED_KEY, false);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getCpuName() {
        return getStringPreference(getPrefs(), CPU_NAME_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Set<String> getCustomPersonas() {
        return getArrayPreference(getPrefs(), CUSTOM_PERSONAS_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getDartSdkVersion() {
        return getStringPreference(getPrefs(), DART_SDK_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getDeviceIdentifier() {
        String stringPreference = getStringPreference(getPrefs(), DEVICE_IDENTIFIER_KEY);
        if (stringPreference != null) {
            return stringPreference;
        }
        String embUuid$default = Uuid.getEmbUuid$default(null, 1, null);
        setDeviceIdentifier(embUuid$default);
        return embUuid$default;
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getEgl() {
        return getStringPreference(getPrefs(), EGL_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getEmbraceFlutterSdkVersion() {
        return getStringPreference(getPrefs(), EMBRACE_FLUTTER_SDK_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Long getInstallDate() {
        return getLongPreference(getPrefs(), INSTALL_DATE_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Boolean getJailbroken() {
        if (getPrefs().contains(IS_JAILBROKEN_KEY)) {
            return Boolean.valueOf(getBooleanPreference(getPrefs(), IS_JAILBROKEN_KEY, false));
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getJavaScriptBundleId() {
        return getStringPreference(getPrefs(), JAVA_SCRIPT_BUNDLE_ID_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getJavaScriptBundleURL() {
        return getStringPreference(getPrefs(), JAVA_SCRIPT_BUNDLE_URL_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getJavaScriptPatchNumber() {
        return getStringPreference(getPrefs(), JAVA_SCRIPT_PATCH_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Long getLastConfigFetchDate() {
        return getLongPreference(getPrefs(), SDK_CONFIG_FETCHED_TIMESTAMP);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getOsVersion() {
        return getStringPreference(getPrefs(), PREVIOUS_OS_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Map<String, String> getPermanentSessionProperties() {
        return getMapPreference(getPrefs(), SESSION_PROPERTIES_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getReactNativeVersionNumber() {
        return getStringPreference(getPrefs(), REACT_NATIVE_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getRnSdkVersion() {
        return getStringPreference(getPrefs(), REACT_NATIVE_SDK_VERSION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getScreenResolution() {
        return getStringPreference(getPrefs(), SCREEN_RESOLUTION_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean getSdkDisabled() {
        return getBooleanPreference(getPrefs(), SDK_DISABLED_KEY, false);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getSdkStartupStatus() {
        return getStringPreference(getPrefs(), SDK_STARTUP_STATUS_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUnityBuildIdNumber() {
        return getStringPreference(getPrefs(), UNITY_BUILD_ID_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUnitySdkVersionNumber() {
        return getStringPreference(getPrefs(), UNITY_SDK_VERSION_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUnityVersionNumber() {
        return getStringPreference(getPrefs(), UNITY_VERSION_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUserEmailAddress() {
        return getStringPreference(getPrefs(), USER_EMAIL_ADDRESS_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUserIdentifier() {
        return getStringPreference(getPrefs(), USER_IDENTIFIER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean getUserMessageNeedsRetry() {
        return getBooleanPreference(getPrefs(), LAST_USER_MESSAGE_FAILED_KEY, false);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean getUserPayer() {
        return getBooleanPreference(getPrefs(), USER_IS_PAYER_KEY, false);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public Set<String> getUserPersonas() {
        return getArrayPreference(getPrefs(), USER_PERSONAS_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public String getUsername() {
        return getStringPreference(getPrefs(), USER_USERNAME_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public int incrementAndGetBackgroundActivityNumber() {
        return incrementAndGetOrdinal(LAST_BACKGROUND_ACTIVITY_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public int incrementAndGetCrashNumber() {
        return incrementAndGetOrdinal(LAST_CRASH_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public int incrementAndGetNativeCrashNumber() {
        return incrementAndGetOrdinal(LAST_NATIVE_CRASH_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public int incrementAndGetSessionNumber() {
        return incrementAndGetOrdinal(LAST_SESSION_NUMBER_KEY);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean isNetworkCaptureRuleOver(String str) {
        zq3.h(str, "id");
        return getNetworkCaptureRuleRemainingCount(str) <= 0;
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public boolean isUsersFirstDay() {
        Long installDate = getInstallDate();
        return installDate != null && this.clock.now() - installDate.longValue() <= 86400000;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onView(this, activity);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onViewClose(this, activity);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setAppVersion(String str) {
        setStringPreference(getPrefs(), PREVIOUS_APP_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setApplicationExitInfoHistory(Set<String> set) {
        setArrayPreference(getPrefs(), AEI_HASH_CODES, set);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setBackgroundActivityEnabled(boolean z) {
        setBooleanPreference(getPrefs(), BACKGROUND_ACTIVITY_ENABLED_KEY, Boolean.valueOf(z));
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setCpuName(String str) {
        setStringPreference(getPrefs(), CPU_NAME_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setDartSdkVersion(String str) {
        setStringPreference(getPrefs(), DART_SDK_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setDeviceIdentifier(String str) {
        zq3.h(str, "value");
        setStringPreference(getPrefs(), DEVICE_IDENTIFIER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setEgl(String str) {
        setStringPreference(getPrefs(), EGL_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setEmbraceFlutterSdkVersion(String str) {
        setStringPreference(getPrefs(), EMBRACE_FLUTTER_SDK_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setInstallDate(Long l) {
        setLongPreference(getPrefs(), INSTALL_DATE_KEY, l);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setJailbroken(Boolean bool) {
        setBooleanPreference(getPrefs(), IS_JAILBROKEN_KEY, bool);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setJavaScriptBundleId(String str) {
        setStringPreference(getPrefs(), JAVA_SCRIPT_BUNDLE_ID_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setJavaScriptBundleURL(String str) {
        setStringPreference(getPrefs(), JAVA_SCRIPT_BUNDLE_URL_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setJavaScriptPatchNumber(String str) {
        setStringPreference(getPrefs(), JAVA_SCRIPT_PATCH_NUMBER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setLastConfigFetchDate(Long l) {
        setLongPreference(getPrefs(), SDK_CONFIG_FETCHED_TIMESTAMP, l);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setOsVersion(String str) {
        setStringPreference(getPrefs(), PREVIOUS_OS_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setPermanentSessionProperties(Map<String, String> map) {
        setMapPreference(getPrefs(), SESSION_PROPERTIES_KEY, map);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setReactNativeVersionNumber(String str) {
        setStringPreference(getPrefs(), REACT_NATIVE_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setRnSdkVersion(String str) {
        setStringPreference(getPrefs(), REACT_NATIVE_SDK_VERSION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setScreenResolution(String str) {
        setStringPreference(getPrefs(), SCREEN_RESOLUTION_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setSdkDisabled(boolean z) {
        setBooleanPreference(getPrefs(), SDK_DISABLED_KEY, Boolean.valueOf(z));
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUnityBuildIdNumber(String str) {
        setStringPreference(getPrefs(), UNITY_BUILD_ID_NUMBER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUnitySdkVersionNumber(String str) {
        setStringPreference(getPrefs(), UNITY_SDK_VERSION_NUMBER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUnityVersionNumber(String str) {
        setStringPreference(getPrefs(), UNITY_VERSION_NUMBER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUserEmailAddress(String str) {
        setStringPreference(getPrefs(), USER_EMAIL_ADDRESS_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUserIdentifier(String str) {
        setStringPreference(getPrefs(), USER_IDENTIFIER_KEY, str);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUserMessageNeedsRetry(boolean z) {
        setBooleanPreference(getPrefs(), LAST_USER_MESSAGE_FAILED_KEY, Boolean.valueOf(z));
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUserPayer(boolean z) {
        setBooleanPreference(getPrefs(), USER_IS_PAYER_KEY, Boolean.valueOf(z));
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUserPersonas(Set<String> set) {
        setArrayPreference(getPrefs(), USER_PERSONAS_KEY, set);
    }

    @Override // io.embrace.android.embracesdk.prefs.PreferencesService
    public void setUsername(String str) {
        setStringPreference(getPrefs(), USER_USERNAME_KEY, str);
    }

    private final int getNetworkCaptureRuleRemainingCount(String str, int i) {
        Integer integerPreference = getIntegerPreference(getPrefs(), NETWORK_CAPTURE_RULE_PREFIX_KEY + str);
        return integerPreference != null ? integerPreference.intValue() : i;
    }
}
