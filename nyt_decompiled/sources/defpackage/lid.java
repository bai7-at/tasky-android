package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class lid {
    private final clc a;
    private final yhd b;
    private final c7c c;

    public lid(clc clcVar, k6e k6eVar) {
        this.a = clcVar;
        final yhd yhdVar = new yhd(k6eVar);
        this.b = yhdVar;
        final wza g = clcVar.g();
        this.c = new c7c() { // from class: kid
            @Override // defpackage.c7c
            public final void n(zze zzeVar) {
                yhd.this.n(zzeVar);
                wza wzaVar = g;
                if (wzaVar != null) {
                    try {
                        wzaVar.d(zzeVar);
                    } catch (RemoteException e) {
                        fgb.i("#007 Could not call remote method.", e);
                    }
                }
                if (wzaVar != null) {
                    try {
                        wzaVar.i(zzeVar.zza);
                    } catch (RemoteException e2) {
                        fgb.i("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final c7c a() {
        return this.c;
    }

    public final r8c b() {
        return this.b;
    }

    public final sic c() {
        return new sic(this.a, this.b.l());
    }

    public final yhd d() {
        return this.b;
    }

    public final void e(pqa pqaVar) {
        this.b.t(pqaVar);
    }
}
