package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcag;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class ubb extends mia implements vbb {
    public ubb() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static vbb w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof vbb ? (vbb) queryLocalInterface : new tbb(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zzl(O);
                break;
            case 2:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                nia.c(parcel);
                v4(O2, readInt);
                break;
            case 3:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zzi(O3);
                break;
            case 4:
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                J(O4);
                break;
            case 5:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                c3(O5);
                break;
            case 6:
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zzf(O6);
                break;
            case 7:
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                zzcag zzcagVar = (zzcag) nia.a(parcel, zzcag.CREATOR);
                nia.c(parcel);
                h3(O7, zzcagVar);
                break;
            case 8:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                zze(O8);
                break;
            case 9:
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                nia.c(parcel);
                l0(O9, readInt2);
                break;
            case 10:
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                r5(O10);
                break;
            case 11:
                ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                V0(O11);
                break;
            case 12:
                nia.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
