package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.g29;
import defpackage.la4;
import defpackage.ma4;
import defpackage.pm6;
import defpackage.v29;
import defpackage.w92;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LoginClient implements Parcelable {
    private a backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    private Map<String, String> extraData;
    private Fragment fragment;
    private LoginMethodHandler[] handlersToTry;
    private Map<String, String> loggingExtras;
    private la4 loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private d onCompletedListener;
    private Request pendingRequest;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new b();

    public static final class Request implements Parcelable {
        private final String applicationId;
        private String authId;
        private String authType;
        private final String codeChallenge;
        private final CodeChallengeMethod codeChallengeMethod;
        private final String codeVerifier;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private final LoginTargetApp loginTargetApp;
        private String messengerPageId;
        private final String nonce;
        private Set<String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Request> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                zq3.h(parcel, "source");
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final String a() {
            return this.applicationId;
        }

        public final String b() {
            return this.authId;
        }

        public final String c() {
            return this.authType;
        }

        public final String d() {
            return this.codeChallenge;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final CodeChallengeMethod e() {
            return this.codeChallengeMethod;
        }

        public final String f() {
            return this.codeVerifier;
        }

        public final DefaultAudience g() {
            return this.defaultAudience;
        }

        public final String h() {
            return this.deviceAuthTargetUserId;
        }

        public final String i() {
            return this.deviceRedirectUriString;
        }

        public final LoginBehavior k() {
            return this.loginBehavior;
        }

        public final LoginTargetApp l() {
            return this.loginTargetApp;
        }

        public final String m() {
            return this.messengerPageId;
        }

        public final String n() {
            return this.nonce;
        }

        public final Set o() {
            return this.permissions;
        }

        public final boolean p() {
            return this.resetMessengerState;
        }

        public final boolean q() {
            Iterator<String> it2 = this.permissions.iterator();
            while (it2.hasNext()) {
                if (ma4.a.c(it2.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean r() {
            return this.isFamilyLogin;
        }

        public final boolean s() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        public final boolean t() {
            return this.isRerequest;
        }

        public final void u(Set set) {
            zq3.h(set, "<set-?>");
            this.permissions = set;
        }

        public final boolean v() {
            return this.shouldSkipAccountDeduplication;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "dest");
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            parcel.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }

        private Request(Parcel parcel) {
            v29 v29Var = v29.a;
            this.loginBehavior = LoginBehavior.valueOf(v29.n(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            this.defaultAudience = readString != null ? DefaultAudience.valueOf(readString) : DefaultAudience.NONE;
            this.applicationId = v29.n(parcel.readString(), "applicationId");
            this.authId = v29.n(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = v29.n(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.loginTargetApp = readString2 != null ? LoginTargetApp.valueOf(readString2) : LoginTargetApp.FACEBOOK;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = v29.n(parcel.readString(), AuthenticationTokenClaims.JSON_KEY_NONCE);
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 == null ? null : CodeChallengeMethod.valueOf(readString3);
        }
    }

    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Result> CREATOR = new a();

        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] valuesCustom = values();
                return (Code[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                zq3.h(parcel, "source");
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result d(b bVar, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return bVar.c(request, str, str2, str3);
            }

            public final Result a(Request request, String str) {
                return new Result(request, Code.CANCEL, null, str, null);
            }

            public final Result b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result c(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final Result e(Request request, AccessToken accessToken) {
                zq3.h(accessToken, "token");
                return new Result(request, Code.SUCCESS, accessToken, null, null);
            }

            private b() {
            }
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "dest");
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i);
            parcel.writeParcelable(this.authenticationToken, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i);
            g29 g29Var = g29.a;
            g29.D0(parcel, this.loggingExtras);
            g29.D0(parcel, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            zq3.h(code, "code");
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            zq3.h(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Code.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = g29.o0(parcel);
            this.extraData = g29.o0(parcel);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            zq3.g(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }

        private c() {
        }
    }

    public interface d {
        void a(Result result);
    }

    public LoginClient(Fragment fragment) {
        zq3.h(fragment, "fragment");
        this.currentHandler = -1;
        x(fragment);
    }

    private final void a(String str, String str2, boolean z) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void h() {
        f(Result.b.d(Result.Companion, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (defpackage.zq3.c(r1, r2 == null ? null : r2.a()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.la4 o() {
        /*
            r3 = this;
            la4 r0 = r3.loginLogger
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.a()
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.a()
        L12:
            boolean r1 = defpackage.zq3.c(r1, r2)
            if (r1 != 0) goto L36
        L18:
            la4 r0 = new la4
            androidx.fragment.app.f r1 = r3.i()
            if (r1 != 0) goto L24
            android.content.Context r1 = defpackage.w92.l()
        L24:
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto L2d
            java.lang.String r2 = defpackage.w92.m()
            goto L31
        L2d:
            java.lang.String r2 = r2.a()
        L31:
            r0.<init>(r1, r2)
            r3.loginLogger = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.o():la4");
    }

    private final void q(String str, Result result, Map map) {
        r(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private final void r(String str, String str2, String str3, String str4, Map map) {
        Request request = this.pendingRequest;
        if (request == null) {
            o().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            o().b(request.b(), str, str2, str3, str4, map, request.r() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void u(Result result) {
        d dVar = this.onCompletedListener;
        if (dVar == null) {
            return;
        }
        dVar.a(result);
    }

    public final boolean A() {
        LoginMethodHandler k = k();
        if (k == null) {
            return false;
        }
        if (k.i() && !d()) {
            a("no_internet_permission", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int p = k.p(request);
        this.numActivitiesReturned = 0;
        if (p > 0) {
            o().d(request.b(), k.f(), request.r() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.numTotalIntentsFired = p;
        } else {
            o().c(request.b(), k.f(), request.r() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", k.f(), true);
        }
        return p > 0;
    }

    public final void B() {
        LoginMethodHandler k = k();
        if (k != null) {
            r(k.f(), "skipped", null, null, k.e());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i = this.currentHandler;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i + 1;
            if (A()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            h();
        }
    }

    public final void D(Result result) {
        Result b2;
        zq3.h(result, "pendingResult");
        if (result.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken e = AccessToken.Companion.e();
        AccessToken accessToken = result.token;
        if (e != null) {
            try {
                if (zq3.c(e.n(), accessToken.n())) {
                    b2 = Result.Companion.b(this.pendingRequest, result.token, result.authenticationToken);
                    f(b2);
                }
            } catch (Exception e2) {
                f(Result.b.d(Result.Companion, this.pendingRequest, "Caught exception", e2.getMessage(), null, 8, null));
                return;
            }
        }
        b2 = Result.b.d(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        f(b2);
    }

    public final void b(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.Companion.g() || d()) {
            this.pendingRequest = request;
            this.handlersToTry = m(request);
            B();
        }
    }

    public final void c() {
        LoginMethodHandler k = k();
        if (k == null) {
            return;
        }
        k.b();
    }

    public final boolean d() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        f i = i();
        f(Result.b.d(Result.Companion, this.pendingRequest, i == null ? null : i.getString(pm6.com_facebook_internet_permission_error_title), i != null ? i.getString(pm6.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e(String str) {
        zq3.h(str, "permission");
        f i = i();
        if (i == null) {
            return -1;
        }
        return i.checkCallingOrSelfPermission(str);
    }

    public final void f(Result result) {
        zq3.h(result, "outcome");
        LoginMethodHandler k = k();
        if (k != null) {
            q(k.f(), result, k.e());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        u(result);
    }

    public final void g(Result result) {
        zq3.h(result, "outcome");
        if (result.token == null || !AccessToken.Companion.g()) {
            f(result);
        } else {
            D(result);
        }
    }

    public final f i() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final LoginMethodHandler k() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    public final Fragment l() {
        return this.fragment;
    }

    public LoginMethodHandler[] m(Request request) {
        zq3.h(request, "request");
        ArrayList arrayList = new ArrayList();
        LoginBehavior k = request.k();
        if (!request.s()) {
            if (k.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!w92.s && k.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!w92.s && k.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (k.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (k.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.s() && k.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean n() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final Request p() {
        return this.pendingRequest;
    }

    public final void s() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void t() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final boolean v(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.j, false)) {
                B();
                return false;
            }
            LoginMethodHandler k = k();
            if (k != null && (!k.o() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return k.k(i, i2, intent);
            }
        }
        return false;
    }

    public final void w(a aVar) {
        this.backgroundProcessingListener = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeParcelableArray(this.handlersToTry, i);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i);
        g29 g29Var = g29.a;
        g29.D0(parcel, this.loggingExtras);
        g29.D0(parcel, this.extraData);
    }

    public final void x(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final void y(d dVar) {
        this.onCompletedListener = dVar;
    }

    public final void z(Request request) {
        if (n()) {
            return;
        }
        b(request);
    }

    public LoginClient(Parcel parcel) {
        zq3.h(parcel, "source");
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.n(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = parcel.readInt();
            this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
            Map o0 = g29.o0(parcel);
            this.loggingExtras = o0 == null ? null : t.x(o0);
            Map o02 = g29.o0(parcel);
            this.extraData = o02 != null ? t.x(o02) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
