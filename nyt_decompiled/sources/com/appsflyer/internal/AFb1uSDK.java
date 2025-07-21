package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
public final class AFb1uSDK {
    private final AFa1ySDK AFInAppEventType = new AFa1ySDK() { // from class: com.appsflyer.internal.AFb1uSDK.3
        @Override // com.appsflyer.internal.AFb1uSDK.AFa1ySDK
        public final Class<?> valueOf(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    enum AFa1vSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        private final String onAppOpenAttributionNative;
        private final String onAttributionFailureNative;

        AFa1vSDK(String str, String str2) {
            this.onAttributionFailureNative = str;
            this.onAppOpenAttributionNative = str2;
        }
    }

    interface AFa1ySDK {
        Class<?> valueOf(String str) throws ClassNotFoundException;
    }

    public final String valueOf() {
        for (AFa1vSDK aFa1vSDK : AFa1vSDK.values()) {
            if (valueOf(aFa1vSDK.onAppOpenAttributionNative)) {
                return aFa1vSDK.onAttributionFailureNative;
            }
        }
        return AFa1vSDK.DEFAULT.onAttributionFailureNative;
    }

    private boolean valueOf(String str) {
        try {
            this.AFInAppEventType.valueOf(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
