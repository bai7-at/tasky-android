package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.pal.zzgy;

/* loaded from: classes3.dex */
final class t1f extends txe {
    final /* synthetic */ qg8 a;

    t1f(d2f d2fVar, qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // defpackage.zxe
    public final void zzb(int i) {
        this.a.d(new zzgy(i));
    }

    @Override // defpackage.zxe
    public final void zzc(Bundle bundle) {
        this.a.e(bundle.getString("newToken"));
    }
}
