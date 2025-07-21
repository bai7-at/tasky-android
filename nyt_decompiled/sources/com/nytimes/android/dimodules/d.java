package com.nytimes.android.dimodules;

import android.app.Activity;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import defpackage.ba2;
import defpackage.cb2;
import defpackage.g16;
import defpackage.jh5;
import defpackage.t98;
import defpackage.xq5;

/* loaded from: classes4.dex */
public abstract class d implements ba2 {
    public static OneTapLifecycleObserver a(Activity activity, Subauth subauth, t98 t98Var, xq5 xq5Var, jh5 jh5Var, cb2 cb2Var) {
        return (OneTapLifecycleObserver) g16.e(ActivityModule.Companion.d(activity, subauth, t98Var, xq5Var, jh5Var, cb2Var));
    }
}
