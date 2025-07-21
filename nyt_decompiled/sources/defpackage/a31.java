package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

/* loaded from: classes2.dex */
public interface a31 {
    PendingResult a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest);

    PendingResult b(GoogleApiClient googleApiClient, Credential credential);
}
