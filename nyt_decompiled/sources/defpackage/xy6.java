package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class xy6 extends wt4 {
    private final Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy6(Context context, int i, int i2) {
        super(i, i2);
        zq3.h(context, "mContext");
        this.a = context;
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        if (this.endVersion >= 10) {
            sc8Var.S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
