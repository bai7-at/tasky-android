package defpackage;

import android.app.Application;
import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.di.SubauthModule;

/* loaded from: classes4.dex */
public abstract class b88 implements ba2 {
    public static mg8 a(SubauthModule subauthModule, Application application, ba1 ba1Var, NYTTargetingAPI nYTTargetingAPI, c05 c05Var, ng8 ng8Var, w88 w88Var) {
        return (mg8) g16.e(subauthModule.n(application, ba1Var, nYTTargetingAPI, c05Var, ng8Var, w88Var));
    }
}
