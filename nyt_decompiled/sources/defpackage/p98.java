package defpackage;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;

/* loaded from: classes4.dex */
public abstract class p98 {
    public static final String a(LoginMethod loginMethod) {
        zq3.h(loginMethod, "<this>");
        int ordinal = loginMethod.ordinal();
        return (ordinal == LoginMethod.LoginCredentials.ordinal() || ordinal == LoginMethod.RegisterCredentials.ordinal()) ? "Email" : ordinal == LoginMethod.LoginMagicLink.ordinal() ? "Magic Link" : ordinal == LoginMethod.FacebookSSO.ordinal() ? "Facebook" : ordinal == LoginMethod.GoogleSSO.ordinal() ? "Google" : ordinal == LoginMethod.GoogleOneTap.ordinal() ? "One Tap" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
