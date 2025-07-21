package com.nytimes.android.widget;

import com.nytimes.android.entitlements.a;
import defpackage.ba2;
import defpackage.jk;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class ForcedLogoutAlert_Factory implements ba2 {
    private final p76 activityProvider;
    private final p76 eCommClientProvider;

    public ForcedLogoutAlert_Factory(p76 p76Var, p76 p76Var2) {
        this.activityProvider = p76Var;
        this.eCommClientProvider = p76Var2;
    }

    public static ForcedLogoutAlert_Factory create(p76 p76Var, p76 p76Var2) {
        return new ForcedLogoutAlert_Factory(p76Var, p76Var2);
    }

    public static ForcedLogoutAlert newInstance(jk jkVar, a aVar) {
        return new ForcedLogoutAlert(jkVar, aVar);
    }

    @Override // defpackage.p76
    public ForcedLogoutAlert get() {
        return newInstance((jk) this.activityProvider.get(), (a) this.eCommClientProvider.get());
    }
}
