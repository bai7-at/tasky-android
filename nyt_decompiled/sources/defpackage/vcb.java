package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class vcb extends icb {
    private final p17 a;
    private final o17 b;

    public vcb(p17 p17Var, o17 o17Var) {
        this.a = p17Var;
        this.b = o17Var;
    }

    @Override // defpackage.jcb
    public final void d(zze zzeVar) {
        if (this.a != null) {
            this.a.a(zzeVar.G0());
        }
    }

    @Override // defpackage.jcb
    public final void i(int i) {
    }

    @Override // defpackage.jcb
    public final void zzg() {
        p17 p17Var = this.a;
        if (p17Var != null) {
            p17Var.b(this.b);
        }
    }
}
