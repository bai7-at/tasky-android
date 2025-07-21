package defpackage;

import kotlin.coroutines.intrinsics.a;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class d4 {
    private final xr4 a;

    public d4(xr4 xr4Var) {
        zq3.h(xr4Var, "messageQueue");
        this.a = xr4Var;
    }

    public static /* synthetic */ Object b(d4 d4Var, as4 as4Var, LocalDateTime localDateTime, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            localDateTime = LocalDateTime.now();
            zq3.g(localDateTime, "now(...)");
        }
        return d4Var.a(as4Var, localDateTime, by0Var);
    }

    public final Object a(as4 as4Var, LocalDateTime localDateTime, by0 by0Var) {
        Object c = this.a.c(new a4(as4Var.a(), localDateTime), by0Var);
        return c == a.h() ? c : ww8.a;
    }
}
