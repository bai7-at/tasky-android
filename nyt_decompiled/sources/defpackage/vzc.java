package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class vzc extends qka implements ntd {
    public static ntd O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof ntd ? (ntd) queryLocalInterface : new a5c(iBinder);
    }
}
