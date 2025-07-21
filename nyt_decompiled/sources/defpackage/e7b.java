package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class e7b extends lia implements g7b {
    e7b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // defpackage.g7b
    public final d7b Y(ee3 ee3Var, h3b h3bVar, int i) {
        d7b b7bVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            b7bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            b7bVar = queryLocalInterface instanceof d7b ? (d7b) queryLocalInterface : new b7b(readStrongBinder);
        }
        Q1.recycle();
        return b7bVar;
    }
}
