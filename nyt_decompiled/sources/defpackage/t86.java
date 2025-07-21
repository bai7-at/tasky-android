package defpackage;

import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrFirstPartyBehavioralTargetingDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingConsentDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class t86 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;

        static {
            int[] iArr = new int[ToggleableDirectiveValue.values().length];
            try {
                iArr[ToggleableDirectiveValue.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableDirectiveValue.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[AcceptableTracker.values().length];
            try {
                iArr2[AcceptableTracker.CONTROLLERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AcceptableTracker.PROCESSORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AcceptableTracker.ESSENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[AdConfiguration.values().length];
            try {
                iArr3[AdConfiguration.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AdConfiguration.RDP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AdConfiguration.NPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AdConfiguration.ADLUCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AdConfiguration.ADLUCE_SOCRATES.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AdConfiguration.LTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
            int[] iArr4 = new int[DataProcessingPreferenceDirectiveValue.values().length];
            try {
                iArr4[DataProcessingPreferenceDirectiveValue.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN_OR_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            d = iArr4;
            int[] iArr5 = new int[DataSaleOptOutDirectiveValueV2.values().length];
            try {
                iArr5[DataSaleOptOutDirectiveValueV2.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[DataSaleOptOutDirectiveValueV2.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[DataSaleOptOutDirectiveValueV2.SHOW_OPTED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            e = iArr5;
            int[] iArr6 = new int[EmailMarketingOptInDirectiveValue.values().length];
            try {
                iArr6[EmailMarketingOptInDirectiveValue.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[EmailMarketingOptInDirectiveValue.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            f = iArr6;
            int[] iArr7 = new int[FirstPartyDirectiveValue.values().length];
            try {
                iArr7[FirstPartyDirectiveValue.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[FirstPartyDirectiveValue.DISALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            g = iArr7;
        }
    }

    private final char a(PurrAcceptableTrackersDirectiveV2 purrAcceptableTrackersDirectiveV2) {
        AcceptableTracker value = purrAcceptableTrackersDirectiveV2 != null ? purrAcceptableTrackersDirectiveV2.getValue() : null;
        int i = value == null ? -1 : b.b[value.ordinal()];
        if (i == 1) {
            return 'c';
        }
        if (i != 2) {
            return i != 3 ? '_' : 'e';
        }
        return 'p';
    }

    private final char b(PurrAdvertisingConfigurationDirectiveV2 purrAdvertisingConfigurationDirectiveV2) {
        AdConfiguration value = purrAdvertisingConfigurationDirectiveV2 != null ? purrAdvertisingConfigurationDirectiveV2.getValue() : null;
        int i = value == null ? -1 : b.c[value.ordinal()];
        if (i == 1) {
            return 'f';
        }
        if (i == 2) {
            return 'r';
        }
        if (i == 3) {
            return 'n';
        }
        if (i != 4) {
            return i != 5 ? '_' : 's';
        }
        return 'a';
    }

    private final char c(PurrAdvertisingConfigurationDirectiveV3 purrAdvertisingConfigurationDirectiveV3) {
        AdConfiguration value = purrAdvertisingConfigurationDirectiveV3 != null ? purrAdvertisingConfigurationDirectiveV3.getValue() : null;
        int i = value == null ? -1 : b.c[value.ordinal()];
        if (i == 1) {
            return 'f';
        }
        if (i == 2) {
            return 'r';
        }
        if (i == 3) {
            return 'n';
        }
        if (i != 5) {
            return i != 6 ? '_' : 'l';
        }
        return 's';
    }

    private final char d(PurrDataSaleOptOutDirectiveV2 purrDataSaleOptOutDirectiveV2) {
        DataSaleOptOutDirectiveValueV2 value = purrDataSaleOptOutDirectiveV2 != null ? purrDataSaleOptOutDirectiveV2.getValue() : null;
        int i = value == null ? -1 : b.e[value.ordinal()];
        if (i == 1) {
            return 'h';
        }
        if (i != 2) {
            return i != 3 ? '_' : 'o';
        }
        return 's';
    }

    private final char e(PurrEmailMarketingOptInUiDirective purrEmailMarketingOptInUiDirective) {
        EmailMarketingOptInDirectiveValue value = purrEmailMarketingOptInUiDirective != null ? purrEmailMarketingOptInUiDirective.getValue() : null;
        int i = value == null ? -1 : b.f[value.ordinal()];
        if (i != 1) {
            return i != 2 ? '_' : 'u';
        }
        return 'c';
    }

    private final char f(PurrFirstPartyBehavioralTargetingDirective purrFirstPartyBehavioralTargetingDirective) {
        FirstPartyDirectiveValue value = purrFirstPartyBehavioralTargetingDirective != null ? purrFirstPartyBehavioralTargetingDirective.getValue() : null;
        int i = value == null ? -1 : b.g[value.ordinal()];
        if (i != 1) {
            return i != 2 ? '_' : 'd';
        }
        return 'a';
    }

    private final char g(PurrShowCaliforniaNoticesUiDirective purrShowCaliforniaNoticesUiDirective) {
        ToggleableDirectiveValue value = purrShowCaliforniaNoticesUiDirective != null ? purrShowCaliforniaNoticesUiDirective.getValue() : null;
        int i = value == null ? -1 : b.a[value.ordinal()];
        if (i != 1) {
            return i != 2 ? '_' : 's';
        }
        return 'h';
    }

    private final char h(PurrShowDataProcessingConsentDirective purrShowDataProcessingConsentDirective) {
        ToggleableDirectiveValue value = purrShowDataProcessingConsentDirective != null ? purrShowDataProcessingConsentDirective.getValue() : null;
        int i = value == null ? -1 : b.a[value.ordinal()];
        if (i != 1) {
            return i != 2 ? '_' : 's';
        }
        return 'h';
    }

    private final char i(PurrShowDataProcessingPreferenceDirective purrShowDataProcessingPreferenceDirective) {
        DataProcessingPreferenceDirectiveValue value = purrShowDataProcessingPreferenceDirective != null ? purrShowDataProcessingPreferenceDirective.getValue() : null;
        int i = value == null ? -1 : b.d[value.ordinal()];
        if (i == 1) {
            return 'h';
        }
        if (i == 2) {
            return 'o';
        }
        if (i != 3) {
            return i != 4 ? '_' : 'a';
        }
        return 'i';
    }

    private final char j(PurrShowLimitSensitivePIUiDirective purrShowLimitSensitivePIUiDirective) {
        ToggleableDirectiveValue value = purrShowLimitSensitivePIUiDirective != null ? purrShowLimitSensitivePIUiDirective.getValue() : null;
        int i = value == null ? -1 : b.a[value.ordinal()];
        if (i != 1) {
            return i != 2 ? '_' : 's';
        }
        return 'h';
    }

    public final String k(PrivacyConfiguration privacyConfiguration) {
        zq3.h(privacyConfiguration, "directives");
        return new String(new char[]{'_', '_', '_', h((PurrShowDataProcessingConsentDirective) privacyConfiguration.getDirective(PurrShowDataProcessingConsentDirective.class)), a((PurrAcceptableTrackersDirectiveV2) privacyConfiguration.getDirective(PurrAcceptableTrackersDirectiveV2.class)), b((PurrAdvertisingConfigurationDirectiveV2) privacyConfiguration.getDirective(PurrAdvertisingConfigurationDirectiveV2.class)), i((PurrShowDataProcessingPreferenceDirective) privacyConfiguration.getDirective(PurrShowDataProcessingPreferenceDirective.class)), d((PurrDataSaleOptOutDirectiveV2) privacyConfiguration.getDirective(PurrDataSaleOptOutDirectiveV2.class)), g((PurrShowCaliforniaNoticesUiDirective) privacyConfiguration.getDirective(PurrShowCaliforniaNoticesUiDirective.class)), e((PurrEmailMarketingOptInUiDirective) privacyConfiguration.getDirective(PurrEmailMarketingOptInUiDirective.class)), '_', c((PurrAdvertisingConfigurationDirectiveV3) privacyConfiguration.getDirective(PurrAdvertisingConfigurationDirectiveV3.class)), j((PurrShowLimitSensitivePIUiDirective) privacyConfiguration.getDirective(PurrShowLimitSensitivePIUiDirective.class)), '_', '_', '_', '_', '_', f((PurrFirstPartyBehavioralTargetingDirective) privacyConfiguration.getDirective(PurrFirstPartyBehavioralTargetingDirective.class))});
    }
}
