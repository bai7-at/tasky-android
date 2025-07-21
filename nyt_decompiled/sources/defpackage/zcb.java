package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class zcb extends icb {
    private final r17 a;
    private final adb b;

    public zcb(r17 r17Var, adb adbVar) {
        this.a = r17Var;
        this.b = adbVar;
    }

    @Override // defpackage.jcb
    public final void d(zze zzeVar) {
        r17 r17Var = this.a;
        if (r17Var != null) {
            r17Var.a(zzeVar.G0());
        }
    }

    @Override // defpackage.jcb
    public final void i(int i) {
    }

    @Override // defpackage.jcb
    public final void zzg() {
        adb adbVar;
        r17 r17Var = this.a;
        if (r17Var == null || (adbVar = this.b) == null) {
            return;
        }
        r17Var.b(adbVar);
    }
}
