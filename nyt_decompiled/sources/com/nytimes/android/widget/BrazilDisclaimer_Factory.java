package com.nytimes.android.widget;

import android.app.Activity;
import defpackage.ba2;
import defpackage.p76;
import defpackage.tm;

/* loaded from: classes4.dex */
public final class BrazilDisclaimer_Factory implements ba2 {
    private final p76 activityProvider;
    private final p76 appPreferencesManagerProvider;

    public BrazilDisclaimer_Factory(p76 p76Var, p76 p76Var2) {
        this.activityProvider = p76Var;
        this.appPreferencesManagerProvider = p76Var2;
    }

    public static BrazilDisclaimer_Factory create(p76 p76Var, p76 p76Var2) {
        return new BrazilDisclaimer_Factory(p76Var, p76Var2);
    }

    public static BrazilDisclaimer newInstance(Activity activity, tm tmVar) {
        return new BrazilDisclaimer(activity, tmVar);
    }

    @Override // defpackage.p76
    public BrazilDisclaimer get() {
        return newInstance((Activity) this.activityProvider.get(), (tm) this.appPreferencesManagerProvider.get());
    }
}
