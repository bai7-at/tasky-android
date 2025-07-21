package com.nytimes.android.performancetrackerclientphoenix.tracing;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.l;
import com.nytimes.android.performancetrackerclientphoenix.tracing.a;
import defpackage.d44;
import defpackage.ei1;
import defpackage.mz1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class TracingMetadataImpl implements ei1, a {
    private final mz1 a = new mz1(null, 1, null);
    private boolean b;
    private Bundle c;

    public TracingMetadataImpl() {
        l.i.a().getLifecycle().a(this);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.tracing.a
    public String a() {
        return this.a.a();
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.tracing.a
    public boolean b() {
        if (!this.b) {
            Bundle bundle = this.c;
            if (zq3.c(bundle != null ? bundle.getString("ARTICLE_REFERRING_SOURCE") : null, "BNA notification")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a.C0375a.a(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a.C0375a.b(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a.C0375a.c(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zq3.h(activity, "activity");
        this.c = activity.getIntent().getExtras();
        a.C0375a.e(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a.C0375a.d(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a.C0375a.e(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a.C0375a.f(this, activity);
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        this.b = true;
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onResume(d44Var);
        this.b = false;
    }
}
