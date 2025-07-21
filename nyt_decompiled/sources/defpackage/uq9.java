package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.icing.zzx;

/* loaded from: classes3.dex */
public final class uq9 extends wp9 implements IInterface {
    uq9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void l3(ku9 ku9Var, String str, zzx[] zzxVarArr) {
        Parcel O = O();
        tab.b(O, ku9Var);
        O.writeString(null);
        O.writeTypedArray(zzxVarArr, 0);
        Q1(1, O);
    }
}
