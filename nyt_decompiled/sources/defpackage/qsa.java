package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class qsa extends lia implements IInterface {
    qsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void s4(t8b t8bVar) {
        Parcel O = O();
        nia.f(O, t8bVar);
        l3(1, O);
    }
}
