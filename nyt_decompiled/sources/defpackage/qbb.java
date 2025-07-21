package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class qbb extends mia implements ucb {
    public qbb() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static ucb w6(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof ucb ? (ucb) queryLocalInterface : new p9b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        nia.c(parcel);
        o0(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
