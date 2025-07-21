package defpackage;

import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.di.SubauthModule;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public abstract class w78 implements ba2 {
    public static a a(SubauthModule subauthModule, t68 t68Var, s86 s86Var, o96 o96Var, MutableSharedFlow mutableSharedFlow, PurrDirectiveOverrider purrDirectiveOverrider, u86 u86Var, SubauthListenerManager subauthListenerManager) {
        return (a) g16.e(subauthModule.i(t68Var, s86Var, o96Var, mutableSharedFlow, purrDirectiveOverrider, u86Var, subauthListenerManager));
    }
}
