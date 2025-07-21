package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class u7b extends mia implements r8b {
    public static r8b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof r8b ? (r8b) queryLocalInterface : new x6b(iBinder);
    }
}
