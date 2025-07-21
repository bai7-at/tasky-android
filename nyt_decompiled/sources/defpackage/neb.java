package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccx;
import defpackage.ee3;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class neb extends mia implements oeb {
    public neb() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static oeb w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof oeb ? (oeb) queryLocalInterface : new meb(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        leb lebVar = null;
        switch (i) {
            case 1:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                zzccx zzccxVar = (zzccx) nia.a(parcel, zzccx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    lebVar = queryLocalInterface instanceof leb ? (leb) queryLocalInterface : new jeb(readStrongBinder);
                }
                nia.c(parcel);
                p5(O, zzccxVar, lebVar);
                parcel2.writeNoException();
                return true;
            case 2:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                B(O2);
                parcel2.writeNoException();
                return true;
            case 3:
                ee3.a.O(parcel.readStrongBinder());
                ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 4:
                ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                d8b w6 = c8b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                f3(createTypedArrayList, O3, w6);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                d8b w62 = c8b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                I2(createTypedArrayList2, O4, w62);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxr zzbxrVar = (zzbxr) nia.a(parcel, zzbxr.CREATOR);
                nia.c(parcel);
                W1(zzbxrVar);
                parcel2.writeNoException();
                return true;
            case 8:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                J(O5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                d8b w63 = c8b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                F1(createTypedArrayList3, O6, w63);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                d8b w64 = c8b.w6(parcel.readStrongBinder());
                nia.c(parcel);
                i1(createTypedArrayList4, O7, w64);
                parcel2.writeNoException();
                return true;
            case 11:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                String readString = parcel.readString();
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                ee3 u2 = u2(O8, O9, readString, O10);
                parcel2.writeNoException();
                nia.f(parcel2, u2);
                return true;
            default:
                return false;
        }
    }
}
