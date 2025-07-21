package defpackage;

import android.app.Application;

/* loaded from: classes4.dex */
public final class i65 {
    private final Application a;
    private final j65 b;
    private final k65 c;

    public i65(Application application, j65 j65Var, k65 k65Var) {
        zq3.h(application, "application");
        zq3.h(j65Var, "nightModeProvider");
        zq3.h(k65Var, "nightModeRuntimeApplier");
        this.a = application;
        this.b = j65Var;
        this.c = k65Var;
    }

    public final void a() {
        this.b.a();
        this.a.registerActivityLifecycleCallbacks(this.c);
    }
}
