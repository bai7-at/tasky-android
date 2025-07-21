package defpackage;

import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;

/* loaded from: classes4.dex */
public abstract class r68 implements ba2 {
    public static NYTUserImpl a(h68 h68Var, t68 t68Var, f88 f88Var, SubauthListenerManager subauthListenerManager) {
        return (NYTUserImpl) g16.e(h68Var.j(t68Var, f88Var, subauthListenerManager));
    }
}
