package defpackage;

import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class nnf {
    private final fyb a;
    private zzgaa b = zzgaa.t();
    private zzgad c = zzgad.f();
    private zzf d;
    private zzf e;
    private zzf f;

    public nnf(fyb fybVar) {
        this.a = fybVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzf j(frb frbVar, zzgaa zzgaaVar, zzf zzfVar, fyb fybVar) {
        n1c zzn = frbVar.zzn();
        int zze = frbVar.zze();
        Object f = zzn.o() ? null : zzn.f(zze);
        int c = (frbVar.e() || zzn.o()) ? -1 : zzn.d(zze, fybVar, false).c(khe.F(frbVar.zzk()));
        for (int i = 0; i < zzgaaVar.size(); i++) {
            zzf zzfVar2 = (zzf) zzgaaVar.get(i);
            if (m(zzfVar2, f, frbVar.e(), frbVar.zzb(), frbVar.zzc(), c)) {
                return zzfVar2;
            }
        }
        if (zzgaaVar.isEmpty() && zzfVar != null) {
            if (m(zzfVar, f, frbVar.e(), frbVar.zzb(), frbVar.zzc(), c)) {
                return zzfVar;
            }
        }
        return null;
    }

    private final void k(l9 l9Var, zzf zzfVar, n1c n1cVar) {
        if (zzfVar == null) {
            return;
        }
        if (n1cVar.a(zzfVar.a) != -1) {
            l9Var.a(zzfVar, n1cVar);
            return;
        }
        n1c n1cVar2 = (n1c) this.c.get(zzfVar);
        if (n1cVar2 != null) {
            l9Var.a(zzfVar, n1cVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l(n1c n1cVar) {
        l9 l9Var = new l9();
        if (this.b.isEmpty()) {
            k(l9Var, this.e, n1cVar);
            if (!mge.a(this.f, this.e)) {
                k(l9Var, this.f, n1cVar);
            }
            if (!mge.a(this.d, this.e) && !mge.a(this.d, this.f)) {
                k(l9Var, this.d, n1cVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                k(l9Var, (zzf) this.b.get(i), n1cVar);
            }
            if (!this.b.contains(this.d)) {
                k(l9Var, this.d, n1cVar);
            }
        }
        this.c = l9Var.c();
    }

    private static boolean m(zzf zzfVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzfVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzfVar.b != i || zzfVar.c != i2) {
                return false;
            }
        } else if (zzfVar.b != -1 || zzfVar.e != i3) {
            return false;
        }
        return true;
    }

    public final n1c a(zzf zzfVar) {
        return (n1c) this.c.get(zzfVar);
    }

    public final zzf b() {
        return this.d;
    }

    public final zzf c() {
        Object next;
        Object obj;
        if (this.b.isEmpty()) {
            return null;
        }
        zzgaa zzgaaVar = this.b;
        if (zzgaaVar == null) {
            Iterator<E> it2 = zzgaaVar.iterator();
            do {
                next = it2.next();
            } while (it2.hasNext());
            obj = next;
        } else {
            if (zzgaaVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzgaaVar.get(zzgaaVar.size() - 1);
        }
        return (zzf) obj;
    }

    public final zzf d() {
        return this.e;
    }

    public final zzf e() {
        return this.f;
    }

    public final void g(frb frbVar) {
        this.d = j(frbVar, this.b, this.e, this.a);
    }

    public final void h(List list, zzf zzfVar, frb frbVar) {
        this.b = zzgaa.p(list);
        if (!list.isEmpty()) {
            this.e = (zzf) list.get(0);
            zzfVar.getClass();
            this.f = zzfVar;
        }
        if (this.d == null) {
            this.d = j(frbVar, this.b, this.e, this.a);
        }
        l(frbVar.zzn());
    }

    public final void i(frb frbVar) {
        this.d = j(frbVar, this.b, this.e, this.a);
        l(frbVar.zzn());
    }
}
