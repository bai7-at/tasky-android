package com.google.android.gms.internal.pal;

import defpackage.ev9;
import defpackage.lh4;
import defpackage.vw9;
import java.util.List;

/* loaded from: classes3.dex */
final class q implements c1 {
    private final p a;
    private int b;
    private int c;
    private int d = 0;

    private q(p pVar) {
        f0.f(pVar, "input");
        this.a = pVar;
        pVar.c = this;
    }

    private final Object b(d1 d1Var, ev9 ev9Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object zze = d1Var.zze();
            d1Var.b(zze, this, ev9Var);
            d1Var.zzf(zze);
            if (this.b == this.c) {
                return zze;
            }
            throw zzadi.g();
        } finally {
            this.c = i;
        }
    }

    private final Object d(d1 d1Var, ev9 ev9Var) {
        int q = ((o) this.a).q();
        p pVar = this.a;
        if (pVar.a >= pVar.b) {
            throw new zzadi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int b = pVar.b(q);
        Object zze = d1Var.zze();
        this.a.a++;
        d1Var.b(zze, this, ev9Var);
        d1Var.zzf(zze);
        this.a.g(0);
        r4.a--;
        this.a.h(b);
        return zze;
    }

    private final void e(int i) {
        if (this.a.a() != i) {
            throw zzadi.i();
        }
    }

    private final void f(int i) {
        if ((this.b & 7) != i) {
            throw zzadi.a();
        }
    }

    private static final void l(int i) {
        if ((i & 3) != 0) {
            throw zzadi.g();
        }
    }

    private static final void m(int i) {
        if ((i & 7) != 0) {
            throw zzadi.g();
        }
    }

    public static q n(p pVar) {
        q qVar = pVar.c;
        return qVar != null ? qVar : new q(pVar);
    }

    public final void a(List list, boolean z) {
        int c;
        int c2;
        if ((this.b & 7) != 2) {
            throw zzadi.a();
        }
        if (!(list instanceof vw9) || z) {
            do {
                list.add(z ? c() : g());
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        vw9 vw9Var = (vw9) list;
        do {
            vw9Var.c0(zzp());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final String c() {
        f(2);
        return this.a.f();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final String g() {
        f(2);
        return this.a.e();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final Object h(d1 d1Var, ev9 ev9Var) {
        f(2);
        return d(d1Var, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final Object i(d1 d1Var, ev9 ev9Var) {
        f(3);
        return b(d1Var, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void j(List list, d1 d1Var, ev9 ev9Var) {
        int c;
        int i = this.b;
        if ((i & 7) != 2) {
            throw zzadi.a();
        }
        do {
            list.add(d(d1Var, ev9Var));
            p pVar = this.a;
            if (pVar.i() || this.d != 0) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == i);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void k(List list, d1 d1Var, ev9 ev9Var) {
        int c;
        int i = this.b;
        if ((i & 7) != 3) {
            throw zzadi.a();
        }
        do {
            list.add(b(d1Var, ev9Var));
            p pVar = this.a;
            if (pVar.i() || this.d != 0) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == i);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzA(List list) {
        int c;
        if (list instanceof k0) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 1) {
                ((o) this.a).r();
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            m(((o) this.a).q());
            this.a.a();
            ((o) this.a).r();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int q = ((o) this.a).q();
            m(q);
            int a = this.a.a() + q;
            do {
                list.add(Long.valueOf(((o) this.a).r()));
            } while (this.a.a() < a);
            return;
        }
        do {
            list.add(Long.valueOf(((o) this.a).r()));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzB(List list) {
        int c;
        if (list instanceof z) {
            lh4.a(list);
            int i = this.b & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzadi.a();
                }
                Float.intBitsToFloat(((o) this.a).p());
                throw null;
            }
            l(((o) this.a).q());
            this.a.a();
            Float.intBitsToFloat(((o) this.a).p());
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int q = ((o) this.a).q();
            l(q);
            int a = this.a.a() + q;
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((o) this.a).p())));
            } while (this.a.a() < a);
            return;
        }
        if (i2 != 5) {
            throw zzadi.a();
        }
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((o) this.a).p())));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzD(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzadi.a();
                }
                int a = this.a.a() + ((o) this.a).q();
                do {
                    list.add(Integer.valueOf(((o) this.a).q()));
                } while (this.a.a() < a);
                e(a);
                return;
            }
            do {
                list.add(Integer.valueOf(((o) this.a).q()));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a2 = this.a.a() + ((o) this.a).q();
            do {
                e0Var.f(((o) this.a).q());
            } while (this.a.a() < a2);
            e(a2);
            return;
        }
        do {
            e0Var.f(((o) this.a).q());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzE(List list) {
        int c;
        if (list instanceof k0) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 0) {
                ((o) this.a).s();
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            ((o) this.a).q();
            this.a.a();
            ((o) this.a).s();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a = this.a.a() + ((o) this.a).q();
            do {
                list.add(Long.valueOf(((o) this.a).s()));
            } while (this.a.a() < a);
            e(a);
            return;
        }
        do {
            list.add(Long.valueOf(((o) this.a).s()));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzG(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i == 2) {
                int q = ((o) this.a).q();
                l(q);
                int a = this.a.a() + q;
                do {
                    list.add(Integer.valueOf(((o) this.a).p()));
                } while (this.a.a() < a);
                return;
            }
            if (i != 5) {
                throw zzadi.a();
            }
            do {
                list.add(Integer.valueOf(((o) this.a).p()));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int q2 = ((o) this.a).q();
            l(q2);
            int a2 = this.a.a() + q2;
            do {
                e0Var.f(((o) this.a).p());
            } while (this.a.a() < a2);
            return;
        }
        if (i2 != 5) {
            throw zzadi.a();
        }
        do {
            e0Var.f(((o) this.a).p());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzH(List list) {
        int c;
        if (list instanceof k0) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 1) {
                ((o) this.a).r();
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            m(((o) this.a).q());
            this.a.a();
            ((o) this.a).r();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int q = ((o) this.a).q();
            m(q);
            int a = this.a.a() + q;
            do {
                list.add(Long.valueOf(((o) this.a).r()));
            } while (this.a.a() < a);
            return;
        }
        do {
            list.add(Long.valueOf(((o) this.a).r()));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzI(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzadi.a();
                }
                int a = this.a.a() + ((o) this.a).q();
                do {
                    list.add(Integer.valueOf(p.l(((o) this.a).q())));
                } while (this.a.a() < a);
                e(a);
                return;
            }
            do {
                list.add(Integer.valueOf(p.l(((o) this.a).q())));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a2 = this.a.a() + ((o) this.a).q();
            do {
                e0Var.f(p.l(((o) this.a).q()));
            } while (this.a.a() < a2);
            e(a2);
            return;
        }
        do {
            e0Var.f(p.l(((o) this.a).q()));
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzJ(List list) {
        int c;
        if (list instanceof k0) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 0) {
                p.m(((o) this.a).s());
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            ((o) this.a).q();
            this.a.a();
            p.m(((o) this.a).s());
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a = this.a.a() + ((o) this.a).q();
            do {
                list.add(Long.valueOf(p.m(((o) this.a).s())));
            } while (this.a.a() < a);
            e(a);
            return;
        }
        do {
            list.add(Long.valueOf(p.m(((o) this.a).s())));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzL(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzadi.a();
                }
                int a = this.a.a() + ((o) this.a).q();
                do {
                    list.add(Integer.valueOf(((o) this.a).q()));
                } while (this.a.a() < a);
                e(a);
                return;
            }
            do {
                list.add(Integer.valueOf(((o) this.a).q()));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a2 = this.a.a() + ((o) this.a).q();
            do {
                e0Var.f(((o) this.a).q());
            } while (this.a.a() < a2);
            e(a2);
            return;
        }
        do {
            e0Var.f(((o) this.a).q());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzM(List list) {
        int c;
        if (list instanceof k0) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 0) {
                ((o) this.a).s();
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            ((o) this.a).q();
            this.a.a();
            ((o) this.a).s();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a = this.a.a() + ((o) this.a).q();
            do {
                list.add(Long.valueOf(((o) this.a).s()));
            } while (this.a.a() < a);
            e(a);
            return;
        }
        do {
            list.add(Long.valueOf(((o) this.a).s()));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final boolean zzN() {
        f(0);
        return this.a.j();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final boolean zzO() {
        int i;
        p pVar = this.a;
        if (pVar.i() || (i = this.b) == this.c) {
            return false;
        }
        return pVar.k(i);
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final double zza() {
        f(1);
        return Double.longBitsToDouble(((o) this.a).r());
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final float zzb() {
        f(5);
        return Float.intBitsToFloat(((o) this.a).p());
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzc() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.c();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzd() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zze() {
        f(0);
        return ((o) this.a).q();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzf() {
        f(5);
        return ((o) this.a).p();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzg() {
        f(0);
        return ((o) this.a).q();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzh() {
        f(5);
        return ((o) this.a).p();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzi() {
        f(0);
        return p.l(((o) this.a).q());
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final int zzj() {
        f(0);
        return ((o) this.a).q();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final long zzk() {
        f(1);
        return ((o) this.a).r();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final long zzl() {
        f(0);
        return ((o) this.a).s();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final long zzm() {
        f(1);
        return ((o) this.a).r();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final long zzn() {
        f(0);
        return p.m(((o) this.a).s());
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final long zzo() {
        f(0);
        return ((o) this.a).s();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final zzaby zzp() {
        f(2);
        return this.a.d();
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzv(List list) {
        int c;
        if (list instanceof i) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 0) {
                this.a.j();
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            ((o) this.a).q();
            this.a.a();
            this.a.j();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a = this.a.a() + ((o) this.a).q();
            do {
                list.add(Boolean.valueOf(this.a.j()));
            } while (this.a.a() < a);
            e(a);
            return;
        }
        do {
            list.add(Boolean.valueOf(this.a.j()));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzw(List list) {
        int c;
        if ((this.b & 7) != 2) {
            throw zzadi.a();
        }
        do {
            list.add(zzp());
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzx(List list) {
        int c;
        if (list instanceof u) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 1) {
                Double.longBitsToDouble(((o) this.a).r());
                throw null;
            }
            if (i != 2) {
                throw zzadi.a();
            }
            m(((o) this.a).q());
            this.a.a();
            Double.longBitsToDouble(((o) this.a).r());
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int q = ((o) this.a).q();
            m(q);
            int a = this.a.a() + q;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((o) this.a).r())));
            } while (this.a.a() < a);
            return;
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((o) this.a).r())));
            p pVar = this.a;
            if (pVar.i()) {
                return;
            } else {
                c = pVar.c();
            }
        } while (c == this.b);
        this.d = c;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzy(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzadi.a();
                }
                int a = this.a.a() + ((o) this.a).q();
                do {
                    list.add(Integer.valueOf(((o) this.a).q()));
                } while (this.a.a() < a);
                e(a);
                return;
            }
            do {
                list.add(Integer.valueOf(((o) this.a).q()));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzadi.a();
            }
            int a2 = this.a.a() + ((o) this.a).q();
            do {
                e0Var.f(((o) this.a).q());
            } while (this.a.a() < a2);
            e(a2);
            return;
        }
        do {
            e0Var.f(((o) this.a).q());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }

    @Override // com.google.android.gms.internal.pal.c1
    public final void zzz(List list) {
        int c;
        int c2;
        if (!(list instanceof e0)) {
            int i = this.b & 7;
            if (i == 2) {
                int q = ((o) this.a).q();
                l(q);
                int a = this.a.a() + q;
                do {
                    list.add(Integer.valueOf(((o) this.a).p()));
                } while (this.a.a() < a);
                return;
            }
            if (i != 5) {
                throw zzadi.a();
            }
            do {
                list.add(Integer.valueOf(((o) this.a).p()));
                p pVar = this.a;
                if (pVar.i()) {
                    return;
                } else {
                    c = pVar.c();
                }
            } while (c == this.b);
            this.d = c;
            return;
        }
        e0 e0Var = (e0) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int q2 = ((o) this.a).q();
            l(q2);
            int a2 = this.a.a() + q2;
            do {
                e0Var.f(((o) this.a).p());
            } while (this.a.a() < a2);
            return;
        }
        if (i2 != 5) {
            throw zzadi.a();
        }
        do {
            e0Var.f(((o) this.a).p());
            p pVar2 = this.a;
            if (pVar2.i()) {
                return;
            } else {
                c2 = pVar2.c();
            }
        } while (c2 == this.b);
        this.d = c2;
    }
}
