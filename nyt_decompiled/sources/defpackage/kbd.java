package defpackage;

import com.google.android.gms.internal.ads.zzcag;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class kbd extends ubb implements n8c {
    private vbb a;
    private m8c b;
    private qgc c;

    @Override // defpackage.vbb
    public final synchronized void J(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).a.n4();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void V0(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).c.zze();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void c3(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).d.zzc();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void h3(ee3 ee3Var, zzcag zzcagVar) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).d.j0(zzcagVar);
        }
    }

    @Override // defpackage.vbb
    public final synchronized void l0(ee3 ee3Var, int i) {
        m8c m8cVar = this.b;
        if (m8cVar != null) {
            m8cVar.zza(i);
        }
    }

    @Override // defpackage.n8c
    public final synchronized void l3(m8c m8cVar) {
        this.b = m8cVar;
    }

    @Override // defpackage.vbb
    public final synchronized void r5(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).c.zzb();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void v4(ee3 ee3Var, int i) {
        qgc qgcVar = this.c;
        if (qgcVar != null) {
            fgb.g("Fail to initialize adapter ".concat(String.valueOf(((xed) qgcVar).c.a)));
        }
    }

    public final synchronized void x6(vbb vbbVar) {
        this.a = vbbVar;
    }

    public final synchronized void y6(qgc qgcVar) {
        this.c = qgcVar;
    }

    @Override // defpackage.vbb
    public final synchronized void zze(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            ((yed) vbbVar).b.v();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void zzf(ee3 ee3Var) {
        vbb vbbVar = this.a;
        if (vbbVar != null) {
            vbbVar.zzf(ee3Var);
        }
    }

    @Override // defpackage.vbb
    public final synchronized void zzi(ee3 ee3Var) {
        m8c m8cVar = this.b;
        if (m8cVar != null) {
            m8cVar.zzd();
        }
    }

    @Override // defpackage.vbb
    public final synchronized void zzl(ee3 ee3Var) {
        Executor executor;
        qgc qgcVar = this.c;
        if (qgcVar != null) {
            executor = ((xed) qgcVar).d.b;
            final j9d j9dVar = ((xed) qgcVar).c;
            final v0e v0eVar = ((xed) qgcVar).b;
            final g1e g1eVar = ((xed) qgcVar).a;
            final xed xedVar = (xed) qgcVar;
            executor.execute(new Runnable() { // from class: wed
                @Override // java.lang.Runnable
                public final void run() {
                    zed zedVar = xed.this.d;
                    zed.e(g1eVar, v0eVar, j9dVar);
                }
            });
        }
    }
}
