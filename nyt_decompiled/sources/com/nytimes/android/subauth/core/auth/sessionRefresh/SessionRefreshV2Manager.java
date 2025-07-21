package com.nytimes.android.subauth.core.auth.sessionRefresh;

import android.content.res.Resources;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.cookies.CookieMonster;
import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.util.ControlledRunner;
import com.nytimes.android.subauth.core.util.CoroutineDataStorePoller;
import defpackage.ba1;
import defpackage.by0;
import defpackage.c05;
import defpackage.kl7;
import defpackage.r35;
import defpackage.ul8;
import defpackage.w88;
import defpackage.ww8;
import defpackage.xz8;
import defpackage.zq3;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.Headers;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class SessionRefreshV2Manager implements kl7 {
    public static final a Companion = new a(null);
    private final Resources a;
    private final NYTSubauthPollAPI b;
    private final xz8 c;
    private final c05 d;
    private final r35 e;
    private final String f;
    private final w88 g;
    private final ba1 h;
    private final SubauthListenerManager i;
    private final ConcurrentLinkedQueue j;
    private final CoroutineScope k;
    private final ControlledRunner l;
    private final CoroutineDataStorePoller m;
    private final long n;
    private Job o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SessionRefreshV2Manager(Resources resources, NYTSubauthPollAPI nYTSubauthPollAPI, xz8 xz8Var, c05 c05Var, r35 r35Var, String str, w88 w88Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(resources, "resources");
        zq3.h(nYTSubauthPollAPI, "pollAPI");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(r35Var, "networkConfig");
        zq3.h(str, "lireClientId");
        zq3.h(w88Var, "networkStatus");
        zq3.h(ba1Var, "dataStore");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = resources;
        this.b = nYTSubauthPollAPI;
        this.c = xz8Var;
        this.d = c05Var;
        this.e = r35Var;
        this.f = str;
        this.g = w88Var;
        this.h = ba1Var;
        this.i = subauthListenerManager;
        this.j = new ConcurrentLinkedQueue();
        this.k = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.l = new ControlledRunner();
        this.m = new CoroutineDataStorePoller(ba1Var, CookieMonster.Companion.a(), false, coroutineDispatcher, new SessionRefreshV2Manager$sessionRefreshPoller$1(this, null));
        this.n = (long) b.b.a(110.0d, DurationUnit.SECONDS, DurationUnit.MILLISECONDS);
    }

    private final Object o(by0 by0Var) {
        Object a2 = PreferencesKt.a(this.h, new SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2(null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0035, IOException -> 0x0038, TryCatch #2 {IOException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x0031, B:14:0x0096, B:15:0x00aa, B:22:0x0053, B:24:0x006c, B:26:0x0070, B:29:0x009d, B:31:0x005b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[Catch: Exception -> 0x0035, IOException -> 0x0038, TryCatch #2 {IOException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x0031, B:14:0x0096, B:15:0x00aa, B:22:0x0053, B:24:0x006c, B:26:0x0070, B:29:0x009d, B:31:0x005b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r10, java.util.Map r11, boolean r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.p(java.lang.String, java.util.Map, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$getOverrideResult$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$getOverrideResult$1 r0 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$getOverrideResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$getOverrideResult$1 r0 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$getOverrideResult$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager r4 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager) r4
            kotlin.f.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            ba1 r5 = r4.h
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            s16 r5 = (defpackage.s16) r5
            r0 = 0
            if (r5 == 0) goto L5b
            java.lang.String r1 = "com.nytimes.android.subauth.common_override_session_refresh_v2"
            s16$a r1 = defpackage.u16.f(r1)
            java.lang.Object r5 = r5.c(r1)
            java.lang.String r5 = (java.lang.String) r5
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L66
            c68 r0 = defpackage.c68.a
            android.content.res.Resources r4 = r4.a
            com.nytimes.android.subauth.core.auth.network.response.c r0 = r0.a(r4, r5)
        L66:
            ul8$b r4 = defpackage.ul8.a
            java.lang.String r5 = "SUBAUTH"
            ul8$c r4 = r4.z(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Overridden Session Refresh Response: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4.a(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.q(by0):java.lang.Object");
    }

    private final void r(c.a aVar, String str, boolean z) {
        this.i.M(aVar, str, z);
        if (z) {
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((kl7.a) it2.next()).f(aVar, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(c cVar, String str, by0 by0Var) {
        if (cVar instanceof c.b) {
            Object t = t((c.b) cVar, by0Var);
            return t == kotlin.coroutines.intrinsics.a.h() ? t : ww8.a;
        }
        if (cVar instanceof c.a.C0415c) {
            r((c.a) cVar, str, true);
        } else if (cVar instanceof c.a.C0414a) {
            r((c.a) cVar, str, true);
        } else if (cVar instanceof c.a.b) {
            r((c.a) cVar, str, false);
        } else if (cVar instanceof c.a.e) {
            r((c.a) cVar, str, false);
        } else if (cVar instanceof c.a.d) {
            r((c.a) cVar, str, false);
        } else if (cVar instanceof c.a.f) {
            r((c.a) cVar, str, false);
        }
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.nytimes.android.subauth.core.auth.network.response.c.b r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$handleSessionRefreshSuccess$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$handleSessionRefreshSuccess$1 r0 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$handleSessionRefreshSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$handleSessionRefreshSuccess$1 r0 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$handleSessionRefreshSuccess$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager r5 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager) r5
            kotlin.f.b(r7)
            goto L50
        L3c:
            kotlin.f.b(r7)
            java.lang.String r6 = r6.a()
            c05 r7 = r5.d
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r7.l(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            xz8 r5 = r5.c
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            r7 = 0
            java.lang.Object r5 = xz8.a.a(r5, r7, r0, r4, r6)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.t(com.nytimes.android.subauth.core.auth.network.response.c$b, by0):java.lang.Object");
    }

    private final c u(Response response) {
        Pair<? extends String, ? extends String> pair;
        Object obj;
        int code = response.code();
        if (code != 200) {
            return code != 400 ? code != 500 ? code != 503 ? new c.a.f(response.message()) : c.a.e.d : new c.a.b(response.message()) : new c.a.C0414a(response.message());
        }
        Headers headers = response.headers();
        zq3.g(headers, "headers(...)");
        Iterator<Pair<? extends String, ? extends String>> it2 = headers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                pair = null;
                break;
            }
            pair = it2.next();
            if (zq3.c(pair.c(), "set-cookie")) {
                break;
            }
        }
        Pair<? extends String, ? extends String> pair2 = pair;
        List<HttpCookie> parse = HttpCookie.parse(pair2 != null ? (String) pair2.d() : null);
        zq3.e(parse);
        Iterator<T> it3 = parse.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (zq3.c(((HttpCookie) obj).getName(), "NYT-S")) {
                break;
            }
        }
        HttpCookie httpCookie = (HttpCookie) obj;
        String value = httpCookie != null ? httpCookie.getValue() : null;
        return (value == null || h.d0(value)) ? new c.a.C0415c(response.message()) : new c.b(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(boolean r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$2
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$2 r0 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$2 r0 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            com.nytimes.android.subauth.core.util.CoroutineDataStorePoller r6 = (com.nytimes.android.subauth.core.util.CoroutineDataStorePoller) r6
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.subauth.core.auth.network.response.c r6 = (com.nytimes.android.subauth.core.auth.network.response.c) r6
            kotlin.f.b(r8)
            goto L6d
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager r6 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager) r6
            kotlin.f.b(r8)
            goto L5a
        L44:
            kotlin.f.b(r8)
            com.nytimes.android.subauth.core.util.ControlledRunner r8 = r6.l
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1 r2 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1
            r5 = 0
            r2.<init>(r6, r7, r5)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r7 = r8
            com.nytimes.android.subauth.core.auth.network.response.c r7 = (com.nytimes.android.subauth.core.auth.network.response.c) r7
            com.nytimes.android.subauth.core.util.CoroutineDataStorePoller r6 = r6.m
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r6 = r7
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.v(boolean, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.kl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$onLogout$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$onLogout$1 r0 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$onLogout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$onLogout$1 r0 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$onLogout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager r4 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager) r4
            kotlin.f.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            xz8 r5 = r4.c
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "SUBAUTH"
            ul8$c r5 = r5.z(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Logged out, cancelling session refresh poll"
            r5.a(r1, r0)
            kotlinx.coroutines.Job r4 = r4.o
            if (r4 == 0) goto L61
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            r5.<init>(r1)
            r4.cancel(r5)
        L61:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.a(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.kl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$restartSessionRefreshPolling$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$restartSessionRefreshPolling$1 r0 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$restartSessionRefreshPolling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$restartSessionRefreshPolling$1 r0 = new com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$restartSessionRefreshPolling$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager r5 = (com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager) r5
            kotlin.f.b(r6)
            goto L61
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            ul8$b r6 = defpackage.ul8.a
            java.lang.String r2 = "SUBAUTH"
            ul8$c r6 = r6.z(r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Restarting Session Refresh Polling"
            r6.a(r4, r2)
            kotlinx.coroutines.Job r6 = r5.o
            if (r6 == 0) goto L56
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r4 = "Starting new session refresh v2 polling job"
            r2.<init>(r4)
            r6.cancel(r2)
        L56:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r5.o(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            com.nytimes.android.subauth.core.util.CoroutineDataStorePoller r6 = r5.m
            long r0 = r5.n
            kotlinx.coroutines.flow.Flow r6 = r6.f(r0)
            kotlinx.coroutines.CoroutineScope r0 = r5.k
            kotlinx.coroutines.Job r6 = kotlinx.coroutines.flow.FlowKt.launchIn(r6, r0)
            r5.o = r6
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager.b(by0):java.lang.Object");
    }

    @Override // defpackage.kl7
    public Object c(by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Run Session Refresh", new Object[0]);
        return v(false, by0Var);
    }

    @Override // defpackage.kl7
    public void d(kl7.a aVar) {
        zq3.h(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.j.add(aVar);
    }

    @Override // defpackage.kl7
    public Object e(by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Force Session Refresh (hits SubInfo gets latest entitlements)", new Object[0]);
        return v(true, by0Var);
    }

    public /* synthetic */ SessionRefreshV2Manager(Resources resources, NYTSubauthPollAPI nYTSubauthPollAPI, xz8 xz8Var, c05 c05Var, r35 r35Var, String str, w88 w88Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, nYTSubauthPollAPI, xz8Var, c05Var, r35Var, str, w88Var, ba1Var, subauthListenerManager, (i & 512) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
