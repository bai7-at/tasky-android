package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
public final class pwc implements dwc {
    private final long a;
    private final gid b;

    pwc(long j, Context context, iwc iwcVar, aob aobVar, String str) {
        this.a = j;
        uyd y = aobVar.y();
        y.b(context);
        y.a(new zzq());
        y.f(str);
        gid zza = y.zzd().zza();
        this.b = zza;
        zza.K4(new owc(this, iwcVar));
    }

    @Override // defpackage.dwc
    public final void a(zzl zzlVar) {
        this.b.p3(zzlVar);
    }

    @Override // defpackage.dwc
    public final void zza() {
        this.b.e();
    }

    @Override // defpackage.dwc
    public final void zzc() {
        this.b.s5(fc5.l3(null));
    }
}
