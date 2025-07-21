package defpackage;

import com.google.android.gms.internal.pal.zzzj;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class qr9 extends q8g {
    qr9() {
    }

    private static final t7g e(ct9 ct9Var, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new l8g(ct9Var.h());
        }
        if (i2 == 6) {
            return new l8g(new zzzj(ct9Var.h()));
        }
        if (i2 == 7) {
            return new l8g(Boolean.valueOf(ct9Var.C()));
        }
        if (i2 == 8) {
            ct9Var.r();
            return g8g.a;
        }
        et9.a(i);
        throw new IllegalStateException("Unexpected token: ".concat(et9.a(i)));
    }

    private static final t7g f(ct9 ct9Var, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ct9Var.i();
            return new r7g();
        }
        if (i2 != 2) {
            return null;
        }
        ct9Var.j();
        return new i8g();
    }

    @Override // defpackage.q8g
    public final /* bridge */ /* synthetic */ Object a(ct9 ct9Var) {
        int G = ct9Var.G();
        t7g f = f(ct9Var, G);
        if (f == null) {
            return e(ct9Var, G);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (ct9Var.s()) {
                String d = f instanceof i8g ? ct9Var.d() : null;
                int G2 = ct9Var.G();
                t7g f2 = f(ct9Var, G2);
                t7g e = f2 == null ? e(ct9Var, G2) : f2;
                if (f instanceof r7g) {
                    ((r7g) f).j(e);
                } else {
                    ((i8g) f).n(d, e);
                }
                if (f2 != null) {
                    arrayDeque.addLast(f);
                    f = e;
                }
            } else {
                if (f instanceof r7g) {
                    ct9Var.l();
                } else {
                    ct9Var.m();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = (t7g) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.q8g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(gt9 gt9Var, t7g t7gVar) {
        if (t7gVar == null || (t7gVar instanceof g8g)) {
            gt9Var.j();
            return;
        }
        if (t7gVar instanceof l8g) {
            l8g l8gVar = (l8g) t7gVar;
            if (l8gVar.j()) {
                gt9Var.l(l8gVar.f());
                return;
            } else if (l8gVar.g()) {
                gt9Var.r(l8gVar.zzc());
                return;
            } else {
                gt9Var.m(l8gVar.c());
                return;
            }
        }
        if (t7gVar instanceof r7g) {
            gt9Var.a();
            Iterator it2 = ((r7g) t7gVar).iterator();
            while (it2.hasNext()) {
                b(gt9Var, (t7g) it2.next());
            }
            gt9Var.d();
            return;
        }
        if (!(t7gVar instanceof i8g)) {
            Class<?> cls = t7gVar.getClass();
            cls.toString();
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(cls)));
        }
        gt9Var.b();
        for (Map.Entry entry : t7gVar.e().k()) {
            gt9Var.i((String) entry.getKey());
            b(gt9Var, (t7g) entry.getValue());
        }
        gt9Var.h();
    }
}
