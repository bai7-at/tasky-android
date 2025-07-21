package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* loaded from: classes3.dex */
public final class d9b extends lia implements f9b {
    d9b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // defpackage.f9b
    public final void D5(zzbym zzbymVar, i9b i9bVar) {
        Parcel O = O();
        nia.d(O, zzbymVar);
        nia.f(O, i9bVar);
        l3(3, O);
    }

    @Override // defpackage.f9b
    public final void U0(zzbyi zzbyiVar, i9b i9bVar) {
        Parcel O = O();
        nia.d(O, zzbyiVar);
        nia.f(O, i9bVar);
        l3(1, O);
    }
}
