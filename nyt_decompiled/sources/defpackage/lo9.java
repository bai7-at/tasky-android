package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes3.dex */
public abstract class lo9 extends go9 implements oo9 {
    public lo9() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.go9
    protected final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                io9.b(parcel);
                break;
            case 4:
                io9.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                io9.b(parcel);
                break;
            case 7:
                io9.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) io9.a(parcel, zak.CREATOR);
                io9.b(parcel);
                zab(zakVar);
                break;
            case 9:
                io9.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
