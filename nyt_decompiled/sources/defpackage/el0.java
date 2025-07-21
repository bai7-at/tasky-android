package defpackage;

import androidx.room.RoomDatabase;

/* loaded from: classes.dex */
public final class el0 extends RoomDatabase.b {
    private final zl0 a;

    public el0(zl0 zl0Var) {
        zq3.h(zl0Var, "clock");
        this.a = zl0Var;
    }

    private final long d() {
        return this.a.currentTimeMillis() - zi9.a;
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.RoomDatabase.b
    public void c(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        super.c(sc8Var);
        sc8Var.t();
        try {
            sc8Var.B(e());
            sc8Var.R();
        } finally {
            sc8Var.Z();
        }
    }
}
