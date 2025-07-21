package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class dta extends lia implements fta {
    dta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // defpackage.fta
    public final String zzg() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.fta
    public final List zzh() {
        Parcel Q1 = Q1(3, O());
        ArrayList b = nia.b(Q1);
        Q1.recycle();
        return b;
    }
}
