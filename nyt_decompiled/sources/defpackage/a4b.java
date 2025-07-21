package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.a0;
import defpackage.ee3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a4b extends lia implements c4b {
    a4b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // defpackage.c4b
    public final void N3(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        Parcel O = O();
        nia.f(O, ee3Var);
        nia.f(O, ee3Var2);
        nia.f(O, ee3Var3);
        l3(21, O);
    }

    @Override // defpackage.c4b
    public final void X5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(20, O);
    }

    @Override // defpackage.c4b
    public final List a() {
        Parcel Q1 = Q1(3, O());
        ArrayList b = nia.b(Q1);
        Q1.recycle();
        return b;
    }

    @Override // defpackage.c4b
    public final String c() {
        Parcel Q1 = Q1(9, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.c4b
    public final void e() {
        l3(19, O());
    }

    @Override // defpackage.c4b
    public final String g() {
        Parcel Q1 = Q1(10, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.c4b
    public final void j5(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(22, O);
    }

    @Override // defpackage.c4b
    public final boolean o() {
        Parcel Q1 = Q1(18, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.c4b
    public final boolean v() {
        Parcel Q1 = Q1(17, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.c4b
    public final double zze() {
        Parcel Q1 = Q1(8, O());
        double readDouble = Q1.readDouble();
        Q1.recycle();
        return readDouble;
    }

    @Override // defpackage.c4b
    public final float zzf() {
        Parcel Q1 = Q1(23, O());
        float readFloat = Q1.readFloat();
        Q1.recycle();
        return readFloat;
    }

    @Override // defpackage.c4b
    public final float zzg() {
        Parcel Q1 = Q1(25, O());
        float readFloat = Q1.readFloat();
        Q1.recycle();
        return readFloat;
    }

    @Override // defpackage.c4b
    public final float zzh() {
        Parcel Q1 = Q1(24, O());
        float readFloat = Q1.readFloat();
        Q1.recycle();
        return readFloat;
    }

    @Override // defpackage.c4b
    public final Bundle zzi() {
        Parcel Q1 = Q1(16, O());
        Bundle bundle = (Bundle) nia.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    @Override // defpackage.c4b
    public final znc zzj() {
        Parcel Q1 = Q1(11, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.c4b
    public final fta zzk() {
        Parcel Q1 = Q1(12, O());
        fta w6 = eta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.c4b
    public final mta zzl() {
        Parcel Q1 = Q1(5, O());
        mta w6 = lta.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.c4b
    public final ee3 zzm() {
        Parcel Q1 = Q1(13, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.c4b
    public final ee3 zzn() {
        Parcel Q1 = Q1(14, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.c4b
    public final ee3 zzo() {
        Parcel Q1 = Q1(15, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.c4b
    public final String zzp() {
        Parcel Q1 = Q1(7, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.c4b
    public final String zzq() {
        Parcel Q1 = Q1(4, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.c4b
    public final String zzr() {
        Parcel Q1 = Q1(6, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.c4b
    public final String zzs() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
