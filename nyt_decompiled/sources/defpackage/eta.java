package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class eta extends mia implements fta {
    public eta() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static fta w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof fta ? (fta) queryLocalInterface : new dta(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(zzg);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List zzh = zzh();
        parcel2.writeNoException();
        parcel2.writeList(zzh);
        return true;
    }
}
