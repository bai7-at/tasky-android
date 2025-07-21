package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class ntc extends njb {
    private final x4f a;

    ntc(x4f x4fVar) {
        this.a = x4fVar;
    }

    @Override // defpackage.skb
    public final void z0(String str, String str2, Bundle bundle, long j) {
        this.a.a(str, str2, bundle, j);
    }

    @Override // defpackage.skb
    public final int zzd() {
        return System.identityHashCode(this.a);
    }
}
