package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class a0b extends lxa implements f1b {
    public static f1b Q1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof f1b ? (f1b) queryLocalInterface : new dza(iBinder);
    }
}
