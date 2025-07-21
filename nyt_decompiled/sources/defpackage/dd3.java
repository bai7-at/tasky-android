package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public abstract class dd3 implements ba2 {
    public static SharedPreferences a(lc3 lc3Var, Application application) {
        return (SharedPreferences) g16.e(lc3Var.r(application));
    }
}
