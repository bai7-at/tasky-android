package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.a0;
import defpackage.ee3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class y3b extends lia implements IInterface {
    y3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final boolean A6() {
        Parcel Q1 = Q1(14, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    public final boolean B6() {
        Parcel Q1 = Q1(13, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    public final void X5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(16, O);
    }

    public final mta Y4() {
        Parcel Q1 = Q1(5, O());
        mta w6 = lta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    public final void g() {
        l3(10, O());
    }

    public final ee3 h6() {
        Parcel Q1 = Q1(18, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    public final znc s4() {
        Parcel Q1 = Q1(17, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    public final ee3 v6() {
        Parcel Q1 = Q1(20, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    public final List w6() {
        Parcel Q1 = Q1(3, O());
        ArrayList b = nia.b(Q1);
        Q1.recycle();
        return b;
    }

    public final fta x4() {
        Parcel Q1 = Q1(19, O());
        fta w6 = eta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    public final void x6(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(11, O);
    }

    public final void y6(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(12, O);
    }

    public final void z6(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        nia.f(O, ee3Var3);
        l3(22, O);
    }

    public final double zze() {
        Parcel Q1 = Q1(7, O());
        double readDouble = Q1.readDouble();
        Q1.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel Q1 = Q1(15, O());
        Bundle bundle = (Bundle) nia.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    public final ee3 zzl() {
        Parcel Q1 = Q1(21, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    public final String zzm() {
        Parcel Q1 = Q1(4, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel Q1 = Q1(6, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel Q1 = Q1(9, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel Q1 = Q1(8, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
