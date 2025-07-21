package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import defpackage.adf;

/* loaded from: classes3.dex */
public final class z8a extends GoogleApi implements yr7 {
    private static final Api.ClientKey a;
    private static final Api.AbstractClientBuilder b;
    private static final Api c;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        wca wcaVar = new wca();
        b = wcaVar;
        c = new Api("Auth.Api.Identity.SignIn.API", wcaVar, clientKey);
    }

    public z8a(Activity activity, adf adfVar) {
        super(activity, (Api<adf>) c, adf.a.a(adfVar).b(mla.a()).c(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // defpackage.yr7
    public final SignInCredential a(Intent intent) {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // defpackage.yr7
    public final og8 c(BeginSignInRequest beginSignInRequest) {
        final BeginSignInRequest a2 = BeginSignInRequest.X0(beginSignInRequest).e(((adf) getApiOptions()).b()).a();
        return doRead(TaskApiCall.builder().setFeatures(gia.a).run(new RemoteCall(this, a2) { // from class: zba
            private final z8a a;
            private final BeginSignInRequest b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                z8a z8aVar = this.a;
                BeginSignInRequest beginSignInRequest2 = this.b;
                ((j1a) ((wfa) obj).getService()).d6(new tea(z8aVar, (qg8) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).build());
    }
}
