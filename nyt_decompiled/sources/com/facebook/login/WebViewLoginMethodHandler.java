package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import defpackage.g29;
import defpackage.j92;
import defpackage.od9;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    private static final String OAUTH_DIALOG = "oauth";
    private String e2e;
    private od9 loginDialog;
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    public final class a extends od9.a {
        private String h;
        private LoginBehavior i;
        private LoginTargetApp j;
        private boolean k;
        private boolean l;
        public String m;
        public String n;
        final /* synthetic */ WebViewLoginMethodHandler o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            zq3.h(webViewLoginMethodHandler, "this$0");
            zq3.h(context, "context");
            zq3.h(str, "applicationId");
            zq3.h(bundle, "parameters");
            this.o = webViewLoginMethodHandler;
            this.h = "fbconnect://success";
            this.i = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.j = LoginTargetApp.FACEBOOK;
        }

        @Override // od9.a
        public od9 a() {
            Bundle f = f();
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            f.putString("redirect_uri", this.h);
            f.putString("client_id", c());
            f.putString("e2e", j());
            f.putString("response_type", this.j == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f.putString("return_scopes", "true");
            f.putString("auth_type", i());
            f.putString("login_behavior", this.i.name());
            if (this.k) {
                f.putString("fx_app", this.j.toString());
            }
            if (this.l) {
                f.putString("skip_dedupe", "true");
            }
            od9.b bVar = od9.m;
            Context d = d();
            if (d != null) {
                return bVar.d(d, "oauth", f, g(), this.j, e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        public final String i() {
            String str = this.n;
            if (str != null) {
                return str;
            }
            zq3.z("authType");
            throw null;
        }

        public final String j() {
            String str = this.m;
            if (str != null) {
                return str;
            }
            zq3.z("e2e");
            throw null;
        }

        public final a k(String str) {
            zq3.h(str, "authType");
            l(str);
            return this;
        }

        public final void l(String str) {
            zq3.h(str, "<set-?>");
            this.n = str;
        }

        public final a m(String str) {
            zq3.h(str, "e2e");
            n(str);
            return this;
        }

        public final void n(String str) {
            zq3.h(str, "<set-?>");
            this.m = str;
        }

        public final a o(boolean z) {
            this.k = z;
            return this;
        }

        public final a p(boolean z) {
            this.h = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(LoginBehavior loginBehavior) {
            zq3.h(loginBehavior, "loginBehavior");
            this.i = loginBehavior;
            return this;
        }

        public final a r(LoginTargetApp loginTargetApp) {
            zq3.h(loginTargetApp, "targetApp");
            this.j = loginTargetApp;
            return this;
        }

        public final a s(boolean z) {
            this.l = z;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements od9.d {
        final /* synthetic */ LoginClient.Request b;

        d(LoginClient.Request request) {
            this.b = request;
        }

        @Override // od9.d
        public void a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.x(this.b, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        od9 od9Var = this.loginDialog;
        if (od9Var != null) {
            if (od9Var != null) {
                od9Var.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String f() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean i() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        zq3.h(request, "request");
        Bundle r = r(request);
        d dVar = new d(request);
        String a2 = LoginClient.Companion.a();
        this.e2e = a2;
        a("e2e", a2);
        f i = d().i();
        if (i == null) {
            return 0;
        }
        boolean S = g29.S(i);
        a aVar = new a(this, i, request.a(), r);
        String str = this.e2e;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.loginDialog = aVar.m(str).p(S).k(request.c()).q(request.k()).r(request.l()).o(request.r()).s(request.v()).h(dVar).a();
        j92 j92Var = new j92();
        j92Var.setRetainInstance(true);
        j92Var.k1(this.loginDialog);
        j92Var.show(i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource t() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
    }

    public final void x(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        zq3.h(request, "request");
        super.v(request, bundle, facebookException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
        this.e2e = parcel.readString();
    }
}
