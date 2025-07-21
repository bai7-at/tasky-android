package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public final class kta extends lia implements mta {
    kta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // defpackage.mta
    public final double zzb() {
        Parcel Q1 = Q1(3, O());
        double readDouble = Q1.readDouble();
        Q1.recycle();
        return readDouble;
    }

    @Override // defpackage.mta
    public final int zzc() {
        Parcel Q1 = Q1(5, O());
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }

    @Override // defpackage.mta
    public final int zzd() {
        Parcel Q1 = Q1(4, O());
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }

    @Override // defpackage.mta
    public final Uri zze() {
        Parcel Q1 = Q1(2, O());
        Uri uri = (Uri) nia.a(Q1, Uri.CREATOR);
        Q1.recycle();
        return uri;
    }

    @Override // defpackage.mta
    public final ee3 zzf() {
        Parcel Q1 = Q1(1, O());
        ee3 O = ee3.a.O(Q1.readStrongBinder());
        Q1.recycle();
        return O;
    }
}
