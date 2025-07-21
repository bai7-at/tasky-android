package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.aj7;
import defpackage.bj7;
import defpackage.dg4;
import defpackage.e64;
import defpackage.hj7;
import defpackage.ij7;
import defpackage.kt6;
import defpackage.kz3;
import defpackage.n27;
import defpackage.ss2;
import defpackage.u2;
import defpackage.yg;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final kt6 a = new kt6(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(SemanticsNode semanticsNode) {
        return semanticsNode.v().t() || semanticsNode.v().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(SemanticsNode semanticsNode) {
        return (semanticsNode.y() || semanticsNode.v().f(SemanticsProperties.a.l())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(SemanticsNode semanticsNode, bj7 bj7Var) {
        Iterator it2 = bj7Var.iterator();
        while (it2.hasNext()) {
            if (!semanticsNode.m().f((SemanticsPropertyKey) ((Map.Entry) it2.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final View D(yg ygVar, int i) {
        Object obj;
        Iterator<T> it2 = ygVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).m0() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(int i) {
        n27.a aVar = n27.b;
        if (n27.k(i, aVar.a())) {
            return "android.widget.Button";
        }
        if (n27.k(i, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (n27.k(i, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (n27.k(i, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (n27.k(i, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(u2 u2Var, Object obj) {
        if (u2Var == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var2 = (u2) obj;
        if (!zq3.c(u2Var.b(), u2Var2.b())) {
            return false;
        }
        if (u2Var.a() != null || u2Var2.a() == null) {
            return u2Var.a() == null || u2Var2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.a(semanticsNode.m(), SemanticsProperties.a.d()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(SemanticsNode semanticsNode) {
        if (semanticsNode.v().f(aj7.a.w()) && !zq3.c(SemanticsConfigurationKt.a(semanticsNode.v(), SemanticsProperties.a.g()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode s = s(semanticsNode.p(), new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r1.f(defpackage.aj7.a.w()) != false) goto L10;
             */
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                /*
                    r1 = this;
                    bj7 r1 = r2.G()
                    if (r1 == 0) goto L1a
                    boolean r2 = r1.t()
                    r0 = 1
                    if (r2 != r0) goto L1a
                    aj7 r2 = defpackage.aj7.a
                    androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.w()
                    boolean r1 = r1.f(r2)
                    if (r1 == 0) goto L1a
                    goto L1b
                L1a:
                    r0 = 0
                L1b:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        });
        if (s != null) {
            bj7 G = s.G();
            if (!(G != null ? zq3.c(SemanticsConfigurationKt.a(G, SemanticsProperties.a.g()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t r(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((t) list.get(i2)).d() == i) {
                return (t) list.get(i2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode s(LayoutNode layoutNode, ss2 ss2Var) {
        for (LayoutNode k0 = layoutNode.k0(); k0 != null; k0 = k0.k0()) {
            if (((Boolean) ss2Var.invoke(k0)).booleanValue()) {
                return k0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map t(ij7 ij7Var) {
        SemanticsNode a2 = ij7Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a2.p().e() && a2.p().G0()) {
            kt6 i = a2.i();
            u(new Region(dg4.d(i.i()), dg4.d(i.l()), dg4.d(i.j()), dg4.d(i.e())), a2, linkedHashMap, a2, new Region());
        }
        return linkedHashMap;
    }

    private static final void u(Region region, SemanticsNode semanticsNode, Map map, SemanticsNode semanticsNode2, Region region2) {
        kz3 o;
        boolean z = (semanticsNode2.p().e() && semanticsNode2.p().G0()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.n() == semanticsNode.n()) {
            if (!z || semanticsNode2.w()) {
                kt6 u = semanticsNode2.u();
                int d = dg4.d(u.i());
                int d2 = dg4.d(u.l());
                int d3 = dg4.d(u.j());
                int d4 = dg4.d(u.e());
                region2.set(d, d2, d3, d4);
                int n = semanticsNode2.n() == semanticsNode.n() ? -1 : semanticsNode2.n();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (semanticsNode2.w()) {
                        SemanticsNode q = semanticsNode2.q();
                        kt6 i = (q == null || (o = q.o()) == null || !o.e()) ? a : q.i();
                        map.put(Integer.valueOf(n), new hj7(semanticsNode2, new Rect(dg4.d(i.i()), dg4.d(i.l()), dg4.d(i.j()), dg4.d(i.e()))));
                        return;
                    } else {
                        if (n == -1) {
                            map.put(Integer.valueOf(n), new hj7(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                map.put(Integer.valueOf(n), new hj7(semanticsNode2, region2.getBounds()));
                List s = semanticsNode2.s();
                for (int size = s.size() - 1; -1 < size; size--) {
                    u(region, semanticsNode, map, (SemanticsNode) s.get(size), region2);
                }
                if (A(semanticsNode2)) {
                    region.op(d, d2, d3, d4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final boolean v() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.v(), SemanticsProperties.a.c());
        if (list != null) {
            return (String) kotlin.collections.i.m0(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.v(), SemanticsProperties.a.z());
        if (list != null) {
            return e64.e(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(SemanticsNode semanticsNode) {
        return semanticsNode.m().f(SemanticsProperties.a.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode k0 = layoutNode2.k0();
        if (k0 == null) {
            return false;
        }
        return zq3.c(k0, layoutNode) || z(layoutNode, k0);
    }
}
