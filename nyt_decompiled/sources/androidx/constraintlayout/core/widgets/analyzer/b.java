package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.x73;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    private final ArrayList a = new ArrayList();
    private a b = new a();
    private androidx.constraintlayout.core.widgets.d c;

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0071b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.c = dVar;
    }

    private boolean a(InterfaceC0071b interfaceC0071b, ConstraintWidget constraintWidget, int i) {
        this.b.a = constraintWidget.A();
        this.b.b = constraintWidget.V();
        this.b.c = constraintWidget.Y();
        this.b.d = constraintWidget.x();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.d0 > 0.0f;
        boolean z4 = z2 && constraintWidget.d0 > 0.0f;
        if (z3 && constraintWidget.y[0] == 4) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.y[1] == 4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0071b.b(constraintWidget, aVar);
        constraintWidget.m1(this.b.e);
        constraintWidget.N0(this.b.f);
        constraintWidget.M0(this.b.h);
        constraintWidget.C0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.d0 <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(androidx.constraintlayout.core.widgets.d r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.W1(r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r13.L1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.n0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.j r6 = r5.e
            if (r6 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.l r7 = r5.f
            if (r7 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r7.e
            boolean r6 = r6.j
            if (r6 == 0) goto L47
            goto La0
        L47:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.u(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.u(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.W1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.h
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.k0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.k0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.b.b(androidx.constraintlayout.core.widgets.d):void");
    }

    private void c(androidx.constraintlayout.core.widgets.d dVar, String str, int i, int i2, int i3) {
        int J = dVar.J();
        int I = dVar.I();
        dVar.c1(0);
        dVar.b1(0);
        dVar.m1(i2);
        dVar.N0(i3);
        dVar.c1(J);
        dVar.b1(I);
        this.c.a2(i);
        this.c.u1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    public long d(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int i10;
        androidx.constraintlayout.core.widgets.d dVar2;
        int i11;
        boolean z3;
        boolean z4;
        int i12;
        int i13;
        boolean z5;
        int i14;
        b bVar = this;
        InterfaceC0071b L1 = dVar.L1();
        int size = dVar.L0.size();
        int Y = dVar.Y();
        int x = dVar.x();
        boolean b = androidx.constraintlayout.core.widgets.g.b(i, 128);
        int i15 = 1;
        boolean z6 = b || androidx.constraintlayout.core.widgets.g.b(i, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) dVar.L0.get(i16);
                ConstraintWidget.DimensionBehaviour A = constraintWidget.A();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z7 = (A == dimensionBehaviour) && (constraintWidget.V() == dimensionBehaviour) && constraintWidget.v() > 0.0f;
                if ((constraintWidget.k0() && z7) || ((constraintWidget.m0() && z7) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) || constraintWidget.k0() || constraintWidget.m0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            boolean z8 = androidx.constraintlayout.core.d.r;
        }
        boolean z9 = z6 & ((i4 == 1073741824 && i6 == 1073741824) || b);
        int i17 = 2;
        if (z9) {
            int min = Math.min(dVar.H(), i5);
            int min2 = Math.min(dVar.G(), i7);
            if (i4 == 1073741824 && dVar.Y() != min) {
                dVar.m1(min);
                dVar.P1();
            }
            if (i6 == 1073741824 && dVar.x() != min2) {
                dVar.N0(min2);
                dVar.P1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z2 = dVar.H1(b);
                i10 = 2;
                z = false;
            } else {
                boolean I1 = dVar.I1(b);
                z = false;
                if (i4 == 1073741824) {
                    I1 &= dVar.J1(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z2 = dVar.J1(b, 1) & I1;
                    i10++;
                } else {
                    z2 = I1;
                }
            }
            if (z2) {
                dVar.r1(i4 == 1073741824 ? true : z, i6 == 1073741824 ? true : z);
            }
        } else {
            z = false;
            z2 = false;
            i10 = 0;
        }
        if (z2 && i10 == 2) {
            return 0L;
        }
        int M1 = dVar.M1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = bVar.a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, Y, x);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour A2 = dVar.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z10 = A2 == dimensionBehaviour2 ? true : z;
            boolean z11 = dVar.V() == dimensionBehaviour2 ? true : z;
            int max = Math.max(dVar.Y(), bVar.c.J());
            int max2 = Math.max(dVar.x(), bVar.c.I());
            boolean z12 = z;
            boolean z13 = z12;
            ?? r15 = z12;
            while (r15 < size2) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) bVar.a.get(r15);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.h) {
                    int Y2 = constraintWidget2.Y();
                    int x2 = constraintWidget2.x();
                    boolean a2 = z13 | bVar.a(L1, constraintWidget2, a.l);
                    int Y3 = constraintWidget2.Y();
                    i13 = M1;
                    int x3 = constraintWidget2.x();
                    if (Y3 != Y2) {
                        constraintWidget2.m1(Y3);
                        if (z10 && constraintWidget2.N() > max) {
                            max = Math.max(max, constraintWidget2.N() + constraintWidget2.o(ConstraintAnchor.Type.RIGHT).f());
                        }
                        z5 = true;
                    } else {
                        z5 = a2;
                    }
                    if (x3 != x2) {
                        constraintWidget2.N0(x3);
                        if (z11 && constraintWidget2.r() > max2) {
                            max2 = Math.max(max2, constraintWidget2.r() + constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        z5 = true;
                    }
                    z13 = z5 | ((androidx.constraintlayout.core.widgets.h) constraintWidget2).H1();
                    i14 = 1;
                } else {
                    i13 = M1;
                    i14 = i15;
                }
                M1 = i13;
                i15 = i14;
                i17 = 2;
                r15 += i14;
            }
            int i18 = M1;
            int i19 = i17;
            int i20 = 0;
            while (i20 < i19) {
                int i21 = 0;
                while (i21 < size2) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) bVar.a.get(i21);
                    if (((constraintWidget3 instanceof x73) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.h)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.f) || constraintWidget3.X() == 8 || ((z9 && constraintWidget3.e.e.j && constraintWidget3.f.e.j) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.h))) {
                        z3 = z9;
                    } else {
                        int Y4 = constraintWidget3.Y();
                        int x4 = constraintWidget3.x();
                        int p = constraintWidget3.p();
                        int i22 = a.l;
                        z3 = z9;
                        if (i20 == 1) {
                            i22 = a.m;
                        }
                        boolean a3 = z13 | bVar.a(L1, constraintWidget3, i22);
                        int Y5 = constraintWidget3.Y();
                        int x5 = constraintWidget3.x();
                        if (Y5 != Y4) {
                            constraintWidget3.m1(Y5);
                            if (z10 && constraintWidget3.N() > max) {
                                max = Math.max(max, constraintWidget3.N() + constraintWidget3.o(ConstraintAnchor.Type.RIGHT).f());
                            }
                            z4 = true;
                        } else {
                            z4 = a3;
                        }
                        if (x5 != x4) {
                            constraintWidget3.N0(x5);
                            if (z11 && constraintWidget3.r() > max2) {
                                max2 = Math.max(max2, constraintWidget3.r() + constraintWidget3.o(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            z4 = true;
                        }
                        if (!constraintWidget3.b0() || p == constraintWidget3.p()) {
                            z13 = z4;
                        } else {
                            i12 = 1;
                            z13 = true;
                            i21 += i12;
                            bVar = this;
                            z9 = z3;
                        }
                    }
                    i12 = 1;
                    i21 += i12;
                    bVar = this;
                    z9 = z3;
                }
                boolean z14 = z9;
                if (!z13) {
                    break;
                }
                i20++;
                c(dVar, "intermediate pass", i20, Y, x);
                i19 = 2;
                z13 = false;
                bVar = this;
                z9 = z14;
            }
            dVar2 = dVar;
            i11 = i18;
        } else {
            dVar2 = dVar;
            i11 = M1;
        }
        dVar2.Z1(i11);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.d dVar) {
        this.a.clear();
        int size = dVar.L0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) dVar.L0.get(i);
            ConstraintWidget.DimensionBehaviour A = constraintWidget.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (A == dimensionBehaviour || constraintWidget.V() == dimensionBehaviour) {
                this.a.add(constraintWidget);
            }
        }
        dVar.P1();
    }
}
