package io.embrace.android.embracesdk.prefs;

import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public interface PreferencesService {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long DAY_IN_MS = 86400000;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long DAY_IN_MS = 86400000;

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ void getCustomPersonas$annotations() {
        }
    }

    void decreaseNetworkCaptureRuleRemainingCount(String str, int i);

    String getAppVersion();

    Set<String> getApplicationExitInfoHistory();

    boolean getBackgroundActivityEnabled();

    String getCpuName();

    Set<String> getCustomPersonas();

    String getDartSdkVersion();

    String getDeviceIdentifier();

    String getEgl();

    String getEmbraceFlutterSdkVersion();

    Long getInstallDate();

    Boolean getJailbroken();

    String getJavaScriptBundleId();

    String getJavaScriptBundleURL();

    String getJavaScriptPatchNumber();

    Long getLastConfigFetchDate();

    String getOsVersion();

    Map<String, String> getPermanentSessionProperties();

    String getReactNativeVersionNumber();

    String getRnSdkVersion();

    String getScreenResolution();

    boolean getSdkDisabled();

    String getSdkStartupStatus();

    String getUnityBuildIdNumber();

    String getUnitySdkVersionNumber();

    String getUnityVersionNumber();

    String getUserEmailAddress();

    String getUserIdentifier();

    boolean getUserMessageNeedsRetry();

    boolean getUserPayer();

    Set<String> getUserPersonas();

    String getUsername();

    int incrementAndGetBackgroundActivityNumber();

    int incrementAndGetCrashNumber();

    int incrementAndGetNativeCrashNumber();

    int incrementAndGetSessionNumber();

    boolean isNetworkCaptureRuleOver(String str);

    boolean isUsersFirstDay();

    void setAppVersion(String str);

    void setApplicationExitInfoHistory(Set<String> set);

    void setBackgroundActivityEnabled(boolean z);

    void setCpuName(String str);

    void setDartSdkVersion(String str);

    void setDeviceIdentifier(String str);

    void setEgl(String str);

    void setEmbraceFlutterSdkVersion(String str);

    void setInstallDate(Long l);

    void setJailbroken(Boolean bool);

    void setJavaScriptBundleId(String str);

    void setJavaScriptBundleURL(String str);

    void setJavaScriptPatchNumber(String str);

    void setLastConfigFetchDate(Long l);

    void setOsVersion(String str);

    void setPermanentSessionProperties(Map<String, String> map);

    void setReactNativeVersionNumber(String str);

    void setRnSdkVersion(String str);

    void setScreenResolution(String str);

    void setSdkDisabled(boolean z);

    void setUnityBuildIdNumber(String str);

    void setUnitySdkVersionNumber(String str);

    void setUnityVersionNumber(String str);

    void setUserEmailAddress(String str);

    void setUserIdentifier(String str);

    void setUserMessageNeedsRetry(boolean z);

    void setUserPayer(boolean z);

    void setUserPersonas(Set<String> set);

    void setUsername(String str);
}
