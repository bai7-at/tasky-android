package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class y0f extends vsa {
    private final p6 a;
    private final Object b;

    public y0f(p6 p6Var, Object obj) {
        this.a = p6Var;
        this.b = obj;
    }

    @Override // defpackage.cua
    public final void h0(zze zzeVar) {
        p6 p6Var = this.a;
        if (p6Var != null) {
            p6Var.a(zzeVar.G0());
        }
    }

    @Override // defpackage.cua
    public final void zzc() {
        Object obj;
        p6 p6Var = this.a;
        if (p6Var == null || (obj = this.b) == null) {
            return;
        }
        p6Var.b(obj);
    }
}
