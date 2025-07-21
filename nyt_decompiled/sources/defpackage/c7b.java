package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class c7b extends mia implements d7b {
    public c7b() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static d7b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof d7b ? (d7b) queryLocalInterface : new b7b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) nia.a(parcel, Intent.CREATOR);
                nia.c(parcel);
                t0(intent);
                break;
            case 2:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                nia.c(parcel);
                u0(O, readString, readString2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                s0(O2);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                w0(createStringArray, createIntArray, O3);
                break;
            case 6:
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                zza zzaVar = (zza) nia.a(parcel, zza.CREATOR);
                nia.c(parcel);
                Y2(O4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
