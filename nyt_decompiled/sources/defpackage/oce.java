package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.a5;
import com.google.android.gms.measurement.internal.x3;

/* loaded from: classes3.dex */
public final class oce {
    private final mce a;

    public oce(mce mceVar) {
        Preconditions.checkNotNull(mceVar);
        this.a = mceVar;
    }

    public final void a(Context context, Intent intent) {
        a5 G = a5.G(context, null, null);
        x3 o = G.o();
        if (intent == null) {
            o.v().a("Receiver called with null intent");
            return;
        }
        G.q();
        String action = intent.getAction();
        o.u().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                o.v().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            o.u().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}
