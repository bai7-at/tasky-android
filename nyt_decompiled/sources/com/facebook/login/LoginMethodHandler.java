package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import defpackage.g29;
import defpackage.kq3;
import defpackage.m23;
import defpackage.pm5;
import defpackage.w92;
import defpackage.yj0;
import defpackage.zq3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public static final a Companion = new a(null);
    public static final String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";
    public static final String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";
    public static final String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public LoginClient loginClient;
    private Map<String, String> methodLoggingExtras;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessToken a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            String string;
            zq3.h(bundle, "bundle");
            zq3.h(str, "applicationId");
            g29 g29Var = g29.a;
            Date w = g29.w(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date w2 = g29.w(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, str, string, stringArrayList, null, null, accessTokenSource, w, new Date(), w2, bundle.getString(AccessToken.GRAPH_DOMAIN));
        }

        public final AccessToken b(Collection collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            Collection collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            zq3.h(bundle, "bundle");
            zq3.h(str, "applicationId");
            g29 g29Var = g29.a;
            Date w = g29.w(bundle, AccessToken.EXPIRES_IN_KEY, new Date());
            String string = bundle.getString(AccessToken.ACCESS_TOKEN_KEY);
            if (string == null) {
                return null;
            }
            Date w2 = g29.w(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collection2 = collection;
            } else {
                Object[] array = h.F0(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                collection2 = i.h(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                Object[] array2 = h.F0(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                arrayList = i.h(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                Object[] array3 = h.F0(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr3 = (String[]) array3;
                arrayList2 = i.h(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (g29.Y(string)) {
                return null;
            }
            return new AccessToken(string, str, e(bundle.getString("signed_request")), collection2, arrayList, arrayList2, accessTokenSource, w, new Date(), w2, bundle.getString(AccessToken.GRAPH_DOMAIN));
        }

        public final AuthenticationToken c(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage());
            }
        }

        public final AuthenticationToken d(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            String string = bundle.getString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY);
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage(), e);
            }
        }

        public final String e(String str) {
            Object[] array;
            if (str == null || str.length() == 0) {
                throw new FacebookException(LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
            }
            try {
                array = h.F0(str, new String[]{InstructionFileId.DOT}, false, 0, 6, null).toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            if (strArr.length == 2) {
                byte[] decode = Base64.decode(strArr[1], 0);
                zq3.g(decode, "data");
                String string = new JSONObject(new String(decode, yj0.b)).getString(AccessToken.USER_ID_KEY);
                zq3.g(string, "jsonObject.getString(\"user_id\")");
                return string;
            }
            throw new FacebookException(LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
        }

        private a() {
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        zq3.h(loginClient, "loginClient");
        n(loginClient);
    }

    protected void a(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    public void b() {
    }

    protected String c(String str) {
        zq3.h(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            m(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", zq3.q("Error creating client state json: ", e.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        zq3.g(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final LoginClient d() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        zq3.z("loginClient");
        throw null;
    }

    public final Map e() {
        return this.methodLoggingExtras;
    }

    public abstract String f();

    protected String g() {
        return "fb" + w92.m() + "://authorize/";
    }

    protected void h(String str) {
        LoginClient.Request p = d().p();
        String a2 = p == null ? null : p.a();
        if (a2 == null) {
            a2 = w92.m();
        }
        kq3 kq3Var = new kq3(d().i(), a2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a2);
        kq3Var.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean k(int i, int i2, Intent intent) {
        return false;
    }

    protected Bundle l(LoginClient.Request request, Bundle bundle) {
        GraphRequest a2;
        zq3.h(request, "request");
        zq3.h(bundle, "values");
        String string = bundle.getString("code");
        if (g29.Y(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            a2 = null;
        } else {
            pm5 pm5Var = pm5.a;
            String g = g();
            String f = request.f();
            if (f == null) {
                f = "";
            }
            a2 = pm5.a(string, g, f);
        }
        if (a2 == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        m23 k = a2.k();
        FacebookRequestError b = k.b();
        if (b != null) {
            throw new FacebookServiceException(b, b.c());
        }
        try {
            JSONObject c = k.c();
            String string2 = c != null ? c.getString(AccessToken.ACCESS_TOKEN_KEY) : null;
            if (c == null || g29.Y(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, string2);
            if (c.has(AuthenticationToken.AUTHENTICATION_TOKEN_KEY)) {
                bundle.putString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, c.getString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY));
            }
            return bundle;
        } catch (JSONException e) {
            throw new FacebookException(zq3.q("Fail to process code exchange response: ", e.getMessage()));
        }
    }

    public void m(JSONObject jSONObject) {
        zq3.h(jSONObject, "param");
    }

    public final void n(LoginClient loginClient) {
        zq3.h(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    public boolean o() {
        return false;
    }

    public abstract int p(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        g29 g29Var = g29.a;
        g29.E0(parcel, this.methodLoggingExtras);
    }

    protected LoginMethodHandler(Parcel parcel) {
        zq3.h(parcel, "source");
        Map q0 = g29.q0(parcel);
        this.methodLoggingExtras = q0 == null ? null : t.x(q0);
    }
}
