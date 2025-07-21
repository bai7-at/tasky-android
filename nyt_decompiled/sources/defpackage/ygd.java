package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public final class ygd extends ewa {
    private final jid a;

    public ygd(Context context, aob aobVar, q1e q1eVar, clc clcVar, pqa pqaVar) {
        lid lidVar = new lid(clcVar, aobVar.C());
        lidVar.e(pqaVar);
        this.a = new jid(new yid(aobVar, context, lidVar, q1eVar), q1eVar.i());
    }

    @Override // defpackage.jxa
    public final void P4(zzl zzlVar) {
        this.a.d(zzlVar, 1);
    }

    @Override // defpackage.jxa
    public final synchronized void y3(zzl zzlVar, int i) {
        this.a.d(zzlVar, i);
    }

    @Override // defpackage.jxa
    public final synchronized String zze() {
        return this.a.a();
    }

    @Override // defpackage.jxa
    public final synchronized String zzf() {
        return this.a.b();
    }

    @Override // defpackage.jxa
    public final synchronized boolean zzi() {
        return this.a.e();
    }
}
