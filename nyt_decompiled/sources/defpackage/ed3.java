package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class ed3 implements ba2 {
    private final mc3 a;
    private final p76 b;

    public ed3(mc3 mc3Var, p76 p76Var) {
        this.a = mc3Var;
        this.b = p76Var;
    }

    public static ed3 a(mc3 mc3Var, p76 p76Var) {
        return new ed3(mc3Var, p76Var);
    }

    public static SharedPreferences c(mc3 mc3Var, Application application) {
        return (SharedPreferences) g16.e(mc3Var.c(application));
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.a, (Application) this.b.get());
    }
}
