package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public final class twc implements dwc {
    private final long a;
    private final iwc b;
    private final m0e c;

    twc(long j, Context context, iwc iwcVar, aob aobVar, String str) {
        this.a = j;
        this.b = iwcVar;
        o0e z = aobVar.z();
        z.b(context);
        z.a(str);
        this.c = z.zzc().zza();
    }

    @Override // defpackage.dwc
    public final void a(zzl zzlVar) {
        try {
            this.c.p1(zzlVar, new rwc(this));
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.dwc
    public final void zza() {
    }

    @Override // defpackage.dwc
    public final void zzc() {
        try {
            this.c.i2(new swc(this));
            this.c.zzm(fc5.l3(null));
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }
}
