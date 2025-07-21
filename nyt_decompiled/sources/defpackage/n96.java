package defpackage;

import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import com.nytimes.android.subauth.core.purr.model.AcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.model.AdConfigurationDirectiveV2;
import com.nytimes.android.subauth.core.purr.model.AdConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.model.ApolloExtensionsKt;
import com.nytimes.android.subauth.core.purr.model.EmailMarketingOptInUiPrivacyDirective;
import com.nytimes.android.subauth.core.purr.model.FirstPartyBehavioralTargetingDirective;
import com.nytimes.android.subauth.core.purr.model.PreferenceUpdateResult;
import com.nytimes.android.subauth.core.purr.model.PrivacyDirectives;
import com.nytimes.android.subauth.core.purr.model.ShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.model.ShowDataProcessingConsentUiPrivacyDirective;
import com.nytimes.android.subauth.core.purr.model.ShowDataProcessingPreferenceUiPrivacyDirective;
import com.nytimes.android.subauth.core.purr.model.ShowDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.model.ShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.model.ShowTCFUIDirective;
import com.nytimes.android.subauth.core.purr.network.parsing.PurrResponseParserException;
import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;
import com.nytimes.android.subauth.core.type.AdConfigurationDirectiveValue;
import com.nytimes.android.subauth.core.type.DataProcessingPreferenceUiDirectiveValue;
import com.nytimes.android.subauth.core.type.EmailMarketingOptInUiDirectiveValue;
import com.nytimes.android.subauth.core.type.PrivacyTargetingValue;
import com.nytimes.android.subauth.core.type.ShowDataSaleOptOutUiPrivacyDirectiveValueV2;
import com.nytimes.android.subauth.core.type.ToggleableUiDirectiveValue;
import defpackage.cg5;
import defpackage.zy4;

