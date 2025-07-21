package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class yvb extends hrc {
    final /* synthetic */ Boolean e;
    final /* synthetic */ j4d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yvb(j4d j4dVar, Boolean bool) {
        super(j4dVar, true);
        this.f = j4dVar;
        this.e = bool;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdb sdbVar2;
        if (this.e != null) {
            sdbVar2 = this.f.i;
            ((sdb) Preconditions.checkNotNull(sdbVar2)).setMeasurementEnabled(this.e.booleanValue(), this.a);
        } else {
            sdbVar = this.f.i;
            ((sdb) Preconditions.checkNotNull(sdbVar)).clearMeasurementEnabled(this.a);
        }
    }
}
