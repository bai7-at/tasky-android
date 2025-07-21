package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class wub extends mia implements bwb {
    public static bwb w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof bwb ? (bwb) queryLocalInterface : new stb(iBinder);
    }
}
