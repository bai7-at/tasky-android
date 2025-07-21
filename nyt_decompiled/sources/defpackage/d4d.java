package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public final class d4d extends h9b {
    final /* synthetic */ e4d a;

    protected d4d(e4d e4dVar) {
        this.a = e4dVar;
    }

    @Override // defpackage.i9b
    public final void a0(zzbb zzbbVar) {
        this.a.a.d(zzbbVar.t0());
    }

    @Override // defpackage.i9b
    public final void f0(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.a.c(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
