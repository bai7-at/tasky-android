package io.embrace.android.embracesdk.capture.metadata;

import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy;
import io.embrace.android.embracesdk.prefs.PreferencesService;

/* loaded from: classes5.dex */
public final class UnityPlatformStrategy implements HostedPlatformStrategy {
    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getHostedPlatformVersionFromPreferences(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return preferencesService.getUnityVersionNumber();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getHostedSdkVersionFromPreferences(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return preferencesService.getUnitySdkVersionNumber();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getJavaScriptPatchNumber(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return HostedPlatformStrategy.DefaultImpls.getJavaScriptPatchNumber(this, preferencesService);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getUnityBuildIdNumber(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return preferencesService.getUnityBuildIdNumber();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setHostedPlatformVersionInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        preferencesService.setUnityVersionNumber(str);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setHostedSdkVersionInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        preferencesService.setUnitySdkVersionNumber(str);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setJavaScriptPatchNumberInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        HostedPlatformStrategy.DefaultImpls.setJavaScriptPatchNumberInPreferences(this, str, preferencesService);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setUnityBuildIdNumberInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        preferencesService.setUnityBuildIdNumber(str);
    }
}
