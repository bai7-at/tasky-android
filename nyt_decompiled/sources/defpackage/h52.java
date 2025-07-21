package defpackage;

import android.content.Context;
import androidx.preference.g;
import com.nytimes.android.eventtracker.EventTracker;

/* loaded from: classes4.dex */
public final class h52 {
    public static final h52 a = new h52();

    private h52() {
    }

    public final EventTracker.Environment a(Context context) {
        zq3.h(context, "context");
        EventTracker.Environment environment = null;
        String string = g.b(context).getString("et2.environment.override", null);
        if (string != null) {
            if (zq3.c(string, "STAGING")) {
                environment = EventTracker.Environment.STAGING;
            } else if (zq3.c(string, "PRODUCTION")) {
                environment = EventTracker.Environment.PRODUCTION;
            }
            ul8.a.z("ET2").a("Dev Setting Override: Env: " + string, new Object[0]);
        }
        return environment;
    }
}
