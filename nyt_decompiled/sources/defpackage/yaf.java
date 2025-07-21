package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zzz;

/* loaded from: classes3.dex */
final class yaf extends klf {
    private final /* synthetic */ Credential a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yaf(y8f y8fVar, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.a = credential;
    }

    @Override // defpackage.klf
    protected final void a(Context context, o3g o3gVar) {
        o3gVar.G0(new nof(this), new zzz(this.a));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
