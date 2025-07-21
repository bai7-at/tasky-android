package io.embrace.android.embracesdk.capture.metadata;

import defpackage.zq3;
import io.embrace.android.embracesdk.prefs.PreferencesService;

/* loaded from: classes5.dex */
public interface HostedPlatformStrategy {

    public static final class DefaultImpls {
        public static String getJavaScriptPatchNumber(HostedPlatformStrategy hostedPlatformStrategy, PreferencesService preferencesService) {
            zq3.h(preferencesService, "preferencesService");
            return null;
        }

        public static String getUnityBuildIdNumber(HostedPlatformStrategy hostedPlatformStrategy, PreferencesService preferencesService) {
            zq3.h(preferencesService, "preferencesService");
            return null;
        }

        public static void setJavaScriptPatchNumberInPreferences(HostedPlatformStrategy hostedPlatformStrategy, String str, PreferencesService preferencesService) {
            zq3.h(preferencesService, "preferencesService");
        }

        public static void setUnityBuildIdNumberInPreferences(HostedPlatformStrategy hostedPlatformStrategy, String str, PreferencesService preferencesService) {
            zq3.h(preferencesService, "preferencesService");
        }
    }

    String getHostedPlatformVersionFromPreferences(PreferencesService preferencesService);

    String getHostedSdkVersionFromPreferences(PreferencesService preferencesService);

    String getJavaScriptPatchNumber(PreferencesService preferencesService);

    String getUnityBuildIdNumber(PreferencesService preferencesService);

    void setHostedPlatformVersionInPreferences(String str, PreferencesService preferencesService);

    void setHostedSdkVersionInPreferences(String str, PreferencesService preferencesService);

    void setJavaScriptPatchNumberInPreferences(String str, PreferencesService preferencesService);

    void setUnityBuildIdNumberInPreferences(String str, PreferencesService preferencesService);
}
