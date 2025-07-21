package io.embrace.android.embracesdk.capture.metadata;

import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy;
import io.embrace.android.embracesdk.prefs.PreferencesService;

/* loaded from: classes5.dex */
public final class NativePlatformStrategy implements HostedPlatformStrategy {
    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getHostedPlatformVersionFromPreferences(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return null;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getHostedSdkVersionFromPreferences(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return null;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getJavaScriptPatchNumber(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return HostedPlatformStrategy.DefaultImpls.getJavaScriptPatchNumber(this, preferencesService);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public String getUnityBuildIdNumber(PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        return HostedPlatformStrategy.DefaultImpls.getUnityBuildIdNumber(this, preferencesService);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setHostedPlatformVersionInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setHostedSdkVersionInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setJavaScriptPatchNumberInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        HostedPlatformStrategy.DefaultImpls.setJavaScriptPatchNumberInPreferences(this, str, preferencesService);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.HostedPlatformStrategy
    public void setUnityBuildIdNumberInPreferences(String str, PreferencesService preferencesService) {
        zq3.h(preferencesService, "preferencesService");
        HostedPlatformStrategy.DefaultImpls.setUnityBuildIdNumberInPreferences(this, str, preferencesService);
    }
}
