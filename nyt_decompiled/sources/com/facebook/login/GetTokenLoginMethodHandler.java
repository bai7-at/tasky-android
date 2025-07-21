package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import defpackage.g29;
import defpackage.w92;
import defpackage.wu5;
import defpackage.xy2;
import defpackage.zq3;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    private xy2 getTokenClient;
    private final String nameForLogging;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements g29.a {
        final /* synthetic */ Bundle a;
        final /* synthetic */ GetTokenLoginMethodHandler b;
        final /* synthetic */ LoginClient.Request c;

        c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.a = bundle;
            this.b = getTokenLoginMethodHandler;
            this.c = request;
        }

        @Override // g29.a
        public void a(JSONObject jSONObject) {
            try {
                this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString("id"));
                this.b.t(this.c, this.a);
            } catch (JSONException e) {
                this.b.d().f(LoginClient.Result.b.d(LoginClient.Result.Companion, this.b.d().p(), "Caught exception", e.getMessage(), null, 8, null));
            }
        }

        @Override // g29.a
        public void b(FacebookException facebookException) {
            this.b.d().f(LoginClient.Result.b.d(LoginClient.Result.Companion, this.b.d().p(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        zq3.h(getTokenLoginMethodHandler, "this$0");
        zq3.h(request, "$request");
        getTokenLoginMethodHandler.s(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        xy2 xy2Var = this.getTokenClient;
        if (xy2Var == null) {
            return;
        }
        xy2Var.b();
        xy2Var.g(null);
        this.getTokenClient = null;
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
    public int p(final LoginClient.Request request) {
        zq3.h(request, "request");
        Context i = d().i();
        if (i == null) {
            i = w92.l();
        }
        xy2 xy2Var = new xy2(i, request);
        this.getTokenClient = xy2Var;
        if (zq3.c(Boolean.valueOf(xy2Var.h()), Boolean.FALSE)) {
            return 0;
        }
        d().s();
        wu5.b bVar = new wu5.b() { // from class: yy2
            @Override // wu5.b
            public final void a(Bundle bundle) {
                GetTokenLoginMethodHandler.u(GetTokenLoginMethodHandler.this, request, bundle);
            }
        };
        xy2 xy2Var2 = this.getTokenClient;
        if (xy2Var2 == null) {
            return 1;
        }
        xy2Var2.g(bVar);
        return 1;
    }

    public final void r(LoginClient.Request request, Bundle bundle) {
        zq3.h(request, "request");
        zq3.h(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            t(request, bundle);
            return;
        }
        d().s();
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        g29 g29Var = g29.a;
        g29.D(string2, new c(bundle, this, request));
    }

    public final void s(LoginClient.Request request, Bundle bundle) {
        zq3.h(request, "request");
        xy2 xy2Var = this.getTokenClient;
        if (xy2Var != null) {
            xy2Var.g(null);
        }
        this.getTokenClient = null;
        d().t();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = i.l();
            }
            Set<String> o = request.o();
            if (o == null) {
                o = b0.e();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (o.contains(Scopes.OPEN_ID) && (string == null || string.length() == 0)) {
                d().B();
                return;
            }
            if (stringArrayList.containsAll(o)) {
                r(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : o) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.u(hashSet);
        }
        d().B();
    }

    public final void t(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result d;
        zq3.h(request, "request");
        zq3.h(bundle, "result");
        try {
            LoginMethodHandler.a aVar = LoginMethodHandler.Companion;
            d = LoginClient.Result.Companion.b(request, aVar.a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.a()), aVar.c(bundle, request.n()));
        } catch (FacebookException e) {
            d = LoginClient.Result.b.d(LoginClient.Result.Companion, d().p(), null, e.getMessage(), null, 8, null);
        }
        d().g(d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.nameForLogging = "get_token";
    }
}
