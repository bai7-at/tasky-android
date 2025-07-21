package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public final class kza extends lia implements mza {
    kza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // defpackage.mza
    public final void P2(List list) {
        Parcel O = O();
        O.writeTypedList(list);
        l3(1, O);
    }
}
