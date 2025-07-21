package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public abstract class a9b extends mia implements b9b {
    public a9b() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        q9b q9bVar = null;
        if (i == 1) {
            nia.c(parcel);
            parcel2.writeNoException();
            nia.e(parcel2, null);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof c9b) {
                }
            }
            nia.c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbze zzbzeVar = (zzbze) nia.a(parcel, zzbze.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                q9bVar = queryLocalInterface2 instanceof q9b ? (q9b) queryLocalInterface2 : new j9b(readStrongBinder2);
            }
            nia.c(parcel);
            X4(zzbzeVar, q9bVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbze zzbzeVar2 = (zzbze) nia.a(parcel, zzbze.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                q9bVar = queryLocalInterface3 instanceof q9b ? (q9b) queryLocalInterface3 : new j9b(readStrongBinder3);
            }
            nia.c(parcel);
            R3(zzbzeVar2, q9bVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbze zzbzeVar3 = (zzbze) nia.a(parcel, zzbze.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                q9bVar = queryLocalInterface4 instanceof q9b ? (q9b) queryLocalInterface4 : new j9b(readStrongBinder4);
            }
            nia.c(parcel);
            o4(zzbzeVar3, q9bVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                q9bVar = queryLocalInterface5 instanceof q9b ? (q9b) queryLocalInterface5 : new j9b(readStrongBinder5);
            }
            nia.c(parcel);
            Z5(readString, q9bVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
