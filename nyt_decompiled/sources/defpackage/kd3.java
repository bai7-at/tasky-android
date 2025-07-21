package defpackage;

import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;
import com.nytimes.android.subauth.core.type.AdConfigurationDirectiveValue;
import com.nytimes.xwords.hybrid.DirectiveKeys;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class kd3 {
    private final com.nytimes.android.subauth.core.purr.a a;
    private final PurrDirectiveOverrider b;

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

    public kd3(com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider) {
        zq3.h(aVar, "purrClient");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        this.a = aVar;
        this.b = purrDirectiveOverrider;
    }

    private final String b(AcceptableTracker acceptableTracker) {
        int i = a.b[acceptableTracker.ordinal()];
        AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue = i != 1 ? i != 2 ? i != 3 ? null : AcceptableTrackersDirectiveValue.ESSENTIALS : AcceptableTrackersDirectiveValue.PROCESSORS : AcceptableTrackersDirectiveValue.CONTROLLERS;
        if (acceptableTrackersDirectiveValue != null) {
            return e(acceptableTrackersDirectiveValue);
        }
        return null;
    }

    private final String c(AdConfiguration adConfiguration) {
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
            return e(adConfigurationDirectiveValue);
        }
        return null;
    }

    private final String e(Enum r8) {
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
        PrivacyConfiguration applyOverrides = this.b.applyOverrides(this.a.n());
        PurrAdvertisingConfigurationDirectiveV3 purrAdvertisingConfigurationDirectiveV3 = (PurrAdvertisingConfigurationDirectiveV3) applyOverrides.getDirective(PurrAdvertisingConfigurationDirectiveV3.class);
        String str = null;
        String c = (purrAdvertisingConfigurationDirectiveV3 == null || (value2 = purrAdvertisingConfigurationDirectiveV3.getValue()) == null) ? null : c(value2);
        PurrAcceptableTrackersDirectiveV2 purrAcceptableTrackersDirectiveV2 = (PurrAcceptableTrackersDirectiveV2) applyOverrides.getDirective(PurrAcceptableTrackersDirectiveV2.class);
        if (purrAcceptableTrackersDirectiveV2 != null && (value = purrAcceptableTrackersDirectiveV2.getValue()) != null) {
            str = b(value);
        }
        return t.m(du8.a(DirectiveKeys.AdvertisingConfigurationDirectiveV3.getKey(), c), du8.a(DirectiveKeys.AcceptableTrackersDirectiveV2.getKey(), str));
    }

    public final String d() {
        return this.a.v().getTcfString();
    }
}
