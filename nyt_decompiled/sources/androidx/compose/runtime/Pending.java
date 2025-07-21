package androidx.compose.runtime;

import defpackage.c04;
import defpackage.qs2;
import defpackage.xs3;
import defpackage.yv3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class Pending {
    private final List a;
    private final int b;
    private int c;
    private final List d;
    private final HashMap e;
    private final c04 f;

    public Pending(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.d = new ArrayList();
        HashMap hashMap = new HashMap();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            yv3 yv3Var = (yv3) this.a.get(i3);
            hashMap.put(Integer.valueOf(yv3Var.b()), new g(i3, i2, yv3Var.c()));
            i2 += yv3Var.c();
        }
        this.e = hashMap;
        this.f = kotlin.c.a(new qs2() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final HashMap mo865invoke() {
                HashMap H;
                Object B;
                H = b.H();
                Pending pending = Pending.this;
                int size2 = pending.b().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    yv3 yv3Var2 = (yv3) pending.b().get(i4);
                    B = b.B(yv3Var2);
                    b.K(H, B, yv3Var2);
                }
                return H;
            }
        });
    }

    public final int a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final HashMap c() {
        return (HashMap) this.f.getValue();
    }

    public final yv3 d(int i, Object obj) {
        Object J;
        J = b.J(c(), obj != null ? new xs3(Integer.valueOf(i), obj) : Integer.valueOf(i));
        return (yv3) J;
    }

    public final int e() {
        return this.b;
    }

    public final List f() {
        return this.d;
    }

    public final int g(yv3 yv3Var) {
        g gVar = (g) this.e.get(Integer.valueOf(yv3Var.b()));
        if (gVar != null) {
            return gVar.b();
        }
        return -1;
    }

    public final boolean h(yv3 yv3Var) {
        return this.d.add(yv3Var);
    }

    public final void i(yv3 yv3Var, int i) {
        this.e.put(Integer.valueOf(yv3Var.b()), new g(-1, i, 0));
    }

    public final void j(int i, int i2, int i3) {
        if (i > i2) {
            for (g gVar : this.e.values()) {
                int b = gVar.b();
                if (i <= b && b < i + i3) {
                    gVar.e((b - i) + i2);
                } else if (i2 <= b && b < i) {
                    gVar.e(b + i3);
                }
            }
            return;
        }
        if (i2 > i) {
            for (g gVar2 : this.e.values()) {
                int b2 = gVar2.b();
                if (i <= b2 && b2 < i + i3) {
                    gVar2.e((b2 - i) + i2);
                } else if (i + 1 <= b2 && b2 < i2) {
                    gVar2.e(b2 - i3);
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i > i2) {
            for (g gVar : this.e.values()) {
                int c = gVar.c();
                if (c == i) {
                    gVar.f(i2);
                } else if (i2 <= c && c < i) {
                    gVar.f(c + 1);
                }
            }
            return;
        }
        if (i2 > i) {
            for (g gVar2 : this.e.values()) {
                int c2 = gVar2.c();
                if (c2 == i) {
                    gVar2.f(i2);
                } else if (i + 1 <= c2 && c2 < i2) {
                    gVar2.f(c2 - 1);
                }
            }
        }
    }

    public final void l(int i) {
        this.c = i;
    }

    public final int m(yv3 yv3Var) {
        g gVar = (g) this.e.get(Integer.valueOf(yv3Var.b()));
        if (gVar != null) {
            return gVar.c();
        }
        return -1;
    }

    public final boolean n(int i, int i2) {
        int b;
        g gVar = (g) this.e.get(Integer.valueOf(i));
        if (gVar == null) {
            return false;
        }
        int b2 = gVar.b();
        int a = i2 - gVar.a();
        gVar.d(i2);
        if (a == 0) {
            return true;
        }
        for (g gVar2 : this.e.values()) {
            if (gVar2.b() >= b2 && !zq3.c(gVar2, gVar) && (b = gVar2.b() + a) >= 0) {
                gVar2.e(b);
            }
        }
        return true;
    }

    public final int o(yv3 yv3Var) {
        g gVar = (g) this.e.get(Integer.valueOf(yv3Var.b()));
        return gVar != null ? gVar.a() : yv3Var.c();
    }
}
