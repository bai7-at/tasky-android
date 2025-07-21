package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class pza extends mia implements qza {
    public pza() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        tza rzaVar;
        if (i == 3) {
            znc zzb = zzb();
            parcel2.writeNoException();
            nia.f(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            ee3 O = ee3.a.O(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                rzaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                rzaVar = queryLocalInterface instanceof tza ? (tza) queryLocalInterface : new rza(readStrongBinder);
            }
            nia.c(parcel);
            Y5(O, rzaVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            ee3 O2 = ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            zze(O2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        jta zzc = zzc();
        parcel2.writeNoException();
        nia.f(parcel2, zzc);
        return true;
    }
}
