package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.hs7;
import defpackage.lb4;
import defpackage.sz5;
import defpackage.tz5;

/* loaded from: classes.dex */
class s {
    final hs7 a = new hs7();
    final lb4 b = new lb4();

    static class a {
        static sz5 d = new tz5(20);
        int a;
        RecyclerView.l.b b;
        RecyclerView.l.b c;

        private a() {
        }

        static void a() {
            while (d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    s() {
    }

    private RecyclerView.l.b l(RecyclerView.d0 d0Var, int i) {
        a aVar;
        RecyclerView.l.b bVar;
        int f = this.a.f(d0Var);
        if (f >= 0 && (aVar = (a) this.a.n(f)) != null) {
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.a = i3;
                if (i == 4) {
                    bVar = aVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.l(f);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = bVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 1;
    }

    void c(long j, RecyclerView.d0 d0Var) {
        this.b.h(j, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.c = bVar;
        aVar.a |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.b = bVar;
        aVar.a |= 4;
    }

    void f() {
        this.a.clear();
        this.b.a();
    }

    RecyclerView.d0 g(long j) {
        return (RecyclerView.d0) this.b.d(j);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    RecyclerView.l.b m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    RecyclerView.l.b n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.a.i(size);
            a aVar = (a) this.a.l(size);
            int i = aVar.a;
            if ((i & 3) == 3) {
                bVar.b(d0Var);
            } else if ((i & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.b;
                if (bVar2 == null) {
                    bVar.b(d0Var);
                } else {
                    bVar.c(d0Var, bVar2, aVar.c);
                }
            } else if ((i & 14) == 14) {
                bVar.a(d0Var, aVar.b, aVar.c);
            } else if ((i & 12) == 12) {
                bVar.d(d0Var, aVar.b, aVar.c);
            } else if ((i & 4) != 0) {
                bVar.c(d0Var, aVar.b, null);
            } else if ((i & 8) != 0) {
                bVar.a(d0Var, aVar.b, aVar.c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int l = this.b.l() - 1;
        while (true) {
            if (l < 0) {
                break;
            }
            if (d0Var == this.b.m(l)) {
                this.b.k(l);
                break;
            }
            l--;
        }
        a aVar = (a) this.a.remove(d0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
