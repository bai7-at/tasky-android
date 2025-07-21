package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class uad implements l9d {
    private final Context a;
    private final nzb b;
    private View c;
    private w3b d;

    public uad(Context context, nzb nzbVar) {
        this.a = context;
        this.b = nzbVar;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, final v0e v0eVar, final j9d j9dVar) {
        final View view;
        if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) {
            try {
                view = (View) fc5.Q1(this.d.zze());
                boolean zzf = this.d.zzf();
                if (view == null) {
                    throw new zzfho(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zb.n(zb.h(null), new ake() { // from class: rad
                            @Override // defpackage.ake
                            public final j64 zza(Object obj) {
                                return uad.this.c(view, v0eVar, obj);
                            }
                        }, pgb.e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfho(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfho(e2);
            }
        } else {
            view = this.c;
        }
        oyb a = this.b.a(new k1c(g1eVar, v0eVar, j9dVar.a), new uyb(view, null, new s0c() { // from class: qad
            @Override // defpackage.s0c
            public final znc zza() {
                try {
                    return ((o5b) j9d.this.b).zze();
                } catch (RemoteException e3) {
                    throw new zzfho(e3);
                }
            }
        }, (w0e) v0eVar.v.get(0)));
        a.i().M0(view);
        ((jbd) j9dVar.c).x6(a.f());
        return a.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            ((o5b) j9dVar.b).U(v0eVar.a0);
            sad sadVar = null;
            if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) {
                ((o5b) j9dVar.b).I1(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new tad(this, j9dVar, sadVar), (t3b) j9dVar.c, g1eVar.a.a.e);
            } else {
                ((o5b) j9dVar.b).o1(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new tad(this, j9dVar, sadVar), (t3b) j9dVar.c, g1eVar.a.a.e);
            }
        } catch (RemoteException e) {
            throw new zzfho(e);
        }
    }

    final /* synthetic */ j64 c(View view, v0e v0eVar, Object obj) {
        return zb.h(e0c.a(this.a, view, v0eVar));
    }
}
