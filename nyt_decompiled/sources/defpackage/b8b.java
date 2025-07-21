package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public final class b8b extends lia implements d8b {
    b8b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // defpackage.d8b
    public final void Y0(List list) {
        Parcel O = O();
        O.writeTypedList(list);
        l3(1, O);
    }

    @Override // defpackage.d8b
    public final void b(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(2, O);
    }
}
