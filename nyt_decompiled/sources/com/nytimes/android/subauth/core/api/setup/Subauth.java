package com.nytimes.android.subauth.core.api.setup;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.webkit.CookieManager;
import androidx.preference.g;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import com.nytimes.android.subauth.core.di.SubauthModule;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.network.Environment;
import com.nytimes.android.subauth.core.util.SubauthSetupException;
import defpackage.a98;
import defpackage.b98;
import defpackage.c05;
import defpackage.c96;
import defpackage.d68;
import defpackage.e68;
import defpackage.f22;
import defpackage.h68;
import defpackage.h98;
import defpackage.k78;
import defpackage.kl7;
import defpackage.n71;
import defpackage.o98;
import defpackage.p78;
import defpackage.q98;
import defpackage.qs2;
import defpackage.r35;
import defpackage.ss2;
import defpackage.u68;
import defpackage.xz8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class Subauth {
    public static final b Companion = new b(null);
    private final ss2 a;
    private final c b;
    private final d68 c;
    private final CoroutineScope d;
    private Boolean e;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {
        private final long a;
        private final TimeUnit b;

        public c(long j, TimeUnit timeUnit) {
            zq3.h(timeUnit, "dntTimeoutTimeUnit");
            this.a = j;
            this.b = timeUnit;
        }

        public final long a() {
            return this.b.toMillis(this.a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PurrConfig(dntTimeoutDuration=" + this.a + ", dntTimeoutTimeUnit=" + this.b + ")";
        }
    }

    private Subauth(Application application, List list, String str, r35 r35Var, Environment environment, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, String str2, CookieManager cookieManager, h98 h98Var, boolean z, boolean z2, boolean z3, String str3, c96 c96Var, c cVar, UserSubscriptionProduct userSubscriptionProduct, List list2, CoroutineDispatcher coroutineDispatcher) {
        this.a = ss2Var2;
        this.b = cVar;
        this.d = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        Context applicationContext = application.getApplicationContext();
        Resources resources = application.getResources();
        Subauth$subauthDependencyProvider$1 subauth$subauthDependencyProvider$1 = new Subauth$subauthDependencyProvider$1(this);
        zq3.e(applicationContext);
        zq3.e(resources);
        e68 a2 = n71.a().b(new h68()).e(new SubauthNetworkModule()).d(new SubauthModule()).c(new u68(application, applicationContext, resources, environment, list, str, r35Var, qs2Var, ss2Var, subauth$subauthDependencyProvider$1, str2, cookieManager, h98Var, z, z2, z3, str3, c96Var, cVar, userSubscriptionProduct)).a();
        zq3.g(a2, "build(...)");
        this.c = a2;
        r();
        t(h98Var, application);
        s(list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$1 r0 = (com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$1 r0 = new com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            com.nytimes.android.subauth.core.api.setup.Subauth r6 = (com.nytimes.android.subauth.core.api.setup.Subauth) r6
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.subauth.core.api.setup.Subauth r0 = (com.nytimes.android.subauth.core.api.setup.Subauth) r0
            kotlin.f.b(r7)
            goto L5a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.f.b(r7)
            java.lang.Boolean r7 = r6.e
            if (r7 != 0) goto L66
            com.nytimes.android.subauth.core.api.setup.Subauth$c r7 = r6.b
            long r4 = r7.a()
            com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$2 r7 = new com.nytimes.android.subauth.core.api.setup.Subauth$doNotTrackWithTimeout$2
            r2 = 0
            r7.<init>(r6, r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r0 = r6
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L63
            r7 = 0
            java.lang.Boolean r7 = defpackage.cc0.a(r7)
        L63:
            r6.e = r7
            r6 = r0
        L66:
            java.lang.Boolean r6 = r6.e
            defpackage.zq3.e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.api.setup.Subauth.d(by0):java.lang.Object");
    }

    private final void r() {
        this.c.k().d(this.c.r());
    }

    private final void s(List list) {
        SubauthListenerManager o = this.c.o();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            o.Y((k78) it2.next());
        }
    }

    private final void t(h98 h98Var, Application application) {
        if (h98Var != null) {
            h98Var.b(this.c.s(), this.c.j());
            h98Var.a(application);
        }
    }

    public b98 e() {
        return this.c.q();
    }

    public q98 f() {
        return this.c.r();
    }

    public p78 g() {
        return this.c.u();
    }

    public c05 h() {
        return this.c.t();
    }

    public NYTUser i() {
        return this.c.h();
    }

    public a98 j() {
        return this.c.q();
    }

    public com.nytimes.android.subauth.core.purr.a k() {
        return this.c.n();
    }

    public PurrDirectiveOverrider l() {
        return this.c.i();
    }

    public kl7 m() {
        return this.c.k();
    }

    public SubauthEnvironment n() {
        return this.c.s();
    }

    public SubauthListenerManager o() {
        return this.c.o();
    }

    public o98 p() {
        return this.c.r();
    }

    public xz8 q() {
        return this.c.p();
    }

    public final void u() {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new Subauth$startup$1(this, null), 3, null);
    }

    public static final class a {
        private Application a;
        private Environment b;
        private List c;
        private String d;
        private r35 e;
        private qs2 f;
        private c96 g;
        private String h;
        private ss2 i;
        private ss2 j;
        private String k;
        private kl7 l;
        private CookieManager m;
        private h98 n;
        private boolean o;
        private boolean p;
        private boolean q;
        private long r;
        private TimeUnit s;
        private UserSubscriptionProduct t;
        private List u;

        public a(Application application, Environment environment, List list, String str, r35 r35Var, qs2 qs2Var, c96 c96Var, String str2, ss2 ss2Var, ss2 ss2Var2, String str3, kl7 kl7Var, CookieManager cookieManager, h98 h98Var, boolean z, boolean z2, boolean z3, long j, TimeUnit timeUnit, UserSubscriptionProduct userSubscriptionProduct, List list2) {
            zq3.h(timeUnit, "dntTimeoutTimeUnit");
            zq3.h(list2, "subauthListeners");
            this.a = application;
            this.b = environment;
            this.c = list;
            this.d = str;
            this.e = r35Var;
            this.f = qs2Var;
            this.g = c96Var;
            this.h = str2;
            this.i = ss2Var;
            this.j = ss2Var2;
            this.k = str3;
            this.l = kl7Var;
            this.m = cookieManager;
            this.n = h98Var;
            this.o = z;
            this.p = z2;
            this.q = z3;
            this.r = j;
            this.s = timeUnit;
            this.t = userSubscriptionProduct;
            this.u = list2;
        }

        private final void i() {
            if (m()) {
                throw new SubauthSetupException("Missing required Subauth parameters.");
            }
            if (l()) {
                throw new SubauthSetupException("Missing required PURR parameters.");
            }
            if (this.t == null) {
                throw new SubauthSetupException("Missing required `clientAppSubscriptionProduct` specified for app.");
            }
        }

        private final boolean l() {
            return this.h == null || this.j == null || this.g == null;
        }

        private final boolean m() {
            return this.a == null || this.e == null || this.c == null || this.f == null || this.i == null || this.k == null || this.b == null;
        }

        public final a a(ss2 ss2Var) {
            zq3.h(ss2Var, "agentIdFunc");
            this.i = ss2Var;
            return this;
        }

        public final a b(Application application) {
            zq3.h(application, "application");
            this.a = application;
            return this;
        }

        public final Subauth c() {
            i();
            Application application = this.a;
            zq3.e(application);
            SharedPreferences b = g.b(application.getApplicationContext());
            zq3.e(b);
            Environment a = f22.a(b);
            if (a == null && (a = this.b) == null) {
                a = Environment.PRODUCTION;
            }
            Environment environment = a;
            Application application2 = this.a;
            zq3.e(application2);
            List list = this.c;
            zq3.e(list);
            String str = this.d;
            r35 r35Var = this.e;
            zq3.e(r35Var);
            qs2 qs2Var = this.f;
            zq3.e(qs2Var);
            ss2 ss2Var = this.i;
            zq3.e(ss2Var);
            ss2 ss2Var2 = this.j;
            zq3.e(ss2Var2);
            String str2 = this.k;
            zq3.e(str2);
            CookieManager cookieManager = this.m;
            if (cookieManager == null) {
                cookieManager = CookieManager.getInstance();
            }
            CookieManager cookieManager2 = cookieManager;
            h98 h98Var = this.n;
            String str3 = this.h;
            zq3.e(str3);
            c96 c96Var = this.g;
            zq3.e(c96Var);
            c cVar = new c(this.r, this.s);
            boolean z = this.o;
            boolean z2 = this.p;
            boolean z3 = this.q;
            UserSubscriptionProduct userSubscriptionProduct = this.t;
            zq3.e(userSubscriptionProduct);
            List list2 = this.u;
            zq3.e(cookieManager2);
            Subauth subauth = new Subauth(application2, list, str, r35Var, environment, qs2Var, ss2Var, ss2Var2, str2, cookieManager2, h98Var, z, z2, z3, str3, c96Var, cVar, userSubscriptionProduct, list2, null, 524288, null);
            subauth.u();
            return subauth;
        }

        public final a d(UserSubscriptionProduct userSubscriptionProduct) {
            zq3.h(userSubscriptionProduct, "clientAppSubProduct");
            this.t = userSubscriptionProduct;
            return this;
        }

        public final a e(TimeUnit timeUnit) {
            zq3.h(timeUnit, "dntTimeoutTimeUnit");
            this.s = timeUnit;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g) && zq3.c(this.h, aVar.h) && zq3.c(this.i, aVar.i) && zq3.c(this.j, aVar.j) && zq3.c(this.k, aVar.k) && zq3.c(this.l, aVar.l) && zq3.c(this.m, aVar.m) && zq3.c(this.n, aVar.n) && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r && this.s == aVar.s && zq3.c(this.t, aVar.t) && zq3.c(this.u, aVar.u);
        }

        public final a f(ss2 ss2Var) {
            zq3.h(ss2Var, "doNotTrackFunc");
            this.j = ss2Var;
            return this;
        }

        public final a g(String str) {
            zq3.h(str, "dataDomeKey");
            this.d = str;
            return this;
        }

        public final a h(Environment environment) {
            zq3.h(environment, "env");
            this.b = environment;
            return this;
        }

        public int hashCode() {
            Application application = this.a;
            int hashCode = (application == null ? 0 : application.hashCode()) * 31;
            Environment environment = this.b;
            int hashCode2 = (hashCode + (environment == null ? 0 : environment.hashCode())) * 31;
            List list = this.c;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.d;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            r35 r35Var = this.e;
            int hashCode5 = (hashCode4 + (r35Var == null ? 0 : r35Var.hashCode())) * 31;
            qs2 qs2Var = this.f;
            int hashCode6 = (hashCode5 + (qs2Var == null ? 0 : qs2Var.hashCode())) * 31;
            c96 c96Var = this.g;
            int hashCode7 = (hashCode6 + (c96Var == null ? 0 : c96Var.hashCode())) * 31;
            String str2 = this.h;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ss2 ss2Var = this.i;
            int hashCode9 = (hashCode8 + (ss2Var == null ? 0 : ss2Var.hashCode())) * 31;
            ss2 ss2Var2 = this.j;
            int hashCode10 = (hashCode9 + (ss2Var2 == null ? 0 : ss2Var2.hashCode())) * 31;
            String str3 = this.k;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            kl7 kl7Var = this.l;
            int hashCode12 = (hashCode11 + (kl7Var == null ? 0 : kl7Var.hashCode())) * 31;
            CookieManager cookieManager = this.m;
            int hashCode13 = (hashCode12 + (cookieManager == null ? 0 : cookieManager.hashCode())) * 31;
            h98 h98Var = this.n;
            int hashCode14 = (((((((((((hashCode13 + (h98Var == null ? 0 : h98Var.hashCode())) * 31) + Boolean.hashCode(this.o)) * 31) + Boolean.hashCode(this.p)) * 31) + Boolean.hashCode(this.q)) * 31) + Long.hashCode(this.r)) * 31) + this.s.hashCode()) * 31;
            UserSubscriptionProduct userSubscriptionProduct = this.t;
            return ((hashCode14 + (userSubscriptionProduct != null ? userSubscriptionProduct.hashCode() : 0)) * 31) + this.u.hashCode();
        }

        public final a j(h98 h98Var) {
            zq3.h(h98Var, "module");
            this.n = h98Var;
            return this;
        }

        public final a k(String str) {
            zq3.h(str, "lireClientId");
            this.k = str;
            return this;
        }

        public final a n(r35 r35Var) {
            zq3.h(r35Var, "config");
            this.e = r35Var;
            return this;
        }

        public final a o(List list) {
            zq3.h(list, "interceptors");
            this.c = list;
            return this;
        }

        public final a p(c96 c96Var) {
            zq3.h(c96Var, "headerProvider");
            this.g = c96Var;
            return this;
        }

        public final a q(String str) {
            zq3.h(str, "sourceName");
            this.h = str;
            return this;
        }

        public final a r(k78 k78Var) {
            zq3.h(k78Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.u.add(k78Var);
            return this;
        }

        public final a s(qs2 qs2Var) {
            zq3.h(qs2Var, "provider");
            this.f = qs2Var;
            return this;
        }

        public String toString() {
            return "Builder(application=" + this.a + ", graphQLEnvironment=" + this.b + ", okhttpInterceptors=" + this.c + ", dataDomeKey=" + this.d + ", networkConfig=" + this.e + ", samizdatOkHttpProvider=" + this.f + ", purrHeaderProvider=" + this.g + ", purrSourceName=" + this.h + ", agentIdFunc=" + this.i + ", doNotTrackFunc=" + this.j + ", lireClientId=" + this.k + ", sessionRefreshProvider=" + this.l + ", cookieManager=" + this.m + ", ssoProviderAPI=" + this.n + ", isPurchasePollingDisabled=" + this.o + ", isTheAthletic=" + this.p + ", isAccountLinkingDisabled=" + this.q + ", dntTimeoutDuration=" + this.r + ", dntTimeoutTimeUnit=" + this.s + ", clientAppSubscriptionProduct=" + this.t + ", subauthListeners=" + this.u + ")";
        }

        public /* synthetic */ a(Application application, Environment environment, List list, String str, r35 r35Var, qs2 qs2Var, c96 c96Var, String str2, ss2 ss2Var, ss2 ss2Var2, String str3, kl7 kl7Var, CookieManager cookieManager, h98 h98Var, boolean z, boolean z2, boolean z3, long j, TimeUnit timeUnit, UserSubscriptionProduct userSubscriptionProduct, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : application, (i & 2) != 0 ? null : environment, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : r35Var, (i & 32) != 0 ? null : qs2Var, (i & 64) != 0 ? null : c96Var, (i & 128) != 0 ? null : str2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : ss2Var, (i & 512) != 0 ? null : ss2Var2, (i & 1024) != 0 ? null : str3, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : kl7Var, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : cookieManager, (i & 8192) != 0 ? null : h98Var, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z, (i & 32768) != 0 ? false : z2, (i & 65536) == 0 ? z3 : false, (i & 131072) != 0 ? 5L : j, (i & 262144) != 0 ? d68.Companion.a() : timeUnit, (i & 524288) != 0 ? null : userSubscriptionProduct, (i & Constants.MB) != 0 ? new ArrayList() : list2);
        }
    }

    /* synthetic */ Subauth(Application application, List list, String str, r35 r35Var, Environment environment, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, String str2, CookieManager cookieManager, h98 h98Var, boolean z, boolean z2, boolean z3, String str3, c96 c96Var, c cVar, UserSubscriptionProduct userSubscriptionProduct, List list2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, list, str, r35Var, environment, qs2Var, ss2Var, ss2Var2, str2, cookieManager, h98Var, z, z2, z3, str3, c96Var, cVar, userSubscriptionProduct, list2, (i & 524288) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
