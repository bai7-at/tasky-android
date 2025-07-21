package com.nytimes.android.resourcedownloader.data;

import android.content.SharedPreferences;
import defpackage.ve2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class LegacyResourceStoreMigration {
    public static final Companion Companion = new Companion(null);
    public static final String HAS_DELETED_LEGACY_RESOURCES = "LegacyResourceStoreMigration.HAS_DELETED_LEGACY_RESOURCES";
    private final ve2 fileSystem;
    private final SharedPreferences sharedPreferences;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyResourceStoreMigration(SharedPreferences sharedPreferences, ve2 ve2Var) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(ve2Var, "fileSystem");
        this.sharedPreferences = sharedPreferences;
        this.fileSystem = ve2Var;
    }

    private final boolean hasAlreadyMigrated() {
        return this.sharedPreferences.getBoolean(HAS_DELETED_LEGACY_RESOURCES, false);
    }

    public final void runIfNeeded() {
        synchronized (this) {
            if (hasAlreadyMigrated()) {
                return;
            }
            this.fileSystem.b("global");
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            zq3.g(edit, "editor");
            edit.putBoolean(HAS_DELETED_LEGACY_RESOURCES, true);
            edit.apply();
            ww8 ww8Var = ww8.a;
        }
    }
}
