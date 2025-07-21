package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class qyb extends nyb {
    private final Context j;
    private final View k;
    private final wlb l;
    private final w0e m;
    private final s0c n;
    private final clc o;
    private final dgc p;
    private final l3f q;
    private final Executor r;
    private zzq s;

    qyb(t0c t0cVar, Context context, w0e w0eVar, View view, wlb wlbVar, s0c s0cVar, clc clcVar, dgc dgcVar, l3f l3fVar, Executor executor) {
        super(t0cVar);
        this.j = context;
        this.k = view;
        this.l = wlbVar;
        this.m = w0eVar;
        this.n = s0cVar;
        this.o = clcVar;
        this.p = dgcVar;
        this.q = l3fVar;
        this.r = executor;
    }

    public static /* synthetic */ void o(qyb qybVar) {
        clc clcVar = qybVar.o;
        if (clcVar.e() == null) {
            return;
        }
        try {
            clcVar.e().M3((q4b) qybVar.q.zzb(), fc5.l3(qybVar.j));
        } catch (RemoteException e) {
            fgb.e("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // defpackage.u0c
    public final void b() {
        this.r.execute(new Runnable() { // from class: pyb
            @Override // java.lang.Runnable
            public final void run() {
                qyb.o(qyb.this);
            }
        });
        super.b();
    }

    @Override // defpackage.nyb
    public final int h() {
        if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && this.b.h0) {
            if (!((Boolean) pla.c().a(mpa.J7)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // defpackage.nyb
    public final View i() {
        return this.k;
    }

    @Override // defpackage.nyb
    public final znc j() {
        try {
            return this.n.zza();
        } catch (zzfho unused) {
            return null;
        }
    }

    @Override // defpackage.nyb
    public final w0e k() {
        zzq zzqVar = this.s;
        if (zzqVar != null) {
            return y1e.b(zzqVar);
        }
        v0e v0eVar = this.b;
        if (v0eVar.d0) {
            for (String str : v0eVar.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.k;
            return new w0e(view.getWidth(), view.getHeight(), false);
        }
        return (w0e) this.b.s.get(0);
    }

    @Override // defpackage.nyb
    public final w0e l() {
        return this.m;
    }

    @Override // defpackage.nyb
    public final void m() {
        this.p.zza();
    }

    @Override // defpackage.nyb
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
        wlb wlbVar;
        if (viewGroup == null || (wlbVar = this.l) == null) {
            return;
        }
        wlbVar.t0(unb.c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.s = zzqVar;
    }
}
