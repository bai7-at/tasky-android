package defpackage;

import com.nytimes.android.growthui.common.models.DataConfigId;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class q53 implements p53 {
    private final qv6 a;

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
                iArr[DataConfigId.PlayTab.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataConfigId.AllAccessPostLogin.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataConfigId.AllAccessPostRegistration.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataConfigId.Regibundle.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataConfigId.Cooking.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataConfigId.Games.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataConfigId.GamesPostLogin.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DataConfigId.GamesPostRegistration.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public q53(qv6 qv6Var) {
        zq3.h(qv6Var, "remoteConfig");
        this.a = qv6Var;
    }

    @Override // defpackage.p53
    public String a(DataConfigId dataConfigId) {
        zq3.h(dataConfigId, "dataConfigId");
        switch (a.a[dataConfigId.ordinal()]) {
            case 1:
            case 2:
                return this.a.C();
            case 3:
                return this.a.x();
            case 4:
                return this.a.G();
            case 5:
                return this.a.p();
            case 6:
            case 7:
                return this.a.A();
            case 8:
                return this.a.D();
            case 9:
            case 10:
            case 11:
            case 12:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
