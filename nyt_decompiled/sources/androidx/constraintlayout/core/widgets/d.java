package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import defpackage.hg9;
import defpackage.st4;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends hg9 {
    androidx.constraintlayout.core.widgets.analyzer.b M0;
    public androidx.constraintlayout.core.widgets.analyzer.d N0;
    private int O0;
    protected b.InterfaceC0071b P0;
    private boolean Q0;
    protected androidx.constraintlayout.core.d R0;
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0;
    public int X0;
    c[] Y0;
    c[] Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public int d1;
    public int e1;
    private int f1;
    public boolean g1;
    private boolean h1;
    private boolean i1;
    int j1;
    private WeakReference k1;
    private WeakReference l1;
    private WeakReference m1;
    private WeakReference n1;
    HashSet o1;
    public b.a p1;

    public d() {
        this.M0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.N0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        this.P0 = null;
        this.Q0 = false;
        this.R0 = new androidx.constraintlayout.core.d();
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = new c[4];
        this.Z0 = new c[4];
        this.a1 = false;
        this.b1 = false;
        this.c1 = false;
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = 257;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = 0;
        this.k1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = new HashSet();
        this.p1 = new b.a();
    }

    private void C1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.R0.h(solverVariable, this.R0.q(constraintAnchor), 0, 5);
    }

    private void D1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.R0.h(this.R0.q(constraintAnchor), solverVariable, 0, 5);
    }

    private void E1(ConstraintWidget constraintWidget) {
        int i = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(constraintWidget, 1, S1());
        this.X0++;
    }

    public static boolean V1(int i, ConstraintWidget constraintWidget, b.InterfaceC0071b interfaceC0071b, b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0071b == null) {
            return false;
        }
        if (constraintWidget.X() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.a = constraintWidget.A();
        aVar.b = constraintWidget.V();
        aVar.c = constraintWidget.Y();
        aVar.d = constraintWidget.x();
        aVar.i = false;
        aVar.j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.d0 > 0.0f;
        boolean z4 = z2 && constraintWidget.d0 > 0.0f;
        if (z && constraintWidget.c0(0) && constraintWidget.w == 0 && !z3) {
            aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.x == 0) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.c0(1) && constraintWidget.x == 0 && !z4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.w == 0) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.p0()) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.q0()) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.y[0] == 4) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = aVar.d;
                } else {
                    aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0071b.b(constraintWidget, aVar);
                    i4 = aVar.f;
                }
                aVar.a = dimensionBehaviour4;
                aVar.c = (int) (constraintWidget.v() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.y[1] == 4) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = aVar.c;
                } else {
                    aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0071b.b(constraintWidget, aVar);
                    i3 = aVar.e;
                }
                aVar.b = dimensionBehaviour6;
                if (constraintWidget.w() == -1) {
                    aVar.d = (int) (i3 / constraintWidget.v());
                } else {
                    aVar.d = (int) (constraintWidget.v() * i3);
                }
            }
        }
        interfaceC0071b.b(constraintWidget, aVar);
        constraintWidget.m1(aVar.e);
        constraintWidget.N0(aVar.f);
        constraintWidget.M0(aVar.h);
        constraintWidget.C0(aVar.g);
        aVar.j = b.a.k;
        return aVar.i;
    }

    private void X1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void z1(ConstraintWidget constraintWidget) {
        int i = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(constraintWidget, 0, S1());
        this.W0++;
    }

    public void A1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.n1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.n1.get()).e()) {
            this.n1 = new WeakReference(constraintAnchor);
        }
    }

    public void B1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.l1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.l1.get()).e()) {
            this.l1 = new WeakReference(constraintAnchor);
        }
    }

    void F1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.m1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.m1.get()).e()) {
            this.m1 = new WeakReference(constraintAnchor);
        }
    }

    void G1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.k1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.k1.get()).e()) {
            this.k1 = new WeakReference(constraintAnchor);
        }
    }

    public boolean H1(boolean z) {
        return this.N0.f(z);
    }

    public boolean I1(boolean z) {
        return this.N0.g(z);
    }

    public boolean J1(boolean z, int i) {
        return this.N0.h(z, i);
    }

    public void K1(st4 st4Var) {
        this.R0.v(st4Var);
    }

    public b.InterfaceC0071b L1() {
        return this.P0;
    }

    public int M1() {
        return this.f1;
    }

    public androidx.constraintlayout.core.d N1() {
        return this.R0;
    }

    public boolean O1() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void P(StringBuilder sb) {
        sb.append(this.o + ":{\n");
        sb.append("  actualWidth:" + this.b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.c0);
        sb.append("\n");
        Iterator it2 = t1().iterator();
        while (it2.hasNext()) {
            ((ConstraintWidget) it2.next()).P(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public void P1() {
        this.N0.j();
    }

    public void Q1() {
        this.N0.k();
    }

    public boolean R1() {
        return this.i1;
    }

    public boolean S1() {
        return this.Q0;
    }

    public boolean T1() {
        return this.h1;
    }

    public long U1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.S0 = i8;
        this.T0 = i9;
        return this.M0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean W1(int i) {
        return (this.f1 & i) == i;
    }

    public void Y1(b.InterfaceC0071b interfaceC0071b) {
        this.P0 = interfaceC0071b;
        this.N0.n(interfaceC0071b);
    }

    public void Z1(int i) {
        this.f1 = i;
        androidx.constraintlayout.core.d.r = W1(512);
    }

    public void a2(int i) {
        this.O0 = i;
    }

    public void b2(boolean z) {
        this.Q0 = z;
    }

    public boolean c2(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean W1 = W1(64);
        s1(dVar, W1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.L0.get(i);
            constraintWidget.s1(dVar, W1);
            if (constraintWidget.e0()) {
                z = true;
            }
        }
        return z;
    }

    public void d2() {
        this.M0.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void r1(boolean z, boolean z2) {
        super.r1(z, z2);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.L0.get(i)).r1(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.hg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.u1():void");
    }

    @Override // defpackage.hg9, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void v0() {
        this.R0.E();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.v0();
    }

    void x1(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            z1(constraintWidget);
        } else if (i == 1) {
            E1(constraintWidget);
        }
    }

    public boolean y1(androidx.constraintlayout.core.d dVar) {
        boolean W1 = W1(64);
        g(dVar, W1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.L0.get(i);
            constraintWidget.U0(0, false);
            constraintWidget.U0(1, false);
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.L0.get(i2);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).A1();
                }
            }
        }
        this.o1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.L0.get(i3);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof h) {
                    this.o1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(dVar, W1);
                }
            }
        }
        while (this.o1.size() > 0) {
            int size2 = this.o1.size();
            Iterator it2 = this.o1.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                h hVar = (h) ((ConstraintWidget) it2.next());
                if (hVar.x1(this.o1)) {
                    hVar.g(dVar, W1);
                    this.o1.remove(hVar);
                    break;
                }
            }
            if (size2 == this.o1.size()) {
                Iterator it3 = this.o1.iterator();
                while (it3.hasNext()) {
                    ((ConstraintWidget) it3.next()).g(dVar, W1);
                }
                this.o1.clear();
            }
        }
        if (androidx.constraintlayout.core.d.r) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.L0.get(i4);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            e(this, dVar, hashSet, A() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it4.next();
                g.a(this, dVar, constraintWidget5);
                constraintWidget5.g(dVar, W1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) this.L0.get(i5);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.Z;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.R0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.i1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(dVar, W1);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.R0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.i1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(dVar, W1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public d(int i, int i2) {
        super(i, i2);
        this.M0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.N0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        this.P0 = null;
        this.Q0 = false;
        this.R0 = new androidx.constraintlayout.core.d();
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = new c[4];
        this.Z0 = new c[4];
        this.a1 = false;
        this.b1 = false;
        this.c1 = false;
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = 257;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = 0;
        this.k1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = new HashSet();
        this.p1 = new b.a();
    }
}
