package com.nytimes.android.dimodules;

import android.app.Activity;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import defpackage.ba2;
import defpackage.g16;
import defpackage.xq5;

/* loaded from: classes4.dex */
public abstract class h implements ba2 {
    public static SmartLockLifecycleObserver a(Activity activity, Subauth subauth, xq5 xq5Var) {
        return (SmartLockLifecycleObserver) g16.e(ActivityModule.Companion.h(activity, subauth, xq5Var));
    }
}
