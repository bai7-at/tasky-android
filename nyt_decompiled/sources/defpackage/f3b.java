package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class f3b extends lia implements h3b {
    f3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.h3b
    public final boolean I(String str) {
        Parcel O = O();
        O.writeString(str);
        Parcel Q1 = Q1(4, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.h3b
    public final boolean b(String str) {
        Parcel O = O();
        O.writeString(str);
        Parcel Q1 = Q1(2, O);
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.h3b
    public final k3b f(String str) {
        k3b i3bVar;
        Parcel O = O();
        O.writeString(str);
        Parcel Q1 = Q1(1, O);
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            i3bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            i3bVar = queryLocalInterface instanceof k3b ? (k3b) queryLocalInterface : new i3b(readStrongBinder);
        }
        Q1.recycle();
        return i3bVar;
    }

    @Override // defpackage.h3b
    public final o5b s(String str) {
        Parcel O = O();
        O.writeString(str);
        Parcel Q1 = Q1(3, O);
        o5b w6 = n5b.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }
}
