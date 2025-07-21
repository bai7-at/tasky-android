package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
final class ode {
    private static ode c;
    private final String a;
    private final SharedPreferences b;

    private ode(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static ode b(Context context) {
        if (c == null) {
            c = new ode(context);
        }
        return c;
    }

    final long a(String str, long j) {
        return this.b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.b.getString(str, null);
    }

    final void d(String str, Object obj) {
        boolean commit;
        if (obj instanceof String) {
            commit = this.b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.a);
                throw new IOException("Failed to store " + str + " for app " + this.a);
            }
            commit = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.a);
    }

    final void e(String str) {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.a);
    }

    final boolean f(String str, boolean z) {
        return this.b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.b.contains(str);
    }
}
