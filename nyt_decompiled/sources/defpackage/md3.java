package defpackage;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes2.dex */
public final class md3 {
    private final bs3 a;
    private boolean b;
    private final jk c;

    public md3(bs3 bs3Var, Activity activity) {
        zq3.h(bs3Var, "iterateSurveyReporter");
        zq3.h(activity, "activity");
        this.a = bs3Var;
        this.c = (jk) activity;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        bs3 bs3Var = this.a;
        FragmentManager supportFragmentManager = this.c.getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        bs3Var.b(supportFragmentManager);
    }
}
