package defpackage;

import defpackage.kl5;

/* loaded from: classes4.dex */
public abstract class ll5 {
    public static final kl5 a(String str, ss2 ss2Var) {
        zq3.h(str, "<this>");
        zq3.h(ss2Var, "getKeyString");
        if (zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_no_override)))) {
            return null;
        }
        return zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_registered_user))) ? kl5.j.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_anon_user))) ? kl5.d.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_regi_lite_user))) ? kl5.e.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_regi_lite_good_ta_token_good_nyt_user))) ? kl5.h.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_regi_lite_bad_ta_token_good_nyt_user))) ? kl5.f.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_regi_lite_good_ta_token_no_nyt_user))) ? kl5.i.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_regi_lite_bad_ta_token_no_nyt_user))) ? kl5.g.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_facebook_user))) ? kl5.a.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_google_user))) ? kl5.b.a : zq3.c(str, ss2Var.invoke(Integer.valueOf(hm6.subauth_email_account_state_override_locked_user))) ? kl5.c.a : kl5.k.a;
    }
}
