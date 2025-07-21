package com.nytimes.android.saved.synchronization;

import android.content.SharedPreferences;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class SavedStrategyMigrationManager {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final SharedPreferences a;
    private final CoroutineDispatcher b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SavedStrategyMigrationManager(SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(sharedPreferences, "preferences");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = sharedPreferences;
        this.b = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return !this.a.getBoolean("SavedManager.MIGRATION_TO_GRAPHQL", false);
    }

    public final Object c(by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.b, new SavedStrategyMigrationManager$markMigrationAsExecuted$2(this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final Object e(by0 by0Var) {
        return BuildersKt.withContext(this.b, new SavedStrategyMigrationManager$migrationNeeded$2(this, null), by0Var);
    }
}
