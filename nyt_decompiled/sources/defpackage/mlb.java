package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzen;

/* loaded from: classes2.dex */
public final class mlb extends lia implements tnb {
    mlb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // defpackage.tnb
    public final h3b getAdapterCreator() {
        Parcel Q1 = Q1(2, O());
        h3b w6 = g3b.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.tnb
    public final zzen getLiteSdkVersion() {
        Parcel Q1 = Q1(1, O());
        zzen zzenVar = (zzen) nia.a(Q1, zzen.CREATOR);
        Q1.recycle();
        return zzenVar;
    }
}
