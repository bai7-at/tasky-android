package com.nytimes.android.subauth.core.auth.cookies;

import android.content.SharedPreferences;
import android.webkit.CookieManager;
import androidx.datastore.preferences.core.PreferencesKt;
import co.datadome.sdk.c;
import com.nytimes.android.subauth.core.auth.cookies.CookieMonster;
import defpackage.ba1;
import defpackage.by0;
import defpackage.c05;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jy0;
import defpackage.p96;
import defpackage.s16;
import defpackage.so;
import defpackage.u16;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.z38;
import defpackage.zq3;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class CookieMonster implements c05 {
    public static final a Companion = new a(null);
    private static final List h = i.o("NYT-S", "NYT-MPS", "nyt-a");
    private static final s16.a i = u16.f("NYT-S");
    private static final s16.a j = u16.e("NYT-S_expiration");
    private static final s16.a k = u16.e("lastPollNyt");
    private final CookieManager a;
    private final jy0 b;
    private final ba1 c;
    private final SharedPreferences d;
    private final CoroutineScope e;
    private MutableStateFlow f;
    private boolean g;

    @fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster$1", f = "CookieMonster.kt", l = {54, 55}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.cookies.CookieMonster$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return CookieMonster.this.new AnonymousClass1(by0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
                kotlin.f.b(r5)
                goto L4d
            L16:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1e:
                kotlin.f.b(r5)
                goto L30
            L22:
                kotlin.f.b(r5)
                com.nytimes.android.subauth.core.auth.cookies.CookieMonster r5 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.this
                r4.label = r3
                java.lang.Object r5 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.j(r5, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                com.nytimes.android.subauth.core.auth.cookies.CookieMonster r5 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.this
                kotlinx.coroutines.flow.MutableStateFlow r5 = r5.y()
                com.nytimes.android.subauth.core.auth.cookies.CookieMonster r1 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.this
                ba1 r1 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.e(r1)
                kotlinx.coroutines.flow.Flow r1 = r1.getData()
                r4.L$0 = r5
                r4.label = r2
                java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r1, r4)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r0 = r5
                r5 = r1
            L4d:
                s16 r5 = (defpackage.s16) r5
                if (r5 == 0) goto L5c
                s16$a r1 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.i()
                java.lang.Object r5 = r5.c(r1)
                java.lang.String r5 = (java.lang.String) r5
                goto L5d
            L5c:
                r5 = 0
            L5d:
                r0.setValue(r5)
                com.nytimes.android.subauth.core.auth.cookies.CookieMonster r4 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.this
                r4.F(r3)
                ww8 r4 = defpackage.ww8.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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

        public final s16.a a() {
            return CookieMonster.k;
        }

        private a() {
        }
    }

    public CookieMonster(CookieManager cookieManager, jy0 jy0Var, ba1 ba1Var, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(cookieManager, "cookieManager");
        zq3.h(jy0Var, "cookieDatabaseProvider");
        zq3.h(ba1Var, "dataStore");
        zq3.h(sharedPreferences, "defaultSharedPrefs");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = cookieManager;
        this.b = jy0Var;
        this.c = ba1Var;
        this.d = sharedPreferences;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.e = CoroutineScope;
        this.f = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    private final boolean B(long j2) {
        return System.currentTimeMillis() - j2 >= 120000;
    }

    private final Object C(s16 s16Var, String str, by0 by0Var) {
        Object f;
        String str2 = (String) s16Var.c(u16.f(str));
        return (str2 == null || (f = f(str, str2, by0Var)) != kotlin.coroutines.intrinsics.a.h()) ? ww8.a : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$migrateOldCookies$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$migrateOldCookies$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$migrateOldCookies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$migrateOldCookies$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$migrateOldCookies$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$1
            s16 r2 = (defpackage.s16) r2
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r4 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r4
            kotlin.f.b(r7)
            goto L8b
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r6 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r6
            kotlin.f.b(r7)
            goto L7c
        L4b:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r6 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r6
            kotlin.f.b(r7)
            goto L63
        L53:
            kotlin.f.b(r7)
            jy0 r7 = r6.b
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.h(r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto La6
            ba1 r7 = r6.c
            kotlinx.coroutines.flow.Flow r7 = r7.getData()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r7, r0)
            if (r7 != r1) goto L7c
            return r1
        L7c:
            s16 r7 = (defpackage.s16) r7
            if (r7 == 0) goto La6
            java.util.List r2 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.h
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r6
            r6 = r2
            r2 = r7
        L8b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La6
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.C(r2, r7, r0)
            if (r7 != r1) goto L8b
            return r1
        La6:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.D(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response E(CookieMonster cookieMonster, Interceptor.Chain chain) {
        zq3.h(cookieMonster, "this$0");
        zq3.h(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String str = (String) cookieMonster.f.getValue();
        if (str != null && str.length() != 0) {
            z38 z38Var = z38.a;
            String format = String.format(Locale.getDefault(), "%s=%s; Domain=%s; Path=/", Arrays.copyOf(new Object[]{"NYT-S", str, "nytimes.com"}, 3));
            zq3.g(format, "format(...)");
            newBuilder.addHeader(c.HTTP_HEADER_COOKIE, format);
        }
        return chain.proceed(newBuilder.build());
    }

    private final void w(String str, String str2, String str3) {
        CookieManager cookieManager = this.a;
        z38 z38Var = z38.a;
        String format = String.format(Locale.getDefault(), "%s=%s; Domain=%s; Path=/", Arrays.copyOf(new Object[]{str2, str3, "nytimes.com"}, 3));
        zq3.g(format, "format(...)");
        cookieManager.setCookie(str, format);
    }

    private final void x(String str, String str2) {
        w(str, str2, "");
    }

    public String A() {
        return this.d.getString("Purr.TCF.Tcf_String", null);
    }

    public final void F(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getCookie$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getCookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getCookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getCookie$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r8)
            goto L71
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.f.b(r8)
            goto L65
        L3b:
            kotlin.f.b(r8)
            goto L53
        L3f:
            kotlin.f.b(r8)
            java.lang.String r8 = "NYT-S"
            boolean r8 = defpackage.zq3.c(r7, r8)
            if (r8 == 0) goto L54
            r0.label = r5
            java.lang.Object r8 = r6.q(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            return r8
        L54:
            java.lang.String r8 = "NYT-MPS"
            boolean r8 = defpackage.zq3.c(r7, r8)
            if (r8 == 0) goto L66
            r0.label = r4
            java.lang.Object r8 = r6.s(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            return r8
        L66:
            jy0 r6 = r6.b
            r0.label = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            gy0 r8 = (defpackage.gy0) r8
            if (r8 == 0) goto L7a
            java.lang.String r6 = r8.b()
            goto L7b
        L7a:
            r6 = 0
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.a(java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.c(java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:11:0x0060->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getAllCookies$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getAllCookies$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getAllCookies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getAllCookies$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getAllCookies$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r4 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r4
            kotlin.f.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            jy0 r5 = r4.b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = 10
            int r0 = kotlin.collections.i.w(r5, r0)
            int r0 = kotlin.collections.t.e(r0)
            r1 = 16
            int r0 = defpackage.uo6.d(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r5.next()
            gy0 r0 = (defpackage.gy0) r0
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = r0.a()
            java.lang.String r0 = r0.b()
            r2.<init>(r3, r0)
            java.lang.Object r0 = r2.c()
            java.lang.Object r2 = r2.d()
            r1.put(r0, r2)
            goto L60
        L85:
            java.util.Map r5 = kotlin.collections.t.x(r1)
            java.lang.String r4 = r4.A()
            if (r4 == 0) goto L97
            java.lang.String r0 = "fides_string"
            java.lang.Object r4 = r5.put(r0, r4)
            java.lang.String r4 = (java.lang.String) r4
        L97:
            java.lang.String r4 = "fides_disable_banner"
            java.lang.String r0 = "true"
            r5.put(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.d(by0):java.lang.Object");
    }

    @Override // defpackage.c05
    public Object f(String str, String str2, by0 by0Var) {
        if (zq3.c(str, "NYT-S")) {
            Object l = l(str2, by0Var);
            return l == kotlin.coroutines.intrinsics.a.h() ? l : ww8.a;
        }
        if (zq3.c(str, "NYT-MPS")) {
            Object u = u(str2, by0Var);
            return u == kotlin.coroutines.intrinsics.a.h() ? u : ww8.a;
        }
        Object f = this.b.f(str, str2, by0Var);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    @Override // defpackage.c05
    public Object k(String str, by0 by0Var) {
        Object f = this.b.f("override-purr", str, by0Var);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r10, defpackage.by0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.f.b(r11)
            goto La3
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r4 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r4
            kotlin.f.b(r11)
            goto L8a
        L47:
            java.lang.Object r9 = r0.L$1
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r9 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r9
            kotlin.f.b(r11)
            goto L68
        L54:
            kotlin.f.b(r11)
            jy0 r11 = r9.b
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r5
            java.lang.String r2 = "NYT-S"
            java.lang.Object r11 = r11.f(r2, r10, r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            kotlinx.coroutines.flow.MutableStateFlow r11 = r9.f
            r11.setValue(r10)
            long r7 = java.lang.System.currentTimeMillis()
            ba1 r11 = r9.c
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$2 r2 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$2
            r2.<init>(r10, r7, r6)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r11 = androidx.datastore.preferences.core.PreferencesKt.a(r11, r2, r0)
            if (r11 != r1) goto L87
            return r1
        L87:
            r4 = r9
            r2 = r10
            r9 = r7
        L8a:
            if (r2 == 0) goto L8d
            goto L8f
        L8d:
            r9 = -1
        L8f:
            ba1 r11 = r4.c
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$3 r2 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$3
            r2.<init>(r9, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = androidx.datastore.preferences.core.PreferencesKt.a(r11, r2, r0)
            if (r9 != r1) goto La3
            return r1
        La3:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.l(java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.c05
    public String m(boolean z) {
        Object runBlocking$default;
        if (this.g || !z) {
            return (String) this.f.getValue();
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new CookieMonster$getCachedNYTSCookie$preferences$1(this, null), 1, null);
        s16 s16Var = (s16) runBlocking$default;
        if (s16Var != null) {
            return (String) s16Var.c(i);
        }
        return null;
    }

    @Override // defpackage.c05
    public Object n(by0 by0Var) {
        Object a2 = PreferencesKt.a(this.c, new CookieMonster$expireNYTSCookie$2(null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$isNYTSCookieValid$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$isNYTSCookieValid$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$isNYTSCookieValid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$isNYTSCookieValid$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$isNYTSCookieValid$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster r4 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster) r4
            kotlin.f.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            ba1 r5 = r4.c
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            s16 r5 = (defpackage.s16) r5
            if (r5 == 0) goto L56
            s16$a r0 = com.nytimes.android.subauth.core.auth.cookies.CookieMonster.j
            java.lang.Object r5 = r5.c(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            goto L57
        L56:
            r5 = 0
        L57:
            if (r5 == 0) goto L64
            long r0 = r5.longValue()
            boolean r4 = r4.B(r0)
            if (r4 != 0) goto L64
            goto L65
        L64:
            r3 = 0
        L65:
            java.lang.Boolean r4 = defpackage.cc0.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.o(by0):java.lang.Object");
    }

    @Override // defpackage.c05
    public Interceptor p() {
        return new Interceptor() { // from class: ky0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response E;
                E = CookieMonster.E(CookieMonster.this, chain);
                return E;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTSCookie$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTSCookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTSCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTSCookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTSCookie$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            jy0 r4 = r4.b
            r0.label = r3
            java.lang.String r5 = "NYT-S"
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            gy0 r5 = (defpackage.gy0) r5
            if (r5 == 0) goto L4a
            java.lang.String r4 = r5.b()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.q(by0):java.lang.Object");
    }

    @Override // defpackage.c05
    public void r(String str) {
        CookieManager cookieManager = this.a;
        z38 z38Var = z38.a;
        Locale locale = Locale.getDefault();
        if (str == null) {
            str = "";
        }
        String format = String.format(locale, p96.COOKIE_FMT, Arrays.copyOf(new Object[]{p96.TCF_COOKIE, str}, 2));
        zq3.g(format, "format(...)");
        cookieManager.setCookie(p96.NYT_DOMAIN, format);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTMPSCookie$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTMPSCookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTMPSCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTMPSCookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTMPSCookie$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            jy0 r4 = r4.b
            r0.label = r3
            java.lang.String r5 = "NYT-MPS"
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            gy0 r5 = (defpackage.gy0) r5
            if (r5 == 0) goto L4a
            java.lang.String r4 = r5.b()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.s(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTACookie$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTACookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTACookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTACookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getNYTACookie$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            jy0 r4 = r4.b
            r0.label = r3
            java.lang.String r5 = "nyt-a"
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            gy0 r5 = (defpackage.gy0) r5
            if (r5 == 0) goto L4a
            java.lang.String r4 = r5.b()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.t(by0):java.lang.Object");
    }

    @Override // defpackage.c05
    public Object u(String str, by0 by0Var) {
        Object f = this.b.f("NYT-MPS", str, by0Var);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    @Override // defpackage.c05
    public Object v(String str, String str2, boolean z, by0 by0Var) {
        so soVar = new so();
        soVar.put("NYT-S", str);
        if (str2 != null) {
            soVar.put("NYT-MPS", str2);
        }
        try {
            return c05.Companion.a(soVar, z);
        } catch (UnsupportedEncodingException e) {
            ul8.a.z("SUBAUTH").f(e, "Unable to convert NYT Cookies: " + str + ", " + str2, new Object[0]);
            return null;
        }
    }

    public final MutableStateFlow y() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getPurrCookie$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getPurrCookie$1 r0 = (com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getPurrCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getPurrCookie$1 r0 = new com.nytimes.android.subauth.core.auth.cookies.CookieMonster$getPurrCookie$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            jy0 r4 = r4.b
            r0.label = r3
            java.lang.String r5 = "override-purr"
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            gy0 r5 = (defpackage.gy0) r5
            if (r5 == 0) goto L4a
            java.lang.String r4 = r5.b()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.cookies.CookieMonster.z(by0):java.lang.Object");
    }

    public /* synthetic */ CookieMonster(CookieManager cookieManager, jy0 jy0Var, ba1 ba1Var, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cookieManager, jy0Var, ba1Var, sharedPreferences, (i2 & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
