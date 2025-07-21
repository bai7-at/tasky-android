package defpackage;

/* loaded from: classes.dex */
public final class du4 extends wt4 {
    public static final du4 a = new du4();

    private du4() {
        super(4, 5);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        sc8Var.B("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
