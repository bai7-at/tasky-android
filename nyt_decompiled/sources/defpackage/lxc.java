package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class lxc implements yec {
    private final Bundle a = new Bundle();

    @Override // defpackage.yec
    public final synchronized void I(String str) {
        this.a.putInt(str, 2);
    }

    @Override // defpackage.yec
    public final void a(String str) {
    }

    public final synchronized Bundle b() {
        return new Bundle(this.a);
    }

    @Override // defpackage.yec
    public final synchronized void s(String str) {
        this.a.putInt(str, 1);
    }

    @Override // defpackage.yec
    public final synchronized void zzb(String str, String str2) {
        this.a.putInt(str, 3);
    }

    @Override // defpackage.yec
    public final void zze() {
    }

    @Override // defpackage.yec
    public final void zzf() {
    }
}
