package defpackage;

import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.models.ProductType;
import com.nytimes.android.growthui.common.models.config.OffersMessageType;
import com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthSkuOverrideData;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthUrgencyMessageData;
import defpackage.bd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class k06 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OffersMessageType.values().length];
            try {
                iArr[OffersMessageType.FreeTrialMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OffersMessageType.SaleMessage.ordinal()] = 2;
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
    public static final String a(PostAuthData postAuthData) {
        String a2;
        zq3.h(postAuthData, "<this>");
        List b = postAuthData.b();
        PostAuthSkuOverrideData postAuthSkuOverrideData = null;
        if (b != null) {
            Iterator it2 = b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                PostAuthSkuOverrideData postAuthSkuOverrideData2 = (PostAuthSkuOverrideData) next;
                if (za7.b(postAuthSkuOverrideData2, 0L, 1, null) && !h.d0(postAuthSkuOverrideData2.a())) {
                    postAuthSkuOverrideData = next;
                    break;
                }
            }
            postAuthSkuOverrideData = postAuthSkuOverrideData;
        }
        return (postAuthSkuOverrideData == null || (a2 = postAuthSkuOverrideData.a()) == null) ? postAuthData.q() : a2;
    }

    public static final j06 b(PostAuthData postAuthData, boolean z, ProductType productType, zc5 zc5Var) {
        oh3 oh3Var;
        zq3.h(postAuthData, "<this>");
        zq3.h(productType, "productType");
        bd5 e = e(postAuthData, zc5Var, productType);
        String a2 = z ? postAuthData.a() : postAuthData.m();
        String s = postAuthData.s();
        String h = h(postAuthData, e);
        List<String> k = postAuthData.k();
        if (k != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : k) {
                Integer num = (Integer) me3.a().get(str);
                he3 he3Var = num != null ? new he3(str, num.intValue()) : null;
                if (he3Var != null) {
                    arrayList.add(he3Var);
                }
            }
            oh3Var = new oh3(arrayList);
        } else {
            oh3Var = null;
        }
        return new j06(new m06(a2, s, "", h, oh3Var), new n06(postAuthData.e(), postAuthData.f(), postAuthData.h(), f(postAuthData)), new o06(e, postAuthData.c(), d(postAuthData, e), postAuthData.d()), postAuthData.r());
    }

    private static final String c(PostAuthData postAuthData) {
        return postAuthData.l();
    }

    public static final String d(PostAuthData postAuthData, bd5 bd5Var) {
        zq3.h(postAuthData, "<this>");
        zq3.h(bd5Var, "offersState");
        if (!(bd5Var instanceof bd5.c)) {
            return c(postAuthData);
        }
        int i = a.a[((bd5.c) bd5Var).a().ordinal()];
        if (i == 1) {
            return postAuthData.i();
        }
        if (i == 2 || i == 3) {
            return postAuthData.g();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final bd5 e(PostAuthData postAuthData, zc5 zc5Var, ProductType productType) {
        zq3.h(postAuthData, "<this>");
        zq3.h(productType, "productType");
        if (zc5Var == null) {
            return bd5.b.a;
        }
        boolean z = !zq3.c(zc5Var.e(), postAuthData.q());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zc5.b(zc5Var, "", null, null, z, productType, 6, null));
        return bd5.Companion.a(arrayList);
    }

    public static final oh3 f(PostAuthData postAuthData) {
        zq3.h(postAuthData, "<this>");
        List<ValuePropData> t = postAuthData.t();
        ArrayList arrayList = new ArrayList(i.w(t, 10));
        for (ValuePropData valuePropData : t) {
            Integer num = (Integer) me3.a().get(valuePropData.a());
            arrayList.add(new w39(new he3("", num != null ? num.intValue() : R.drawable.ic_main), valuePropData.c(), valuePropData.b()));
        }
        return new oh3(arrayList);
    }

    private static final String g(PostAuthData postAuthData) {
        String j = postAuthData.j();
        return h.d0(j) ? postAuthData.l() : j;
    }

    public static final String h(PostAuthData postAuthData, bd5 bd5Var) {
        zq3.h(postAuthData, "<this>");
        zq3.h(bd5Var, "offersState");
        if (!(bd5Var instanceof bd5.c)) {
            return c(postAuthData);
        }
        int i = a.a[((bd5.c) bd5Var).a().ordinal()];
        if (i == 1) {
            return g(postAuthData);
        }
        if (i == 2) {
            return i(postAuthData);
        }
        if (i == 3) {
            return c(postAuthData);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String i(PostAuthData postAuthData) {
        String a2;
        List p = postAuthData.p();
        PostAuthUrgencyMessageData postAuthUrgencyMessageData = null;
        if (p != null) {
            Iterator it2 = p.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                PostAuthUrgencyMessageData postAuthUrgencyMessageData2 = (PostAuthUrgencyMessageData) next;
                if (za7.b(postAuthUrgencyMessageData2, 0L, 1, null) && !h.d0(postAuthUrgencyMessageData2.a())) {
                    postAuthUrgencyMessageData = next;
                    break;
                }
            }
            postAuthUrgencyMessageData = postAuthUrgencyMessageData;
        }
        return (postAuthUrgencyMessageData == null || (a2 = postAuthUrgencyMessageData.a()) == null) ? postAuthData.l() : a2;
    }
}
