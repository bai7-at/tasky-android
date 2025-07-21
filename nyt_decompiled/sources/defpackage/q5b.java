package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public abstract class q5b extends mia implements r5b {
    public q5b() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            nia.c(parcel);
            b(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            nia.c(parcel);
            n(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
            nia.c(parcel);
            C0(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
