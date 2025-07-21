package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginMeta;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponseData;
import com.nytimes.android.subauth.core.auth.network.response.LoginWithCodeResponse;
import com.nytimes.android.subauth.core.auth.network.response.NYTCodeCookie;
import com.nytimes.android.subauth.core.auth.network.response.NYTCookie;
import com.nytimes.android.subauth.core.util.SubauthException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class qa4 {
    public static final LoginResponse a(LoginWithCodeResponse loginWithCodeResponse) {
        zq3.h(loginWithCodeResponse, "<this>");
        if (loginWithCodeResponse.b() != null) {
            return new LoginResponse(null, new LoginMeta(i.e(new LoginError(null, null, null, loginWithCodeResponse.b() + ", " + loginWithCodeResponse.c()))), 1, null);
        }
        if (loginWithCodeResponse.a() == null) {
            throw new SubauthException("LoginWithCodeResponse cannot be converted to LoginResponse");
        }
        List<NYTCodeCookie> a = loginWithCodeResponse.a().a();
        ArrayList arrayList = new ArrayList(i.w(a, 10));
        for (NYTCodeCookie nYTCodeCookie : a) {
            arrayList.add(new NYTCookie(nYTCodeCookie.b(), nYTCodeCookie.a()));
        }
        return new LoginResponse(new LoginResponseData("LOGIN", arrayList, loginWithCodeResponse.a().b()), new LoginMeta(null));
    }
}
