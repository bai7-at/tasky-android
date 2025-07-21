package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class txe extends o4e implements zxe {
    public txe() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // defpackage.o4e
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Bundle bundle = (Bundle) r5e.a(parcel, Bundle.CREATOR);
            r5e.b(parcel);
            zzc(bundle);
        } else {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            r5e.b(parcel);
            zzb(readInt);
        }
        return true;
    }
}
