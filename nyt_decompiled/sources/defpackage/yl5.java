package defpackage;

import defpackage.xl5;

/* loaded from: classes4.dex */
public abstract class yl5 {
    public static final xl5 a(String str, ss2 ss2Var) {
        zq3.h(str, "<this>");
        zq3.h(ss2Var, "getKeyString");
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_no_override)))) {
            return null;
        }
        return zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_set_password_with_token_override_success))) ? xl5.c.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_set_password_with_token_override_fail_precondition))) ? xl5.b.a : xl5.a.a;
    }
}
