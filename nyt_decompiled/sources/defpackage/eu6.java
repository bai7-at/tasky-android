package defpackage;

import com.nytimes.android.growthui.common.models.config.OffersMessageType;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleData;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleSkuOverrideData;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.RegibundleUrgencyMessageData;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.SubscriptionData;
import defpackage.bd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class eu6 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OffersMessageType.values().length];
            try {
                iArr[OffersMessageType.SaleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OffersMessageType.FreeTrialMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OffersMessageType.BauMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(RegibundleData regibundleData) {
        String a2;
        zq3.h(regibundleData, "<this>");
        List a3 = regibundleData.a();
        RegibundleSkuOverrideData regibundleSkuOverrideData = null;
        if (a3 != null) {
            Iterator it2 = a3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                RegibundleSkuOverrideData regibundleSkuOverrideData2 = (RegibundleSkuOverrideData) next;
                if (za7.b(regibundleSkuOverrideData2, 0L, 1, null) && !h.d0(regibundleSkuOverrideData2.a())) {
                    regibundleSkuOverrideData = next;
                    break;
                }
            }
            regibundleSkuOverrideData = regibundleSkuOverrideData;
        }
        return (regibundleSkuOverrideData == null || (a2 = regibundleSkuOverrideData.a()) == null) ? regibundleData.d().d() : a2;
    }

    public static final du6 b(RegibundleData regibundleData, zc5 zc5Var) {
        zq3.h(regibundleData, "<this>");
        bd5 c = c(regibundleData, zc5Var);
        return new du6(regibundleData.b(), regibundleData.c(), new SubscriptionData(h(regibundleData, c), i(regibundleData, c), g(regibundleData, c), regibundleData.d().c(), a(regibundleData)), c);
    }

    public static final bd5 c(RegibundleData regibundleData, zc5 zc5Var) {
        zq3.h(regibundleData, "<this>");
        if (zc5Var == null) {
            return bd5.b.a;
        }
        boolean z = !zq3.c(zc5Var.e(), regibundleData.d().d());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zc5.b(zc5Var, null, null, null, z, null, 23, null));
        return bd5.Companion.a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String d(RegibundleData regibundleData) {
        String a2;
        List e = regibundleData.e();
        RegibundleUrgencyMessageData regibundleUrgencyMessageData = null;
        if (e != null) {
            Iterator it2 = e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                RegibundleUrgencyMessageData regibundleUrgencyMessageData2 = (RegibundleUrgencyMessageData) next;
                if (za7.b(regibundleUrgencyMessageData2, 0L, 1, null) && !h.d0(regibundleUrgencyMessageData2.a())) {
                    regibundleUrgencyMessageData = next;
                    break;
                }
            }
            regibundleUrgencyMessageData = regibundleUrgencyMessageData;
        }
        return (regibundleUrgencyMessageData == null || (a2 = regibundleUrgencyMessageData.a()) == null) ? regibundleData.d().a() : a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String e(RegibundleData regibundleData) {
        String b;
        List e = regibundleData.e();
        RegibundleUrgencyMessageData regibundleUrgencyMessageData = null;
        if (e != null) {
            Iterator it2 = e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                RegibundleUrgencyMessageData regibundleUrgencyMessageData2 = (RegibundleUrgencyMessageData) next;
                if (za7.b(regibundleUrgencyMessageData2, 0L, 1, null) && !h.d0(regibundleUrgencyMessageData2.b())) {
                    regibundleUrgencyMessageData = next;
                    break;
                }
            }
            regibundleUrgencyMessageData = regibundleUrgencyMessageData;
        }
        return (regibundleUrgencyMessageData == null || (b = regibundleUrgencyMessageData.b()) == null) ? regibundleData.d().b() : b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String f(RegibundleData regibundleData) {
        String c;
        List e = regibundleData.e();
        RegibundleUrgencyMessageData regibundleUrgencyMessageData = null;
        if (e != null) {
            Iterator it2 = e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                RegibundleUrgencyMessageData regibundleUrgencyMessageData2 = (RegibundleUrgencyMessageData) next;
                if (za7.b(regibundleUrgencyMessageData2, 0L, 1, null) && !h.d0(regibundleUrgencyMessageData2.c())) {
                    regibundleUrgencyMessageData = next;
                    break;
                }
            }
            regibundleUrgencyMessageData = regibundleUrgencyMessageData;
        }
        return (regibundleUrgencyMessageData == null || (c = regibundleUrgencyMessageData.c()) == null) ? regibundleData.d().e() : c;
    }

    public static final String g(RegibundleData regibundleData, bd5 bd5Var) {
        zq3.h(regibundleData, "<this>");
        zq3.h(bd5Var, "offersState");
        if (!(bd5Var instanceof bd5.c)) {
            return regibundleData.d().e();
        }
        int i = a.a[((bd5.c) bd5Var).a().ordinal()];
        if (i == 1) {
            return d(regibundleData);
        }
        if (i == 2 || i == 3) {
            return regibundleData.d().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String h(RegibundleData regibundleData, bd5 bd5Var) {
        zq3.h(regibundleData, "<this>");
        zq3.h(bd5Var, "offersState");
        if (!(bd5Var instanceof bd5.c)) {
            return regibundleData.d().e();
        }
        int i = a.a[((bd5.c) bd5Var).a().ordinal()];
        if (i == 1) {
            return e(regibundleData);
        }
        if (i == 2 || i == 3) {
            return regibundleData.d().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String i(RegibundleData regibundleData, bd5 bd5Var) {
        zq3.h(regibundleData, "<this>");
        zq3.h(bd5Var, "offersState");
        if (!(bd5Var instanceof bd5.c)) {
            return regibundleData.d().e();
        }
        int i = a.a[((bd5.c) bd5Var).a().ordinal()];
        if (i == 1) {
            return f(regibundleData);
        }
        if (i == 2 || i == 3) {
            return regibundleData.d().e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
