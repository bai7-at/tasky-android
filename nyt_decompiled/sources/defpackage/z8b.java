package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public final class z8b extends lia implements b9b {
    z8b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // defpackage.b9b
    public final void R3(zzbze zzbzeVar, q9b q9bVar) {
        Parcel O = O();
        nia.d(O, zzbzeVar);
        nia.f(O, q9bVar);
        l3(5, O);
    }

    @Override // defpackage.b9b
    public final void X4(zzbze zzbzeVar, q9b q9bVar) {
        Parcel O = O();
        nia.d(O, zzbzeVar);
        nia.f(O, q9bVar);
        l3(4, O);
    }

    @Override // defpackage.b9b
    public final void Z5(String str, q9b q9bVar) {
        Parcel O = O();
        O.writeString(str);
        nia.f(O, q9bVar);
        l3(7, O);
    }

    @Override // defpackage.b9b
    public final void o4(zzbze zzbzeVar, q9b q9bVar) {
        Parcel O = O();
        nia.d(O, zzbzeVar);
        nia.f(O, q9bVar);
        l3(6, O);
    }
}
