package com.nytimes.android.subauth.core.auth;

import android.content.res.Resources;
import com.comscore.streaming.ContentType;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.models.a;
import com.nytimes.android.subauth.core.auth.models.b;
import com.nytimes.android.subauth.core.auth.models.c;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.auth.network.response.DeleteAccountResponse;
import com.nytimes.android.subauth.core.auth.network.response.GenericLireResponseError;
import com.nytimes.android.subauth.core.auth.network.response.GenericLireResponseMeta;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponseData;
import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponse;
import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponseData;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.auth.network.response.d;
import com.nytimes.android.subauth.core.util.NetworkUtils;
import com.nytimes.android.subauth.core.util.SubauthSetupException;
import defpackage.a59;
import defpackage.am5;
import defpackage.ba1;
import defpackage.by0;
import defpackage.c05;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.fr3;
import defpackage.g77;
import defpackage.g78;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.i13;
import defpackage.i77;
import defpackage.kl5;
import defpackage.kl7;
import defpackage.ll5;
import defpackage.mg8;
import defpackage.o98;
import defpackage.oa4;
import defpackage.q98;
import defpackage.qv7;
import defpackage.s16;
import defpackage.ss2;
import defpackage.tl5;
import defpackage.u16;
import defpackage.ul5;
import defpackage.ul8;
import defpackage.vl5;
import defpackage.w88;
import defpackage.wl5;
import defpackage.ww8;
import defpackage.wy6;
import defpackage.xl5;
import defpackage.xl7;
import defpackage.xz8;
import defpackage.yl5;
import defpackage.yl7;
import defpackage.zl5;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Http2;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class SubauthUserManager implements o98, q98, kl7.a {
    public static final a Companion = new a(null);
    private final Resources a;
    private final NYTUser b;
    private final UserAPI c;
    private final w88 d;
    private final xz8 e;
    private final c05 f;
    private final kl7 g;
    private final Map h;
    private final ss2 i;
    private final String j;
    private final String k;
    private final mg8 l;
    private final ba1 m;
    private final SubauthListenerManager n;
    private final CoroutineDispatcher o;
    private com.nytimes.android.subauth.core.auth.network.response.a p;
    private b q;
    private c r;
    private yl7 s;
    private vl5 t;
    private final CoroutineScope u;
    private final MutableStateFlow v;
    private final MutableStateFlow w;
    private boolean x;

    @fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$1", f = "SubauthUserManager.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.SubauthUserManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return SubauthUserManager.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SubauthUserManager subauthUserManager;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                SubauthUserManager subauthUserManager2 = SubauthUserManager.this;
                Flow data = subauthUserManager2.V().getData();
                this.L$0 = subauthUserManager2;
                this.label = 1;
                Object firstOrNull = FlowKt.firstOrNull(data, this);
                if (firstOrNull == h) {
                    return h;
                }
                obj = firstOrNull;
                subauthUserManager = subauthUserManager2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                subauthUserManager = (SubauthUserManager) this.L$0;
                f.b(obj);
            }
            subauthUserManager.j0((s16) obj);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SubauthUserManager(Resources resources, NYTUser nYTUser, UserAPI userAPI, w88 w88Var, xz8 xz8Var, c05 c05Var, kl7 kl7Var, Map map, ss2 ss2Var, String str, String str2, mg8 mg8Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(resources, "resources");
        zq3.h(nYTUser, "nytUser");
        zq3.h(userAPI, "userAPI");
        zq3.h(w88Var, "networkStatus");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(kl7Var, "sessionRefreshProvider");
        zq3.h(map, "ssoProviders");
        zq3.h(mg8Var, "targetingServiceProvider");
        zq3.h(ba1Var, "dataStore");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = resources;
        this.b = nYTUser;
        this.c = userAPI;
        this.d = w88Var;
        this.e = xz8Var;
        this.f = c05Var;
        this.g = kl7Var;
        this.h = map;
        this.i = ss2Var;
        this.j = str;
        this.k = str2;
        this.l = mg8Var;
        this.m = ba1Var;
        this.n = subauthListenerManager;
        this.o = coroutineDispatcher;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.u = CoroutineScope;
        this.v = StateFlowKt.MutableStateFlow(null);
        this.w = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    private final Object T(LoginMethod loginMethod, ss2 ss2Var, by0 by0Var) {
        if (this.d.a()) {
            return ss2Var.invoke(by0Var);
        }
        qv7.a aVar = null;
        return new oa4.b(new LoginError(null, null, null, "Internet Not Connected", 7, null), loginMethod, aVar, null, null, null, true, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b0() {
        Resources resources = this.a;
        if (resources != null) {
            return fr3.a.a(resources) ? "U" : "N";
        }
        ul8.a.z("SUBAUTH").u("Null `mnl_opt_in` param: No resources available to tell if we're in the us or not", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f0(LoginResponse loginResponse, String str, LoginMethod loginMethod, by0 by0Var) {
        if (loginResponse == null) {
            qv7.a aVar = null;
            g78.a.b(this.n, str, loginMethod, null, 4, null);
            return new oa4.b(new LoginError(null, null, null, str, 7, null), loginMethod, aVar, null, null, null, false, 124, null);
        }
        LoginError e = loginResponse.e();
        if (e == null) {
            return i0(loginResponse, loginMethod, by0Var);
        }
        this.n.l(str, loginMethod, loginResponse);
        return new oa4.b(e, loginMethod, null, null, null, null, false, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.nytimes.android.subauth.core.auth.models.LoginMethod] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.nytimes.android.subauth.core.auth.models.LoginMethod] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(defpackage.lh5 r19, java.lang.String r20, com.nytimes.android.subauth.core.auth.models.LoginMethod r21, defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.g0(lh5, java.lang.String, com.nytimes.android.subauth.core.auth.models.LoginMethod, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h0(qv7 qv7Var, LoginMethod loginMethod, androidx.fragment.app.f fVar, by0 by0Var) {
        if (!(qv7Var instanceof qv7.a)) {
            if (qv7Var instanceof qv7.c) {
                ul8.a.z("SUBAUTH").a("Smart Lock Read Success: Account Only. Attempting SSO from Smart Lock", new Object[0]);
                return r0(fVar, (qv7.c) qv7Var, by0Var);
            }
            if (qv7Var instanceof qv7.d) {
                ul8.a.z("SUBAUTH").a("Smart Lock Read Success: Credentials. Attempting Login", new Object[0]);
                qv7.d dVar = (qv7.d) qv7Var;
                return o98.a.a(this, dVar.b(), dVar.a(), null, by0Var, 4, null);
            }
            if (!(qv7Var instanceof qv7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ul8.a.z("SUBAUTH").u("Smart Lock Read User Cancelled.", new Object[0]);
            return new oa4.a(loginMethod);
        }
        qv7.a aVar = (qv7.a) qv7Var;
        ul8.a.z("SUBAUTH").d("Smart Lock Read failure: " + aVar.a() + ". Returning login error.", new Object[0]);
        return new oa4.b(new LoginError(null, null, null, aVar.a(), 7, null), loginMethod, aVar, null, null, null, false, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(com.nytimes.android.subauth.core.auth.network.response.LoginResponse r18, com.nytimes.android.subauth.core.auth.models.LoginMethod r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.i0(com.nytimes.android.subauth.core.auth.network.response.LoginResponse, com.nytimes.android.subauth.core.auth.models.LoginMethod, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(s16 s16Var) {
        String string = this.a.getString(hm6.subauth_email_account_state);
        if (s16Var != null) {
            zq3.e(string);
            String str = (String) s16Var.c(u16.f(string));
            if (str != null) {
                kl5 a2 = ll5.a(str, new ss2() { // from class: com.nytimes.android.subauth.core.auth.SubauthUserManager$initializeDataStore$1$1$1
                    {
                        super(1);
                    }

                    public final String b(int i) {
                        return SubauthUserManager.this.c0().getString(i);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
                this.p = a2 != null ? com.nytimes.android.subauth.core.auth.network.response.b.a(a2) : null;
            }
        }
        String string2 = this.a.getString(hm6.subauth_request_verification_code_key);
        if (s16Var != null) {
            zq3.e(string2);
            String str2 = (String) s16Var.c(u16.f(string2));
            if (str2 != null) {
                tl5 a3 = ul5.a(str2, new ss2() { // from class: com.nytimes.android.subauth.core.auth.SubauthUserManager$initializeDataStore$2$1$1
                    {
                        super(1);
                    }

                    public final String b(int i) {
                        return SubauthUserManager.this.c0().getString(i);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
                this.q = a3 != null ? wy6.a(a3) : null;
            }
        }
        String string3 = this.a.getString(hm6.subauth_verify_email_with_code_key);
        if (s16Var != null) {
            zq3.e(string3);
            String str3 = (String) s16Var.c(u16.f(string3));
            if (str3 != null) {
                zl5 a4 = am5.a(str3, new ss2() { // from class: com.nytimes.android.subauth.core.auth.SubauthUserManager$initializeDataStore$3$1$1
                    {
                        super(1);
                    }

                    public final String b(int i) {
                        return SubauthUserManager.this.c0().getString(i);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
                this.r = a4 != null ? a59.a(a4) : null;
            }
        }
        String string4 = this.a.getString(hm6.subauth_set_password_with_token_key);
        if (s16Var != null) {
            zq3.e(string4);
            String str4 = (String) s16Var.c(u16.f(string4));
            if (str4 != null) {
                xl5 a5 = yl5.a(str4, new ss2() { // from class: com.nytimes.android.subauth.core.auth.SubauthUserManager$initializeDataStore$4$1$1
                    {
                        super(1);
                    }

                    public final String b(int i) {
                        return SubauthUserManager.this.c0().getString(i);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
                this.s = a5 != null ? xl7.a(a5) : null;
            }
        }
        String string5 = this.a.getString(hm6.subauth_override_sso_action_key);
        if (s16Var != null) {
            zq3.e(string5);
            String str5 = (String) s16Var.c(u16.f(string5));
            if (str5 != null) {
                this.t = wl5.a(str5, new ss2() { // from class: com.nytimes.android.subauth.core.auth.SubauthUserManager$initializeDataStore$5$1$1
                    {
                        super(1);
                    }

                    public final String b(int i) {
                        return SubauthUserManager.this.c0().getString(i);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
            }
        }
        this.x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125 A[Catch: Exception -> 0x013d, TRY_LEAVE, TryCatch #0 {Exception -> 0x013d, blocks: (B:25:0x011f, B:27:0x0125, B:21:0x00cf), top: B:20:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(defpackage.i77 r22, java.lang.String r23, java.lang.String r24, com.nytimes.android.subauth.core.auth.models.RegiInterface r25, h77.c r26, defpackage.by0 r27) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.k0(i77, java.lang.String, java.lang.String, com.nytimes.android.subauth.core.auth.models.RegiInterface, h77$c, by0):java.lang.Object");
    }

    private final Object l0(i77 i77Var, g77 g77Var, androidx.fragment.app.f fVar, String str, String str2, RegiInterface regiInterface, by0 by0Var) {
        LoginMethod s0 = s0(i77Var);
        return T(s0, new SubauthUserManager$loginWithSSO$2(g77Var, fVar, str2, this, i77Var, str, regiInterface, s0, null), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.nytimes.android.subauth.core.auth.models.a m0(Response response) {
        String string;
        int code = response.code();
        ResponseBody errorBody = response.errorBody();
        DeleteAccountResponse deleteAccountResponse = (errorBody == null || (string = errorBody.string()) == null) ? null : (DeleteAccountResponse) NetworkUtils.a.b(DeleteAccountResponse.class, string);
        String b = deleteAccountResponse != null ? deleteAccountResponse.b() : null;
        return code != 202 ? code != 400 ? code != 409 ? new a.AbstractC0406a.f(code, b) : new a.AbstractC0406a.b(code, b) : new a.AbstractC0406a.d(code, b) : a.b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b n0(Response response) {
        int code = response.code();
        if (code == 200) {
            return b.C0410b.a;
        }
        if (400 <= code && code < 500) {
            return new b.a.C0408a(response.code());
        }
        if (code == 500) {
            return new b.a.c(response.code());
        }
        return new b.a.d("Unexpected Server Code " + response.code());
    }

    private final c.a o0(int i, Integer num) {
        if (400 > i || i >= 500) {
            return i == 500 ? new c.a.C0412c(500) : new c.a.d("Unknown Error");
        }
        return new c.a.C0411a(i, num != null ? num.intValue() : 0);
    }

    static /* synthetic */ c.a p0(SubauthUserManager subauthUserManager, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = 0;
        }
        return subauthUserManager.o0(i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c q0(Response response) {
        c.a aVar;
        String string;
        c.a aVar2;
        GenericLireResponseMeta b;
        List a2;
        GenericLireResponseError genericLireResponseError;
        VerifyEmailWithCodeResponse verifyEmailWithCodeResponse = (VerifyEmailWithCodeResponse) response.body();
        if (verifyEmailWithCodeResponse != null) {
            VerifyEmailWithCodeResponseData a3 = verifyEmailWithCodeResponse.a();
            c.b bVar = (a3 == null || a3.a() == null) ? null : new c.b(verifyEmailWithCodeResponse);
            if (bVar != null) {
                return bVar;
            }
        }
        ResponseBody errorBody = response.errorBody();
        if (errorBody == null || (string = errorBody.string()) == null) {
            aVar = null;
        } else {
            VerifyEmailWithCodeResponse verifyEmailWithCodeResponse2 = (VerifyEmailWithCodeResponse) NetworkUtils.a.b(VerifyEmailWithCodeResponse.class, string);
            if (verifyEmailWithCodeResponse2 == null || (b = verifyEmailWithCodeResponse2.b()) == null || (a2 = b.a()) == null || (genericLireResponseError = (GenericLireResponseError) i.k0(a2)) == null) {
                aVar2 = null;
            } else {
                int code = response.code();
                Integer b2 = genericLireResponseError.b();
                aVar2 = o0(code, Integer.valueOf(b2 != null ? b2.intValue() : 0));
            }
            aVar = aVar2;
        }
        return aVar != null ? aVar : p0(this, response.code(), null, 2, null);
    }

    private final Object r0(androidx.fragment.app.f fVar, qv7.c cVar, by0 by0Var) {
        i77 a2 = cVar.a();
        if (zq3.c(a2, i77.b.b)) {
            return o98.a.c(this, fVar, null, cVar.b(), null, by0Var, 10, null);
        }
        if (zq3.c(a2, i77.a.b)) {
            return o98.a.b(this, fVar, null, null, by0Var, 6, null);
        }
        ul8.a.z("SUBAUTH").d("Unknown SSO Account Type. Cannot attempt to login", new Object[0]);
        qv7.a aVar = null;
        return new oa4.b(new LoginError(null, null, null, "Unknown account type", 7, null), LoginMethod.GoogleSSO, aVar, null, null, null, false, 124, null);
    }

    private final LoginMethod s0(i77 i77Var) {
        if (zq3.c(i77Var, i77.b.b)) {
            return LoginMethod.GoogleSSO;
        }
        if (zq3.c(i77Var, i77.a.b)) {
            return LoginMethod.FacebookSSO;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final LoginResponse t0(LoginResponse loginResponse) {
        String str;
        vl5 vl5Var = this.t;
        if (vl5Var == null) {
            return loginResponse;
        }
        if (zq3.c(vl5Var, vl5.a.a)) {
            str = "LOGIN";
        } else if (zq3.c(vl5Var, vl5.b.a)) {
            str = "LINKED_REGILITE";
        } else {
            if (!zq3.c(vl5Var, vl5.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "REGISTER";
        }
        String str2 = str;
        LoginResponseData c = loginResponse.c();
        LoginResponse a2 = loginResponse.a(c != null ? LoginResponseData.b(c, str2, null, null, 6, null) : null, loginResponse.f());
        return a2 == null ? loginResponse : a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.lang.String r6, java.lang.String r7, androidx.fragment.app.f r8, com.nytimes.android.subauth.core.auth.models.RegiInterface r9, defpackage.by0 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$loginAndSaveToSmartLock$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.subauth.core.auth.SubauthUserManager$loginAndSaveToSmartLock$1 r0 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$loginAndSaveToSmartLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$loginAndSaveToSmartLock$1 r0 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$loginAndSaveToSmartLock$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            oa4 r5 = (defpackage.oa4) r5
            kotlin.f.b(r10)
            goto L8f
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$3
            r8 = r5
            androidx.fragment.app.f r8 = (androidx.fragment.app.f) r8
            java.lang.Object r5 = r0.L$2
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r5 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r5
            kotlin.f.b(r10)
            goto L63
        L4f:
            kotlin.f.b(r10)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.label = r4
            java.lang.Object r10 = r5.s(r6, r7, r9, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            r9 = r10
            oa4 r9 = (defpackage.oa4) r9
            boolean r10 = r9 instanceof oa4.c
            if (r10 == 0) goto L92
            java.util.Map r5 = r5.h
            i77$b r10 = i77.b.b
            java.lang.Object r5 = r5.get(r10)
            boolean r10 = r5 instanceof defpackage.i13
            r2 = 0
            if (r10 == 0) goto L7a
            i13 r5 = (defpackage.i13) r5
            goto L7b
        L7a:
            r5 = r2
        L7b:
            if (r5 == 0) goto L92
            r0.L$0 = r9
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r10 = r5.a(r8, r6, r7, r0)
            if (r10 != r1) goto L8e
            return r1
        L8e:
            r5 = r9
        L8f:
            rv7 r10 = (defpackage.rv7) r10
            r9 = r5
        L92:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.A(java.lang.String, java.lang.String, androidx.fragment.app.f, com.nytimes.android.subauth.core.auth.models.RegiInterface, by0):java.lang.Object");
    }

    @Override // defpackage.q98
    public void B(zl5 zl5Var) {
        this.r = zl5Var != null ? a59.a(zl5Var) : null;
    }

    @Override // defpackage.q98
    public void C(kl5 kl5Var) {
        this.p = kl5Var != null ? com.nytimes.android.subauth.core.auth.network.response.b.a(kl5Var) : null;
    }

    @Override // defpackage.q98
    public boolean D() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SubauthUserManager$isNYTSCookieValid$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.q98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(java.lang.String r9, java.lang.String r10, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingLogin$1
            if (r0 == 0) goto L14
            r0 = r11
            com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingLogin$1 r0 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingLogin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingLogin$1 r0 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingLogin$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.f.b(r11)
            goto L45
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.f.b(r11)
            r5.label = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r11 = o98.a.a(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L45
            return r0
        L45:
            oa4 r11 = (defpackage.oa4) r11
            xn1 r8 = defpackage.pa4.c(r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.E(java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.q98
    public void F(xl5 xl5Var) {
        this.s = xl5Var != null ? xl7.a(xl5Var) : null;
    }

    @Override // defpackage.q98
    public Object G(by0 by0Var) {
        Object e = o98.a.e(this, null, by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    @Override // defpackage.o98
    public boolean H() {
        return this.h.get(i77.b.b) != null;
    }

    public final ss2 U() {
        return this.i;
    }

    public final ba1 V() {
        return this.m;
    }

    public final String W() {
        return this.j;
    }

    public final CoroutineDispatcher X() {
        return this.o;
    }

    public final w88 Y() {
        return this.d;
    }

    public final c05 Z() {
        return this.f;
    }

    @Override // defpackage.q98
    public d a() {
        return this.l.a();
    }

    public final NYTUser a0() {
        return this.b;
    }

    @Override // defpackage.o98
    public String b() {
        return this.k;
    }

    @Override // defpackage.o98
    public Flow c() {
        return FlowKt.filterNotNull(this.w);
    }

    public final Resources c0() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, androidx.fragment.app.f r19, com.nytimes.android.subauth.core.auth.models.RegiInterface r20, defpackage.by0 r21) {
        /*
            r14 = this;
            r7 = r14
            r0 = r21
            boolean r1 = r0 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$registerAndSaveToSmartLock$1
            if (r1 == 0) goto L17
            r1 = r0
            com.nytimes.android.subauth.core.auth.SubauthUserManager$registerAndSaveToSmartLock$1 r1 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$registerAndSaveToSmartLock$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$registerAndSaveToSmartLock$1 r1 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$registerAndSaveToSmartLock$1
            r1.<init>(r14, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L55
            if (r1 == r2) goto L3e
            if (r1 != r10) goto L36
            java.lang.Object r1 = r8.L$0
            oa4 r1 = (defpackage.oa4) r1
            kotlin.f.b(r0)
            goto La5
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            java.lang.Object r1 = r8.L$3
            androidx.fragment.app.f r1 = (androidx.fragment.app.f) r1
            java.lang.Object r2 = r8.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r4 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r4
            kotlin.f.b(r0)
            r13 = r1
            r12 = r2
            r11 = r3
            goto L7a
        L55:
            kotlin.f.b(r0)
            r8.L$0 = r7
            r11 = r15
            r8.L$1 = r11
            r12 = r16
            r8.L$2 = r12
            r13 = r19
            r8.L$3 = r13
            r8.label = r2
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r8
            java.lang.Object r0 = r0.w(r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L79
            return r9
        L79:
            r4 = r7
        L7a:
            r1 = r0
            oa4 r1 = (defpackage.oa4) r1
            boolean r0 = r1 instanceof oa4.c
            if (r0 == 0) goto La7
            java.util.Map r0 = r4.h
            i77$b r2 = i77.b.b
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof defpackage.i13
            r3 = 0
            if (r2 == 0) goto L91
            i13 r0 = (defpackage.i13) r0
            goto L92
        L91:
            r0 = r3
        L92:
            if (r0 == 0) goto La7
            r8.L$0 = r1
            r8.L$1 = r3
            r8.L$2 = r3
            r8.L$3 = r3
            r8.label = r10
            java.lang.Object r0 = r0.a(r13, r11, r12, r8)
            if (r0 != r9) goto La5
            return r9
        La5:
            rv7 r0 = (defpackage.rv7) r0
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.fragment.app.f, com.nytimes.android.subauth.core.auth.models.RegiInterface, by0):java.lang.Object");
    }

    public final mg8 d0() {
        return this.l;
    }

    @Override // defpackage.o98
    public Object e(String str, by0 by0Var) {
        b bVar = this.q;
        return bVar == null ? BuildersKt.withContext(this.o, new SubauthUserManager$requestVerificationCode$2(this, str, null), by0Var) : bVar;
    }

    public final UserAPI e0() {
        return this.c;
    }

    @Override // kl7.a
    public void f(c.a aVar, String str) {
        zq3.h(aVar, "sessionRefreshError");
        BuildersKt__Builders_commonKt.launch$default(this.u, null, null, new SubauthUserManager$onSessionRefreshFailed$1(aVar, this, str, null), 3, null);
    }

    @Override // defpackage.o98
    public Object g(by0 by0Var) {
        Object b = this.l.b(false, by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    @Override // defpackage.o98
    public Object h(String str, by0 by0Var) {
        return T(LoginMethod.LoginMagicLink, new SubauthUserManager$login$4(this, str, null), by0Var);
    }

    @Override // defpackage.o98
    public Object i(androidx.fragment.app.f fVar, String str, by0 by0Var) {
        Object obj = this.h.get(i77.b.b);
        i13 i13Var = obj instanceof i13 ? (i13) obj : null;
        if (i13Var == null) {
            throw new SubauthSetupException("Google SSO not setup");
        }
        LoginMethod loginMethod = LoginMethod.GoogleOneTap;
        return T(loginMethod, new SubauthUserManager$oneTapLogin$2(i13Var, fVar, this, str, loginMethod, null), by0Var);
    }

    @Override // defpackage.o98
    public Object j(String str, String str2, String str3, RegiInterface regiInterface, by0 by0Var) {
        return BuildersKt.withContext(this.o, new SubauthUserManager$loginWithWebSSO$2(this, str, regiInterface, str3, str2, null), by0Var);
    }

    @Override // defpackage.o98
    public Object k(androidx.fragment.app.f fVar, String str, RegiInterface regiInterface, by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Login with Facebook SSO", new Object[0]);
        Map map = this.h;
        i77.a aVar = i77.a.b;
        g77 g77Var = (g77) map.get(aVar);
        if (g77Var != null) {
            return l0(aVar, g77Var, fVar, str, null, regiInterface, by0Var);
        }
        throw new SubauthSetupException("Facebook SSO not setup");
    }

    @Override // defpackage.q98
    public Object l(String str, by0 by0Var) {
        Object l = this.f.l(str, by0Var);
        return l == kotlin.coroutines.intrinsics.a.h() ? l : ww8.a;
    }

    @Override // defpackage.o98
    public Flow m() {
        return FlowKt.filterNotNull(this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0062, B:13:0x0066, B:16:0x006c, B:26:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0062, B:13:0x0066, B:16:0x006c, B:26:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r11, java.lang.String r12, defpackage.by0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$1 r0 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$1 r0 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> L29
            goto L62
        L29:
            r10 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.f.b(r13)
            w88 r13 = r10.d
            boolean r13 = r13.a()
            if (r13 != 0) goto L4b
            r3$a r10 = new r3$a
            r8 = 2
            r9 = 0
            java.lang.String r5 = "Internet Not Connected"
            r6 = 0
            r7 = 1
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        L4b:
            com.nytimes.android.subauth.core.auth.network.response.a r13 = r10.p
            if (r13 != 0) goto L88
            com.nytimes.android.subauth.core.util.NetworkUtils r13 = com.nytimes.android.subauth.core.util.NetworkUtils.a     // Catch: java.lang.Exception -> L29
            java.lang.Class<com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse> r2 = com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse.class
            com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$response$1 r4 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$response$1     // Catch: java.lang.Exception -> L29
            r5 = 0
            r4.<init>(r12, r10, r11, r5)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r13 = r13.a(r2, r4, r0)     // Catch: java.lang.Exception -> L29
            if (r13 != r1) goto L62
            return r1
        L62:
            com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse r13 = (com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse) r13     // Catch: java.lang.Exception -> L29
            if (r13 == 0) goto L6c
            r3$b r10 = new r3$b     // Catch: java.lang.Exception -> L29
            r10.<init>(r13)     // Catch: java.lang.Exception -> L29
            goto L98
        L6c:
            r3$a r10 = new r3$a     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "No response"
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L29
            goto L98
        L79:
            r3$a r11 = new r3$a
            java.lang.String r12 = r10.getMessage()
            if (r12 != 0) goto L83
            java.lang.String r12 = "Unknown"
        L83:
            r11.<init>(r12, r10, r3)
            r10 = r11
            goto L98
        L88:
            r3$b r10 = new r3$b
            com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse r12 = new com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse
            com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponseData$a r0 = com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponseData.Companion
            com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponseData r11 = r0.a(r13, r11)
            r12.<init>(r11)
            r10.<init>(r12)
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.n(java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.q98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r11, java.lang.String r12, defpackage.by0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingRegister$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingRegister$1 r0 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingRegister$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingRegister$1 r0 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$devSettingRegister$1
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.f.b(r13)
            goto L48
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.f.b(r13)
            r7.label = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 28
            r9 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            java.lang.Object r13 = o98.a.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L48
            return r0
        L48:
            oa4 r13 = (defpackage.oa4) r13
            xn1 r10 = defpackage.pa4.c(r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.o(java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.o98
    public Object p(androidx.fragment.app.f fVar, String str, String str2, RegiInterface regiInterface, by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Login with Google SSO", new Object[0]);
        Map map = this.h;
        i77.b bVar = i77.b.b;
        g77 g77Var = (g77) map.get(bVar);
        if (g77Var != null) {
            return l0(bVar, g77Var, fVar, str, str2, regiInterface, by0Var);
        }
        throw new SubauthSetupException("Google SSO not setup");
    }

    @Override // defpackage.o98
    public Object q(by0 by0Var) {
        return BuildersKt.withContext(this.o, new SubauthUserManager$deleteAccount$2(this, null), by0Var);
    }

    @Override // defpackage.q98
    public Map r() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SubauthUserManager$blockingCookies$1(this, null), 1, null);
        return (Map) runBlocking$default;
    }

    @Override // defpackage.o98
    public Object s(String str, String str2, RegiInterface regiInterface, by0 by0Var) {
        if (h.c1(str).toString().length() != 0 && h.c1(str2).toString().length() != 0) {
            return T(LoginMethod.LoginCredentials, new SubauthUserManager$login$2(this, str, str2, regiInterface, null), by0Var);
        }
        return new oa4.b(new LoginError(null, cc0.c(101), null, "Invalid Input. Email or Password are Empty.", 5, null), LoginMethod.LoginCredentials, null, null, null, null, false, 124, null);
    }

    @Override // defpackage.o98
    public Object t(androidx.fragment.app.f fVar, by0 by0Var) {
        Object obj = this.h.get(i77.b.b);
        i13 i13Var = obj instanceof i13 ? (i13) obj : null;
        if (i13Var == null) {
            throw new SubauthSetupException("Google SSO not setup");
        }
        LoginMethod loginMethod = LoginMethod.GoogleSSO;
        return T(loginMethod, new SubauthUserManager$smartLock$2(i13Var, fVar, this, loginMethod, null), by0Var);
    }

    @Override // defpackage.o98
    public Object u(String str, String str2, by0 by0Var) {
        yl7 yl7Var = this.s;
        return yl7Var == null ? BuildersKt.withContext(this.o, new SubauthUserManager$setPasswordWithToken$2(this, str, str2, null), by0Var) : yl7Var;
    }

    @Override // defpackage.q98
    public void v(tl5 tl5Var) {
        this.q = tl5Var != null ? wy6.a(tl5Var) : null;
    }

    @Override // defpackage.o98
    public Object w(String str, String str2, String str3, String str4, RegiInterface regiInterface, by0 by0Var) {
        if (h.c1(str).toString().length() != 0 && h.c1(str2).toString().length() != 0) {
            return T(LoginMethod.RegisterCredentials, new SubauthUserManager$register$2(this, regiInterface, str, str2, str3, str4, null), by0Var);
        }
        return new oa4.b(new LoginError(null, cc0.c(ContentType.LONG_FORM_ON_DEMAND), null, "Invalid Input. Email or Password are Empty.", 5, null), LoginMethod.RegisterCredentials, null, null, null, null, false, 124, null);
    }

    @Override // defpackage.q98
    public void x() {
        BuildersKt__BuildersKt.runBlocking$default(null, new SubauthUserManager$expireNYTSCookie$1(this, null), 1, null);
    }

    @Override // defpackage.o98
    public Object y(String str, String str2, by0 by0Var) {
        com.nytimes.android.subauth.core.auth.models.c cVar = this.r;
        return cVar == null ? BuildersKt.withContext(this.o, new SubauthUserManager$verifyEmailWithCode$2(this, str, str2, null), by0Var) : cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(com.nytimes.android.subauth.core.api.listeners.LogoutSource r10, defpackage.by0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.nytimes.android.subauth.core.auth.SubauthUserManager$logout$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.subauth.core.auth.SubauthUserManager$logout$1 r0 = (com.nytimes.android.subauth.core.auth.SubauthUserManager$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.SubauthUserManager$logout$1 r0 = new com.nytimes.android.subauth.core.auth.SubauthUserManager$logout$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L5f
            if (r2 == r7) goto L57
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            kotlin.f.b(r11)
            goto La9
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r9 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r9
            kotlin.f.b(r11)
            goto L9c
        L47:
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r9 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r9
            kotlin.f.b(r11)
            goto L8e
        L4f:
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r9 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r9
            kotlin.f.b(r11)
            goto L81
        L57:
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.subauth.core.auth.SubauthUserManager r9 = (com.nytimes.android.subauth.core.auth.SubauthUserManager) r9
            kotlin.f.b(r11)
            goto L74
        L5f:
            kotlin.f.b(r11)
            com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager r11 = r9.n
            r11.m(r10)
            c05 r10 = r9.f
            r0.L$0 = r9
            r0.label = r7
            java.lang.Object r10 = r10.l(r8, r0)
            if (r10 != r1) goto L74
            return r1
        L74:
            c05 r10 = r9.f
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.u(r8, r0)
            if (r10 != r1) goto L81
            return r1
        L81:
            xz8 r10 = r9.e
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L8e
            return r1
        L8e:
            mg8 r10 = r9.l
            r0.L$0 = r9
            r0.label = r4
            r11 = 0
            java.lang.Object r10 = mg8.a.a(r10, r11, r0, r7, r8)
            if (r10 != r1) goto L9c
            return r1
        L9c:
            kl7 r9 = r9.g
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager.z(com.nytimes.android.subauth.core.api.listeners.LogoutSource, by0):java.lang.Object");
    }

    public /* synthetic */ SubauthUserManager(Resources resources, NYTUser nYTUser, UserAPI userAPI, w88 w88Var, xz8 xz8Var, c05 c05Var, kl7 kl7Var, Map map, ss2 ss2Var, String str, String str2, mg8 mg8Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, nYTUser, userAPI, w88Var, xz8Var, c05Var, kl7Var, (i & 128) != 0 ? new LinkedHashMap() : map, ss2Var, str, str2, mg8Var, ba1Var, subauthListenerManager, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
