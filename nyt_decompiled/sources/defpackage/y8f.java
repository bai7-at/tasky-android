package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class y8f implements a31 {
    @Override // defpackage.a31
    public final PendingResult a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credentialRequest, "request must not be null");
        return googleApiClient.enqueue(new i6f(this, googleApiClient, credentialRequest));
    }

    @Override // defpackage.a31
    public final PendingResult b(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new yaf(this, googleApiClient, credential));
    }
}
