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
public final class z3b extends lia implements IInterface {
    z3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final void A6(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(14, O);
    }

    public final boolean B6() {
        Parcel Q1 = Q1(11, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    public final mta Y4() {
        Parcel Q1 = Q1(5, O());
        mta w6 = lta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    public final boolean a() {
        Parcel Q1 = Q1(12, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    public final ee3 h6() {
        Parcel Q1 = Q1(20, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    public final znc s4() {
        Parcel Q1 = Q1(16, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    public final ee3 v6() {
        Parcel Q1 = Q1(21, O());
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
        l3(9, O);
    }

    public final void y6(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(10, O);
    }

    public final void z6(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        nia.f(O, ee3Var3);
        l3(22, O);
    }

    public final Bundle zze() {
        Parcel Q1 = Q1(13, O());
        Bundle bundle = (Bundle) nia.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    public final ee3 zzi() {
        Parcel Q1 = Q1(15, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    public final String zzl() {
        Parcel Q1 = Q1(7, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
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

    public final void zzr() {
        l3(8, O());
    }
}
