package defpackage;

import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class ti3 {
    private final dr7 a;
    private final m17 b;

    public ti3(dr7 dr7Var, m17 m17Var) {
        zq3.h(dr7Var, "showReviewClass");
        zq3.h(m17Var, "reviewStorage");
        this.a = dr7Var;
        this.b = m17Var;
    }

    public static /* synthetic */ void b(ti3 ti3Var, LocalDateTime localDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            localDateTime = LocalDateTime.now();
            zq3.g(localDateTime, "now(...)");
        }
        ti3Var.a(localDateTime);
    }

    public final void a(LocalDateTime localDateTime) {
        zq3.h(localDateTime, "currentTime");
        if (this.b.c(localDateTime)) {
            this.a.c();
        }
    }
}
