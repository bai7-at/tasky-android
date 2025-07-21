package defpackage;

import defpackage.i78;
import defpackage.v32;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class j78 {
    private final String a;

    public j78(String str) {
        this.a = str;
    }

    public static /* synthetic */ i78.b c(j78 j78Var, u52 u52Var, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return j78Var.b(u52Var, str);
    }

    public final i78.a a(u52 u52Var) {
        zq3.h(u52Var, "eventType");
        return new i78.a(u52Var, v32.a.b(v32.c, this.a, u52Var, null, 4, null));
    }

    public final i78.b b(u52 u52Var, String str) {
        zq3.h(u52Var, "eventType");
        return new i78.b(u52Var, v32.c.a(this.a, u52Var, str), u52Var.e());
    }

    public final List d(u52 u52Var) {
        zq3.h(u52Var, "eventType");
        e32 d = u52Var.d();
        return i.q(d != null ? new i78.e(u52Var, d) : null, u52Var.a() != null ? new i78.a(u52Var, v32.a.b(v32.c, this.a, u52Var, null, 4, null)) : null);
    }
}
