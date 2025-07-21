package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.p000authapi.zzz;

/* loaded from: classes3.dex */
public final class e2g extends c5c implements o3g {
    e2g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // defpackage.o3g
    public final void G0(t0g t0gVar, zzz zzzVar) {
        Parcel O = O();
        xsd.b(O, t0gVar);
        xsd.c(O, zzzVar);
        Q1(2, O);
    }

    @Override // defpackage.o3g
    public final void e1(t0g t0gVar, CredentialRequest credentialRequest) {
        Parcel O = O();
        xsd.b(O, t0gVar);
        xsd.c(O, credentialRequest);
        Q1(1, O);
    }
}
