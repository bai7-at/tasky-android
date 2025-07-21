package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import defpackage.a85;
import defpackage.cz3;
import defpackage.dy5;
import defpackage.fd5;
import defpackage.lb4;
import defpackage.pq3;
import defpackage.rl1;
import defpackage.ul1;
import defpackage.ux5;
import defpackage.vx5;
import defpackage.vy4;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {
    private final Modifier.c c;
    private cz3 f;
    private c g;
    private boolean h;
    private final ux5 d = new ux5();
    private final lb4 e = new lb4(2);
    private boolean i = true;
    private boolean j = true;
    private final vy4 k = new vy4(new Long[16], 0);

    public a(Modifier.c cVar) {
        this.c = cVar;
    }

    private final void i() {
        this.e.a();
        this.f = null;
    }

    private final boolean l(c cVar, c cVar2) {
        if (cVar == null || cVar.c().size() != cVar2.c().size()) {
            return true;
        }
        int size = cVar2.c().size();
        for (int i = 0; i < size; i++) {
            if (!fd5.l(((vx5) cVar.c().get(i)).i(), ((vx5) cVar2.c().get(i)).i())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(defpackage.lb4 r36, defpackage.cz3 r37, defpackage.pq3 r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.a.a(lb4, cz3, pq3, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.b
    public void b(pq3 pq3Var) {
        super.b(pq3Var);
        c cVar = this.g;
        if (cVar == null) {
            return;
        }
        this.h = this.i;
        List c = cVar.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            vx5 vx5Var = (vx5) c.get(i);
            if (!vx5Var.j() && (!pq3Var.d(vx5Var.g()) || !this.i)) {
                this.d.i(vx5Var.g());
            }
        }
        this.i = false;
        this.j = d.i(cVar.f(), d.a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.input.pointer.b
    public void d() {
        vy4 g = g();
        int q = g.q();
        if (q > 0) {
            Object[] p = g.p();
            int i = 0;
            do {
                ((a) p[i]).d();
                i++;
            } while (i < q);
        }
        ul1 ul1Var = this.c;
        int a = a85.a(16);
        ?? r5 = 0;
        while (ul1Var != 0) {
            if (ul1Var instanceof dy5) {
                ((dy5) ul1Var).U0();
            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                Modifier.c f2 = ul1Var.f2();
                int i2 = 0;
                r5 = r5;
                ul1Var = ul1Var;
                while (f2 != null) {
                    if ((f2.G1() & a) != 0) {
                        i2++;
                        r5 = r5;
                        if (i2 == 1) {
                            ul1Var = f2;
                        } else {
                            if (r5 == 0) {
                                r5 = new vy4(new Modifier.c[16], 0);
                            }
                            if (ul1Var != 0) {
                                r5.b(ul1Var);
                                ul1Var = 0;
                            }
                            r5.b(f2);
                        }
                    }
                    f2 = f2.C1();
                    r5 = r5;
                    ul1Var = ul1Var;
                }
                if (i2 == 1) {
                }
            }
            ul1Var = rl1.g(r5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.b
    public boolean e(pq3 pq3Var) {
        vy4 g;
        int q;
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.e.f() && this.c.L1()) {
            c cVar = this.g;
            zq3.e(cVar);
            cz3 cz3Var = this.f;
            zq3.e(cz3Var);
            long a = cz3Var.a();
            ul1 ul1Var = this.c;
            int a2 = a85.a(16);
            ?? r8 = 0;
            while (ul1Var != 0) {
                if (ul1Var instanceof dy5) {
                    ((dy5) ul1Var).L(cVar, PointerEventPass.Final, a);
                } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                    Modifier.c f2 = ul1Var.f2();
                    int i2 = 0;
                    ul1Var = ul1Var;
                    r8 = r8;
                    while (f2 != null) {
                        if ((f2.G1() & a2) != 0) {
                            i2++;
                            r8 = r8;
                            if (i2 == 1) {
                                ul1Var = f2;
                            } else {
                                if (r8 == 0) {
                                    r8 = new vy4(new Modifier.c[16], 0);
                                }
                                if (ul1Var != 0) {
                                    r8.b(ul1Var);
                                    ul1Var = 0;
                                }
                                r8.b(f2);
                            }
                        }
                        f2 = f2.C1();
                        ul1Var = ul1Var;
                        r8 = r8;
                    }
                    if (i2 == 1) {
                    }
                }
                ul1Var = rl1.g(r8);
            }
            if (this.c.L1() && (q = (g = g()).q()) > 0) {
                Object[] p = g.p();
                do {
                    ((a) p[i]).e(pq3Var);
                    i++;
                } while (i < q);
            }
            z = true;
        }
        b(pq3Var);
        i();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [vy4] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [vy4] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [vy4] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [vy4] */
    @Override // androidx.compose.ui.input.pointer.b
    public boolean f(lb4 lb4Var, cz3 cz3Var, pq3 pq3Var, boolean z) {
        vy4 g;
        int q;
        if (this.e.f() || !this.c.L1()) {
            return false;
        }
        c cVar = this.g;
        zq3.e(cVar);
        cz3 cz3Var2 = this.f;
        zq3.e(cz3Var2);
        long a = cz3Var2.a();
        ul1 ul1Var = this.c;
        int a2 = a85.a(16);
        ?? r6 = 0;
        while (ul1Var != 0) {
            if (ul1Var instanceof dy5) {
                ((dy5) ul1Var).L(cVar, PointerEventPass.Initial, a);
            } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                Modifier.c f2 = ul1Var.f2();
                int i = 0;
                ul1Var = ul1Var;
                r6 = r6;
                while (f2 != null) {
                    if ((f2.G1() & a2) != 0) {
                        i++;
                        r6 = r6;
                        if (i == 1) {
                            ul1Var = f2;
                        } else {
                            if (r6 == 0) {
                                r6 = new vy4(new Modifier.c[16], 0);
                            }
                            if (ul1Var != 0) {
                                r6.b(ul1Var);
                                ul1Var = 0;
                            }
                            r6.b(f2);
                        }
                    }
                    f2 = f2.C1();
                    ul1Var = ul1Var;
                    r6 = r6;
                }
                if (i == 1) {
                }
            }
            ul1Var = rl1.g(r6);
        }
        if (this.c.L1() && (q = (g = g()).q()) > 0) {
            Object[] p = g.p();
            int i2 = 0;
            do {
                a aVar = (a) p[i2];
                lb4 lb4Var2 = this.e;
                cz3 cz3Var3 = this.f;
                zq3.e(cz3Var3);
                aVar.f(lb4Var2, cz3Var3, pq3Var, z);
                i2++;
            } while (i2 < q);
        }
        if (this.c.L1()) {
            ul1 ul1Var2 = this.c;
            int a3 = a85.a(16);
            ?? r15 = 0;
            while (ul1Var2 != 0) {
                if (ul1Var2 instanceof dy5) {
                    ((dy5) ul1Var2).L(cVar, PointerEventPass.Main, a);
                } else if ((ul1Var2.G1() & a3) != 0 && (ul1Var2 instanceof ul1)) {
                    Modifier.c f22 = ul1Var2.f2();
                    int i3 = 0;
                    ul1Var2 = ul1Var2;
                    r15 = r15;
                    while (f22 != null) {
                        if ((f22.G1() & a3) != 0) {
                            i3++;
                            r15 = r15;
                            if (i3 == 1) {
                                ul1Var2 = f22;
                            } else {
                                if (r15 == 0) {
                                    r15 = new vy4(new Modifier.c[16], 0);
                                }
                                if (ul1Var2 != 0) {
                                    r15.b(ul1Var2);
                                    ul1Var2 = 0;
                                }
                                r15.b(f22);
                            }
                        }
                        f22 = f22.C1();
                        ul1Var2 = ul1Var2;
                        r15 = r15;
                    }
                    if (i3 == 1) {
                    }
                }
                ul1Var2 = rl1.g(r15);
            }
        }
        return true;
    }

    public final Modifier.c j() {
        return this.c;
    }

    public final ux5 k() {
        return this.d;
    }

    public final void m() {
        this.i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.c + ", children=" + g() + ", pointerIds=" + this.d + ')';
    }
}
