package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes2.dex */
public abstract class ewa extends mia implements jxa {
    public ewa() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzl zzlVar = (zzl) nia.a(parcel, zzl.CREATOR);
            nia.c(parcel);
            P4(zzlVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            int i3 = nia.b;
            parcel2.writeInt(zzi ? 1 : 0);
        } else if (i == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) nia.a(parcel, zzl.CREATOR);
            int readInt = parcel.readInt();
            nia.c(parcel);
            y3(zzlVar2, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
