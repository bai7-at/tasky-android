package defpackage;

import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.di.SubauthModule;

/* loaded from: classes4.dex */
public abstract class x78 implements ba2 {
    public static kl7 a(SubauthModule subauthModule, t68 t68Var, xz8 xz8Var, NYTSubauthPollAPI nYTSubauthPollAPI, c05 c05Var, ba1 ba1Var, w88 w88Var, SubauthListenerManager subauthListenerManager) {
        return (kl7) g16.e(subauthModule.j(t68Var, xz8Var, nYTSubauthPollAPI, c05Var, ba1Var, w88Var, subauthListenerManager));
    }
}
