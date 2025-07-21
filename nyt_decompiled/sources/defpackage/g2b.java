package defpackage;

import com.google.android.gms.internal.ads.zzbrm;

/* loaded from: classes3.dex */
final class g2b implements wgb {
    final /* synthetic */ ugb a;
    final /* synthetic */ l1b b;

    g2b(n2b n2bVar, ugb ugbVar, l1b l1bVar) {
        this.a = ugbVar;
        this.b = l1bVar;
    }

    @Override // defpackage.wgb
    public final void zza() {
        pzc.k("callJs > getEngine: Promise rejected");
        this.a.d(new zzbrm("Unable to obtain a JavascriptEngine."));
        this.b.g();
    }
}
