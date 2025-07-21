package com.nytimes.android.subauth.core.purr.directive;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class PurrDirectiveOverrider_Factory implements ba2 {
    private final p76 contextProvider;
    private final p76 sharedPrefsProvider;

    public PurrDirectiveOverrider_Factory(p76 p76Var, p76 p76Var2) {
        this.contextProvider = p76Var;
        this.sharedPrefsProvider = p76Var2;
    }

    public static PurrDirectiveOverrider_Factory create(p76 p76Var, p76 p76Var2) {
        return new PurrDirectiveOverrider_Factory(p76Var, p76Var2);
    }

    public static PurrDirectiveOverrider newInstance(Context context, SharedPreferences sharedPreferences) {
        return new PurrDirectiveOverrider(context, sharedPreferences);
    }

    @Override // defpackage.p76
    public PurrDirectiveOverrider get() {
        return newInstance((Context) this.contextProvider.get(), (SharedPreferences) this.sharedPrefsProvider.get());
    }
}
