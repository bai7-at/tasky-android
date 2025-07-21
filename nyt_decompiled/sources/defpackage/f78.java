package defpackage;

import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;

/* loaded from: classes4.dex */
public interface f78 {
    void L(LoginMethod loginMethod);

    void Q();

    void T(UserData userData);

    void k(RegiData regiData);

    void m(LogoutSource logoutSource);

    void o(LoginResponse loginResponse, LoginMethod loginMethod);

    void r(String str);

    void u();
}
