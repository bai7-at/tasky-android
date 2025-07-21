package defpackage;

import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class k5f extends o4e implements n5f {
    public k5f() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.o4e
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                r5e.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                r5e.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                r5e.b(parcel);
                break;
            case 6:
                parcel.readInt();
                r5e.b(parcel);
                break;
            case 7:
                parcel.readInt();
                r5e.b(parcel);
                break;
            case 8:
                ee3.a.O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                r5e.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
