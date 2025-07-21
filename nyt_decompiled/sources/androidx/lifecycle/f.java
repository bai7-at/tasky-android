package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import defpackage.g02;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a extends g02 {
        @Override // defpackage.g02, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            m.b.b(activity);
        }
    }

    private f() {
    }

    public static final void a(Context context) {
        zq3.h(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        zq3.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
