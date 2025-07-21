package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.nytimes.android.MainActivity;
import com.nytimes.android.jobs.UpdateWorker;
import com.nytimes.android.jobs.UpdateWorkerSchedulingParams;
import defpackage.es7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class yx8 implements es7 {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private final pk9 a;
    private final h05 b;
    private final SharedPreferences c;
    private final UpdateWorkerSchedulingParams d;
    private final String e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public yx8(pk9 pk9Var, h05 h05Var, SharedPreferences sharedPreferences, UpdateWorkerSchedulingParams updateWorkerSchedulingParams, Application application) {
        zq3.h(pk9Var, "workerConstraintsCalculator");
        zq3.h(h05Var, "jobScheduler");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(updateWorkerSchedulingParams, "updateWorkerSchedulingParams");
        zq3.h(application, "app");
        this.a = pk9Var;
        this.b = h05Var;
        this.c = sharedPreferences;
        this.d = updateWorkerSchedulingParams;
        String string = application.getString(km6.background_update_key);
        zq3.g(string, "getString(...)");
        this.e = string;
        this.f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xx8
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                yx8.e(yx8.this, sharedPreferences2, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(yx8 yx8Var, SharedPreferences sharedPreferences, String str) {
        zq3.h(yx8Var, "this$0");
        if (zq3.c(str, yx8Var.e)) {
            if (!yx8Var.a.c()) {
                yx8Var.b.b("update_job_tag");
                return;
            }
            yx8Var.b.e(UpdateWorker.class, "update_job_tag", yx8Var.d.b(), yx8Var.a.b());
        }
    }

    public final void d() {
        if (!this.c.getBoolean("MORNING_AFTERNOON_WORKERS_REMOVED", false)) {
            this.b.b("morning_update_job_tag");
            this.b.b("afternoon_update_job_tag");
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("MORNING_AFTERNOON_WORKERS_REMOVED", true);
            edit.apply();
        }
        if (this.a.c()) {
            this.b.c(UpdateWorker.class, "update_job_tag", this.d.b(), this.a.b());
        } else {
            this.b.b("update_job_tag");
        }
        this.c.registerOnSharedPreferenceChangeListener(this.f);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        if ((activity instanceof MainActivity) && bundle == null) {
            d();
        }
        es7.a.a(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        es7.a.b(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        es7.a.c(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        es7.a.d(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        es7.a.e(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        es7.a.f(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
