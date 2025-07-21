package defpackage;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import com.nytimes.subauth.ui.models.LoginType;
import defpackage.oa4;

/* loaded from: classes4.dex */
public abstract class em5 {
    public static final oa4 a(oa4 oa4Var, LoginType loginType, LIREErrorStateOverride lIREErrorStateOverride) {
        zq3.h(oa4Var, "originalLoginStatus");
        zq3.h(loginType, "loginType");
        zq3.h(lIREErrorStateOverride, "lireStateOverrideParam");
        if ((loginType instanceof LoginType.GoogleSSOLogin) && lIREErrorStateOverride == LIREErrorStateOverride.GoogleSSOUnknownError) {
            ul8.a.a("Overriding Google SSO login status with unknown error", new Object[0]);
            return new oa4.b(new LoginError(null, null, null, "Simulated Unknown Error", 7, null), LoginMethod.GoogleSSO, null, null, null, null, false, 124, null);
        }
        if ((loginType instanceof LoginType.FacebookSSOLogin) && lIREErrorStateOverride == LIREErrorStateOverride.FacebookSSOUnknownError) {
            ul8.a.a("Overriding Facebook SSO login status with unknown error", new Object[0]);
            return new oa4.b(new LoginError(null, null, null, "Simulated Unknown Error", 7, null), LoginMethod.FacebookSSO, null, null, null, null, false, 124, null);
        }
        ul8.a.a("No override needed for SSO login status", new Object[0]);
        return oa4Var;
    }
}
