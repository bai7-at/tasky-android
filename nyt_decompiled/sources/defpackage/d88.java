package defpackage;

import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager;
import com.nytimes.android.subauth.core.di.SubauthModule;

/* loaded from: classes4.dex */
public abstract class d88 implements ba2 {
    public static UserDetailsManager a(SubauthModule subauthModule, ba1 ba1Var, vz8 vz8Var, qz8 qz8Var, c05 c05Var, SubauthListenerManager subauthListenerManager) {
        return (UserDetailsManager) g16.e(subauthModule.p(ba1Var, vz8Var, qz8Var, c05Var, subauthListenerManager));
    }
}
