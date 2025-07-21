package defpackage;

/* loaded from: classes.dex */
public final class yt4 extends wt4 {
    public static final yt4 a = new yt4();

    private yt4() {
        super(12, 13);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        sc8Var.B("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
