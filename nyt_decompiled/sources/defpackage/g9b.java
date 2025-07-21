package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public final class g9b extends lia implements i9b {
    g9b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // defpackage.i9b
    public final void a0(zzbb zzbbVar) {
        Parcel O = O();
        nia.d(O, zzbbVar);
        l3(2, O);
    }

    @Override // defpackage.i9b
    public final void f0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel O = O();
        nia.d(O, parcelFileDescriptor);
        l3(1, O);
    }
}
