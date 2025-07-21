package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class y9d implements l9d {
    private final Context a;
    private final yxb b;
    private final Executor c;

    y9d(Context context, yxb yxbVar, Executor executor) {
        this.a = context;
        this.b = yxbVar;
        this.c = executor;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, final j9d j9dVar) {
        vxb a = this.b.a(new k1c(g1eVar, v0eVar, j9dVar.a), new chc(new iic() { // from class: x9d
            @Override // defpackage.iic
            public final void a(boolean z, Context context, m7c m7cVar) {
                j9d j9dVar2 = j9d.this;
                try {
                    ((s2e) j9dVar2.b).A(z);
                    ((s2e) j9dVar2.b).B(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }, null), new wxb(v0eVar.b0));
        a.c().C0(new svb((s2e) j9dVar.b), this.c);
        ((jbd) j9dVar.c).x6(a.g());
        return a.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        s2e s2eVar = (s2e) j9dVar.b;
        s1e s1eVar = g1eVar.a.a;
        s2eVar.q(this.a, s1eVar.d, v0eVar.w.toString(), (t3b) j9dVar.c);
    }
}
