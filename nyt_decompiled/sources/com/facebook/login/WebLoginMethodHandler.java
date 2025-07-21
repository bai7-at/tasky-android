package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.Scopes;
import defpackage.g29;
import defpackage.w92;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public static final a Companion = new a(null);
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
    }

    private final String u() {
        Context i = d().i();
        if (i == null) {
            i = w92.l();
        }
        return i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    private final void w(String str) {
        Context i = d().i();
        if (i == null) {
            i = w92.l();
        }
        i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, str).apply();
    }

    protected Bundle q(Bundle bundle, LoginClient.Request request) {
        zq3.h(bundle, "parameters");
        zq3.h(request, "request");
        bundle.putString("redirect_uri", g());
        if (request.s()) {
            bundle.putString("app_id", request.a());
        } else {
            bundle.putString("client_id", request.a());
        }
        bundle.putString("e2e", LoginClient.Companion.a());
        if (request.s()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.o().contains(Scopes.OPEN_ID)) {
                bundle.putString(AuthenticationTokenClaims.JSON_KEY_NONCE, request.n());
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.d());
        CodeChallengeMethod e = request.e();
        bundle.putString("code_challenge_method", e == null ? null : e.name());
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.c());
        bundle.putString("login_behavior", request.k().name());
        bundle.putString("sdk", zq3.q("android-", w92.A()));
        if (s() != null) {
            bundle.putString("sso", s());
        }
        bundle.putString("cct_prefetching", w92.q ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        if (request.r()) {
            bundle.putString("fx_app", request.l().toString());
        }
        if (request.v()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.m() != null) {
            bundle.putString("messenger_page_id", request.m());
            bundle.putString("reset_messenger_state", request.p() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
        return bundle;
    }

    protected Bundle r(LoginClient.Request request) {
        zq3.h(request, "request");
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        if (!g29.Z(request.o())) {
            String join = TextUtils.join(",", request.o());
            bundle.putString("scope", join);
            a("scope", join);
        }
        DefaultAudience g = request.g();
        if (g == null) {
            g = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", g.getNativeProtocolAudience());
        bundle.putString(TransferTable.COLUMN_STATE, c(request.b()));
        AccessToken e = AccessToken.Companion.e();
        String m = e == null ? null : e.m();
        if (m == null || !zq3.c(m, u())) {
            f i = d().i();
            if (i != null) {
                g29.i(i);
            }
            a(AccessToken.ACCESS_TOKEN_KEY, "0");
        } else {
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, m);
            a(AccessToken.ACCESS_TOKEN_KEY, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", w92.p() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return bundle;
    }

    protected String s() {
        return null;
    }

    public abstract AccessTokenSource t();

    public void v(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result c;
        zq3.h(request, "request");
        LoginClient d = d();
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.a aVar = LoginMethodHandler.Companion;
                AccessToken b = aVar.b(request.o(), bundle, t(), request.a());
                c = LoginClient.Result.Companion.b(d.p(), b, aVar.d(bundle, request.n()));
                if (d.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b != null) {
                        w(b.m());
                    }
                }
            } catch (FacebookException e) {
                c = LoginClient.Result.b.d(LoginClient.Result.Companion, d.p(), null, e.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            c = LoginClient.Result.Companion.a(d.p(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
        } else {
            this.e2e = null;
            String message = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError c2 = ((FacebookServiceException) facebookException).c();
                str = String.valueOf(c2.b());
                message = c2.toString();
            } else {
                str = null;
            }
            c = LoginClient.Result.Companion.c(d.p(), null, message, str);
        }
        g29 g29Var = g29.a;
        if (!g29.Y(this.e2e)) {
            h(this.e2e);
        }
        d.g(c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
    }
}
