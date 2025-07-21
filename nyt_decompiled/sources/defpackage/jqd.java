package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jqd {
    private final Context a;
    private final Set b;
    private final Executor c;
    private final q7e d;
    private final zuc e;
    private long f = 0;
    private int g = 0;

    public jqd(Context context, Executor executor, Set set, q7e q7eVar, zuc zucVar) {
        this.a = context;
        this.c = executor;
        this.b = set;
        this.d = q7eVar;
        this.e = zucVar;
    }

    public final j64 a(final Object obj) {
        f7e a = e7e.a(this.a, 8);
        a.zzh();
        final ArrayList arrayList = new ArrayList(this.b.size());
        List arrayList2 = new ArrayList();
        zoa zoaVar = mpa.hb;
        if (!((String) pla.c().a(zoaVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) pla.c().a(zoaVar)).split(","));
        }
        this.f = dyf.b().elapsedRealtime();
        for (final gqd gqdVar : this.b) {
            if (!arrayList2.contains(String.valueOf(gqdVar.zza()))) {
                final long elapsedRealtime = dyf.b().elapsedRealtime();
                j64 zzb = gqdVar.zzb();
                zzb.a(new Runnable() { // from class: hqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        jqd.this.b(elapsedRealtime, gqdVar);
                    }
                }, pgb.f);
                arrayList.add(zzb);
            }
        }
        j64 a2 = zb.b(arrayList).a(new Callable() { // from class: iqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it2.hasNext()) {
                        return obj2;
                    }
                    fqd fqdVar = (fqd) ((j64) it2.next()).get();
                    if (fqdVar != null) {
                        fqdVar.a(obj2);
                    }
                }
            }
        }, this.c);
        if (v7e.a()) {
            p7e.a(a2, this.d, a);
        }
        return a2;
    }

    public final void b(long j, gqd gqdVar) {
        long elapsedRealtime = dyf.b().elapsedRealtime() - j;
        if (((Boolean) yra.a.e()).booleanValue()) {
            pzc.k("Signal runtime (ms) : " + ehe.c(gqdVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) pla.c().a(mpa.a2)).booleanValue()) {
            yuc a = this.e.a();
            a.b("action", "lat_ms");
            a.b("lat_grp", "sig_lat_grp");
            a.b("lat_id", String.valueOf(gqdVar.zza()));
            a.b("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) pla.c().a(mpa.b2)).booleanValue()) {
                synchronized (this) {
                    this.g++;
                }
                a.b("seq_num", dyf.q().h().d());
                synchronized (this) {
                    try {
                        if (this.g == this.b.size() && this.f != 0) {
                            this.g = 0;
                            String valueOf = String.valueOf(dyf.b().elapsedRealtime() - this.f);
                            if (gqdVar.zza() <= 39 || gqdVar.zza() >= 52) {
                                a.b("lat_clsg", valueOf);
                            } else {
                                a.b("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            a.h();
        }
    }
}
