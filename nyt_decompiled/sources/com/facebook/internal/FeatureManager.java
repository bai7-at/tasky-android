package com.facebook.internal;

import android.R;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.comscore.streaming.EventType;
import defpackage.qd2;
import defpackage.w92;
import defpackage.zq3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class FeatureManager {
    public static final FeatureManager a = new FeatureManager();
    private static final Map b = new HashMap();

    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);

        public static final a Companion = new a(null);
        private final int code;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Feature a(int i) {
                Feature[] valuesCustom = Feature.valuesCustom();
                int length = valuesCustom.length;
                int i2 = 0;
                while (i2 < length) {
                    Feature feature = valuesCustom[i2];
                    i2++;
                    if (feature.code == i) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }

            private a() {
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Feature.valuesCustom().length];
                iArr[Feature.Core.ordinal()] = 1;
                iArr[Feature.AppEvents.ordinal()] = 2;
                iArr[Feature.CodelessEvents.ordinal()] = 3;
                iArr[Feature.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[Feature.Instrument.ordinal()] = 5;
                iArr[Feature.CrashReport.ordinal()] = 6;
                iArr[Feature.CrashShield.ordinal()] = 7;
                iArr[Feature.ThreadCheck.ordinal()] = 8;
                iArr[Feature.ErrorReport.ordinal()] = 9;
                iArr[Feature.AnrReport.ordinal()] = 10;
                iArr[Feature.AAM.ordinal()] = 11;
                iArr[Feature.CloudBridge.ordinal()] = 12;
                iArr[Feature.PrivacyProtection.ordinal()] = 13;
                iArr[Feature.SuggestedEvents.ordinal()] = 14;
                iArr[Feature.IntelligentIntegrity.ordinal()] = 15;
                iArr[Feature.ModelRequest.ordinal()] = 16;
                iArr[Feature.EventDeactivation.ordinal()] = 17;
                iArr[Feature.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[Feature.IapLogging.ordinal()] = 20;
                iArr[Feature.IapLoggingLib2.ordinal()] = 21;
                iArr[Feature.Monitoring.ordinal()] = 22;
                iArr[Feature.ServiceUpdateCompliance.ordinal()] = 23;
                iArr[Feature.Login.ordinal()] = 24;
                iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 25;
                iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
                iArr[Feature.BypassAppSwitch.ordinal()] = 27;
                iArr[Feature.Share.ordinal()] = 28;
                a = iArr;
            }
        }

        Feature(int i) {
            this.code = i;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Feature[] valuesCustom() {
            Feature[] valuesCustom = values();
            return (Feature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final Feature getParent() {
            int i = this.code;
            return (i & 255) > 0 ? Companion.a(i & (-256)) : (65280 & i) > 0 ? Companion.a(i & (-65536)) : (16711680 & i) > 0 ? Companion.a(i & (-16777216)) : Companion.a(0);
        }

        public final String toKey() {
            return zq3.q("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (b.a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case 23:
                    return "ServiceUpdateCompliance";
                case 24:
                    return "LoginKit";
                case EventType.SUBS /* 25 */:
                    return "ChromeCustomTabsPrefetching";
                case EventType.CDN /* 26 */:
                    return "IgnoreAppSwitchToLoggedOut";
                case 27:
                    return "BypassAppSwitch";
                case 28:
                    return "ShareKit";
                default:
                    return DatasetUtils.UNKNOWN_IDENTITY_ID;
            }
        }
    }

    public interface a {
        void a(boolean z);
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Feature.valuesCustom().length];
            iArr[Feature.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[Feature.Instrument.ordinal()] = 2;
            iArr[Feature.CrashReport.ordinal()] = 3;
            iArr[Feature.CrashShield.ordinal()] = 4;
            iArr[Feature.ThreadCheck.ordinal()] = 5;
            iArr[Feature.ErrorReport.ordinal()] = 6;
            iArr[Feature.AnrReport.ordinal()] = 7;
            iArr[Feature.AAM.ordinal()] = 8;
            iArr[Feature.CloudBridge.ordinal()] = 9;
            iArr[Feature.PrivacyProtection.ordinal()] = 10;
            iArr[Feature.SuggestedEvents.ordinal()] = 11;
            iArr[Feature.IntelligentIntegrity.ordinal()] = 12;
            iArr[Feature.ModelRequest.ordinal()] = 13;
            iArr[Feature.EventDeactivation.ordinal()] = 14;
            iArr[Feature.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[Feature.IapLogging.ordinal()] = 17;
            iArr[Feature.IapLoggingLib2.ordinal()] = 18;
            iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[Feature.Monitoring.ordinal()] = 20;
            iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 21;
            iArr[Feature.BypassAppSwitch.ordinal()] = 22;
            a = iArr;
        }
    }

    public static final class c implements qd2.a {
        final /* synthetic */ a a;
        final /* synthetic */ Feature b;

        c(a aVar, Feature feature) {
            this.a = aVar;
            this.b = feature;
        }

        @Override // qd2.a
        public void onCompleted() {
            a aVar = this.a;
            FeatureManager featureManager = FeatureManager.a;
            aVar.a(FeatureManager.g(this.b));
        }
    }

    private FeatureManager() {
    }

    public static final void a(Feature feature, a aVar) {
        zq3.h(feature, "feature");
        zq3.h(aVar, "callback");
        qd2 qd2Var = qd2.a;
        qd2.h(new c(aVar, feature));
    }

    private final boolean b(Feature feature) {
        switch (b.a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                return true;
        }
    }

    public static final void c(Feature feature) {
        zq3.h(feature, "feature");
        w92.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), w92.A()).apply();
    }

    public static final Feature d(String str) {
        zq3.h(str, "className");
        a.f();
        for (Map.Entry entry : b.entrySet()) {
            Feature feature = (Feature) entry.getKey();
            String[] strArr = (String[]) entry.getValue();
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                if (h.K(str, str2, false, 2, null)) {
                    return feature;
                }
            }
        }
        return Feature.Unknown;
    }

    private final boolean e(Feature feature) {
        boolean b2 = b(feature);
        qd2 qd2Var = qd2.a;
        return qd2.d(feature.toKey(), w92.m(), b2);
    }

    private final synchronized void f() {
        Map map = b;
        if (map.isEmpty()) {
            map.put(Feature.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(Feature feature) {
        zq3.h(feature, "feature");
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = w92.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), null);
        if (string != null && zq3.c(string, w92.A())) {
            return false;
        }
        Feature parent = feature.getParent();
        return parent == feature ? a.e(feature) : g(parent) && a.e(feature);
    }
}
