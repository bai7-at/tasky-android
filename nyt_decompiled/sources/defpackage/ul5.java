package defpackage;

import defpackage.tl5;

/* loaded from: classes4.dex */
public abstract class ul5 {
    public static final tl5 a(String str, ss2 ss2Var) {
        zq3.h(str, "<this>");
        zq3.h(ss2Var, "getKeyString");
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_no_override)))) {
            return null;
        }
        return zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_request_verification_code_status_override_success))) ? tl5.b.a : tl5.a.a;
    }
}
