package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.poisonpill.di.PoisonPillModule;

/* loaded from: classes4.dex */
public abstract class ny5 implements ba2 {
    public static rp0 a(Application application, cb2 cb2Var, SharedPreferences sharedPreferences) {
        return (rp0) g16.e(PoisonPillModule.a.a(application, cb2Var, sharedPreferences));
    }
}
