package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class ecb extends mia implements fcb {
    public ecb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        zbb xbbVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    xbbVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    xbbVar = queryLocalInterface instanceof zbb ? (zbb) queryLocalInterface : new xbb(readStrongBinder);
                }
                nia.c(parcel);
                D4(xbbVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                nia.c(parcel);
                zzh(readInt);
                break;
            case 5:
                zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
                nia.c(parcel);
                b3(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
