package com.google.android.gms.internal.ads;

import defpackage.lh4;
import defpackage.o1f;
import java.util.List;

/* loaded from: classes3.dex */
final class hh implements xi {
    private final gh a;
    private int b;
    private int c;
    private int d = 0;

    private hh(gh ghVar) {
        byte[] bArr = ai.d;
        this.a = ghVar;
        ghVar.c = this;
    }

    private final void f(Object obj, bj bjVar, ph phVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            bjVar.d(obj, this, phVar);
            if (this.b == this.c) {
            } else {
                throw zzhag.g();
            }
        } finally {
            this.c = i;
        }
    }

    private final void g(Object obj, bj bjVar, ph phVar) {
        gh ghVar = this.a;
        int s = ghVar.s();
        if (ghVar.a >= ghVar.b) {
            throw new zzhag("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int l = this.a.l(s);
        this.a.a++;
        bjVar.d(obj, this, phVar);
        this.a.B(0);
        r3.a--;
        this.a.a(l);
    }

    private final void h(int i) {
        if (this.a.k() != i) {
            throw zzhag.j();
        }
    }

    private final void i(int i) {
        if ((this.b & 7) != i) {
            throw zzhag.a();
        }
    }

    private static final void j(int i) {
        if ((i & 3) != 0) {
            throw zzhag.g();
        }
    }

    private static final void k(int i) {
        if ((i & 7) != 0) {
            throw zzhag.g();
        }
    }

    public static hh l(gh ghVar) {
        hh hhVar = ghVar.c;
        return hhVar != null ? hhVar : new hh(ghVar);
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void a(Object obj, bj bjVar, ph phVar) {
        i(2);
        g(obj, bjVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void b(List list, bj bjVar, ph phVar) {
        int r;
        int i = this.b;
        if ((i & 7) != 2) {
            throw zzhag.a();
        }
        do {
            Object zze = bjVar.zze();
            g(zze, bjVar, phVar);
            bjVar.zzf(zze);
            list.add(zze);
            if (this.a.b() || this.d != 0) {
                return;
            } else {
                r = this.a.r();
            }
        } while (r == i);
        this.d = r;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void c(List list, bj bjVar, ph phVar) {
        int r;
        int i = this.b;
        if ((i & 7) != 3) {
            throw zzhag.a();
        }
        do {
            Object zze = bjVar.zze();
            f(zze, bjVar, phVar);
            bjVar.zzf(zze);
            list.add(zze);
            if (this.a.b() || this.d != 0) {
                return;
            } else {
                r = this.a.r();
            }
        } while (r == i);
        this.d = r;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void d(Object obj, bj bjVar, ph phVar) {
        i(3);
        f(obj, bjVar, phVar);
    }

    public final void e(List list, boolean z) {
        int r;
        int i;
        if ((this.b & 7) != 2) {
            throw zzhag.a();
        }
        if ((list instanceof o1f) && !z) {
            o1f o1fVar = (o1f) list;
            do {
                o1fVar.W0(zzp());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzA(List list) {
        int r;
        int i;
        if (list instanceof gi) {
            gi giVar = (gi) list;
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                int s = this.a.s();
                k(s);
                int k = this.a.k() + s;
                do {
                    giVar.f(this.a.t());
                } while (this.a.k() < k);
                return;
            }
            do {
                giVar.f(this.a.t());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                int s2 = this.a.s();
                k(s2);
                int k2 = this.a.k() + s2;
                do {
                    list.add(Long.valueOf(this.a.t()));
                } while (this.a.k() < k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.t()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzB(List list) {
        int r;
        if (list instanceof uh) {
            lh4.a(list);
            int i = this.b & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzhag.a();
                }
                this.a.j();
                throw null;
            }
            j(this.a.s());
            this.a.k();
            this.a.j();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int s = this.a.s();
            j(s);
            int k = this.a.k() + s;
            do {
                list.add(Float.valueOf(this.a.j()));
            } while (this.a.k() < k);
            return;
        }
        if (i2 != 5) {
            throw zzhag.a();
        }
        do {
            list.add(Float.valueOf(this.a.j()));
            if (this.a.b()) {
                return;
            } else {
                r = this.a.r();
            }
        } while (r == this.b);
        this.d = r;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzD(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    zhVar.zzh(this.a.o());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                zhVar.zzh(this.a.o());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzE(List list) {
        int r;
        int i;
        if (list instanceof gi) {
            gi giVar = (gi) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    giVar.f(this.a.u());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                giVar.f(this.a.u());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzG(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 == 2) {
                int s = this.a.s();
                j(s);
                int k = this.a.k() + s;
                do {
                    zhVar.zzh(this.a.p());
                } while (this.a.k() < k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.a();
            }
            do {
                zhVar.zzh(this.a.p());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 == 2) {
                int s2 = this.a.s();
                j(s2);
                int k2 = this.a.k() + s2;
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.k() < k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.a();
            }
            do {
                list.add(Integer.valueOf(this.a.p()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzH(List list) {
        int r;
        int i;
        if (list instanceof gi) {
            gi giVar = (gi) list;
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                int s = this.a.s();
                k(s);
                int k = this.a.k() + s;
                do {
                    giVar.f(this.a.v());
                } while (this.a.k() < k);
                return;
            }
            do {
                giVar.f(this.a.v());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                int s2 = this.a.s();
                k(s2);
                int k2 = this.a.k() + s2;
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.k() < k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzI(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    zhVar.zzh(this.a.q());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                zhVar.zzh(this.a.q());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzJ(List list) {
        int r;
        int i;
        if (list instanceof gi) {
            gi giVar = (gi) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    giVar.f(this.a.w());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                giVar.f(this.a.w());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.w()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzL(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    zhVar.zzh(this.a.s());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                zhVar.zzh(this.a.s());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Integer.valueOf(this.a.s()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.s()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzM(List list) {
        int r;
        int i;
        if (list instanceof gi) {
            gi giVar = (gi) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    giVar.f(this.a.x());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                giVar.f(this.a.x());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Long.valueOf(this.a.x()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.a.x()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final boolean zzN() {
        i(0);
        return this.a.c();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final boolean zzO() {
        int i;
        if (this.a.b() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.d(i);
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final double zza() {
        i(1);
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final float zzb() {
        i(5);
        return this.a.j();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzc() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.r();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzd() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zze() {
        i(0);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzf() {
        i(5);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzg() {
        i(0);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzh() {
        i(5);
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzi() {
        i(0);
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final int zzj() {
        i(0);
        return this.a.s();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final long zzk() {
        i(1);
        return this.a.t();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final long zzl() {
        i(0);
        return this.a.u();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final long zzm() {
        i(1);
        return this.a.v();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final long zzn() {
        i(0);
        return this.a.w();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final long zzo() {
        i(0);
        return this.a.x();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final zzgyl zzp() {
        i(2);
        return this.a.y();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final String zzr() {
        i(2);
        return this.a.z();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final String zzs() {
        i(2);
        return this.a.A();
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzv(List list) {
        int r;
        if (list instanceof xg) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 0) {
                this.a.c();
                throw null;
            }
            if (i != 2) {
                throw zzhag.a();
            }
            gh ghVar = this.a;
            ghVar.s();
            ghVar.k();
            this.a.c();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.c()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            this.d = r;
            return;
        }
        if (i2 != 2) {
            throw zzhag.a();
        }
        gh ghVar2 = this.a;
        int k = ghVar2.k() + ghVar2.s();
        do {
            list.add(Boolean.valueOf(this.a.c()));
        } while (this.a.k() < k);
        h(k);
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzw(List list) {
        int r;
        if ((this.b & 7) != 2) {
            throw zzhag.a();
        }
        do {
            list.add(zzp());
            if (this.a.b()) {
                return;
            } else {
                r = this.a.r();
            }
        } while (r == this.b);
        this.d = r;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzx(List list) {
        int r;
        if (list instanceof nh) {
            lh4.a(list);
            int i = this.b & 7;
            if (i == 1) {
                this.a.i();
                throw null;
            }
            if (i != 2) {
                throw zzhag.a();
            }
            k(this.a.s());
            this.a.k();
            this.a.i();
            throw null;
        }
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.a.i()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            this.d = r;
            return;
        }
        if (i2 != 2) {
            throw zzhag.a();
        }
        int s = this.a.s();
        k(s);
        int k = this.a.k() + s;
        do {
            list.add(Double.valueOf(this.a.i()));
        } while (this.a.k() < k);
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzy(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.a();
                }
                gh ghVar = this.a;
                int k = ghVar.k() + ghVar.s();
                do {
                    zhVar.zzh(this.a.m());
                } while (this.a.k() < k);
                h(k);
                return;
            }
            do {
                zhVar.zzh(this.a.m());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.a();
                }
                gh ghVar2 = this.a;
                int k2 = ghVar2.k() + ghVar2.s();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.k() < k2);
                h(k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.a.m()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.xi
    public final void zzz(List list) {
        int r;
        int i;
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            int i2 = this.b & 7;
            if (i2 == 2) {
                int s = this.a.s();
                j(s);
                int k = this.a.k() + s;
                do {
                    zhVar.zzh(this.a.n());
                } while (this.a.k() < k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.a();
            }
            do {
                zhVar.zzh(this.a.n());
                if (this.a.b()) {
                    return;
                } else {
                    i = this.a.r();
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 == 2) {
                int s2 = this.a.s();
                j(s2);
                int k2 = this.a.k() + s2;
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.k() < k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.a();
            }
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.b()) {
                    return;
                } else {
                    r = this.a.r();
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }
}
