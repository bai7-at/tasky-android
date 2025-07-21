package defpackage;

import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes2.dex */
final class bld extends ewa {
    final /* synthetic */ gmd a;

    /* synthetic */ bld(gmd gmdVar, zjd zjdVar) {
        this.a = gmdVar;
    }

    @Override // defpackage.jxa
    public final void P4(zzl zzlVar) {
        y3(zzlVar, 1);
    }

    @Override // defpackage.jxa
    public final void y3(zzl zzlVar, int i) {
        fgb.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        tfb.b.post(new wid(this));
    }

    @Override // defpackage.jxa
    public final String zze() {
        return null;
    }

    @Override // defpackage.jxa
    public final String zzf() {
        return null;
    }

    @Override // defpackage.jxa
    public final boolean zzi() {
        return false;
    }
}
