package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class hwd implements c7c, c9c, dyd, tof, s9c, p7c, bgc {
    private final e3e a;
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();
    private hwd h = null;

    public hwd(e3e e3eVar) {
        this.a = e3eVar;
    }

    public static hwd c(hwd hwdVar) {
        hwd hwdVar2 = new hwd(hwdVar.a);
        hwdVar2.h = hwdVar;
        return hwdVar2;
    }

    public final void E(cma cmaVar) {
        this.b.set(cmaVar);
    }

    public final void F(gma gmaVar) {
        this.d.set(gmaVar);
    }

    @Override // defpackage.tof
    public final void O() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.O();
        } else {
            rxd.a(this.f, new qxd() { // from class: svd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((tof) obj).O();
                }
            });
        }
    }

    @Override // defpackage.tof
    public final void Q1(final int i) {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.Q1(i);
        } else {
            rxd.a(this.f, new qxd() { // from class: bwd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((tof) obj).Q1(i);
                }
            });
        }
    }

    @Override // defpackage.bgc
    public final void X() {
    }

    @Override // defpackage.tof
    public final void Y4() {
    }

    @Override // defpackage.s9c
    public final void a(final zzs zzsVar) {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.a(zzsVar);
        } else {
            rxd.a(this.g, new qxd() { // from class: pvd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((zcc) obj).n5(zzs.this);
                }
            });
        }
    }

    @Override // defpackage.tof
    public final void h6() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.h6();
        } else {
            rxd.a(this.f, new qxd() { // from class: fwd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((tof) obj).h6();
                }
            });
        }
    }

    @Override // defpackage.p7c
    public final void k(final zze zzeVar) {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.k(zzeVar);
        } else {
            rxd.a(this.d, new qxd() { // from class: tvd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((gma) obj).N(zze.this);
                }
            });
        }
    }

    public final void l() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.l();
            return;
        }
        this.a.a();
        rxd.a(this.c, new qxd() { // from class: zvd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                lh4.a(obj);
                throw null;
            }
        });
        rxd.a(this.d, new qxd() { // from class: awd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((gma) obj).zzc();
            }
        });
    }

    @Override // defpackage.c7c
    public final void n(final zze zzeVar) {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.n(zzeVar);
        } else {
            rxd.a(this.b, new qxd() { // from class: cwd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((cma) obj).A5(zze.this);
                }
            });
            rxd.a(this.b, new qxd() { // from class: dwd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((cma) obj).zzb(zze.this.zza);
                }
            });
        }
    }

    @Override // defpackage.tof
    public final void n4() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.n4();
            return;
        }
        rxd.a(this.f, new qxd() { // from class: gwd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((tof) obj).n4();
            }
        });
        rxd.a(this.d, new qxd() { // from class: qvd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((gma) obj).zzf();
            }
        });
        rxd.a(this.d, new qxd() { // from class: rvd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((gma) obj).zze();
            }
        });
    }

    @Override // defpackage.dyd
    public final void s(dyd dydVar) {
        this.h = (hwd) dydVar;
    }

    @Override // defpackage.tof
    public final void s4() {
    }

    public final void t(final zla zlaVar) {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.t(zlaVar);
        } else {
            rxd.a(this.b, new qxd() { // from class: xvd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((cma) obj).t3(zla.this);
                }
            });
        }
    }

    public final void v(tof tofVar) {
        this.f.set(tofVar);
    }

    public final void x(zcc zccVar) {
        this.g.set(zccVar);
    }

    @Override // defpackage.c9c
    public final void zzg() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.zzg();
        } else {
            rxd.a(this.e, new qxd() { // from class: ewd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((c9c) obj).zzg();
                }
            });
        }
    }

    @Override // defpackage.bgc
    public final void zzs() {
        hwd hwdVar = this.h;
        if (hwdVar != null) {
            hwdVar.zzs();
        } else {
            rxd.a(this.d, new qxd() { // from class: yvd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((gma) obj).zzb();
                }
            });
        }
    }
}
