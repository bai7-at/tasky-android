package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class b2g extends c5c implements yxf {
    b2g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // defpackage.yxf
    public final void a1(yuf yufVar, GoogleSignInOptions googleSignInOptions) {
        Parcel O = O();
        xsd.b(O, yufVar);
        xsd.c(O, googleSignInOptions);
        Q1(103, O);
    }

    @Override // defpackage.yxf
    public final void z1(yuf yufVar, GoogleSignInOptions googleSignInOptions) {
        Parcel O = O();
        xsd.b(O, yufVar);
        xsd.c(O, googleSignInOptions);
        Q1(102, O);
    }
}
