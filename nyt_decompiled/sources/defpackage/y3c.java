package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public abstract class y3c extends mia implements y5c {
    public y3c() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
        nia.c(parcel);
        T1(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
