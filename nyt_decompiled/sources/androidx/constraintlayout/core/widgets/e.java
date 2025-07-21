package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends h {
    private ConstraintWidget[] x1;
    private int a1 = -1;
    private int b1 = -1;
    private int c1 = -1;
    private int d1 = -1;
    private int e1 = -1;
    private int f1 = -1;
    private float g1 = 0.5f;
    private float h1 = 0.5f;
    private float i1 = 0.5f;
    private float j1 = 0.5f;
    private float k1 = 0.5f;
    private float l1 = 0.5f;
    private int m1 = 0;
    private int n1 = 0;
    private int o1 = 2;
    private int p1 = 2;
    private int q1 = 0;
    private int r1 = -1;
    private int s1 = 0;
    private ArrayList t1 = new ArrayList();
    private ConstraintWidget[] u1 = null;
    private ConstraintWidget[] v1 = null;
    private int[] w1 = null;
    private int y1 = 0;

    private class a {
        private int a;
        private ConstraintAnchor d;
        private ConstraintAnchor e;
        private ConstraintAnchor f;
        private ConstraintAnchor g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int q;
        private ConstraintWidget b = null;
        int c = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;

        public a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = e.this.B1();
            this.i = e.this.D1();
            this.j = e.this.C1();
            this.k = e.this.A1();
            this.q = i2;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < e.this.y1; i2++) {
                ConstraintWidget constraintWidget = e.this.x1[this.n + i2];
                if (this.a == 0) {
                    int Y = constraintWidget.Y();
                    int i3 = e.this.m1;
                    if (constraintWidget.X() == 8) {
                        i3 = 0;
                    }
                    this.l += Y + i3;
                    int m2 = e.this.m2(constraintWidget, this.q);
                    if (this.b == null || this.c < m2) {
                        this.b = constraintWidget;
                        this.c = m2;
                        this.m = m2;
                    }
                } else {
                    int n2 = e.this.n2(constraintWidget, this.q);
                    int m22 = e.this.m2(constraintWidget, this.q);
                    int i4 = e.this.n1;
                    if (constraintWidget.X() == 8) {
                        i4 = 0;
                    }
                    this.m += m22 + i4;
                    if (this.b == null || this.c < n2) {
                        this.b = constraintWidget;
                        this.c = n2;
                        this.l = n2;
                    }
                }
            }
        }

        public void b(ConstraintWidget constraintWidget) {
            if (this.a == 0) {
                int n2 = e.this.n2(constraintWidget, this.q);
                if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    n2 = 0;
                }
                this.l += n2 + (constraintWidget.X() != 8 ? e.this.m1 : 0);
                int m2 = e.this.m2(constraintWidget, this.q);
                if (this.b == null || this.c < m2) {
                    this.b = constraintWidget;
                    this.c = m2;
                    this.m = m2;
                }
            } else {
                int n22 = e.this.n2(constraintWidget, this.q);
                int m22 = e.this.m2(constraintWidget, this.q);
                if (constraintWidget.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    m22 = 0;
                }
                this.m += m22 + (constraintWidget.X() != 8 ? e.this.n1 : 0);
                if (this.b == null || this.c < n22) {
                    this.b = constraintWidget;
                    this.c = n22;
                    this.l = n22;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            char c;
            float f;
            float f2;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < e.this.y1; i3++) {
                ConstraintWidget constraintWidget2 = e.this.x1[this.n + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.w0();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= e.this.y1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = e.this.x1[this.n + i7];
                if (constraintWidget3 != null && constraintWidget3.X() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.a != 0) {
                ConstraintWidget constraintWidget5 = this.b;
                constraintWidget5.P0(e.this.a1);
                int i8 = this.h;
                if (i > 0) {
                    i8 += e.this.m1;
                }
                if (z) {
                    constraintWidget5.Q.a(this.f, i8);
                    if (z2) {
                        constraintWidget5.O.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.O.a(constraintWidget5.Q, 0);
                    }
                } else {
                    constraintWidget5.O.a(this.d, i8);
                    if (z2) {
                        constraintWidget5.Q.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.Q.a(constraintWidget5.O, 0);
                    }
                }
                for (int i9 = 0; i9 < i2 && this.n + i9 < e.this.y1; i9++) {
                    ConstraintWidget constraintWidget6 = e.this.x1[this.n + i9];
                    if (constraintWidget6 != null) {
                        if (i9 == 0) {
                            constraintWidget6.k(constraintWidget6.P, this.e, this.i);
                            int i10 = e.this.b1;
                            float f3 = e.this.h1;
                            if (this.n == 0 && e.this.d1 != -1) {
                                i10 = e.this.d1;
                                f3 = e.this.j1;
                            } else if (z2 && e.this.f1 != -1) {
                                i10 = e.this.f1;
                                f3 = e.this.l1;
                            }
                            constraintWidget6.g1(i10);
                            constraintWidget6.f1(f3);
                        }
                        if (i9 == i2 - 1) {
                            constraintWidget6.k(constraintWidget6.R, this.g, this.k);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.P.a(constraintWidget4.R, e.this.n1);
                            if (i9 == i4) {
                                constraintWidget6.P.u(this.i);
                            }
                            constraintWidget4.R.a(constraintWidget6.P, 0);
                            if (i9 == i5 + 1) {
                                constraintWidget4.R.u(this.k);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z) {
                                int i11 = e.this.o1;
                                if (i11 == 0) {
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                } else if (i11 == 1) {
                                    constraintWidget6.O.a(constraintWidget5.O, 0);
                                } else if (i11 == 2) {
                                    constraintWidget6.O.a(constraintWidget5.O, 0);
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                }
                            } else {
                                int i12 = e.this.o1;
                                if (i12 == 0) {
                                    constraintWidget6.O.a(constraintWidget5.O, 0);
                                } else if (i12 == 1) {
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                } else if (i12 == 2) {
                                    if (z3) {
                                        constraintWidget6.O.a(this.d, this.h);
                                        constraintWidget6.Q.a(this.f, this.j);
                                    } else {
                                        constraintWidget6.O.a(constraintWidget5.O, 0);
                                        constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.b;
            constraintWidget7.g1(e.this.b1);
            int i13 = this.i;
            if (i > 0) {
                i13 += e.this.n1;
            }
            constraintWidget7.P.a(this.e, i13);
            if (z2) {
                constraintWidget7.R.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.R.a(constraintWidget7.P, 0);
            }
            char c2 = 3;
            if (e.this.p1 == 3 && !constraintWidget7.b0()) {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.n + i15 >= e.this.y1) {
                        break;
                    }
                    constraintWidget = e.this.x1[this.n + i15];
                    if (constraintWidget.b0()) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.n + i17 >= e.this.y1) {
                    return;
                }
                ConstraintWidget constraintWidget8 = e.this.x1[this.n + i17];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c = c2;
                } else {
                    if (i16 == 0) {
                        constraintWidget8.k(constraintWidget8.O, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i18 = e.this.a1;
                        float f4 = e.this.g1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.n == 0 && e.this.c1 != -1) {
                            i18 = e.this.c1;
                            if (z) {
                                f2 = e.this.i1;
                                f = 1.0f - f2;
                                f4 = f;
                            } else {
                                f = e.this.i1;
                                f4 = f;
                            }
                        } else if (z2 && e.this.e1 != -1) {
                            i18 = e.this.e1;
                            if (z) {
                                f2 = e.this.k1;
                                f = 1.0f - f2;
                                f4 = f;
                            } else {
                                f = e.this.k1;
                                f4 = f;
                            }
                        }
                        constraintWidget8.P0(i18);
                        constraintWidget8.O0(f4);
                    }
                    if (i16 == i2 - 1) {
                        constraintWidget8.k(constraintWidget8.Q, this.f, this.j);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.O.a(constraintWidget4.Q, e.this.m1);
                        if (i16 == i4) {
                            constraintWidget8.O.u(this.h);
                        }
                        constraintWidget4.Q.a(constraintWidget8.O, 0);
                        if (i16 == i5 + 1) {
                            constraintWidget4.Q.u(this.j);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c = 3;
                        if (e.this.p1 == 3 && constraintWidget.b0() && constraintWidget8 != constraintWidget && constraintWidget8.b0()) {
                            constraintWidget8.S.a(constraintWidget.S, 0);
                        } else {
                            int i19 = e.this.p1;
                            if (i19 == 0) {
                                constraintWidget8.P.a(constraintWidget7.P, 0);
                            } else if (i19 == 1) {
                                constraintWidget8.R.a(constraintWidget7.R, 0);
                            } else if (z3) {
                                constraintWidget8.P.a(this.e, this.i);
                                constraintWidget8.R.a(this.g, this.k);
                            } else {
                                constraintWidget8.P.a(constraintWidget7.P, 0);
                                constraintWidget8.R.a(constraintWidget7.R, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i16++;
                c2 = c;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - e.this.n1 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - e.this.m1 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < e.this.y1; i5++) {
                ConstraintWidget constraintWidget = e.this.x1[this.n + i5];
                if (this.a == 0) {
                    if (constraintWidget != null && constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.w == 0) {
                        e.this.F1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.V(), constraintWidget.x());
                    }
                } else if (constraintWidget != null && constraintWidget.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.x == 0) {
                    e.this.F1(constraintWidget, constraintWidget.A(), constraintWidget.Y(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
            }
            h();
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    private void l2(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.w1 == null || this.v1 == null || this.u1 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.y1; i2++) {
            this.x1[i2].w0();
        }
        int[] iArr = this.w1;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.g1;
        ConstraintWidget constraintWidget2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.g1;
            } else {
                f = f2;
                i = i5;
            }
            ConstraintWidget constraintWidget3 = this.v1[i];
            if (constraintWidget3 != null && constraintWidget3.X() != 8) {
                if (i5 == 0) {
                    constraintWidget3.k(constraintWidget3.O, this.O, B1());
                    constraintWidget3.P0(this.a1);
                    constraintWidget3.O0(f);
                }
                if (i5 == i3 - 1) {
                    constraintWidget3.k(constraintWidget3.Q, this.Q, C1());
                }
                if (i5 > 0 && constraintWidget2 != null) {
                    constraintWidget3.k(constraintWidget3.O, constraintWidget2.Q, this.m1);
                    constraintWidget2.k(constraintWidget2.Q, constraintWidget3.O, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ConstraintWidget constraintWidget4 = this.u1[i6];
            if (constraintWidget4 != null && constraintWidget4.X() != 8) {
                if (i6 == 0) {
                    constraintWidget4.k(constraintWidget4.P, this.P, D1());
                    constraintWidget4.g1(this.b1);
                    constraintWidget4.f1(this.h1);
                }
                if (i6 == i4 - 1) {
                    constraintWidget4.k(constraintWidget4.R, this.R, A1());
                }
                if (i6 > 0 && constraintWidget2 != null) {
                    constraintWidget4.k(constraintWidget4.P, constraintWidget2.R, this.n1);
                    constraintWidget2.k(constraintWidget2.R, constraintWidget4.P, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.s1 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                ConstraintWidget[] constraintWidgetArr = this.x1;
                if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.X() != 8) {
                    ConstraintWidget constraintWidget5 = this.v1[i7];
                    ConstraintWidget constraintWidget6 = this.u1[i8];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.k(constraintWidget.O, constraintWidget5.O, 0);
                        constraintWidget.k(constraintWidget.Q, constraintWidget5.Q, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.k(constraintWidget.P, constraintWidget6.P, 0);
                        constraintWidget.k(constraintWidget.R, constraintWidget6.R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m2(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.E * i);
                if (i3 != constraintWidget.x()) {
                    constraintWidget.a1(true);
                    F1(constraintWidget, constraintWidget.A(), constraintWidget.Y(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return constraintWidget.x();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget.Y() * constraintWidget.d0) + 0.5f);
            }
        }
        return constraintWidget.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n2(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.B * i);
                if (i3 != constraintWidget.Y()) {
                    constraintWidget.a1(true);
                    F1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.V(), constraintWidget.x());
                }
                return i3;
            }
            if (i2 == 1) {
                return constraintWidget.Y();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget.x() * constraintWidget.d0) + 0.5f);
            }
        }
        return constraintWidget.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.o2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void p2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        ConstraintAnchor constraintAnchor;
        int C1;
        ConstraintAnchor constraintAnchor2;
        int A1;
        int i7;
        if (i == 0) {
            return;
        }
        this.t1.clear();
        a aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
        this.t1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int n2 = n2(constraintWidget, i3);
                if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.m1 + i8) + n2 > i3) && aVar.b != null;
                if (!z && i9 > 0 && (i7 = this.r1) > 0 && i9 % i7 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i9);
                    this.t1.add(aVar);
                } else if (i9 > 0) {
                    i8 += this.m1 + n2;
                    aVar.b(constraintWidget);
                    i9++;
                    i4 = i10;
                }
                i8 = n2;
                aVar.b(constraintWidget);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i12];
                int m2 = m2(constraintWidget2, i3);
                if (constraintWidget2.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.n1 + i11) + m2 > i3) && aVar.b != null;
                if (!z2 && i12 > 0 && (i5 = this.r1) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i12);
                    this.t1.add(aVar);
                } else if (i12 > 0) {
                    i11 += this.n1 + m2;
                    aVar.b(constraintWidget2);
                    i12++;
                    i4 = i13;
                }
                i11 = m2;
                aVar.b(constraintWidget2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.t1.size();
        ConstraintAnchor constraintAnchor3 = this.O;
        ConstraintAnchor constraintAnchor4 = this.P;
        ConstraintAnchor constraintAnchor5 = this.Q;
        ConstraintAnchor constraintAnchor6 = this.R;
        int B1 = B1();
        int D1 = D1();
        int C12 = C1();
        int A12 = A1();
        ConstraintWidget.DimensionBehaviour A = A();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = A == dimensionBehaviour || V() == dimensionBehaviour;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = (a) this.t1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i15 = D1;
        int i16 = C12;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = B1;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i21 = A12;
        while (i19 < size) {
            a aVar3 = (a) this.t1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    constraintAnchor2 = ((a) this.t1.get(i19 + 1)).b.P;
                    A1 = 0;
                } else {
                    constraintAnchor2 = this.R;
                    A1 = A1();
                }
                ConstraintAnchor constraintAnchor9 = aVar3.b.R;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i22 = i17;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i23 = i18;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i19;
                aVar3.j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i20, i15, i16, A1, i3);
                int max = Math.max(i23, aVar3.f());
                i17 = i22 + aVar3.e();
                if (i6 > 0) {
                    i17 += this.n1;
                }
                constraintAnchor8 = constraintAnchor11;
                i18 = max;
                i15 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i24 = A1;
                constraintAnchor6 = constraintAnchor2;
                i21 = i24;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    constraintAnchor = ((a) this.t1.get(i6 + 1)).b.O;
                    C1 = 0;
                } else {
                    constraintAnchor = this.Q;
                    C1 = C1();
                }
                ConstraintAnchor constraintAnchor16 = aVar3.b.Q;
                aVar3.j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i20, i15, C1, i21, i3);
                i18 = i26 + aVar3.f();
                int max2 = Math.max(i25, aVar3.e());
                if (i6 > 0) {
                    i18 += this.m1;
                }
                i17 = max2;
                i20 = 0;
                i16 = C1;
                constraintAnchor8 = constraintAnchor16;
            }
            i19 = i6 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    private void q2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        ConstraintAnchor constraintAnchor;
        int C1;
        ConstraintAnchor constraintAnchor2;
        int A1;
        int i7;
        if (i == 0) {
            return;
        }
        this.t1.clear();
        a aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
        this.t1.add(aVar);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i10];
                int n2 = n2(constraintWidget, i3);
                if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z = (i9 == i3 || (this.m1 + i9) + n2 > i3) && aVar.b != null;
                if (!z && i10 > 0 && (i7 = this.r1) > 0 && i11 > i7) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i10);
                    this.t1.add(aVar);
                    i8 = i11;
                    i9 = n2;
                } else {
                    i9 = i10 > 0 ? i9 + this.m1 + n2 : n2;
                    i8 = 0;
                }
                aVar.b(constraintWidget);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                int m2 = m2(constraintWidget2, i3);
                if (constraintWidget2.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i3 || (this.n1 + i13) + m2 > i3) && aVar.b != null;
                if (!z2 && i14 > 0 && (i5 = this.r1) > 0 && i5 < 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i14);
                    this.t1.add(aVar);
                } else if (i14 > 0) {
                    i13 += this.n1 + m2;
                    aVar.b(constraintWidget2);
                    i14++;
                    i4 = i15;
                }
                i13 = m2;
                aVar.b(constraintWidget2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.t1.size();
        ConstraintAnchor constraintAnchor3 = this.O;
        ConstraintAnchor constraintAnchor4 = this.P;
        ConstraintAnchor constraintAnchor5 = this.Q;
        ConstraintAnchor constraintAnchor6 = this.R;
        int B1 = B1();
        int D1 = D1();
        int C12 = C1();
        int A12 = A1();
        ConstraintWidget.DimensionBehaviour A = A();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = A == dimensionBehaviour || V() == dimensionBehaviour;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = (a) this.t1.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i17 = D1;
        int i18 = C12;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = B1;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i23 = A12;
        while (i21 < size) {
            a aVar3 = (a) this.t1.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    constraintAnchor2 = ((a) this.t1.get(i21 + 1)).b.P;
                    A1 = 0;
                } else {
                    constraintAnchor2 = this.R;
                    A1 = A1();
                }
                ConstraintAnchor constraintAnchor9 = aVar3.b.R;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i24 = i19;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i25 = i20;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i21;
                aVar3.j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i22, i17, i18, A1, i3);
                int max = Math.max(i25, aVar3.f());
                i19 = i24 + aVar3.e();
                if (i6 > 0) {
                    i19 += this.n1;
                }
                constraintAnchor8 = constraintAnchor11;
                i20 = max;
                i17 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i26 = A1;
                constraintAnchor6 = constraintAnchor2;
                i23 = i26;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i27 = i19;
                int i28 = i20;
                i6 = i21;
                if (i6 < size - 1) {
                    constraintAnchor = ((a) this.t1.get(i6 + 1)).b.O;
                    C1 = 0;
                } else {
                    constraintAnchor = this.Q;
                    C1 = C1();
                }
                ConstraintAnchor constraintAnchor16 = aVar3.b.Q;
                aVar3.j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i22, i17, C1, i23, i3);
                i20 = i28 + aVar3.f();
                int max2 = Math.max(i27, aVar3.e());
                if (i6 > 0) {
                    i20 += this.m1;
                }
                i19 = max2;
                i22 = 0;
                i18 = C1;
                constraintAnchor8 = constraintAnchor16;
            }
            i21 = i6 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i20;
        iArr[1] = i19;
    }

    private void r2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.t1.size() == 0) {
            aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
            this.t1.add(aVar);
        } else {
            a aVar2 = (a) this.t1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i2, this.O, this.P, this.Q, this.R, B1(), D1(), C1(), A1(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(constraintWidgetArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(float f) {
        this.k1 = f;
    }

    public void B2(int i) {
        this.e1 = i;
    }

    public void C2(float f) {
        this.l1 = f;
    }

    public void D2(int i) {
        this.f1 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.h
    public void E1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.M0 > 0 && !G1()) {
            J1(0, 0);
            I1(false);
            return;
        }
        int B1 = B1();
        int C1 = C1();
        int D1 = D1();
        int A1 = A1();
        int[] iArr2 = new int[2];
        int i7 = (i2 - B1) - C1;
        int i8 = this.s1;
        if (i8 == 1) {
            i7 = (i4 - D1) - A1;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        } else {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.L0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.M0;
            if (i10 >= i5) {
                break;
            }
            if (this.L0[i10].X() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            constraintWidgetArr = new ConstraintWidget[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.M0; i13++) {
                ConstraintWidget constraintWidget = this.L0[i13];
                if (constraintWidget.X() != 8) {
                    constraintWidgetArr[i12] = constraintWidget;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.x1 = constraintWidgetArr;
        this.y1 = i6;
        int i14 = this.q1;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            r2(constraintWidgetArr, i6, this.s1, i9, iArr2);
        } else if (i14 == 1) {
            z = true;
            iArr = iArr2;
            p2(constraintWidgetArr, i6, this.s1, i9, iArr2);
        } else if (i14 == 2) {
            z = true;
            iArr = iArr2;
            o2(constraintWidgetArr, i6, this.s1, i9, iArr2);
        } else if (i14 != 3) {
            z = true;
            iArr = iArr2;
        } else {
            z = true;
            iArr = iArr2;
            q2(constraintWidgetArr, i6, this.s1, i9, iArr2);
        }
        int i15 = iArr[0] + B1 + C1;
        int i16 = iArr[z ? 1 : 0] + D1 + A1;
        if (i == 1073741824) {
            i15 = i2;
        } else if (i == Integer.MIN_VALUE) {
            i15 = Math.min(i15, i2);
        } else if (i != 0) {
            i15 = 0;
        }
        if (i3 == 1073741824) {
            i16 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i16 = Math.min(i16, i4);
        } else if (i3 != 0) {
            i16 = 0;
        }
        J1(i15, i16);
        m1(i15);
        N0(i16);
        if (this.M0 <= 0) {
            z = false;
        }
        I1(z);
    }

    public void E2(int i) {
        this.r1 = i;
    }

    public void F2(int i) {
        this.s1 = i;
    }

    public void G2(int i) {
        this.p1 = i;
    }

    public void H2(float f) {
        this.h1 = f;
    }

    public void I2(int i) {
        this.n1 = i;
    }

    public void J2(int i) {
        this.b1 = i;
    }

    public void K2(int i) {
        this.q1 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        super.g(dVar, z);
        boolean z2 = L() != null && ((d) L()).S1();
        int i = this.q1;
        if (i != 0) {
            if (i == 1) {
                int size = this.t1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((a) this.t1.get(i2)).d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                l2(z2);
            } else if (i == 3) {
                int size2 = this.t1.size();
                int i3 = 0;
                while (i3 < size2) {
                    ((a) this.t1.get(i3)).d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.t1.size() > 0) {
            ((a) this.t1.get(0)).d(z2, 0, true);
        }
        I1(false);
    }

    public void s2(float f) {
        this.i1 = f;
    }

    public void t2(int i) {
        this.c1 = i;
    }

    public void u2(float f) {
        this.j1 = f;
    }

    public void v2(int i) {
        this.d1 = i;
    }

    public void w2(int i) {
        this.o1 = i;
    }

    public void x2(float f) {
        this.g1 = f;
    }

    public void y2(int i) {
        this.m1 = i;
    }

    public void z2(int i) {
        this.a1 = i;
    }
}
