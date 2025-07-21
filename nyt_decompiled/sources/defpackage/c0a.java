package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.icing.zzx;

/* loaded from: classes3.dex */
final class c0a extends r2a {
    final /* synthetic */ zzx[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0a(g5a g5aVar, GoogleApiClient googleApiClient, zzx[] zzxVarArr) {
        super(googleApiClient);
        this.a = zzxVarArr;
    }

    @Override // defpackage.k1a
    protected final void a(uq9 uq9Var) {
        uq9Var.l3(new a4a(this), null, this.a);
    }
}
