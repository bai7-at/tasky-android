package defpackage;

import com.comscore.streaming.WindowState;
import com.nytimes.android.subauth.core.auth.models.c;
import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponse;
import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponseData;
import defpackage.zl5;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class a59 {
    public static final c a(zl5 zl5Var) {
        zq3.h(zl5Var, "<this>");
        if (zq3.c(zl5Var, zl5.d.a)) {
            return new c.b(new VerifyEmailWithCodeResponse(new VerifyEmailWithCodeResponseData("token"), null, 2, null));
        }
        if (zq3.c(zl5Var, zl5.a.a)) {
            return new c.a.C0411a(WindowState.NORMAL, 910);
        }
        if (zq3.c(zl5Var, zl5.c.a)) {
            return new c.a.C0411a(WindowState.NORMAL, 911);
        }
        if (zq3.c(zl5Var, zl5.b.a)) {
            return new c.a.C0412c(500);
        }
        throw new NoWhenBranchMatchedException();
    }
}
