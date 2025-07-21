package defpackage;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.SubauthUserManager;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.di.SubauthModule;

/* loaded from: classes4.dex */
public abstract class a88 implements ba2 {
    public static SubauthUserManager a(SubauthModule subauthModule, t68 t68Var, NYTUser nYTUser, UserAPI userAPI, xz8 xz8Var, c05 c05Var, kl7 kl7Var, mg8 mg8Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        return (SubauthUserManager) g16.e(subauthModule.m(t68Var, nYTUser, userAPI, xz8Var, c05Var, kl7Var, mg8Var, ba1Var, subauthListenerManager, w88Var));
    }
}
