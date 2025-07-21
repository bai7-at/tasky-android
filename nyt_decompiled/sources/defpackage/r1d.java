package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public final class r1d extends k9b {
    final /* synthetic */ s1d a;

    protected r1d(s1d s1dVar) {
        this.a = s1dVar;
    }

    @Override // defpackage.q9b
    public final void a0(zzbb zzbbVar) {
        this.a.a.d(zzbbVar.t0());
    }

    @Override // defpackage.q9b
    public final void f0(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.a.c(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
