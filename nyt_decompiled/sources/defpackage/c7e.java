package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class c7e implements cfc, p7c, kfc {
    private final q7e a;
    private final f7e b;

    c7e(Context context, q7e q7eVar) {
        this.a = q7eVar;
        this.b = e7e.a(context, 13);
    }

    @Override // defpackage.p7c
    public final void k(zze zzeVar) {
        if (((Boolean) jra.d.e()).booleanValue()) {
            q7e q7eVar = this.a;
            f7e f7eVar = this.b;
            f7eVar.s(zzeVar.t0().toString());
            f7eVar.S(false);
            q7eVar.a(f7eVar);
        }
    }

    @Override // defpackage.kfc
    public final void zza() {
    }

    @Override // defpackage.kfc
    public final void zzb() {
        if (((Boolean) jra.d.e()).booleanValue()) {
            q7e q7eVar = this.a;
            f7e f7eVar = this.b;
            f7eVar.S(true);
            q7eVar.a(f7eVar);
        }
    }

    @Override // defpackage.cfc
    public final void zzk() {
    }

    @Override // defpackage.cfc
    public final void zzl() {
        if (((Boolean) jra.d.e()).booleanValue()) {
            this.b.zzh();
        }
    }
}
