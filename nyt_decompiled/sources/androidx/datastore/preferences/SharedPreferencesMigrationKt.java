package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import defpackage.gt2;
import defpackage.it2;
import defpackage.zq3;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class SharedPreferencesMigrationKt {
    private static final Set a = new LinkedHashSet();

    public static final SharedPreferencesMigration a(Context context, String str, Set set) {
        zq3.h(context, "context");
        zq3.h(str, "sharedPreferencesName");
        zq3.h(set, "keysToMigrate");
        if (set != a) {
            return new SharedPreferencesMigration(context, str, set, e(set), d());
        }
        return new SharedPreferencesMigration(context, str, null, e(set), d(), 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration b(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return a;
    }

    private static final it2 d() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(null);
    }

    private static final gt2 e(Set set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
