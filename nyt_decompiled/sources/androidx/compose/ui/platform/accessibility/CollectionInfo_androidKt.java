package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import defpackage.bj7;
import defpackage.fd5;
import defpackage.h3;
import defpackage.hd5;
import defpackage.hn0;
import defpackage.lh4;
import defpackage.qs2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class CollectionInfo_androidKt {
    private static final boolean a(List list) {
        List l;
        long x;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            l = i.l();
        } else {
            l = new ArrayList();
            Object obj = list.get(0);
            int n = i.n(list);
            int i = 0;
            while (i < n) {
                i++;
                Object obj2 = list.get(i);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                l.add(fd5.d(hd5.a(Math.abs(fd5.o(semanticsNode2.i().g()) - fd5.o(semanticsNode.i().g())), Math.abs(fd5.p(semanticsNode2.i().g()) - fd5.p(semanticsNode.i().g())))));
                obj = obj2;
            }
        }
        if (l.size() == 1) {
            x = ((fd5) i.k0(l)).x();
        } else {
            if (l.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object k0 = i.k0(l);
            int n2 = i.n(l);
            if (1 <= n2) {
                int i2 = 1;
                while (true) {
                    k0 = fd5.d(fd5.t(((fd5) k0).x(), ((fd5) l.get(i2)).x()));
                    if (i2 == n2) {
                        break;
                    }
                    i2++;
                }
            }
            x = ((fd5) k0).x();
        }
        return fd5.f(x) < fd5.e(x);
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        bj7 m = semanticsNode.m();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (SemanticsConfigurationKt.a(m, semanticsProperties.a()) == null && SemanticsConfigurationKt.a(semanticsNode.m(), semanticsProperties.v()) == null) ? false : true;
    }

    private static final boolean c(hn0 hn0Var) {
        return hn0Var.b() < 0 || hn0Var.a() < 0;
    }

    public static final void d(SemanticsNode semanticsNode, h3 h3Var) {
        bj7 m = semanticsNode.m();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        hn0 hn0Var = (hn0) SemanticsConfigurationKt.a(m, semanticsProperties.a());
        if (hn0Var != null) {
            h3Var.g0(f(hn0Var));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(semanticsNode.m(), semanticsProperties.v()) != null) {
            List s = semanticsNode.s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i);
                if (semanticsNode2.m().f(SemanticsProperties.a.w())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean a = a(arrayList);
        h3Var.g0(h3.e.a(a ? 1 : arrayList.size(), a ? arrayList.size() : 1, false, 0));
    }

    public static final void e(SemanticsNode semanticsNode, h3 h3Var) {
        bj7 m = semanticsNode.m();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        lh4.a(SemanticsConfigurationKt.a(m, semanticsProperties.b()));
        SemanticsNode q = semanticsNode.q();
        if (q == null || SemanticsConfigurationKt.a(q.m(), semanticsProperties.v()) == null) {
            return;
        }
        hn0 hn0Var = (hn0) SemanticsConfigurationKt.a(q.m(), semanticsProperties.a());
        if ((hn0Var == null || !c(hn0Var)) && semanticsNode.m().f(semanticsProperties.w())) {
            ArrayList arrayList = new ArrayList();
            List s = q.s();
            int size = s.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i2);
                if (semanticsNode2.m().f(SemanticsProperties.a.w())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.p().l0() < semanticsNode.p().l0()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean a = a(arrayList);
            h3.f a2 = h3.f.a(a ? 0 : i, 1, a ? i : 0, 1, false, ((Boolean) semanticsNode.m().o(SemanticsProperties.a.w(), new qs2() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            if (a2 != null) {
                h3Var.h0(a2);
            }
        }
    }

    private static final h3.e f(hn0 hn0Var) {
        return h3.e.a(hn0Var.b(), hn0Var.a(), false, 0);
    }
}
