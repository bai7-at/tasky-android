package defpackage;

import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.models.Subscription;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class v43 {

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
                iArr[DataConfigId.AllAccessPostLogin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataConfigId.AllAccessPostRegistration.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataConfigId.Regibundle.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataConfigId.WordlebotPaywall.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataConfigId.Games.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataConfigId.GamesPostLogin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataConfigId.GamesPostRegistration.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataConfigId.PlayTab.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DataConfigId.Cooking.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public static final boolean a(u43 u43Var, DataConfigId dataConfigId) {
        zq3.h(u43Var, "<this>");
        switch (dataConfigId == null ? -1 : a.a[dataConfigId.ordinal()]) {
            case -1:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return u43Var.a().contains(Subscription.News);
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return u43Var.a().contains(Subscription.Games);
            case 12:
                return u43Var.a().contains(Subscription.Cooking);
        }
    }
}
