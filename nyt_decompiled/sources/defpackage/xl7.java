package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponseData;
import com.nytimes.android.subauth.core.auth.network.response.NYTCookie;
import com.nytimes.android.subauth.core.auth.network.response.NYTUserInfo;
import defpackage.xl5;
import defpackage.yl7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class xl7 {
    public static final yl7 a(xl5 xl5Var) {
        zq3.h(xl5Var, "<this>");
        if (zq3.c(xl5Var, xl5.c.a)) {
            return new yl7.b(new LoginResponse(new LoginResponseData(null, i.e(new NYTCookie("0000000ce5e48c4f71705d822ed8870d415c819c448f9782a6342b535a34505de00fdc75b16a54d2ec5cdf28087c8bae3b5c0276367c3bb7d469582d3ed2cc", "NYT-MPS")), new NYTUserInfo("testemail123@nytimes.com", 0L)), null, 2, null));
        }
        if (zq3.c(xl5Var, xl5.b.a)) {
            return new yl7.a.d(new LoginError(null, null, null, "Bad Password", 7, null), null, 2, null);
        }
        if (zq3.c(xl5Var, xl5.a.a)) {
            return new yl7.a.C0558a(new LoginError(null, null, null, "Unknown Error", 7, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
