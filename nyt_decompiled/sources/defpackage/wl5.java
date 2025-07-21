package defpackage;

import defpackage.vl5;

/* loaded from: classes4.dex */
public abstract class wl5 {
    public static final vl5 a(String str, ss2 ss2Var) {
        zq3.h(str, "<this>");
        zq3.h(ss2Var, "getKeyString");
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_override_sso_action_override_login)))) {
            return vl5.a.a;
        }
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_override_sso_action_override_register)))) {
            return vl5.c.a;
        }
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_override_sso_action_override_regilite)))) {
            return vl5.b.a;
        }
        return null;
    }
}
