package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.entitlements.purr.client.DirectiveKeys;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrOptOutStatus;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingConsentDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrTCFUIDirective;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class x86 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataSaleOptOutDirectiveValueV2.values().length];
            try {
                iArr[DataSaleOptOutDirectiveValueV2.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSaleOptOutDirectiveValueV2.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSaleOptOutDirectiveValueV2.SHOW_OPTED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final Map a(PrivacyConfiguration privacyConfiguration, List list) {
        zq3.h(privacyConfiguration, "<this>");
        zq3.h(list, "keys");
        Map b = b(privacyConfiguration.getDirectives());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : b.entrySet()) {
            if (list.isEmpty() || list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Map b(List list) {
        Pair a2;
        zq3.h(list, "<this>");
        List<PurrPrivacyDirective> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list2, 10)), 16));
        for (PurrPrivacyDirective purrPrivacyDirective : list2) {
            if (purrPrivacyDirective instanceof PurrAcceptableTrackersDirectiveV2) {
                a2 = du8.a(DirectiveKeys.AcceptableTrackersDirectiveV2.getKey(), c(((PurrAcceptableTrackersDirectiveV2) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV2) {
                a2 = du8.a(DirectiveKeys.AdvertisingConfigurationDirectiveV2.getKey(), c(((PurrAdvertisingConfigurationDirectiveV2) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV3) {
                a2 = du8.a(DirectiveKeys.AdvertisingConfigurationDirectiveV3.getKey(), c(((PurrAdvertisingConfigurationDirectiveV3) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrDataSaleOptOutDirectiveV2) {
                a2 = du8.a(DirectiveKeys.DataSalesOptOutDirectiveV2.getKey(), c(((PurrDataSaleOptOutDirectiveV2) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrShowDataProcessingConsentDirective) {
                a2 = du8.a(DirectiveKeys.DataProcessingConsentUIDirective.getKey(), c(((PurrShowDataProcessingConsentDirective) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrShowDataProcessingPreferenceDirective) {
                a2 = du8.a(DirectiveKeys.DataProcessingPreferenceUIDirective.getKey(), c(((PurrShowDataProcessingPreferenceDirective) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrShowCaliforniaNoticesUiDirective) {
                a2 = du8.a(DirectiveKeys.ShowCaliforniaNoticesUI.getKey(), c(((PurrShowCaliforniaNoticesUiDirective) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrEmailMarketingOptInUiDirective) {
                a2 = du8.a(DirectiveKeys.EmailMarketingOptInUI.getKey(), c(((PurrEmailMarketingOptInUiDirective) purrPrivacyDirective).getValue().name()));
            } else if (purrPrivacyDirective instanceof PurrShowLimitSensitivePIUiDirective) {
                a2 = du8.a(DirectiveKeys.ShowLimitSensitivePIUiDirective.getKey(), c(((PurrShowLimitSensitivePIUiDirective) purrPrivacyDirective).getValue().name()));
            } else {
                if (!(purrPrivacyDirective instanceof PurrTCFUIDirective)) {
                    throw new IllegalArgumentException("unrecognized directive: " + purrPrivacyDirective);
                }
                a2 = du8.a(DirectiveKeys.ShowPurrTCFUIDirective.getKey(), c(((PurrTCFUIDirective) purrPrivacyDirective).getValue().name()));
            }
            linkedHashMap.put(a2.c(), a2.d());
        }
        return linkedHashMap;
    }

    private static final String c(String str) {
        Locale locale = Locale.US;
        zq3.g(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.F(lowerCase, QueryKeys.END_MARKER, "-", false, 4, null);
    }

    public static final PurrOptOutStatus d(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2) {
        zq3.h(dataSaleOptOutDirectiveValueV2, "<this>");
        int i = a.a[dataSaleOptOutDirectiveValueV2.ordinal()];
        if (i == 1) {
            return PurrOptOutStatus.HIDE;
        }
        if (i == 2) {
            return PurrOptOutStatus.SHOW_OPT_OUT_ACTION;
        }
        if (i == 3) {
            return PurrOptOutStatus.SHOW_OPTED_OUT_MSG;
        }
        throw new NoWhenBranchMatchedException();
    }
}
