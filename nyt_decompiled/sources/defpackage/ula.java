package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import defpackage.rm;

/* loaded from: classes3.dex */
public final class ula extends bma {
    private final rm.a a;
    private final String b;

    public ula(rm.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // defpackage.cma
    public final void A5(zze zzeVar) {
        if (this.a != null) {
            this.a.a(zzeVar.G0());
        }
    }

    @Override // defpackage.cma
    public final void t3(zla zlaVar) {
        if (this.a != null) {
            this.a.b(new vla(zlaVar, this.b));
        }
    }

    @Override // defpackage.cma
    public final void zzb(int i) {
    }
}
