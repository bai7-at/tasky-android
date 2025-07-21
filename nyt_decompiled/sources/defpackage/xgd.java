package defpackage;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* loaded from: classes3.dex */
public final class xgd extends aza {
    private final Context a;
    private final aob b;
    final q1e c;
    final alc d;
    private pqa e;

    public xgd(aob aobVar, Context context, String str) {
        q1e q1eVar = new q1e();
        this.c = q1eVar;
        this.d = new alc();
        this.b = aobVar;
        q1eVar.J(str);
        this.a = context;
    }

    @Override // defpackage.c0b
    public final void A3(zzbpp zzbppVar) {
        this.c.M(zzbppVar);
    }

    @Override // defpackage.c0b
    public final void B0(wza wzaVar) {
        this.d.d(wzaVar);
    }

    @Override // defpackage.c0b
    public final void C5(qua quaVar) {
        this.d.b(quaVar);
    }

    @Override // defpackage.c0b
    public final void b2(String str, wua wuaVar, tua tuaVar) {
        this.d.c(str, wuaVar, tuaVar);
    }

    @Override // defpackage.c0b
    public final void j3(ava avaVar, zzq zzqVar) {
        this.d.e(avaVar);
        this.c.I(zzqVar);
    }

    @Override // defpackage.c0b
    public final void k6(PublisherAdViewOptions publisherAdViewOptions) {
        this.c.d(publisherAdViewOptions);
    }

    @Override // defpackage.c0b
    public final void l1(nua nuaVar) {
        this.d.a(nuaVar);
    }

    @Override // defpackage.c0b
    public final void o6(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.c.H(adManagerAdViewOptions);
    }

    @Override // defpackage.c0b
    public final void p4(hva hvaVar) {
        this.d.f(hvaVar);
    }

    @Override // defpackage.c0b
    public final void r3(pqa pqaVar) {
        this.e = pqaVar;
    }

    @Override // defpackage.c0b
    public final void u1(zzbjb zzbjbVar) {
        this.c.a(zzbjbVar);
    }

    @Override // defpackage.c0b
    public final void v3(fhb fhbVar) {
        this.c.q(fhbVar);
    }

    @Override // defpackage.c0b
    public final jxa zze() {
        clc g = this.d.g();
        this.c.b(g.i());
        this.c.c(g.h());
        q1e q1eVar = this.c;
        if (q1eVar.x() == null) {
            q1eVar.I(zzq.H0());
        }
        return new ygd(this.a, this.b, this.c, g, this.e);
    }
}
