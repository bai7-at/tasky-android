package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.pal.zzhi;
import com.google.android.gms.internal.pal.zzhk;

/* loaded from: classes3.dex */
public final class a5f extends n3e implements IInterface {
    a5f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzhk s4(zzhi zzhiVar) {
        Parcel O = O();
        r5e.d(O, zzhiVar);
        Parcel Q1 = Q1(1, O);
        zzhk zzhkVar = (zzhk) r5e.a(Q1, zzhk.CREATOR);
        Q1.recycle();
        return zzhkVar;
    }
}
