package defpackage;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzbze;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class yhd implements jl, cac, r8c, c7c, t7c, jq9, w6c, s9c, p7c, bgc {
    private final k6e i;
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicBoolean f = new AtomicBoolean(true);
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    final BlockingQueue j = new ArrayBlockingQueue(((Integer) pla.c().a(mpa.K8)).intValue());

    public yhd(k6e k6eVar) {
        this.i = k6eVar;
    }

    private final void R() {
        if (this.g.get() && this.h.get()) {
            for (final Pair pair : this.j) {
                rxd.a(this.b, new qxd() { // from class: fhd
                    @Override // defpackage.qxd
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((ucb) obj).o0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.j.clear();
            this.f.set(false);
        }
    }

    public final void E(cua cuaVar) {
        this.d.set(cuaVar);
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
    }

    public final void I(zcc zccVar) {
        this.c.set(zccVar);
    }

    public final void K(ucb ucbVar) {
        this.b.set(ucbVar);
        this.g.set(true);
        R();
    }

    public final void O(ukb ukbVar) {
        this.e.set(ukbVar);
    }

    @Override // defpackage.bgc
    public final void X() {
        rxd.a(this.a, new qxd() { // from class: ohd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzk();
            }
        });
    }

    @Override // defpackage.s9c
    public final void a(final zzs zzsVar) {
        rxd.a(this.c, new qxd() { // from class: xhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((zcc) obj).n5(zzs.this);
            }
        });
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
    }

    @Override // defpackage.p7c
    public final void k(final zze zzeVar) {
        rxd.a(this.e, new qxd() { // from class: lhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ukb) obj).N(zze.this);
            }
        });
    }

    public final synchronized pqa l() {
        return (pqa) this.a.get();
    }

    @Override // defpackage.c7c
    public final void n(final zze zzeVar) {
        rxd.a(this.a, new qxd() { // from class: ghd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).d(zze.this);
            }
        });
        rxd.a(this.a, new qxd() { // from class: hhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).i(zze.this.zza);
            }
        });
        rxd.a(this.d, new qxd() { // from class: ihd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((cua) obj).h0(zze.this);
            }
        });
        this.f.set(false);
        this.j.clear();
    }

    public final synchronized ucb s() {
        return (ucb) this.b.get();
    }

    public final void t(pqa pqaVar) {
        this.a.set(pqaVar);
    }

    @Override // defpackage.jq9
    public final void v() {
        if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
            return;
        }
        rxd.a(this.a, whd.a);
    }

    @Override // defpackage.jl
    public final synchronized void x(final String str, final String str2) {
        if (!this.f.get()) {
            rxd.a(this.b, new qxd() { // from class: mhd
                @Override // defpackage.qxd
                public final void zza(Object obj) {
                    ((ucb) obj).o0(str, str2);
                }
            });
            return;
        }
        if (!this.j.offer(new Pair(str, str2))) {
            fgb.b("The queue for app events is full, dropping the new event.");
            k6e k6eVar = this.i;
            if (k6eVar != null) {
                j6e b = j6e.b("dae_action");
                b.a("dae_name", str);
                b.a("dae_data", str2);
                k6eVar.a(b);
            }
        }
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        this.f.set(true);
        this.h.set(false);
    }

    @Override // defpackage.w6c
    public final void zza() {
        rxd.a(this.a, new qxd() { // from class: chd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzd();
            }
        });
        rxd.a(this.e, new qxd() { // from class: dhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ukb) obj).zzc();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zzb() {
        rxd.a(this.a, new qxd() { // from class: nhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzh();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zzc() {
        rxd.a(this.a, new qxd() { // from class: phd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzj();
            }
        });
        rxd.a(this.e, new qxd() { // from class: uhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ukb) obj).zzf();
            }
        });
        rxd.a(this.e, new qxd() { // from class: vhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ukb) obj).zze();
            }
        });
    }

    @Override // defpackage.w6c
    public final void zze() {
    }

    @Override // defpackage.w6c
    public final void zzf() {
    }

    @Override // defpackage.t7c
    public final void zzq() {
        rxd.a(this.a, new qxd() { // from class: bhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzg();
            }
        });
    }

    @Override // defpackage.r8c
    public final synchronized void zzr() {
        rxd.a(this.a, new qxd() { // from class: jhd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((pqa) obj).zzi();
            }
        });
        rxd.a(this.d, new qxd() { // from class: khd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((cua) obj).zzc();
            }
        });
        this.h.set(true);
        R();
    }

    @Override // defpackage.bgc
    public final void zzs() {
        if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
            rxd.a(this.a, whd.a);
        }
        rxd.a(this.e, new qxd() { // from class: ehd
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((ukb) obj).zzb();
            }
        });
    }
}
