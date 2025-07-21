package defpackage;

/* loaded from: classes.dex */
public final class gu4 extends wt4 {
    public static final gu4 a = new gu4();

    private gu4() {
        super(8, 9);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
