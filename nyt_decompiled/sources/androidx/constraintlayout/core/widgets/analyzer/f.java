package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f {
    private static b.a a = new b.a();
    private static int b = 0;
    private static int c = 0;

    private static boolean a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour A = constraintWidget.A();
        ConstraintWidget.DimensionBehaviour V = constraintWidget.V();
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget.L() != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget.L() : null;
        if (dVar != null) {
            dVar.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.V();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = A == dimensionBehaviour5 || constraintWidget.p0() || A == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (A == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.w == 0 && constraintWidget.d0 == 0.0f && constraintWidget.c0(0)) || (A == dimensionBehaviour2 && constraintWidget.w == 1 && constraintWidget.f0(0, constraintWidget.Y()));
        boolean z2 = V == dimensionBehaviour5 || constraintWidget.q0() || V == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (V == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.x == 0 && constraintWidget.d0 == 0.0f && constraintWidget.c0(1)) || (V == dimensionBehaviour && constraintWidget.x == 1 && constraintWidget.f0(1, constraintWidget.x()));
        if (constraintWidget.d0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(int i, ConstraintWidget constraintWidget, b.InterfaceC0071b interfaceC0071b, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.i0()) {
            return;
        }
        boolean z2 = true;
        b++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.o0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.V1(i2, constraintWidget, interfaceC0071b, new b.a(), b.a.k);
            }
        }
        ConstraintAnchor o = constraintWidget.o(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor o2 = constraintWidget.o(ConstraintAnchor.Type.RIGHT);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.n()) {
            Iterator it2 = o.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i3 = i + 1;
                boolean a2 = a(i3, constraintWidget2);
                if (constraintWidget2.o0() && a2) {
                    androidx.constraintlayout.core.widgets.d.V1(i3, constraintWidget2, interfaceC0071b, new b.a(), b.a.k);
                }
                boolean z3 = ((constraintAnchor5 == constraintWidget2.O && (constraintAnchor4 = constraintWidget2.Q.f) != null && constraintAnchor4.n()) || (constraintAnchor5 == constraintWidget2.Q && (constraintAnchor3 = constraintWidget2.O.f) != null && constraintAnchor3.n())) ? z2 : false;
                ConstraintWidget.DimensionBehaviour A = constraintWidget2.A();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (A != dimensionBehaviour || a2) {
                    if (!constraintWidget2.o0()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.O;
                        if (constraintAnchor5 == constraintAnchor6 && constraintWidget2.Q.f == null) {
                            int f = constraintAnchor6.f() + e;
                            constraintWidget2.H0(f, constraintWidget2.Y() + f);
                            b(i3, constraintWidget2, interfaceC0071b, z);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.Q;
                            if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                                int f2 = e - constraintAnchor7.f();
                                constraintWidget2.H0(f2 - constraintWidget2.Y(), f2);
                                b(i3, constraintWidget2, interfaceC0071b, z);
                            } else if (z3 && !constraintWidget2.k0()) {
                                d(i3, interfaceC0071b, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.A() == dimensionBehaviour && constraintWidget2.A >= 0 && constraintWidget2.z >= 0 && ((constraintWidget2.X() == 8 || (constraintWidget2.w == 0 && constraintWidget2.v() == 0.0f)) && !constraintWidget2.k0() && !constraintWidget2.n0() && z3 && !constraintWidget2.k0())) {
                    e(i3, constraintWidget, interfaceC0071b, constraintWidget2, z);
                }
                z2 = true;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (o2.d() != null && o2.n()) {
            Iterator it3 = o2.d().iterator();
            while (it3.hasNext()) {
                ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it3.next();
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i4 = i + 1;
                boolean a3 = a(i4, constraintWidget3);
                if (constraintWidget3.o0() && a3) {
                    androidx.constraintlayout.core.widgets.d.V1(i4, constraintWidget3, interfaceC0071b, new b.a(), b.a.k);
                }
                boolean z4 = (constraintAnchor8 == constraintWidget3.O && (constraintAnchor2 = constraintWidget3.Q.f) != null && constraintAnchor2.n()) || (constraintAnchor8 == constraintWidget3.Q && (constraintAnchor = constraintWidget3.O.f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour A2 = constraintWidget3.A();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (A2 != dimensionBehaviour2 || a3) {
                    if (!constraintWidget3.o0()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.O;
                        if (constraintAnchor8 == constraintAnchor9 && constraintWidget3.Q.f == null) {
                            int f3 = constraintAnchor9.f() + e2;
                            constraintWidget3.H0(f3, constraintWidget3.Y() + f3);
                            b(i4, constraintWidget3, interfaceC0071b, z);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.Q;
                            if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                                int f4 = e2 - constraintAnchor10.f();
                                constraintWidget3.H0(f4 - constraintWidget3.Y(), f4);
                                b(i4, constraintWidget3, interfaceC0071b, z);
                            } else if (z4 && !constraintWidget3.k0()) {
                                d(i4, interfaceC0071b, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.A() == dimensionBehaviour2 && constraintWidget3.A >= 0 && constraintWidget3.z >= 0 && (constraintWidget3.X() == 8 || (constraintWidget3.w == 0 && constraintWidget3.v() == 0.0f))) {
                    if (!constraintWidget3.k0() && !constraintWidget3.n0() && z4 && !constraintWidget3.k0()) {
                        e(i4, constraintWidget, interfaceC0071b, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.s0();
    }

    private static void c(int i, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0071b interfaceC0071b, int i2, boolean z) {
        if (aVar.v1()) {
            if (i2 == 0) {
                b(i + 1, aVar, interfaceC0071b, z);
            } else {
                i(i + 1, aVar, interfaceC0071b);
            }
        }
    }

    private static void d(int i, b.InterfaceC0071b interfaceC0071b, ConstraintWidget constraintWidget, boolean z) {
        float y = constraintWidget.y();
        int e = constraintWidget.O.f.e();
        int e2 = constraintWidget.Q.f.e();
        int f = constraintWidget.O.f() + e;
        int f2 = e2 - constraintWidget.Q.f();
        if (e == e2) {
            y = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int Y = constraintWidget.Y();
        int i2 = (e2 - e) - Y;
        if (e > e2) {
            i2 = (e - e2) - Y;
        }
        int i3 = ((int) (i2 > 0 ? (y * i2) + 0.5f : y * i2)) + e;
        int i4 = i3 + Y;
        if (e > e2) {
            i4 = i3 - Y;
        }
        constraintWidget.H0(i3, i4);
        b(i + 1, constraintWidget, interfaceC0071b, z);
    }

    private static void e(int i, ConstraintWidget constraintWidget, b.InterfaceC0071b interfaceC0071b, ConstraintWidget constraintWidget2, boolean z) {
        float y = constraintWidget2.y();
        int e = constraintWidget2.O.f.e() + constraintWidget2.O.f();
        int e2 = constraintWidget2.Q.f.e() - constraintWidget2.Q.f();
        if (e2 >= e) {
            int Y = constraintWidget2.Y();
            if (constraintWidget2.X() != 8) {
                int i2 = constraintWidget2.w;
                if (i2 == 2) {
                    Y = (int) (constraintWidget2.y() * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.Y() : constraintWidget.L().Y()));
                } else if (i2 == 0) {
                    Y = e2 - e;
                }
                Y = Math.max(constraintWidget2.z, Y);
                int i3 = constraintWidget2.A;
                if (i3 > 0) {
                    Y = Math.min(i3, Y);
                }
            }
            int i4 = e + ((int) ((y * ((e2 - e) - Y)) + 0.5f));
            constraintWidget2.H0(i4, Y + i4);
            b(i + 1, constraintWidget2, interfaceC0071b, z);
        }
    }

    private static void f(int i, b.InterfaceC0071b interfaceC0071b, ConstraintWidget constraintWidget) {
        float T = constraintWidget.T();
        int e = constraintWidget.P.f.e();
        int e2 = constraintWidget.R.f.e();
        int f = constraintWidget.P.f() + e;
        int f2 = e2 - constraintWidget.R.f();
        if (e == e2) {
            T = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int x = constraintWidget.x();
        int i2 = (e2 - e) - x;
        if (e > e2) {
            i2 = (e - e2) - x;
        }
        int i3 = (int) (i2 > 0 ? (T * i2) + 0.5f : T * i2);
        int i4 = e + i3;
        int i5 = i4 + x;
        if (e > e2) {
            i4 = e - i3;
            i5 = i4 - x;
        }
        constraintWidget.K0(i4, i5);
        i(i + 1, constraintWidget, interfaceC0071b);
    }

    private static void g(int i, ConstraintWidget constraintWidget, b.InterfaceC0071b interfaceC0071b, ConstraintWidget constraintWidget2) {
        float T = constraintWidget2.T();
        int e = constraintWidget2.P.f.e() + constraintWidget2.P.f();
        int e2 = constraintWidget2.R.f.e() - constraintWidget2.R.f();
        if (e2 >= e) {
            int x = constraintWidget2.x();
            if (constraintWidget2.X() != 8) {
                int i2 = constraintWidget2.x;
                if (i2 == 2) {
                    x = (int) (T * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.x() : constraintWidget.L().x()));
                } else if (i2 == 0) {
                    x = e2 - e;
                }
                x = Math.max(constraintWidget2.C, x);
                int i3 = constraintWidget2.D;
                if (i3 > 0) {
                    x = Math.min(i3, x);
                }
            }
            int i4 = e + ((int) ((T * ((e2 - e) - x)) + 0.5f));
            constraintWidget2.K0(i4, x + i4);
            i(i + 1, constraintWidget2, interfaceC0071b);
        }
    }

    public static void h(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0071b interfaceC0071b) {
        ConstraintWidget.DimensionBehaviour A = dVar.A();
        ConstraintWidget.DimensionBehaviour V = dVar.V();
        b = 0;
        c = 0;
        dVar.x0();
        ArrayList t1 = dVar.t1();
        int size = t1.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) t1.get(i)).x0();
        }
        boolean S1 = dVar.S1();
        if (A == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.H0(0, dVar.Y());
        } else {
            dVar.I0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) t1.get(i2);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.u1() == 1) {
                    if (fVar.v1() != -1) {
                        fVar.y1(fVar.v1());
                    } else if (fVar.w1() != -1 && dVar.p0()) {
                        fVar.y1(dVar.Y() - fVar.w1());
                    } else if (dVar.p0()) {
                        fVar.y1((int) ((fVar.x1() * dVar.Y()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget).z1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) t1.get(i3);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.u1() == 1) {
                        b(0, fVar2, interfaceC0071b, S1);
                    }
                }
            }
        }
        b(0, dVar, interfaceC0071b, S1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) t1.get(i4);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget3;
                    if (aVar.z1() == 0) {
                        c(0, aVar, interfaceC0071b, 0, S1);
                    }
                }
            }
        }
        if (V == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.K0(0, dVar.x());
        } else {
            dVar.J0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) t1.get(i5);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.u1() == 0) {
                    if (fVar3.v1() != -1) {
                        fVar3.y1(fVar3.v1());
                    } else if (fVar3.w1() != -1 && dVar.q0()) {
                        fVar3.y1(dVar.x() - fVar3.w1());
                    } else if (dVar.q0()) {
                        fVar3.y1((int) ((fVar3.x1() * dVar.x()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget4).z1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) t1.get(i6);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.u1() == 0) {
                        i(1, fVar4, interfaceC0071b);
                    }
                }
            }
        }
        i(0, dVar, interfaceC0071b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) t1.get(i7);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget6;
                    if (aVar2.z1() == 1) {
                        c(0, aVar2, interfaceC0071b, 1, S1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = (ConstraintWidget) t1.get(i8);
            if (constraintWidget7.o0() && a(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.d.V1(0, constraintWidget7, interfaceC0071b, a, b.a.k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, interfaceC0071b, S1);
                    i(0, constraintWidget7, interfaceC0071b);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).u1() == 0) {
                    i(0, constraintWidget7, interfaceC0071b);
                } else {
                    b(0, constraintWidget7, interfaceC0071b, S1);
                }
            }
        }
    }

    private static void i(int i, ConstraintWidget constraintWidget, b.InterfaceC0071b interfaceC0071b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.r0()) {
            return;
        }
        c++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.o0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.V1(i2, constraintWidget, interfaceC0071b, new b.a(), b.a.k);
            }
        }
        ConstraintAnchor o = constraintWidget.o(ConstraintAnchor.Type.TOP);
        ConstraintAnchor o2 = constraintWidget.o(ConstraintAnchor.Type.BOTTOM);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.n()) {
            Iterator it2 = o.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i3 = i + 1;
                boolean a2 = a(i3, constraintWidget2);
                if (constraintWidget2.o0() && a2) {
                    androidx.constraintlayout.core.widgets.d.V1(i3, constraintWidget2, interfaceC0071b, new b.a(), b.a.k);
                }
                boolean z = (constraintAnchor5 == constraintWidget2.P && (constraintAnchor4 = constraintWidget2.R.f) != null && constraintAnchor4.n()) || (constraintAnchor5 == constraintWidget2.R && (constraintAnchor3 = constraintWidget2.P.f) != null && constraintAnchor3.n());
                ConstraintWidget.DimensionBehaviour V = constraintWidget2.V();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (V != dimensionBehaviour || a2) {
                    if (!constraintWidget2.o0()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.P;
                        if (constraintAnchor5 == constraintAnchor6 && constraintWidget2.R.f == null) {
                            int f = constraintAnchor6.f() + e;
                            constraintWidget2.K0(f, constraintWidget2.x() + f);
                            i(i3, constraintWidget2, interfaceC0071b);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.R;
                            if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                                int f2 = e - constraintAnchor7.f();
                                constraintWidget2.K0(f2 - constraintWidget2.x(), f2);
                                i(i3, constraintWidget2, interfaceC0071b);
                            } else if (z && !constraintWidget2.m0()) {
                                f(i3, interfaceC0071b, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.V() == dimensionBehaviour && constraintWidget2.D >= 0 && constraintWidget2.C >= 0 && (constraintWidget2.X() == 8 || (constraintWidget2.x == 0 && constraintWidget2.v() == 0.0f))) {
                    if (!constraintWidget2.m0() && !constraintWidget2.n0() && z && !constraintWidget2.m0()) {
                        g(i3, constraintWidget, interfaceC0071b, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (o2.d() != null && o2.n()) {
            Iterator it3 = o2.d().iterator();
            while (it3.hasNext()) {
                ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it3.next();
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i4 = i + 1;
                boolean a3 = a(i4, constraintWidget3);
                if (constraintWidget3.o0() && a3) {
                    androidx.constraintlayout.core.widgets.d.V1(i4, constraintWidget3, interfaceC0071b, new b.a(), b.a.k);
                }
                boolean z2 = (constraintAnchor8 == constraintWidget3.P && (constraintAnchor2 = constraintWidget3.R.f) != null && constraintAnchor2.n()) || (constraintAnchor8 == constraintWidget3.R && (constraintAnchor = constraintWidget3.P.f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour V2 = constraintWidget3.V();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (V2 != dimensionBehaviour2 || a3) {
                    if (!constraintWidget3.o0()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.P;
                        if (constraintAnchor8 == constraintAnchor9 && constraintWidget3.R.f == null) {
                            int f3 = constraintAnchor9.f() + e2;
                            constraintWidget3.K0(f3, constraintWidget3.x() + f3);
                            i(i4, constraintWidget3, interfaceC0071b);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.R;
                            if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                                int f4 = e2 - constraintAnchor10.f();
                                constraintWidget3.K0(f4 - constraintWidget3.x(), f4);
                                i(i4, constraintWidget3, interfaceC0071b);
                            } else if (z2 && !constraintWidget3.m0()) {
                                f(i4, interfaceC0071b, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.V() == dimensionBehaviour2 && constraintWidget3.D >= 0 && constraintWidget3.C >= 0 && (constraintWidget3.X() == 8 || (constraintWidget3.x == 0 && constraintWidget3.v() == 0.0f))) {
                    if (!constraintWidget3.m0() && !constraintWidget3.n0() && z2 && !constraintWidget3.m0()) {
                        g(i4, constraintWidget, interfaceC0071b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor o3 = constraintWidget.o(ConstraintAnchor.Type.BASELINE);
        if (o3.d() != null && o3.n()) {
            int e3 = o3.e();
            Iterator it4 = o3.d().iterator();
            while (it4.hasNext()) {
                ConstraintAnchor constraintAnchor11 = (ConstraintAnchor) it4.next();
                ConstraintWidget constraintWidget4 = constraintAnchor11.d;
                int i5 = i + 1;
                boolean a4 = a(i5, constraintWidget4);
                if (constraintWidget4.o0() && a4) {
                    androidx.constraintlayout.core.widgets.d.V1(i5, constraintWidget4, interfaceC0071b, new b.a(), b.a.k);
                }
                if (constraintWidget4.V() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget4.o0() && constraintAnchor11 == constraintWidget4.S) {
                        constraintWidget4.G0(constraintAnchor11.f() + e3);
                        i(i5, constraintWidget4, interfaceC0071b);
                    }
                }
            }
        }
        constraintWidget.t0();
    }
}
