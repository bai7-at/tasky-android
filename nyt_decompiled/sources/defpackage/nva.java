package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.y;
import defpackage.ee3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class nva extends lia implements pva {
    nva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // defpackage.pva
    public final List a() {
        Parcel Q1 = Q1(23, O());
        ArrayList b = nia.b(Q1);
        Q1.recycle();
        return b;
    }

    @Override // defpackage.pva
    public final List c() {
        Parcel Q1 = Q1(3, O());
        ArrayList b = nia.b(Q1);
        Q1.recycle();
        return b;
    }

    @Override // defpackage.pva
    public final String g() {
        Parcel Q1 = Q1(9, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.pva
    public final double zze() {
        Parcel Q1 = Q1(8, O());
        double readDouble = Q1.readDouble();
        Q1.recycle();
        return readDouble;
    }

    @Override // defpackage.pva
    public final qkc zzg() {
        Parcel Q1 = Q1(31, O());
        qkc w6 = y.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.pva
    public final znc zzh() {
        Parcel Q1 = Q1(11, O());
        znc w6 = a0.w6(Q1.readStrongBinder());
        Q1.recycle();
        return w6;
    }

    @Override // defpackage.pva
    public final fta zzi() {
        fta dtaVar;
        Parcel Q1 = Q1(14, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            dtaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            dtaVar = queryLocalInterface instanceof fta ? (fta) queryLocalInterface : new dta(readStrongBinder);
        }
        Q1.recycle();
        return dtaVar;
    }

    @Override // defpackage.pva
    public final mta zzk() {
        mta ktaVar;
        Parcel Q1 = Q1(5, O());
        IBinder readStrongBinder = Q1.readStrongBinder();
        if (readStrongBinder == null) {
            ktaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            ktaVar = queryLocalInterface instanceof mta ? (mta) queryLocalInterface : new kta(readStrongBinder);
        }
        Q1.recycle();
        return ktaVar;
    }

    @Override // defpackage.pva
    public final ee3 zzl() {
        Parcel Q1 = Q1(19, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.pva
    public final ee3 zzm() {
        Parcel Q1 = Q1(18, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }

    @Override // defpackage.pva
    public final String zzn() {
        Parcel Q1 = Q1(7, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.pva
    public final String zzo() {
        Parcel Q1 = Q1(4, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.pva
    public final String zzp() {
        Parcel Q1 = Q1(6, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.pva
    public final String zzq() {
        Parcel Q1 = Q1(2, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }

    @Override // defpackage.pva
    public final String zzs() {
        Parcel Q1 = Q1(10, O());
        String readString = Q1.readString();
        Q1.recycle();
        return readString;
    }
}
