package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import defpackage.ee3;

/* loaded from: classes2.dex */
public abstract class h2b extends mia implements n3b {
    public h2b() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ee3 O = ee3.a.O(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            nia.c(parcel);
            boolean zzf = zzf(O, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i == 2) {
            ee3 O2 = ee3.a.O(parcel.readStrongBinder());
            nia.c(parcel);
            zze(O2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            ee3 O3 = ee3.a.O(parcel.readStrongBinder());
            zza zzaVar = (zza) nia.a(parcel, zza.CREATOR);
            nia.c(parcel);
            boolean zzg = zzg(O3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
