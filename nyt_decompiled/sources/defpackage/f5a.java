package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes3.dex */
public final class f5a extends c5c implements j1a {
    f5a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override // defpackage.j1a
    public final void d6(tq9 tq9Var, BeginSignInRequest beginSignInRequest) {
        Parcel O = O();
        xsd.b(O, tq9Var);
        xsd.c(O, beginSignInRequest);
        Q1(1, O);
    }
}
