package defpackage;

import com.nytimes.android.growthui.common.models.DataConfigId;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class l43 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataConfigId.values().length];
            try {
                iArr[DataConfigId.AllAccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataConfigId.AllAccessLandingPageAsPaywall.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataConfigId.AllAccessPaywall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataConfigId.WordlebotPaywall.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataConfigId.Cooking.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataConfigId.PlayTab.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataConfigId.Games.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataConfigId.AllAccessPostLogin.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataConfigId.GamesPostLogin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataConfigId.AllAccessPostRegistration.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataConfigId.GamesPostRegistration.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DataConfigId.Regibundle.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public static final String a(DataConfigId dataConfigId) {
        switch (dataConfigId == null ? -1 : a.a[dataConfigId.ordinal()]) {
            case -1:
                return "unknown plp";
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return "all access";
            case 2:
            case 3:
                return "paywall";
            case 4:
                return "wordlebot paywall";
            case 5:
                return "cooking plp";
            case 6:
            case 7:
                return "games plp";
            case 8:
            case 9:
                return "post login offer";
            case 10:
            case 11:
                return "post regi offer";
            case 12:
                return "gateway";
        }
    }
}
