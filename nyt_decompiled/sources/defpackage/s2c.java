package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class s2c extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ j4d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s2c(j4d j4dVar, String str) {
        super(j4dVar, true);
        this.f = j4dVar;
        this.e = str;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.f.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).beginAdUnitExposure(this.e, this.b);
    }
}
