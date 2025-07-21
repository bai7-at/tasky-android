package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class m7b extends mia implements n7b {
    public static n7b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof n7b ? (n7b) queryLocalInterface : new l7b(iBinder);
    }
}
