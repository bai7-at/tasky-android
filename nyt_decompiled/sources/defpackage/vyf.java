package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class vyf extends qab implements yuf {
    public vyf() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.qab
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                H4((GoogleSignInAccount) xsd.a(parcel, GoogleSignInAccount.CREATOR), (Status) xsd.a(parcel, Status.CREATOR));
                break;
            case 102:
                U3((Status) xsd.a(parcel, Status.CREATOR));
                break;
            case 103:
                q4((Status) xsd.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
