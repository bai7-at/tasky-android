package defpackage;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import defpackage.oa4;
import defpackage.xn1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class pa4 {
    public static final boolean a(LoginMethod loginMethod) {
        zq3.h(loginMethod, "<this>");
        return loginMethod == LoginMethod.GoogleSSO || loginMethod == LoginMethod.FacebookSSO || loginMethod == LoginMethod.GoogleOneTap || loginMethod == LoginMethod.WebSSO;
    }

    public static final LoginMethod b(oa4 oa4Var) {
        zq3.h(oa4Var, "<this>");
        if (oa4Var instanceof oa4.c) {
            return ((oa4.c) oa4Var).c();
        }
        if (oa4Var instanceof oa4.b) {
            return ((oa4.b) oa4Var).b();
        }
        if (oa4Var instanceof oa4.a) {
            return ((oa4.a) oa4Var).a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xn1 c(oa4 oa4Var) {
        zq3.h(oa4Var, "<this>");
        if (oa4Var instanceof oa4.a) {
            return xn1.a.a;
        }
        if (oa4Var instanceof oa4.b) {
            return new xn1.b(((oa4.b) oa4Var).a().c());
        }
        if (oa4Var instanceof oa4.c) {
            return xn1.c.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
