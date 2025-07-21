package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class aec extends hrc {
    final /* synthetic */ Bundle e;
    final /* synthetic */ m9b f;
    final /* synthetic */ j4d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aec(j4d j4dVar, Bundle bundle, m9b m9bVar) {
        super(j4dVar, true);
        this.g = j4dVar;
        this.e = bundle;
        this.f = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.g.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).performAction(this.e, this.f, this.a);
    }

    @Override // defpackage.hrc
    protected final void b() {
        this.f.G(null);
    }
}
