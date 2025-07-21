package defpackage;

/* loaded from: classes.dex */
public final class fu4 extends wt4 {
    public static final fu4 a = new fu4();

    private fu4() {
        super(7, 8);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
