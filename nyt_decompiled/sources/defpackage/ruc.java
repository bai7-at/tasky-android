package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class ruc extends hrc {
    final /* synthetic */ Bundle e;
    final /* synthetic */ Activity f;
    final /* synthetic */ f3d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ruc(f3d f3dVar, Bundle bundle, Activity activity) {
        super(f3dVar.a, true);
        this.g = f3dVar;
        this.e = bundle;
        this.f = activity;
    }

    @Override // defpackage.hrc
    final void a() {
        Bundle bundle;
        sdb sdbVar;
        if (this.e != null) {
            bundle = new Bundle();
            if (this.e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        sdbVar = this.g.a.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).onActivityCreated(fc5.l3(this.f), bundle, this.b);
    }
}
