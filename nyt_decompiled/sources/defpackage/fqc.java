package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class fqc extends mia implements jrc {
    public fqc() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzi();
        } else if (i == 2) {
            zzh();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            boolean g = nia.g(parcel);
            nia.c(parcel);
            S(g);
        }
        parcel2.writeNoException();
        return true;
    }
}
