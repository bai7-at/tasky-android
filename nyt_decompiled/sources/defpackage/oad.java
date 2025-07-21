package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzfho;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class oad implements l9d {
    private final Context a;
    private final nzb b;
    private final Executor c;

    public oad(Context context, nzb nzbVar, Executor executor) {
        this.a = context;
        this.b = nzbVar;
        this.c = executor;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, final v0e v0eVar, j9d j9dVar) {
        final View f;
        if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) {
            w3b h = ((s2e) j9dVar.b).h();
            if (h == null) {
                fgb.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfho(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                f = (View) fc5.Q1(h.zze());
                boolean zzf = h.zzf();
                if (f == null) {
                    throw new zzfho(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        f = (View) zb.n(zb.h(null), new ake() { // from class: mad
                            @Override // defpackage.ake
                            public final j64 zza(Object obj) {
                                return oad.this.c(f, v0eVar, obj);
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
            f = ((s2e) j9dVar.b).f();
        }
        nzb nzbVar = this.b;
        k1c k1cVar = new k1c(g1eVar, v0eVar, j9dVar.a);
        final s2e s2eVar = (s2e) j9dVar.b;
        Objects.requireNonNull(s2eVar);
        oyb a = nzbVar.a(k1cVar, new uyb(f, null, new s0c() { // from class: nad
            @Override // defpackage.s0c
            public final znc zza() {
                return s2e.this.g();
            }
        }, (w0e) v0eVar.v.get(0)));
        a.i().M0(f);
        a.c().C0(new svb((s2e) j9dVar.b), this.c);
        ((jbd) j9dVar.c).x6(a.g());
        return a.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        zzq zzqVar;
        zzq zzqVar2 = g1eVar.a.a.e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.a, vka.d(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) ? new zzq(this.a, vka.e(zzqVar2.zze, zzqVar2.zzb)) : y1e.a(this.a, v0eVar.v);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) {
            Object obj = j9dVar.b;
            ((s2e) obj).s(this.a, zzqVar3, g1eVar.a.a.d, v0eVar.w.toString(), t6b.l(v0eVar.t), (t3b) j9dVar.c);
            return;
        }
        Object obj2 = j9dVar.b;
        ((s2e) obj2).r(this.a, zzqVar3, g1eVar.a.a.d, v0eVar.w.toString(), t6b.l(v0eVar.t), (t3b) j9dVar.c);
    }

    final /* synthetic */ j64 c(View view, v0e v0eVar, Object obj) {
        return zb.h(e0c.a(this.a, view, v0eVar));
    }
}