/* loaded from: classes4.dex */
public final class n96 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;

        static {
            int[] iArr = new int[AdConfigurationDirectiveValue.values().length];
            try {
                iArr[AdConfigurationDirectiveValue.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdConfigurationDirectiveValue.NPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdConfigurationDirectiveValue.ADLUCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdConfigurationDirectiveValue.ADLUCE_SOCRATES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdConfigurationDirectiveValue.RDP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdConfigurationDirectiveValue.LTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
            int[] iArr2 = new int[AcceptableTrackersDirectiveValue.values().length];
            try {
                iArr2[AcceptableTrackersDirectiveValue.CONTROLLERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AcceptableTrackersDirectiveValue.PROCESSORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AcceptableTrackersDirectiveValue.ESSENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
            int[] iArr3 = new int[ShowDataSaleOptOutUiPrivacyDirectiveValueV2.values().length];
            try {
                iArr3[ShowDataSaleOptOutUiPrivacyDirectiveValueV2.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ShowDataSaleOptOutUiPrivacyDirectiveValueV2.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ShowDataSaleOptOutUiPrivacyDirectiveValueV2.SHOW_OPTED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
            int[] iArr4 = new int[DataProcessingPreferenceUiDirectiveValue.values().length];
            try {
                iArr4[DataProcessingPreferenceUiDirectiveValue.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DataProcessingPreferenceUiDirectiveValue.ALLOW_OPT_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DataProcessingPreferenceUiDirectiveValue.ALLOW_OPT_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DataProcessingPreferenceUiDirectiveValue.ALLOW_OPT_IN_OR_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            d = iArr4;
            int[] iArr5 = new int[EmailMarketingOptInUiDirectiveValue.values().length];
            try {
                iArr5[EmailMarketingOptInUiDirectiveValue.UNCHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[EmailMarketingOptInUiDirectiveValue.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[EmailMarketingOptInUiDirectiveValue.DO_NOT_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            e = iArr5;
            int[] iArr6 = new int[PrivacyTargetingValue.values().length];
            try {
                iArr6[PrivacyTargetingValue.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[PrivacyTargetingValue.DISALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f = iArr6;
            int[] iArr7 = new int[ToggleableUiDirectiveValue.values().length];
            try {
                iArr7[ToggleableUiDirectiveValue.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[ToggleableUiDirectiveValue.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            g = iArr7;
        }
    }

    private final AcceptableTracker a(AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue) {
        int i = acceptableTrackersDirectiveValue == null ? -1 : a.b[acceptableTrackersDirectiveValue.ordinal()];
        if (i == 1) {
            return AcceptableTracker.CONTROLLERS;
        }
        if (i == 2) {
            return AcceptableTracker.PROCESSORS;
        }
        if (i == 3) {
            return AcceptableTracker.ESSENTIALS;
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + acceptableTrackersDirectiveValue);
    }

    private final AdConfiguration b(AdConfigurationDirectiveValue adConfigurationDirectiveValue) {
        switch (adConfigurationDirectiveValue == null ? -1 : a.a[adConfigurationDirectiveValue.ordinal()]) {
            case 1:
                return AdConfiguration.FULL;
            case 2:
                return AdConfiguration.NPA;
            case 3:
                return AdConfiguration.ADLUCE;
            case 4:
                return AdConfiguration.ADLUCE_SOCRATES;
            case 5:
                return AdConfiguration.RDP;
            case 6:
                return AdConfiguration.LTD;
            default:
                throw new PurrResponseParserException("Can't parse unknown value=" + adConfigurationDirectiveValue);
        }
    }

    private final DataProcessingPreferenceDirectiveValue c(DataProcessingPreferenceUiDirectiveValue dataProcessingPreferenceUiDirectiveValue) {
        int i = a.d[dataProcessingPreferenceUiDirectiveValue.ordinal()];
        if (i == 1) {
            return DataProcessingPreferenceDirectiveValue.HIDE;
        }
        if (i == 2) {
            return DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN;
        }
        if (i == 3) {
            return DataProcessingPreferenceDirectiveValue.ALLOW_OPT_OUT;
        }
        if (i == 4) {
            return DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN_OR_OUT;
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + dataProcessingPreferenceUiDirectiveValue);
    }

    private final DataSaleOptOutDirectiveValueV2 d(ShowDataSaleOptOutUiPrivacyDirectiveValueV2 showDataSaleOptOutUiPrivacyDirectiveValueV2) {
        int i = a.c[showDataSaleOptOutUiPrivacyDirectiveValueV2.ordinal()];
        if (i == 1) {
            return DataSaleOptOutDirectiveValueV2.SHOW;
        }
        if (i == 2) {
            return DataSaleOptOutDirectiveValueV2.HIDE;
        }
        if (i == 3) {
            return DataSaleOptOutDirectiveValueV2.SHOW_OPTED_OUT;
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + showDataSaleOptOutUiPrivacyDirectiveValueV2);
    }

    private final EmailMarketingOptInDirectiveValue e(EmailMarketingOptInUiDirectiveValue emailMarketingOptInUiDirectiveValue) {
        int i = a.e[emailMarketingOptInUiDirectiveValue.ordinal()];
        if (i == 1) {
            return EmailMarketingOptInDirectiveValue.UNCHECKED;
        }
        if (i == 2) {
            return EmailMarketingOptInDirectiveValue.CHECKED;
        }
        if (i == 3) {
            return EmailMarketingOptInDirectiveValue.DO_NOT_DISPLAY;
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + emailMarketingOptInUiDirectiveValue);
    }

    private final ToggleableDirectiveValue f(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
        int i = a.g[toggleableUiDirectiveValue.ordinal()];
        if (i == 1) {
            return ToggleableDirectiveValue.SHOW;
        }
        if (i == 2) {
            return ToggleableDirectiveValue.HIDE;
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + toggleableUiDirectiveValue);
    }

    private final AcceptableTrackersDirectiveV2 g(cg5.a aVar) {
        return new AcceptableTrackersDirectiveV2(a(aVar.a()));
    }

    private final AdConfigurationDirectiveV2 h(cg5.b bVar) {
        return new AdConfigurationDirectiveV2(b(bVar.a()));
    }

    private final AdConfigurationDirectiveV3 i(cg5.c cVar) {
        return new AdConfigurationDirectiveV3(b(cVar.a()));
    }

    private final EmailMarketingOptInUiPrivacyDirective j(cg5.d dVar) {
        return new EmailMarketingOptInUiPrivacyDirective(e(dVar.a()));
    }

    private final FirstPartyBehavioralTargetingDirective k(cg5.f fVar) {
        int i = a.f[fVar.a().ordinal()];
        if (i == 1) {
            return new FirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue.ALLOWED);
        }
        if (i == 2) {
            return new FirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue.DISALLOWED);
        }
        throw new PurrResponseParserException("Can't parse unknown value=" + fVar);
    }

    private final ShowCaliforniaNoticesUiDirective l(cg5.g gVar) {
        return new ShowCaliforniaNoticesUiDirective(f(gVar.a()));
    }

    private final ShowDataProcessingConsentUiPrivacyDirective m(cg5.h hVar) {
        return new ShowDataProcessingConsentUiPrivacyDirective(f(hVar.a()));
    }

    private final ShowDataProcessingPreferenceUiPrivacyDirective n(cg5.i iVar) {
        return new ShowDataProcessingPreferenceUiPrivacyDirective(c(iVar.a()));
    }

    private final ShowDataSaleOptOutDirectiveV2 o(cg5.j jVar) {
        return new ShowDataSaleOptOutDirectiveV2(d(jVar.a()));
    }

    private final ShowLimitSensitivePIUiDirective p(cg5.k kVar) {
        return new ShowLimitSensitivePIUiDirective(f(kVar.a()));
    }

    private final ShowTCFUIDirective q(cg5.e eVar) {
        return new ShowTCFUIDirective(f(eVar.a()));
    }

    public final PreferenceUpdateResult r(zy4.c cVar) {
        zq3.h(cVar, "result");
        return new PreferenceUpdateResult(s(cVar.a().a()), ApolloExtensionsKt.toModel(cVar.b().a()));
    }

    public final PrivacyDirectives s(cg5 cg5Var) {
        zq3.h(cg5Var, "directives");
        return new PrivacyDirectives(h(cg5Var.b()), i(cg5Var.c()), g(cg5Var.a()), o(cg5Var.j()), m(cg5Var.h()), n(cg5Var.i()), l(cg5Var.g()), j(cg5Var.d()), p(cg5Var.k()), q(cg5Var.e()), k(cg5Var.f()));
    }
}
