package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.st4;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static long x;
    public static long y;
    private a d;
    androidx.constraintlayout.core.b[] g;
    final c n;
    private a q;
    public boolean a = false;
    int b = 0;
    private HashMap c = null;
    private int e = 32;
    private int f = 32;
    public boolean h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    private SolverVariable[] o = new SolverVariable[w];
    private int p = 0;

    interface a {
        void a(a aVar);

        SolverVariable b(d dVar, boolean[] zArr);

        void c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    class b extends androidx.constraintlayout.core.b {
        public b(c cVar) {
            this.e = new h(this, cVar);
        }
    }

    public d() {
        this.g = null;
        this.g = new androidx.constraintlayout.core.b[32];
        D();
        c cVar = new c();
        this.n = cVar;
        this.d = new g(cVar);
        if (v) {
            this.q = new b(cVar);
        } else {
            this.q = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private final int C(a aVar, boolean z) {
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().c] = true;
            }
            SolverVariable b2 = aVar.b(this, this.j);
            if (b2 != null) {
                boolean[] zArr = this.j;
                int i3 = b2.c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    androidx.constraintlayout.core.b bVar = this.g[i5];
                    if (bVar.a.j != SolverVariable.Type.UNRESTRICTED && !bVar.f && bVar.t(b2)) {
                        float j = bVar.e.j(b2);
                        if (j < 0.0f) {
                            float f2 = (-bVar.b) / j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    androidx.constraintlayout.core.b bVar2 = this.g[i4];
                    bVar2.a.d = -1;
                    bVar2.x(b2);
                    SolverVariable solverVariable = bVar2.a;
                    solverVariable.d = i4;
                    solverVariable.i(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private void D() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                androidx.constraintlayout.core.b bVar = this.g[i];
                if (bVar != null) {
                    this.n.a.a(bVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            androidx.constraintlayout.core.b bVar2 = this.g[i];
            if (bVar2 != null) {
                this.n.b.a(bVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    private SolverVariable a(SolverVariable.Type type2, String str) {
        SolverVariable solverVariable = (SolverVariable) this.n.c.b();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type2, str);
            solverVariable.g(type2, str);
        } else {
            solverVariable.e();
            solverVariable.g(type2, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (SolverVariable[]) Arrays.copyOf(this.o, i3);
        }
        SolverVariable[] solverVariableArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        solverVariableArr[i4] = solverVariable;
        return solverVariable;
    }

    private final void l(androidx.constraintlayout.core.b bVar) {
        int i;
        if (t && bVar.f) {
            bVar.a.f(this, bVar.b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.g;
            int i2 = this.l;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.d = i2;
            this.l = i2 + 1;
            solverVariable.i(this, bVar);
        }
        if (t && this.a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.g[i3];
                if (bVar2 != null && bVar2.f) {
                    bVar2.a.f(this, bVar2.b);
                    if (v) {
                        this.n.a.a(bVar2);
                    } else {
                        this.n.b.a(bVar2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.g;
                        int i6 = i4 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.a;
                        if (solverVariable2.d == i4) {
                            solverVariable2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    private void n() {
        for (int i = 0; i < this.l; i++) {
            androidx.constraintlayout.core.b bVar = this.g[i];
            bVar.a.f = bVar.b;
        }
    }

    public static androidx.constraintlayout.core.b s(d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return dVar.r().j(solverVariable, solverVariable2, f);
    }

    private int u(a aVar) {
        for (int i = 0; i < this.l; i++) {
            androidx.constraintlayout.core.b bVar = this.g[i];
            if (bVar.a.j != SolverVariable.Type.UNRESTRICTED && bVar.b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.l) {
                            break;
                        }
                        androidx.constraintlayout.core.b bVar2 = this.g[i3];
                        if (bVar2.a.j != SolverVariable.Type.UNRESTRICTED && !bVar2.f && bVar2.b < 0.0f) {
                            int i7 = 9;
                            if (u) {
                                int f2 = bVar2.e.f();
                                int i8 = 0;
                                while (i8 < f2) {
                                    SolverVariable b2 = bVar2.e.b(i8);
                                    float j = bVar2.e.j(b2);
                                    if (j > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f3 = b2.h[i9] / j;
                                            if ((f3 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = b2.c;
                                                i4 = i3;
                                                f = f3;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.k; i10++) {
                                    SolverVariable solverVariable = this.n.d[i10];
                                    float j2 = bVar2.e.j(solverVariable);
                                    if (j2 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = solverVariable.h[i11] / j2;
                                            if ((f4 < f && i11 == i6) || i11 > i6) {
                                                i4 = i3;
                                                i5 = i10;
                                                i6 = i11;
                                                f = f4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        androidx.constraintlayout.core.b bVar3 = this.g[i4];
                        bVar3.a.d = -1;
                        bVar3.x(this.n.d[i5]);
                        SolverVariable solverVariable2 = bVar3.a;
                        solverVariable2.d = i4;
                        solverVariable2.i(this, bVar3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.k / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public static st4 x() {
        return null;
    }

    private void z() {
        int i = this.e * 2;
        this.e = i;
        this.g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.g, i);
        c cVar = this.n;
        cVar.d = (SolverVariable[]) Arrays.copyOf(cVar.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
    }

    public void A() {
        if (this.d.isEmpty()) {
            n();
            return;
        }
        if (!this.h && !this.i) {
            B(this.d);
            return;
        }
        for (int i = 0; i < this.l; i++) {
            if (!this.g[i].f) {
                B(this.d);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.n;
            SolverVariable[] solverVariableArr = cVar.d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.e();
            }
            i++;
        }
        cVar.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            androidx.constraintlayout.core.b bVar = this.g[i2];
            if (bVar != null) {
                bVar.c = false;
            }
        }
        D();
        this.l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new androidx.constraintlayout.core.b(this.n);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
        SolverVariable q = q(constraintWidget.o(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
        SolverVariable q2 = q(constraintWidget.o(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
        SolverVariable q3 = q(constraintWidget.o(type4));
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable q4 = q(constraintWidget.o(type5));
        SolverVariable q5 = q(constraintWidget2.o(type2));
        SolverVariable q6 = q(constraintWidget2.o(type3));
        SolverVariable q7 = q(constraintWidget2.o(type4));
        SolverVariable q8 = q(constraintWidget2.o(type5));
        androidx.constraintlayout.core.b r2 = r();
        double d = f;
        double d2 = i;
        r2.q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        d(r2);
        androidx.constraintlayout.core.b r3 = r();
        r3.q(q, q3, q5, q7, (float) (Math.cos(d) * d2));
        d(r3);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.b r2 = r();
        r2.h(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(androidx.constraintlayout.core.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.m
            if (r0 >= r2) goto L12
            int r0 = r5.k
            int r0 = r0 + r1
            int r2 = r5.f
            if (r0 < r2) goto L15
        L12:
            r5.z()
        L15:
            boolean r0 = r6.f
            r2 = 0
            if (r0 != 0) goto L84
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7b
            androidx.constraintlayout.core.SolverVariable r0 = r5.p()
            r6.a = r0
            int r3 = r5.l
            r5.l(r6)
            int r4 = r5.l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            androidx.constraintlayout.core.d$a r2 = r5.q
            r2.a(r6)
            androidx.constraintlayout.core.d$a r2 = r5.q
            r5.C(r2, r1)
            int r2 = r0.d
            r3 = -1
            if (r2 != r3) goto L7c
            androidx.constraintlayout.core.SolverVariable r2 = r6.a
            if (r2 != r0) goto L59
            androidx.constraintlayout.core.SolverVariable r0 = r6.v(r0)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f
            if (r0 != 0) goto L62
            androidx.constraintlayout.core.SolverVariable r0 = r6.a
            r0.i(r5, r6)
        L62:
            boolean r0 = androidx.constraintlayout.core.d.v
            if (r0 == 0) goto L6e
            androidx.constraintlayout.core.c r0 = r5.n
            androidx.constraintlayout.core.e r0 = r0.a
            r0.a(r6)
            goto L75
        L6e:
            androidx.constraintlayout.core.c r0 = r5.n
            androidx.constraintlayout.core.e r0 = r0.b
            r0.a(r6)
        L75:
            int r0 = r5.l
            int r0 = r0 - r1
            r5.l = r0
            goto L7c
        L7b:
            r1 = r2
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r2 = r1
        L84:
            if (r2 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.d(androidx.constraintlayout.core.b):void");
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (s && i2 == 8 && solverVariable2.g && solverVariable.d == -1) {
            solverVariable.f(this, solverVariable2.f + i);
            return null;
        }
        androidx.constraintlayout.core.b r2 = r();
        r2.n(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(SolverVariable solverVariable, int i) {
        if (s && solverVariable.d == -1) {
            float f = i;
            solverVariable.f(this, f);
            for (int i2 = 0; i2 < this.b + 1; i2++) {
                SolverVariable solverVariable2 = this.n.d[i2];
                if (solverVariable2 != null && solverVariable2.n && solverVariable2.r == solverVariable.c) {
                    solverVariable2.f(this, solverVariable2.s + f);
                }
            }
            return;
        }
        int i3 = solverVariable.d;
        if (i3 == -1) {
            androidx.constraintlayout.core.b r2 = r();
            r2.i(solverVariable, i);
            d(r2);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.g[i3];
        if (bVar.f) {
            bVar.b = i;
            return;
        }
        if (bVar.e.f() == 0) {
            bVar.f = true;
            bVar.b = i;
        } else {
            androidx.constraintlayout.core.b r3 = r();
            r3.m(solverVariable, i);
            d(r3);
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b r2 = r();
        SolverVariable t2 = t();
        t2.e = 0;
        r2.o(solverVariable, solverVariable2, t2, i);
        d(r2);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b r2 = r();
        SolverVariable t2 = t();
        t2.e = 0;
        r2.o(solverVariable, solverVariable2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.j(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b r2 = r();
        SolverVariable t2 = t();
        t2.e = 0;
        r2.p(solverVariable, solverVariable2, t2, i);
        d(r2);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b r2 = r();
        SolverVariable t2 = t();
        t2.e = 0;
        r2.p(solverVariable, solverVariable2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.j(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.b r2 = r();
        r2.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    void m(androidx.constraintlayout.core.b bVar, int i, int i2) {
        bVar.e(o(i2, null), i);
    }

    public SolverVariable o(int i, String str) {
        if (this.k + 1 >= this.f) {
            z();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR, str);
        int i2 = this.b + 1;
        this.b = i2;
        this.k++;
        a2.c = i2;
        a2.e = i;
        this.n.d[i2] = a2;
        this.d.c(a2);
        return a2;
    }

    public SolverVariable p() {
        if (this.k + 1 >= this.f) {
            z();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.c = i;
        this.n.d[i] = a2;
        return a2;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            z();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.i();
            if (solverVariable == null) {
                constraintAnchor.s(this.n);
                solverVariable = constraintAnchor.i();
            }
            int i = solverVariable.c;
            if (i == -1 || i > this.b || this.n.d[i] == null) {
                if (i != -1) {
                    solverVariable.e();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.k++;
                solverVariable.c = i2;
                solverVariable.j = SolverVariable.Type.UNRESTRICTED;
                this.n.d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public androidx.constraintlayout.core.b r() {
        androidx.constraintlayout.core.b bVar;
        if (v) {
            bVar = (androidx.constraintlayout.core.b) this.n.a.b();
            if (bVar == null) {
                bVar = new b(this.n);
                y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (androidx.constraintlayout.core.b) this.n.b.b();
            if (bVar == null) {
                bVar = new androidx.constraintlayout.core.b(this.n);
                x++;
            } else {
                bVar.y();
            }
        }
        SolverVariable.c();
        return bVar;
    }

    public SolverVariable t() {
        if (this.k + 1 >= this.f) {
            z();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.c = i;
        this.n.d[i] = a2;
        return a2;
    }

    public void v(st4 st4Var) {
    }

    public c w() {
        return this.n;
    }

    public int y(Object obj) {
        SolverVariable i = ((ConstraintAnchor) obj).i();
        if (i != null) {
            return (int) (i.f + 0.5f);
        }
        return 0;
    }
}
