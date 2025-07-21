package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.ZoneRulesInitializer;

/* loaded from: classes3.dex */
public abstract class pg {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Application application) {
        b(application);
    }

    public static void b(Context context) {
        c(context, "org/threeten/bp/TZDB.dat");
    }

    public static void c(Context context, String str) {
        if (a.getAndSet(true)) {
            return;
        }
        ZoneRulesInitializer.setInitializer(new bu(context, str));
    }
}
