package com.nytimes.android.media.util;

import android.app.Application;
import com.nytimes.android.utils.AppPreferences;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CaptionPrefManager_Factory implements ba2 {
    private final p76 appPreferencesProvider;
    private final p76 applicationProvider;

    public CaptionPrefManager_Factory(p76 p76Var, p76 p76Var2) {
        this.applicationProvider = p76Var;
        this.appPreferencesProvider = p76Var2;
    }

    public static CaptionPrefManager_Factory create(p76 p76Var, p76 p76Var2) {
        return new CaptionPrefManager_Factory(p76Var, p76Var2);
    }

    public static CaptionPrefManager newInstance(Application application, AppPreferences appPreferences) {
        return new CaptionPrefManager(application, appPreferences);
    }

    @Override // defpackage.p76
    public CaptionPrefManager get() {
        return newInstance((Application) this.applicationProvider.get(), (AppPreferences) this.appPreferencesProvider.get());
    }
}
