package defpackage;

import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class exd implements gyd {
    private d6c a;
    private final Executor b = lc.b();

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ j64 a(hyd hydVar, fyd fydVar, Object obj) {
        return c(hydVar, fydVar, null);
    }

    public final d6c b() {
        return this.a;
    }

    public final j64 c(hyd hydVar, fyd fydVar, d6c d6cVar) {
        c6c a = fydVar.a(hydVar.b);
        a.p(new kyd(true));
        d6c d6cVar2 = (d6c) a.zzh();
        this.a = d6cVar2;
        final g2c zzb = d6cVar2.zzb();
        final s3e s3eVar = new s3e();
        return zb.m(zb.n(vb.C(zzb.j()), new ake() { // from class: cxd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                g1e g1eVar = (g1e) obj;
                s3eVar.b = g1eVar;
                Iterator it2 = g1eVar.b.a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((v0e) it2.next()).a.iterator();
                        while (it3.hasNext()) {
                            if (!((String) it3.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzb.i(zb.h(g1eVar));
                    }
                }
                return zb.h(null);
            }
        }, this.b), new gge() { // from class: dxd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                s3e s3eVar2 = s3e.this;
                s3eVar2.c = (u0c) obj;
                return s3eVar2;
            }
        }, this.b);
    }

    @Override // defpackage.gyd
    public final /* synthetic */ Object zzd() {
        return this.a;
    }
}
