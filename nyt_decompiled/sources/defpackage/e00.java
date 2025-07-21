package defpackage;

/* loaded from: classes.dex */
public final class e00 implements c00 {
    @Override // defpackage.c00
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
