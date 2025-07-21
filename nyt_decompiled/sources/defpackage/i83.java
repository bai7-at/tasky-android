package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.d;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public abstract class i83 {
    public static final t.b a(sa9 sa9Var, Composer composer, int i) {
        composer.z(1770922558);
        t.b a = sa9Var instanceof d ? h83.a((Context) composer.m(AndroidCompositionLocals_androidKt.g()), ((d) sa9Var).getDefaultViewModelProviderFactory()) : null;
        composer.R();
        return a;
    }
}
