package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class r16 {
    private final WorkDatabase a;

    public r16(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void c(Context context, sc8 sc8Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sc8Var.t();
            try {
                sc8Var.S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sc8Var.S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sc8Var.R();
            } finally {
                sc8Var.Z();
            }
        }
    }

    public long a() {
        Long a = this.a.e().a("last_force_stop_ms");
        if (a != null) {
            return a.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long a = this.a.e().a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    public void d(long j) {
        this.a.e().b(new k16("last_force_stop_ms", Long.valueOf(j)));
    }

    public void e(boolean z) {
        this.a.e().b(new k16("reschedule_needed", z));
    }
}
