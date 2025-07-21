package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzs;

/* loaded from: classes2.dex */
public abstract class tbc extends mia implements zcc {
    public tbc() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zcc w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zcc ? (zcc) queryLocalInterface : new oac(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzs zzsVar = (zzs) nia.a(parcel, zzs.CREATOR);
            nia.c(parcel);
            n5(zzsVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = nia.b;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
