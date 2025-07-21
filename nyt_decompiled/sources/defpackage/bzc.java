package defpackage;

import android.os.Parcel;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class bzc extends rka implements vsd {
    public bzc() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // defpackage.rka
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        k2((Status) oab.a(parcel, Status.CREATOR), (zzc) oab.a(parcel, zzc.CREATOR));
        return true;
    }
}
