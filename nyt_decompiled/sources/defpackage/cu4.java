package defpackage;

/* loaded from: classes.dex */
public final class cu4 extends wt4 {
    public static final cu4 a = new cu4();

    private cu4() {
        super(3, 4);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
