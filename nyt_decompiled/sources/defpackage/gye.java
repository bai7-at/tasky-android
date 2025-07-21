package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class gye extends o4e implements jye {
    public static jye Q1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        return queryLocalInterface instanceof jye ? (jye) queryLocalInterface : new cye(iBinder);
    }
}
