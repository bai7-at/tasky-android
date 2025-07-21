package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aed implements l9d {
    private final Context a;
    private final Executor b;
    private final zqc c;

    public aed(Context context, Executor executor, zqc zqcVar) {
        this.a = context;
        this.b = executor;
        this.c = zqcVar;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, final j9d j9dVar) {
        vqc b = this.c.b(new k1c(g1eVar, v0eVar, j9dVar.a), new wqc(new iic() { // from class: zdd
            @Override // defpackage.iic
            public final void a(boolean z, Context context, m7c m7cVar) {
                j9d j9dVar2 = j9d.this;
                try {
                    ((s2e) j9dVar2.b).A(z);
                    ((s2e) j9dVar2.b).E(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        b.c().C0(new svb((s2e) j9dVar.b), this.b);
        ((jbd) j9dVar.c).x6(b.m());
        return b.k();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            s1e s1eVar = g1eVar.a.a;
            if (s1eVar.o.a == 3) {
                ((s2e) j9dVar.b).w(this.a, s1eVar.d, v0eVar.w.toString(), (t3b) j9dVar.c);
            } else {
                ((s2e) j9dVar.b).v(this.a, s1eVar.d, v0eVar.w.toString(), (t3b) j9dVar.c);
            }
        } catch (Exception e) {
            fgb.h("Fail to load ad from adapter ".concat(String.valueOf(j9dVar.a)), e);
        }
    }
}
