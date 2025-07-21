package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class j6 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ z6 b;

    j6(z6 z6Var, Bundle bundle) {
        this.b = z6Var;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z6 z6Var = this.b;
        Bundle bundle = this.a;
        z6Var.c();
        z6Var.d();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        if (!z6Var.a.k()) {
            z6Var.a.o().u().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            z6Var.a.K().r(new zzac(bundle.getString("app_id"), "", new zzlo(checkNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), z6Var.a.M().v0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
