package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class h1d implements gke {
    final /* synthetic */ i1d a;

    h1d(i1d i1dVar) {
        this.a = i1dVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        Pattern pattern;
        t6d t6dVar;
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue()) {
            pattern = i1d.h;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                t6dVar = this.a.e;
                t6dVar.i(Integer.parseInt(group));
            }
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        t6d t6dVar;
        t6d t6dVar2;
        g1e g1eVar = (g1e) obj;
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue()) {
            t6dVar = this.a.e;
            t6dVar.i(g1eVar.b.b.e);
            t6dVar2 = this.a.e;
            t6dVar2.j(g1eVar.b.b.f);
        }
    }
}
