package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class bma extends mia implements cma {
    public bma() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static cma w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof cma ? (cma) queryLocalInterface : new ama(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        zla xlaVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                xlaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                xlaVar = queryLocalInterface instanceof zla ? (zla) queryLocalInterface : new xla(readStrongBinder);
            }
            nia.c(parcel);
            t3(xlaVar);
        } else if (i == 2) {
            parcel.readInt();
            nia.c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
            nia.c(parcel);
            A5(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
