package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class uzd implements ae5, r8c, c7c, w6c, p7c, s9c, dyd, bgc {
    private final e3e a;
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();
    private final AtomicReference h = new AtomicReference();

    public uzd(e3e e3eVar) {
        this.a = e3eVar;
    }

    public final void E(jcb jcbVar) {
        this.c.set(jcbVar);
    }

    public final void F(rbb rbbVar) {
        this.e.set(rbbVar);
    }

    public final void I(jab jabVar) {
        this.g.set(jabVar);
    }

    public final void K(kcb kcbVar) {
        this.f.set(kcbVar);
    }

    @Override // defpackage.bgc
    public final void X() {
    }

    @Override // defpackage.s9c
    public final void a(final zzs zzsVar) {
        rxd.a(this.h, new qxd() { // from class: fzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((zcc) obj).n5(zzs.this);
            }
        });
    }

    @Override // defpackage.w6c
    public final void c(final iab iabVar, final String str, final String str2) {
        rxd.a(this.d, new qxd() { // from class: tzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                iab iabVar2 = iab.this;
                ((fcb) obj).D4(new xcb(iabVar2.zzc(), iabVar2.zzb()));
            }
        });
        rxd.a(this.f, new qxd() { // from class: xyd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                iab iabVar2 = iab.this;
                ((kcb) obj).s4(new xcb(iabVar2.zzc(), iabVar2.zzb()), str, str2);
            }
        });
        rxd.a(this.e, new qxd() { // from class: yyd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).s2(iab.this);
            }
        });
        rxd.a(this.g, new qxd() { // from class: zyd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((jab) obj).s4(iab.this, str, str2);
            }
        });
    }

    @Override // defpackage.p7c
    public final void k(final zze zzeVar) {
        rxd.a(this.d, new qxd() { // from class: kzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).b3(zze.this);
            }
        });
        rxd.a(this.d, new qxd() { // from class: lzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).zzh(zze.this.zza);
            }
        });
    }

    @Override // defpackage.ae5
    public final void l() {
        rxd.a(this.b, new qxd() { // from class: izd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ae5) obj).l();
            }
        });
    }

    @Override // defpackage.c7c
    public final void n(final zze zzeVar) {
        final int i = zzeVar.zza;
        rxd.a(this.c, new qxd() { // from class: nzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((jcb) obj).d(zze.this);
            }
        });
        rxd.a(this.c, new qxd() { // from class: ozd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((jcb) obj).i(i);
            }
        });
        rxd.a(this.e, new qxd() { // from class: pzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzg(i);
            }
        });
    }

    @Override // defpackage.dyd
    public final void s(dyd dydVar) {
        throw null;
    }

    public final void t(ae5 ae5Var) {
        this.b.set(ae5Var);
    }

    public final void v(zcc zccVar) {
        this.h.set(zccVar);
    }

    public final void x(fcb fcbVar) {
        this.d.set(fcbVar);
    }

    @Override // defpackage.w6c
    public final void zza() {
        this.a.a();
        rxd.a(this.d, new qxd() { // from class: qzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).zzg();
            }
        });
        rxd.a(this.e, new qxd() { // from class: rzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzf();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zzb() {
        rxd.a(this.e, new qxd() { // from class: szd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzh();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zzc() {
        rxd.a(this.d, new qxd() { // from class: azd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).zzj();
            }
        });
        rxd.a(this.e, new qxd() { // from class: bzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzj();
            }
        });
        rxd.a(this.d, new qxd() { // from class: czd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).zzf();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zze() {
        rxd.a(this.e, new qxd() { // from class: mzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzk();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zzf() {
        rxd.a(this.e, new qxd() { // from class: wyd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzl();
            }
        });
    }

    @Override // defpackage.r8c
    public final void zzr() {
        rxd.a(this.c, new qxd() { // from class: gzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((jcb) obj).zzg();
            }
        });
        rxd.a(this.e, new qxd() { // from class: hzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((rbb) obj).zzi();
            }
        });
    }

    @Override // defpackage.bgc
    public final void zzs() {
        rxd.a(this.d, new qxd() { // from class: jzd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((fcb) obj).zze();
            }
        });
    }
}
