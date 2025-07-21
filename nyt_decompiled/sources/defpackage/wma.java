package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;

/* loaded from: classes3.dex */
public final class wma extends lia implements IInterface {
    wma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbay Y4(zzbbb zzbbbVar) {
        Parcel O = O();
        nia.d(O, zzbbbVar);
        Parcel Q1 = Q1(2, O);
        zzbay zzbayVar = (zzbay) nia.a(Q1, zzbay.CREATOR);
        Q1.recycle();
        return zzbayVar;
    }

    public final long s4(zzbbb zzbbbVar) {
        Parcel O = O();
        nia.d(O, zzbbbVar);
        Parcel Q1 = Q1(3, O);
        long readLong = Q1.readLong();
        Q1.recycle();
        return readLong;
    }

    public final zzbay x4(zzbbb zzbbbVar) {
        Parcel O = O();
        nia.d(O, zzbbbVar);
        Parcel Q1 = Q1(1, O);
        zzbay zzbayVar = (zzbay) nia.a(Q1, zzbay.CREATOR);
        Q1.recycle();
        return zzbayVar;
    }
}
