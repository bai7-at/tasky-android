package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfrz;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzfsk;

/* loaded from: classes3.dex */
public final class ube extends lia implements IInterface {
    ube(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void Y4(zzfrw zzfrwVar) {
        Parcel O = O();
        nia.d(O, zzfrwVar);
        l3(2, O);
    }

    public final zzfsb s4(zzfrz zzfrzVar) {
        Parcel O = O();
        nia.d(O, zzfrzVar);
        Parcel Q1 = Q1(1, O);
        zzfsb zzfsbVar = (zzfsb) nia.a(Q1, zzfsb.CREATOR);
        Q1.recycle();
        return zzfsbVar;
    }

    public final zzfsk x4(zzfsi zzfsiVar) {
        Parcel O = O();
        nia.d(O, zzfsiVar);
        Parcel Q1 = Q1(3, O);
        zzfsk zzfskVar = (zzfsk) nia.a(Q1, zzfsk.CREATOR);
        Q1.recycle();
        return zzfskVar;
    }
}
