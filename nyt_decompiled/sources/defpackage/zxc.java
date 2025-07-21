package defpackage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zxc extends hrc {
    final /* synthetic */ Activity e;
    final /* synthetic */ f3d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zxc(f3d f3dVar, Activity activity) {
        super(f3dVar.a, true);
        this.f = f3dVar;
        this.e = activity;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.f.a.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).onActivityPaused(fc5.l3(this.e), this.b);
    }
}
