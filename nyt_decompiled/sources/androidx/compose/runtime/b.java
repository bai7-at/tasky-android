package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import defpackage.bi5;
import defpackage.es0;
import defpackage.hd;
import defpackage.j17;
import defpackage.nv6;
import defpackage.ov6;
import defpackage.pv6;
import defpackage.ww8;
import defpackage.xs3;
import defpackage.yv3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract class b {
    private static final Object a = new bi5("provider");
    private static final Object b = new bi5("provider");
    private static final Object c = new bi5("compositionLocalMap");
    private static final Object d = new bi5("providerValues");
    private static final Object e = new bi5("providers");
    private static final Object f = new bi5("reference");
    private static final Comparator g = new Comparator() { // from class: androidx.compose.runtime.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b2;
            b2 = b.b((j) obj, (j) obj2);
            return b2;
        }
    };

    public static final Object A() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(yv3 yv3Var) {
        return yv3Var.d() != null ? new xs3(Integer.valueOf(yv3Var.a()), yv3Var.d()) : Integer.valueOf(yv3Var.a());
    }

    public static final Object C() {
        return b;
    }

    public static final Object D() {
        return e;
    }

    public static final Object E() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int x = x(list, i);
        IdentityArraySet identityArraySet = null;
        if (x < 0) {
            int i2 = -(x + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new j(recomposeScopeImpl, i, identityArraySet));
            return;
        }
        if (obj == null) {
            ((j) list.get(x)).e(null);
            return;
        }
        IdentityArraySet a2 = ((j) list.get(x)).a();
        if (a2 != null) {
            a2.add(obj);
        }
    }

    public static final boolean G() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap H() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(q qVar, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (qVar.M(i) == i2) {
            return i2;
        }
        if (qVar.M(i2) == i) {
            return i;
        }
        if (qVar.M(i) == qVar.M(i2)) {
            return qVar.M(i);
        }
        int v = v(qVar, i, i3);
        int v2 = v(qVar, i2, i3);
        int i4 = v - v2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = qVar.M(i);
        }
        int i6 = v2 - v;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = qVar.M(i2);
        }
        while (i != i2) {
            i = qVar.M(i);
            i2 = qVar.M(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J(HashMap hashMap, Object obj) {
        Object l0;
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet == null || (l0 = kotlin.collections.i.l0(linkedHashSet)) == null) {
            return null;
        }
        L(hashMap, obj, l0);
        return l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(HashMap hashMap, Object obj, Object obj2) {
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = new LinkedHashSet();
            hashMap.put(obj, obj3);
        }
        return ((LinkedHashSet) obj3).add(obj2);
    }

    private static final ww8 L(HashMap hashMap, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(obj2);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(obj);
        }
        return ww8.a;
    }

    public static final void M(t tVar, nv6 nv6Var) {
        Iterator k0 = tVar.k0();
        while (k0.hasNext()) {
            Object next = k0.next();
            if (next instanceof es0) {
                nv6Var.b((es0) next);
            }
            if (next instanceof pv6) {
                nv6Var.d(((pv6) next).a());
            }
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).x();
            }
        }
        tVar.K0();
    }

    private static final void N(t tVar, int i, int i2, Object obj) {
        if (obj == tVar.Q0(i, i2, Composer.a.a())) {
            return;
        }
        t("Slot table is out of sync");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j O(List list, int i) {
        int x = x(list, i);
        if (x >= 0) {
            return (j) list.remove(x);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(List list, int i, int i2) {
        int w = w(list, i);
        while (w < list.size() && ((j) list.get(w)).b() < i2) {
            list.remove(w);
        }
    }

    public static final void Q(boolean z) {
        if (z) {
            return;
        }
        t("Check failed");
        throw new KotlinNothingValueException();
    }

    public static final void R() {
    }

    public static final void S(int i, int i2, int i3, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(j jVar, j jVar2) {
        return zq3.j(jVar.b(), jVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(r rVar, hd hdVar) {
        ArrayList arrayList = new ArrayList();
        q y = rVar.y();
        try {
            s(y, arrayList, rVar.c(hdVar));
            ww8 ww8Var = ww8.a;
            return arrayList;
        } finally {
            y.d();
        }
    }

    private static final void s(q qVar, List list, int i) {
        if (qVar.G(i)) {
            list.add(qVar.I(i));
            return;
        }
        int i2 = i + 1;
        int B = i + qVar.B(i);
        while (i2 < B) {
            s(qVar, list, i2);
            i2 += qVar.B(i2);
        }
    }

    public static final Void t(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void u(t tVar, nv6 nv6Var) {
        int g0;
        int Y0;
        int g02;
        int a0 = tVar.a0();
        int b0 = tVar.b0();
        while (a0 < b0) {
            Object A0 = tVar.A0(a0);
            if (A0 instanceof es0) {
                nv6Var.e((es0) A0);
            }
            g0 = tVar.g0(a0);
            Y0 = tVar.Y0(tVar.b, g0);
            int[] iArr = tVar.b;
            int i = a0 + 1;
            g02 = tVar.g0(i);
            int Q = tVar.Q(iArr, g02);
            for (int i2 = Y0; i2 < Q; i2++) {
                int i3 = i2 - Y0;
                Object obj = tVar.c[tVar.R(i2)];
                if (obj instanceof pv6) {
                    ov6 a2 = ((pv6) obj).a();
                    if (!(a2 instanceof j17)) {
                        N(tVar, a0, i3, obj);
                        nv6Var.d(a2);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    N(tVar, a0, i3, obj);
                    ((RecomposeScopeImpl) obj).x();
                }
            }
            a0 = i;
        }
    }

    private static final int v(q qVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = qVar.M(i);
            i3++;
        }
        return i3;
    }

    private static final int w(List list, int i) {
        int x = x(list, i);
        return x < 0 ? -(x + 1) : x;
    }

    private static final int x(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int j = zq3.j(((j) list.get(i3)).b(), i);
            if (j < 0) {
                i2 = i3 + 1;
            } else {
                if (j <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j y(List list, int i, int i2) {
        int w = w(list, i);
        if (w >= list.size()) {
            return null;
        }
        j jVar = (j) list.get(w);
        if (jVar.b() < i2) {
            return jVar;
        }
        return null;
    }

    public static final Object z() {
        return c;
    }
}
