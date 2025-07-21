package defpackage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class z0d extends hrc {
    final /* synthetic */ Activity e;
    final /* synthetic */ m9b f;
    final /* synthetic */ f3d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z0d(f3d f3dVar, Activity activity, m9b m9bVar) {
        super(f3dVar.a, true);
        this.g = f3dVar;
        this.e = activity;
        this.f = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.g.a.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).onActivitySaveInstanceState(fc5.l3(this.e), this.f, this.b);
    }
}
