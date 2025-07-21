package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public abstract class z16 implements ba2 {
    public static SharedPreferences a(Application application) {
        return (SharedPreferences) g16.e(x16.Companion.d(application));
    }
}
