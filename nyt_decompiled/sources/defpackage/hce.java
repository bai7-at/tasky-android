package defpackage;

import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class hce extends mia implements ice {
    public hce() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                nia.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                nia.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                nia.c(parcel);
                break;
            case 6:
                parcel.readInt();
                nia.c(parcel);
                break;
            case 7:
                parcel.readInt();
                nia.c(parcel);
                break;
            case 8:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                nia.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
