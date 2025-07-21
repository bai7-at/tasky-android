package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zed implements l9d {
    private final Context a;
    private final Executor b;
    private final zqc c;

    public zed(Context context, Executor executor, zqc zqcVar) {
        this.a = context;
        this.b = executor;
        this.c = zqcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            ((s2e) j9dVar.b).p(g1eVar.a.a.d, v0eVar.w.toString());
        } catch (Exception e) {
            fgb.h("Fail to load ad from adapter ".concat(String.valueOf(j9dVar.a)), e);
        }
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, final j9d j9dVar) {
        vqc b = this.c.b(new k1c(g1eVar, v0eVar, j9dVar.a), new wqc(new iic() { // from class: ved
            @Override // defpackage.iic
            public final void a(boolean z, Context context, m7c m7cVar) {
                j9d j9dVar2 = j9d.this;
                try {
                    ((s2e) j9dVar2.b).A(z);
                    ((s2e) j9dVar2.b).a();
                } catch (zzfho e) {
                    fgb.h("Cannot show rewarded video.", e);
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        b.c().C0(new svb((s2e) j9dVar.b), this.b);
        k8c d = b.d();
        u6c a = b.a();
        ((kbd) j9dVar.c).x6(new yed(this, b.h(), a, d, b.i()));
        return b.k();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        if (((s2e) j9dVar.b).c()) {
            e(g1eVar, v0eVar, j9dVar);
            return;
        }
        ((kbd) j9dVar.c).y6(new xed(this, g1eVar, v0eVar, j9dVar));
        Object obj = j9dVar.b;
        Context context = this.a;
        s1e s1eVar = g1eVar.a.a;
        ((s2e) obj).m(context, s1eVar.d, null, (vbb) j9dVar.c, v0eVar.w.toString());
    }
}
