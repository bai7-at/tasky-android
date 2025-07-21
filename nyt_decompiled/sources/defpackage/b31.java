package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import defpackage.qz;

/* loaded from: classes2.dex */
public class b31 extends GoogleApi {
    b31(Context context, qz.a aVar) {
        super(context, (Api<qz.a>) qz.f, aVar, new ApiExceptionMapper());
    }

    public og8 d(CredentialRequest credentialRequest) {
        return PendingResultUtil.toResponseTask(qz.i.a(asGoogleApiClient(), credentialRequest), new x21());
    }

    public og8 e(Credential credential) {
        return PendingResultUtil.toVoidTask(qz.i.b(asGoogleApiClient(), credential));
    }
}
