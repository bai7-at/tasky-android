package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import defpackage.a85;
import defpackage.gv4;
import defpackage.hv4;
import defpackage.kv4;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.ww8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ModifierLocalManager {
    private final m a;
    private final vy4 b = new vy4(new BackwardsCompatNode[16], 0);
    private final vy4 c = new vy4(new gv4[16], 0);
    private final vy4 d = new vy4(new LayoutNode[16], 0);
    private final vy4 e = new vy4(new gv4[16], 0);
    private boolean f;

    public ModifierLocalManager(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void c(Modifier.c cVar, gv4 gv4Var, Set set) {
        int a = a85.a(32);
        if (!cVar.c0().L1()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        vy4 vy4Var = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = cVar.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var, cVar.c0());
        } else {
            vy4Var.b(C1);
        }
        while (vy4Var.t()) {
            Modifier.c cVar2 = (Modifier.c) vy4Var.y(vy4Var.q() - 1);
            if ((cVar2.B1() & a) != 0) {
                for (Modifier.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.C1()) {
                    if ((cVar3.G1() & a) != 0) {
                        ul1 ul1Var = cVar3;
                        ?? r7 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof kv4) {
                                kv4 kv4Var = (kv4) ul1Var;
                                if (kv4Var instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) kv4Var;
                                    if ((backwardsCompatNode.e2() instanceof hv4) && backwardsCompatNode.f2().contains(gv4Var)) {
                                        set.add(kv4Var);
                                    }
                                }
                                if (kv4Var.V().a(gv4Var)) {
                                    break;
                                }
                            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r7 = r7;
                                while (f2 != null) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        r7 = r7;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r7.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r7.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r7 = r7;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r7);
                        }
                    }
                }
            }
            rl1.c(vy4Var, cVar2);
        }
    }

    public final void a(BackwardsCompatNode backwardsCompatNode, gv4 gv4Var) {
        this.b.b(backwardsCompatNode);
        this.c.b(gv4Var);
        b();
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.r(new qs2() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m73invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m73invoke() {
                ModifierLocalManager.this.e();
            }
        });
    }

    public final void d(BackwardsCompatNode backwardsCompatNode, gv4 gv4Var) {
        this.d.b(rl1.k(backwardsCompatNode));
        this.e.b(gv4Var);
        b();
    }

    public final void e() {
        int i = 0;
        this.f = false;
        HashSet hashSet = new HashSet();
        vy4 vy4Var = this.d;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i2];
                gv4 gv4Var = (gv4) this.e.p()[i2];
                if (layoutNode.h0().k().L1()) {
                    c(layoutNode.h0().k(), gv4Var, hashSet);
                }
                i2++;
            } while (i2 < q);
        }
        this.d.h();
        this.e.h();
        vy4 vy4Var2 = this.b;
        int q2 = vy4Var2.q();
        if (q2 > 0) {
            Object[] p2 = vy4Var2.p();
            do {
                BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) p2[i];
                gv4 gv4Var2 = (gv4) this.c.p()[i];
                if (backwardsCompatNode.L1()) {
                    c(backwardsCompatNode, gv4Var2, hashSet);
                }
                i++;
            } while (i < q2);
        }
        this.b.h();
        this.c.h();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((BackwardsCompatNode) it2.next()).k2();
        }
    }

    public final void f(BackwardsCompatNode backwardsCompatNode, gv4 gv4Var) {
        this.b.b(backwardsCompatNode);
        this.c.b(gv4Var);
        b();
    }
}
