package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class f8c extends mia implements j9c {
    public static j9c w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof j9c ? (j9c) queryLocalInterface : new b7c(iBinder);
    }
}
