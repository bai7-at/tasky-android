package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.NativeAppLoginMethodHandler;
import defpackage.g29;
import defpackage.j5;
import defpackage.w92;
import defpackage.ww8;
import defpackage.yk7;
import defpackage.zq3;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    private final AccessTokenSource tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        zq3.h(nativeAppLoginMethodHandler, "this$0");
        zq3.h(request, "$request");
        zq3.h(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.x(request, nativeAppLoginMethodHandler.l(request, bundle));
        } catch (FacebookServiceException e) {
            FacebookRequestError c = e.c();
            nativeAppLoginMethodHandler.w(request, c.d(), c.c(), String.valueOf(c.b()));
        } catch (FacebookException e2) {
            nativeAppLoginMethodHandler.w(request, null, e2.getMessage(), null);
        }
    }

    private final void r(LoginClient.Result result) {
        if (result != null) {
            d().g(result);
        } else {
            d().B();
        }
    }

    private final boolean y(Intent intent) {
        zq3.g(w92.l().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r1.isEmpty();
    }

    private final void z(final LoginClient.Request request, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            g29 g29Var = g29.a;
            if (!g29.Y(bundle.getString("code"))) {
                w92.t().execute(new Runnable() { // from class: x15
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.A(NativeAppLoginMethodHandler.this, request, bundle);
                    }
                });
                return;
            }
        }
        x(request, bundle);
    }

    protected boolean B(Intent intent, int i) {
        j5 g1;
        if (intent == null || !y(intent)) {
            return false;
        }
        Fragment l = d().l();
        ww8 ww8Var = null;
        LoginFragment loginFragment = l instanceof LoginFragment ? (LoginFragment) l : null;
        if (loginFragment != null && (g1 = loginFragment.g1()) != null) {
            g1.a(intent);
            ww8Var = ww8.a;
        }
        return ww8Var != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean k(int i, int i2, Intent intent) {
        LoginClient.Request p = d().p();
        if (intent == null) {
            r(LoginClient.Result.Companion.a(p, "Operation canceled"));
        } else if (i2 == 0) {
            v(p, intent);
        } else if (i2 != -1) {
            r(LoginClient.Result.b.d(LoginClient.Result.Companion, p, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                r(LoginClient.Result.b.d(LoginClient.Result.Companion, p, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String s = s(extras);
            Object obj = extras.get("error_code");
            String obj2 = obj == null ? null : obj.toString();
            String t = t(extras);
            String string = extras.getString("e2e");
            if (!g29.Y(string)) {
                h(string);
            }
            if (s == null && obj2 == null && t == null && p != null) {
                z(p, extras);
            } else {
                w(p, s, t, obj2);
            }
        }
        return true;
    }

    protected String s(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    protected String t(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    public AccessTokenSource u() {
        return this.tokenSource;
    }

    protected void v(LoginClient.Request request, Intent intent) {
        Object obj;
        zq3.h(intent, "data");
        Bundle extras = intent.getExtras();
        String s = s(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        if (zq3.c(yk7.c(), str)) {
            r(LoginClient.Result.Companion.c(request, s, t(extras), str));
        } else {
            r(LoginClient.Result.Companion.a(request, s));
        }
    }

    protected void w(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && zq3.c(str, "logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            r(null);
        } else if (i.c0(yk7.d(), str)) {
            r(null);
        } else if (i.c0(yk7.e(), str)) {
            r(LoginClient.Result.Companion.a(request, null));
        } else {
            r(LoginClient.Result.Companion.c(request, str, str2, str3));
        }
    }

    protected void x(LoginClient.Request request, Bundle bundle) {
        zq3.h(request, "request");
        zq3.h(bundle, "extras");
        try {
            LoginMethodHandler.a aVar = LoginMethodHandler.Companion;
            r(LoginClient.Result.Companion.b(request, aVar.b(request.o(), bundle, u(), request.a()), aVar.d(bundle, request.n())));
        } catch (FacebookException e) {
            r(LoginClient.Result.b.d(LoginClient.Result.Companion, request, null, e.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }
}
