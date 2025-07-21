package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import defpackage.bn1;
import defpackage.bv0;
import defpackage.c04;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.ig9;
import defpackage.in3;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u08;
import defpackage.vq8;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public class Measurer implements b.InterfaceC0071b, bn1 {
    private String a = "";
    private final androidx.constraintlayout.core.widgets.d b;
    private final Map c;
    private final Map d;
    private final Map e;
    protected fm1 f;
    protected androidx.compose.ui.layout.f g;
    private final c04 h;
    private final int[] i;
    private final int[] j;
    private float k;
    private int l;
    private int m;
    private ArrayList n;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            a = iArr;
        }
    }

    public Measurer() {
        androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d(0, 0);
        dVar.Y1(this);
        ww8 ww8Var = ww8.a;
        this.b = dVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.h = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.constraintlayout.compose.Measurer$state$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final u08 mo865invoke() {
                return new u08(Measurer.this.f());
            }
        });
        this.i = new int[2];
        this.j = new int[2];
        this.k = Float.NaN;
        this.n = new ArrayList();
    }

    private final void e(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.e);
        numArr[1] = Integer.valueOf(aVar.f);
        numArr[2] = Integer.valueOf(aVar.g);
    }

    private final boolean j(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        boolean z3;
        boolean z4;
        int i5 = a.a[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
        } else {
            if (i5 == 2) {
                iArr[0] = 0;
                iArr[1] = i4;
                return true;
            }
            if (i5 == 3) {
                z3 = ConstraintLayoutKt.a;
                if (z3) {
                    Log.d("CCL", zq3.q("Measure strategy ", Integer.valueOf(i3)));
                    Log.d("CCL", zq3.q("DW ", Integer.valueOf(i2)));
                    Log.d("CCL", zq3.q("ODR ", Boolean.valueOf(z)));
                    Log.d("CCL", zq3.q("IRH ", Boolean.valueOf(z2)));
                }
                boolean z5 = z2 || ((i3 == b.a.l || i3 == b.a.m) && (i3 == b.a.m || i2 != 1 || z));
                z4 = ConstraintLayoutKt.a;
                if (z4) {
                    Log.d("CCL", zq3.q("UD ", Boolean.valueOf(z5)));
                }
                iArr[0] = z5 ? i : 0;
                if (!z5) {
                    i = i4;
                }
                iArr[1] = i;
                if (!z5) {
                    return true;
                }
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
                }
                iArr[0] = i4;
                iArr[1] = i4;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0071b
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r20.x == 0) goto L77;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0071b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(androidx.constraintlayout.core.widgets.ConstraintWidget r20, androidx.constraintlayout.core.widgets.analyzer.b.a r21) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.b(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.b$a):void");
    }

    protected final void c(long j) {
        this.b.m1(fv0.n(j));
        this.b.N0(fv0.m(j));
        this.k = Float.NaN;
        this.l = this.b.Y();
        this.m = this.b.x();
    }

    public void d() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.b.Y() + " ,");
        sb.append("  bottom:  " + this.b.x() + " ,");
        sb.append(" } }");
        Iterator it2 = this.b.t1().iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
            Object s = constraintWidget2.s();
            if (s instanceof qg4) {
                ig9 ig9Var = null;
                if (constraintWidget2.o == null) {
                    qg4 qg4Var = (qg4) s;
                    Object a2 = androidx.compose.ui.layout.b.a(qg4Var);
                    if (a2 == null) {
                        a2 = zu0.a(qg4Var);
                    }
                    constraintWidget2.o = a2 == null ? null : a2.toString();
                }
                ig9 ig9Var2 = (ig9) this.e.get(s);
                if (ig9Var2 != null && (constraintWidget = ig9Var2.a) != null) {
                    ig9Var = constraintWidget.n;
                }
                if (ig9Var != null) {
                    sb.append(' ' + ((Object) constraintWidget2.o) + ": {");
                    sb.append(" interpolated : ");
                    ig9Var.d(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                sb.append(' ' + ((Object) constraintWidget2.o) + ": {");
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                if (fVar.u1() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + fVar.Z() + ", top: " + fVar.a0() + ", right: " + (fVar.Z() + fVar.Y()) + ", bottom: " + (fVar.a0() + fVar.x()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        zq3.g(sb2, "json.toString()");
        this.a = sb2;
    }

    protected final fm1 f() {
        fm1 fm1Var = this.f;
        if (fm1Var != null) {
            return fm1Var;
        }
        zq3.z("density");
        throw null;
    }

    protected final Map g() {
        return this.e;
    }

    protected final Map h() {
        return this.c;
    }

    protected final u08 i() {
        return (u08) this.h.getValue();
    }

    public final void k(l.a aVar, List list) {
        zq3.h(aVar, "<this>");
        zq3.h(list, "measurables");
        if (this.e.isEmpty()) {
            Iterator it2 = this.b.t1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
                Object s = constraintWidget.s();
                if (s instanceof qg4) {
                    this.e.put(s, new ig9(constraintWidget.n.h()));
                }
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                qg4 qg4Var = (qg4) list.get(i);
                final ig9 ig9Var = (ig9) g().get(qg4Var);
                if (ig9Var == null) {
                    return;
                }
                if (ig9Var.c()) {
                    ig9 ig9Var2 = (ig9) g().get(qg4Var);
                    zq3.e(ig9Var2);
                    int i3 = ig9Var2.b;
                    ig9 ig9Var3 = (ig9) g().get(qg4Var);
                    zq3.e(ig9Var3);
                    int i4 = ig9Var3.c;
                    l lVar = (l) h().get(qg4Var);
                    if (lVar != null) {
                        l.a.h(aVar, lVar, wm3.a(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    ss2 ss2Var = new ss2() { // from class: androidx.constraintlayout.compose.Measurer$performLayout$1$layerBlock$1
                        {
                            super(1);
                        }

                        public final void b(androidx.compose.ui.graphics.c cVar) {
                            zq3.h(cVar, "$this$null");
                            if (!Float.isNaN(ig9.this.f) || !Float.isNaN(ig9.this.g)) {
                                cVar.m0(vq8.a(Float.isNaN(ig9.this.f) ? 0.5f : ig9.this.f, Float.isNaN(ig9.this.g) ? 0.5f : ig9.this.g));
                            }
                            if (!Float.isNaN(ig9.this.h)) {
                                cVar.q(ig9.this.h);
                            }
                            if (!Float.isNaN(ig9.this.i)) {
                                cVar.r(ig9.this.i);
                            }
                            if (!Float.isNaN(ig9.this.j)) {
                                cVar.s(ig9.this.j);
                            }
                            if (!Float.isNaN(ig9.this.k)) {
                                cVar.x(ig9.this.k);
                            }
                            if (!Float.isNaN(ig9.this.l)) {
                                cVar.g(ig9.this.l);
                            }
                            if (!Float.isNaN(ig9.this.m)) {
                                cVar.G0(ig9.this.m);
                            }
                            if (!Float.isNaN(ig9.this.n) || !Float.isNaN(ig9.this.o)) {
                                cVar.n(Float.isNaN(ig9.this.n) ? 1.0f : ig9.this.n);
                                cVar.t(Float.isNaN(ig9.this.o) ? 1.0f : ig9.this.o);
                            }
                            if (Float.isNaN(ig9.this.p)) {
                                return;
                            }
                            cVar.c(ig9.this.p);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((androidx.compose.ui.graphics.c) obj);
                            return ww8.a;
                        }
                    };
                    ig9 ig9Var4 = (ig9) g().get(qg4Var);
                    zq3.e(ig9Var4);
                    int i5 = ig9Var4.b;
                    ig9 ig9Var5 = (ig9) g().get(qg4Var);
                    zq3.e(ig9Var5);
                    int i6 = ig9Var5.c;
                    float f = Float.isNaN(ig9Var.m) ? 0.0f : ig9Var.m;
                    l lVar2 = (l) h().get(qg4Var);
                    if (lVar2 != null) {
                        aVar.q(lVar2, i5, i6, f, ss2Var);
                    }
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (LayoutInfoFlags.BOUNDS == null) {
            d();
        }
    }

    public final long l(long j, LayoutDirection layoutDirection, bv0 bv0Var, List list, int i, androidx.compose.ui.layout.f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String g;
        String g2;
        String obj;
        zq3.h(layoutDirection, "layoutDirection");
        zq3.h(bv0Var, "constraintSet");
        zq3.h(list, "measurables");
        zq3.h(fVar, "measureScope");
        n(fVar);
        o(fVar);
        i().l(fv0.l(j) ? androidx.constraintlayout.core.state.b.a(fv0.n(j)) : androidx.constraintlayout.core.state.b.c().h(fv0.p(j)));
        i().e(fv0.k(j) ? androidx.constraintlayout.core.state.b.a(fv0.m(j)) : androidx.constraintlayout.core.state.b.c().h(fv0.o(j)));
        i().q(j);
        i().p(layoutDirection);
        m();
        if (bv0Var.a(list)) {
            i().h();
            bv0Var.b(i(), list);
            ConstraintLayoutKt.d(i(), list);
            i().a(this.b);
        } else {
            ConstraintLayoutKt.d(i(), list);
        }
        c(j);
        this.b.d2();
        z = ConstraintLayoutKt.a;
        if (z) {
            this.b.E0("ConstraintLayout");
            ArrayList<ConstraintWidget> t1 = this.b.t1();
            zq3.g(t1, "root.children");
            for (ConstraintWidget constraintWidget : t1) {
                Object s = constraintWidget.s();
                qg4 qg4Var = s instanceof qg4 ? (qg4) s : null;
                Object a2 = qg4Var == null ? null : androidx.compose.ui.layout.b.a(qg4Var);
                String str = "NOTAG";
                if (a2 != null && (obj = a2.toString()) != null) {
                    str = obj;
                }
                constraintWidget.E0(str);
            }
            Log.d("CCL", zq3.q("ConstraintLayout is asked to measure with ", fv0.s(j)));
            g = ConstraintLayoutKt.g(this.b);
            Log.d("CCL", g);
            Iterator it2 = this.b.t1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
                zq3.g(constraintWidget2, "child");
                g2 = ConstraintLayoutKt.g(constraintWidget2);
                Log.d("CCL", g2);
            }
        }
        this.b.Z1(i);
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        dVar.U1(dVar.M1(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator it3 = this.b.t1().iterator();
        while (it3.hasNext()) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) it3.next();
            Object s2 = constraintWidget3.s();
            if (s2 instanceof qg4) {
                l lVar = (l) this.c.get(s2);
                Integer valueOf = lVar == null ? null : Integer.valueOf(lVar.F0());
                Integer valueOf2 = lVar == null ? null : Integer.valueOf(lVar.v0());
                int Y = constraintWidget3.Y();
                if (valueOf != null && Y == valueOf.intValue()) {
                    int x = constraintWidget3.x();
                    if (valueOf2 != null && x == valueOf2.intValue()) {
                    }
                }
                z3 = ConstraintLayoutKt.a;
                if (z3) {
                    Log.d("CCL", "Final measurement for " + androidx.compose.ui.layout.b.a((qg4) s2) + " to confirm size " + constraintWidget3.Y() + ' ' + constraintWidget3.x());
                }
                h().put(s2, ((qg4) s2).W(fv0.b.c(constraintWidget3.Y(), constraintWidget3.x())));
            }
        }
        z2 = ConstraintLayoutKt.a;
        if (z2) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.b.Y() + ' ' + this.b.x());
        }
        return in3.a(this.b.Y(), this.b.x());
    }

    public final void m() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
    }

    protected final void n(fm1 fm1Var) {
        zq3.h(fm1Var, "<set-?>");
        this.f = fm1Var;
    }

    protected final void o(androidx.compose.ui.layout.f fVar) {
        zq3.h(fVar, "<set-?>");
        this.g = fVar;
    }
}
