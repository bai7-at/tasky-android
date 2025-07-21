package defpackage;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class d00 implements c00 {
    @Override // defpackage.c00
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        sc8Var.P0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
