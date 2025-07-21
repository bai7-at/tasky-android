package defpackage;

import defpackage.zl5;

/* loaded from: classes4.dex */
public abstract class am5 {
    public static final zl5 a(String str, ss2 ss2Var) {
        zq3.h(str, "<this>");
        zq3.h(ss2Var, "getKeyString");
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_no_override)))) {
            return null;
        }
        return zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_verify_email_with_code_status_override_success))) ? zl5.d.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_verify_email_with_code_status_override_fail_expired))) ? zl5.a.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_verify_email_with_code_status_override_fail_invalid))) ? zl5.c.a : zl5.b.a;
    }
}
