package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class iib extends gwa implements skb {
    iib(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.skb
    public final void z0(String str, String str2, Bundle bundle, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.e(O, bundle);
        O.writeLong(j);
        l3(1, O);
    }

    @Override // defpackage.skb
    public final int zzd() {
        Parcel Q1 = Q1(2, O());
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }
}
