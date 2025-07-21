package defpackage;

import android.app.Application;

/* loaded from: classes4.dex */
public final class g96 implements f96 {
    private final Application a;
    private final cb2 b;

    public g96(Application application, cb2 cb2Var) {
        zq3.h(application, "application");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = application;
        this.b = cb2Var;
    }

    @Override // defpackage.f96
    public boolean a() {
        return this.b.m();
    }
}
