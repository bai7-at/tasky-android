package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
final class wfd implements htd {
    final /* synthetic */ ugb a;
    final /* synthetic */ g1e b;
    final /* synthetic */ v0e c;
    final /* synthetic */ cgd d;
    final /* synthetic */ xfd e;

    wfd(xfd xfdVar, ugb ugbVar, g1e g1eVar, v0e v0eVar, cgd cgdVar) {
        this.a = ugbVar;
        this.b = g1eVar;
        this.c = v0eVar;
        this.d = cgdVar;
        this.e = xfdVar;
    }

    @Override // defpackage.htd
    public final void zza(View view) {
        ggd ggdVar;
        cgd cgdVar = this.d;
        ggdVar = this.e.d;
        this.a.c(ggdVar.a(this.b, this.c, view, cgdVar));
    }

    @Override // defpackage.htd
    public final void zzb() {
    }

    @Override // defpackage.htd
    public final void zzc() {
    }
}
