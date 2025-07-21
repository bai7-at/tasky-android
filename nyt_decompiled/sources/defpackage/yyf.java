package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class yyf extends qab implements t0g {
    public yyf() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // defpackage.qab
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Y1((Status) xsd.a(parcel, Status.CREATOR), (Credential) xsd.a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            Q3((Status) xsd.a(parcel, Status.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            j6((Status) xsd.a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
