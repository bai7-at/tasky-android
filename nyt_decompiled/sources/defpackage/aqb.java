package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class aqb extends hrc {
    final /* synthetic */ Bundle e;
    final /* synthetic */ j4d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aqb(j4d j4dVar, Bundle bundle) {
        super(j4dVar, true);
        this.f = j4dVar;
        this.e = bundle;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.f.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).setConditionalUserProperty(this.e, this.a);
    }
}
