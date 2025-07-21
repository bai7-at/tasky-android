package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class i6 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ z6 b;

    i6(z6 z6Var, Bundle bundle) {
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
        String string = bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!z6Var.a.k()) {
            z6Var.a.o().u().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlo zzloVar = new zzlo(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw v0 = z6Var.a.M().v0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            z6Var.a.K().r(new zzac(bundle.getString("app_id"), string2, zzloVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), z6Var.a.M().v0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), v0, bundle.getLong("time_to_live"), z6Var.a.M().v0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
