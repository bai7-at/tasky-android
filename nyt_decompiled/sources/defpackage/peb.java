package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class peb extends lia implements reb {
    peb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // defpackage.reb
    public final oeb Y(ee3 ee3Var, h3b h3bVar, int i) {
        oeb mebVar;
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, h3bVar);
        O.writeInt(240304000);
        Parcel Q1 = Q1(2, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            mebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            mebVar = queryLocalInterface instanceof oeb ? (oeb) queryLocalInterface : new meb(readStrongBinder);
        }
        Q1.recycle();
        return mebVar;
    }
}
