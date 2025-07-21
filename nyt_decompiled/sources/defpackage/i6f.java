package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class i6f extends klf {
    private final /* synthetic */ CredentialRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i6f(y8f y8fVar, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.a = credentialRequest;
    }

    @Override // defpackage.klf
    protected final void a(Context context, o3g o3gVar) {
        o3gVar.e1(new fdf(this), this.a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return vhe.b(status);
    }
}
