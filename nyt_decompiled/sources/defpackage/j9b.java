package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public final class j9b extends lia implements q9b {
    j9b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // defpackage.q9b
    public final void a0(zzbb zzbbVar) {
        Parcel O = O();
        nia.d(O, zzbbVar);
        l3(2, O);
    }

    @Override // defpackage.q9b
    public final void f0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel O = O();
        nia.d(O, parcelFileDescriptor);
        l3(1, O);
    }
}
