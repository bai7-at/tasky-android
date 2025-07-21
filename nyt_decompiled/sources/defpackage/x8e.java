package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class x8e implements Application.ActivityLifecycleCallbacks {
    private boolean a;
    protected boolean b;
    private w8e c;

    private final void c(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                d(z);
                w8e w8eVar = this.c;
                if (w8eVar != null) {
                    w8eVar.a(z);
                }
            }
        }
    }

    private final boolean j() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || e();
    }

    protected void d(boolean z) {
    }

    protected boolean e() {
        return false;
    }

    public final void f(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void g(w8e w8eVar) {
        this.c = w8eVar;
    }

    public final void h() {
        this.a = true;
        boolean j = j();
        this.b = j;
        d(j);
    }

    public final void i() {
        this.a = false;
        this.c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(j());
    }
}
