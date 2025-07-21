package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
final class qwb implements gke {
    final /* synthetic */ swb a;

    qwb(swb swbVar) {
        this.a = swbVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        d2e d2eVar;
        z7e z7eVar;
        g1e g1eVar;
        v0e v0eVar;
        v0e v0eVar2;
        Context context;
        swb swbVar = this.a;
        String str = (String) obj;
        d2eVar = swbVar.h;
        z7eVar = swbVar.g;
        g1eVar = swbVar.e;
        v0eVar = swbVar.f;
        v0eVar2 = swbVar.f;
        List d = z7eVar.d(g1eVar, v0eVar, false, "", str, v0eVar2.c);
        swb swbVar2 = this.a;
        kfb q = dyf.q();
        context = swbVar2.a;
        d2eVar.c(d, true == q.z(context) ? 2 : 1);
    }
}
