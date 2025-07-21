package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class yv9 extends qab implements tq9 {
    public yv9() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // defpackage.qab
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        J5((Status) xsd.a(parcel, Status.CREATOR), (BeginSignInResult) xsd.a(parcel, BeginSignInResult.CREATOR));
        return true;
    }
}
