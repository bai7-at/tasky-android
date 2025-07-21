package io.embrace.android.embracesdk.capture.metadata;

import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class HostedSdkVersionInfo {
    private HostedPlatformStrategy hostedPlatformStrategy;
    private String hostedPlatformVersion;
    private String hostedSdkVersion;
    private String javaScriptPatchNumber;
    private final PreferencesService preferencesService;
    private String unityBuildIdNumber;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Embrace.AppFramework.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Embrace.AppFramework.REACT_NATIVE.ordinal()] = 1;
            iArr[Embrace.AppFramework.UNITY.ordinal()] = 2;
            iArr[Embrace.AppFramework.FLUTTER.ordinal()] = 3;
        }
    }

    public HostedSdkVersionInfo(PreferencesService preferencesService, Embrace.AppFramework appFramework) {
        zq3.h(preferencesService, "preferencesService");
        zq3.h(appFramework, "appFramework");
        this.preferencesService = preferencesService;
        int i = WhenMappings.$EnumSwitchMapping$0[appFramework.ordinal()];
        if (i == 1) {
            this.hostedPlatformStrategy = new ReactNativePlatformStrategy();
            return;
        }
        if (i == 2) {
            this.hostedPlatformStrategy = new UnityPlatformStrategy();
        } else if (i != 3) {
            this.hostedPlatformStrategy = new NativePlatformStrategy();
        } else {
            this.hostedPlatformStrategy = new FlutterPlatformStrategy();
        }
    }

    public final String getHostedPlatformVersion() {
        String str = this.hostedPlatformVersion;
        return str == null ? this.hostedPlatformStrategy.getHostedPlatformVersionFromPreferences(this.preferencesService) : str;
    }

    public final String getHostedSdkVersion() {
        String str = this.hostedSdkVersion;
        return str == null ? this.hostedPlatformStrategy.getHostedSdkVersionFromPreferences(this.preferencesService) : str;
    }

    public final String getJavaScriptPatchNumber() {
        String str = this.javaScriptPatchNumber;
        return str == null ? this.hostedPlatformStrategy.getJavaScriptPatchNumber(this.preferencesService) : str;
    }

    public final String getUnityBuildIdNumber() {
        String str = this.unityBuildIdNumber;
        return str == null ? this.hostedPlatformStrategy.getUnityBuildIdNumber(this.preferencesService) : str;
    }

    public final void setHostedPlatformVersion(String str) {
        String hostedPlatformVersionFromPreferences = this.hostedPlatformStrategy.getHostedPlatformVersionFromPreferences(this.preferencesService);
        if (hostedPlatformVersionFromPreferences == null) {
            this.hostedPlatformVersion = str;
            this.hostedPlatformStrategy.setHostedPlatformVersionInPreferences(str, this.preferencesService);
        } else {
            if (zq3.c(str, hostedPlatformVersionFromPreferences)) {
                return;
            }
            this.hostedPlatformVersion = str;
            this.hostedPlatformStrategy.setHostedPlatformVersionInPreferences(str, this.preferencesService);
        }
    }

    public final void setHostedSdkVersion(String str) {
        String hostedSdkVersionFromPreferences = this.hostedPlatformStrategy.getHostedSdkVersionFromPreferences(this.preferencesService);
        if (hostedSdkVersionFromPreferences == null) {
            this.hostedSdkVersion = str;
            this.hostedPlatformStrategy.setHostedSdkVersionInPreferences(str, this.preferencesService);
        } else {
            if (zq3.c(str, hostedSdkVersionFromPreferences)) {
                return;
            }
            this.hostedSdkVersion = str;
            this.hostedPlatformStrategy.setHostedSdkVersionInPreferences(str, this.preferencesService);
        }
    }

    public final void setJavaScriptPatchNumber(String str) {
        String javaScriptPatchNumber = this.hostedPlatformStrategy.getJavaScriptPatchNumber(this.preferencesService);
        if (javaScriptPatchNumber == null) {
            this.javaScriptPatchNumber = str;
            this.hostedPlatformStrategy.setJavaScriptPatchNumberInPreferences(str, this.preferencesService);
        } else {
            if (zq3.c(str, javaScriptPatchNumber)) {
                return;
            }
            this.javaScriptPatchNumber = str;
            this.hostedPlatformStrategy.setJavaScriptPatchNumberInPreferences(str, this.preferencesService);
        }
    }

    public final void setUnityBuildIdNumber(String str) {
        String unityBuildIdNumber = this.hostedPlatformStrategy.getUnityBuildIdNumber(this.preferencesService);
        if (unityBuildIdNumber == null) {
            this.unityBuildIdNumber = str;
            this.hostedPlatformStrategy.setUnityBuildIdNumberInPreferences(str, this.preferencesService);
        } else {
            if (zq3.c(str, unityBuildIdNumber)) {
                return;
            }
            this.unityBuildIdNumber = str;
            this.hostedPlatformStrategy.setUnityBuildIdNumberInPreferences(str, this.preferencesService);
        }
    }

    public /* synthetic */ HostedSdkVersionInfo(PreferencesService preferencesService, Embrace.AppFramework appFramework, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preferencesService, (i & 2) != 0 ? Embrace.AppFramework.NATIVE : appFramework);
    }
}
