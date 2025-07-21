package com.nytimes.android.resourcedownloader.data;

import android.content.SharedPreferences;
import defpackage.ba2;
import defpackage.p76;
import defpackage.ve2;

/* loaded from: classes4.dex */
public final class LegacyResourceStoreMigration_Factory implements ba2 {
    private final p76 fileSystemProvider;
    private final p76 sharedPreferencesProvider;

    public LegacyResourceStoreMigration_Factory(p76 p76Var, p76 p76Var2) {
        this.sharedPreferencesProvider = p76Var;
        this.fileSystemProvider = p76Var2;
    }

    public static LegacyResourceStoreMigration_Factory create(p76 p76Var, p76 p76Var2) {
        return new LegacyResourceStoreMigration_Factory(p76Var, p76Var2);
    }

    public static LegacyResourceStoreMigration newInstance(SharedPreferences sharedPreferences, ve2 ve2Var) {
        return new LegacyResourceStoreMigration(sharedPreferences, ve2Var);
    }

    @Override // defpackage.p76
    public LegacyResourceStoreMigration get() {
        return newInstance((SharedPreferences) this.sharedPreferencesProvider.get(), (ve2) this.fileSystemProvider.get());
    }
}
