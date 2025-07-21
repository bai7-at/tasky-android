package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class umc extends hrc {
    final /* synthetic */ ntc e;
    final /* synthetic */ j4d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    umc(j4d j4dVar, ntc ntcVar) {
        super(j4dVar, true);
        this.f = j4dVar;
        this.e = ntcVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.f.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).registerOnMeasurementEventListener(this.e);
    }
}
