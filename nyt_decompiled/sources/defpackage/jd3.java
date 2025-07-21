package defpackage;

import com.nytimes.android.entitlements.purr.client.DirectiveKeys;
import com.nytimes.android.hybrid.HybridTcfInfo;
import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;
import com.nytimes.android.subauth.core.type.AdConfigurationDirectiveValue;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class jd3 {
    private final d96 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AdConfiguration.values().length];
            try {
                iArr[AdConfiguration.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdConfiguration.NPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdConfiguration.ADLUCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdConfiguration.ADLUCE_SOCRATES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdConfiguration.RDP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdConfiguration.LTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
            int[] iArr2 = new int[AcceptableTracker.values().length];
            try {
                iArr2[AcceptableTracker.CONTROLLERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AcceptableTracker.PROCESSORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AcceptableTracker.ESSENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public jd3(d96 d96Var) {
        zq3.h(d96Var, "purrClient");
        this.a = d96Var;
    }

    private final String c(AcceptableTracker acceptableTracker) {
        int i = a.b[acceptableTracker.ordinal()];
        AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue = i != 1 ? i != 2 ? i != 3 ? null : AcceptableTrackersDirectiveValue.ESSENTIALS : AcceptableTrackersDirectiveValue.PROCESSORS : AcceptableTrackersDirectiveValue.CONTROLLERS;
        if (acceptableTrackersDirectiveValue != null) {
            return f(acceptableTrackersDirectiveValue);
        }
        return null;
    }

    private final String d(AdConfiguration adConfiguration) {
        AdConfigurationDirectiveValue adConfigurationDirectiveValue;
        switch (a.a[adConfiguration.ordinal()]) {
            case 1:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.FULL;
                break;
            case 2:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.NPA;
                break;
            case 3:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.ADLUCE;
                break;
            case 4:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.ADLUCE_SOCRATES;
                break;
            case 5:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.RDP;
                break;
            case 6:
                adConfigurationDirectiveValue = AdConfigurationDirectiveValue.LTD;
                break;
            default:
                adConfigurationDirectiveValue = null;
                break;
        }
        if (adConfigurationDirectiveValue != null) {
            return f(adConfigurationDirectiveValue);
        }
        return null;
    }

    private final String f(Enum r8) {
        String name;
        if (r8 != null && (name = r8.name()) != null) {
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return h.E(lowerCase, '_', '-', false, 4, null);
            }
        }
        return null;
    }

    public final Map a() {
        AcceptableTracker value;
        AdConfiguration value2;
        PrivacyConfiguration d = this.a.d();
        PurrAdvertisingConfigurationDirectiveV3 purrAdvertisingConfigurationDirectiveV3 = (PurrAdvertisingConfigurationDirectiveV3) d.getDirective(PurrAdvertisingConfigurationDirectiveV3.class);
        String str = null;
        String d2 = (purrAdvertisingConfigurationDirectiveV3 == null || (value2 = purrAdvertisingConfigurationDirectiveV3.getValue()) == null) ? null : d(value2);
        PurrAcceptableTrackersDirectiveV2 purrAcceptableTrackersDirectiveV2 = (PurrAcceptableTrackersDirectiveV2) d.getDirective(PurrAcceptableTrackersDirectiveV2.class);
        if (purrAcceptableTrackersDirectiveV2 != null && (value = purrAcceptableTrackersDirectiveV2.getValue()) != null) {
            str = c(value);
        }
        return t.m(du8.a(DirectiveKeys.AdvertisingConfigurationDirectiveV3.getKey(), d2), du8.a(DirectiveKeys.AcceptableTrackersDirectiveV2.getKey(), str));
    }

    public final HybridTcfInfo b() {
        return new HybridTcfInfo(this.a.g(), false, 2, null);
    }

    public final boolean e(Map map) {
        zq3.h(map, "purrDirectives");
        String str = (String) map.get(DirectiveKeys.AcceptableTrackersDirectiveV2.getKey());
        if (zq3.c(str, f(AcceptableTracker.CONTROLLERS))) {
            return false;
        }
        if (zq3.c(str, f(AcceptableTracker.PROCESSORS))) {
            return true;
        }
        zq3.c(str, f(AcceptableTracker.ESSENTIALS));
        return false;
    }
}
