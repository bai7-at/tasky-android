package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public final class hta extends lia implements jta {
    hta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // defpackage.jta
    public final ee3 zzi() {
        Parcel Q1 = Q1(4, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }
}
