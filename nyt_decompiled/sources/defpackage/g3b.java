package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class g3b extends mia implements h3b {
    public g3b() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static h3b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof h3b ? (h3b) queryLocalInterface : new f3b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            nia.c(parcel);
            k3b f = f(readString);
            parcel2.writeNoException();
            nia.f(parcel2, f);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            nia.c(parcel);
            boolean b = b(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(b ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            nia.c(parcel);
            o5b s = s(readString3);
            parcel2.writeNoException();
            nia.f(parcel2, s);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            nia.c(parcel);
            boolean I = I(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(I ? 1 : 0);
        }
        return true;
    }
}
