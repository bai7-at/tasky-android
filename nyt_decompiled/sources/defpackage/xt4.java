package defpackage;

/* loaded from: classes.dex */
public final class xt4 extends wt4 {
    public static final xt4 a = new xt4();

    private xt4() {
        super(11, 12);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
