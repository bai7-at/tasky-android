package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class sj9 extends wt4 {
    private final Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj9(Context context) {
        super(9, 10);
        zq3.h(context, "context");
        this.a = context;
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        sc8Var.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r16.c(this.a, sc8Var);
        cf3.c(this.a, sc8Var);
    }
}
