package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.webkit.CookieManager;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import com.nytimes.android.subauth.core.purr.network.Environment;
import java.util.List;

/* loaded from: classes4.dex */
public final class u68 implements t68 {
    private final Application a;
    private final Context b;
    private final Resources c;
    private final Environment d;
    private final List e;
    private final String f;
    private final r35 g;
    private final qs2 h;
    private final ss2 i;
    private final ss2 j;
    private final String k;
    private final CookieManager l;
    private final h98 m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final String q;
    private final c96 r;
    private final Subauth.c s;
    private final UserSubscriptionProduct t;

    public u68(Application application, Context context, Resources resources, Environment environment, List list, String str, r35 r35Var, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, String str2, CookieManager cookieManager, h98 h98Var, boolean z, boolean z2, boolean z3, String str3, c96 c96Var, Subauth.c cVar, UserSubscriptionProduct userSubscriptionProduct) {
        zq3.h(application, "application");
        zq3.h(context, "applicationContext");
        zq3.h(resources, "resources");
        zq3.h(environment, "graphQLEnvironment");
        zq3.h(list, "okhttpInterceptors");
        zq3.h(r35Var, "networkConfig");
        zq3.h(qs2Var, "samizdatOkHttpProvider");
        zq3.h(ss2Var, "agentIdFunc");
        zq3.h(ss2Var2, "doNotTrackFunc");
        zq3.h(str2, "lireClientId");
        zq3.h(cookieManager, "cookieManager");
        zq3.h(str3, "purrSourceName");
        zq3.h(c96Var, "purrHeaderProvider");
        zq3.h(cVar, "purrConfig");
        zq3.h(userSubscriptionProduct, "clientAppSubscriptionProduct");
        this.a = application;
        this.b = context;
        this.c = resources;
        this.d = environment;
        this.e = list;
        this.f = str;
        this.g = r35Var;
        this.h = qs2Var;
        this.i = ss2Var;
        this.j = ss2Var2;
        this.k = str2;
        this.l = cookieManager;
        this.m = h98Var;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = str3;
        this.r = c96Var;
        this.s = cVar;
        this.t = userSubscriptionProduct;
    }

    @Override // defpackage.t68
    public String b() {
        return this.k;
    }

    @Override // defpackage.t68
    public ss2 c() {
        return this.i;
    }

    @Override // defpackage.t68
    public List d() {
        return this.e;
    }

    @Override // defpackage.t68
    public qs2 e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u68)) {
            return false;
        }
        u68 u68Var = (u68) obj;
        return zq3.c(this.a, u68Var.a) && zq3.c(this.b, u68Var.b) && zq3.c(this.c, u68Var.c) && this.d == u68Var.d && zq3.c(this.e, u68Var.e) && zq3.c(this.f, u68Var.f) && zq3.c(this.g, u68Var.g) && zq3.c(this.h, u68Var.h) && zq3.c(this.i, u68Var.i) && zq3.c(this.j, u68Var.j) && zq3.c(this.k, u68Var.k) && zq3.c(this.l, u68Var.l) && zq3.c(this.m, u68Var.m) && this.n == u68Var.n && this.o == u68Var.o && this.p == u68Var.p && zq3.c(this.q, u68Var.q) && zq3.c(this.r, u68Var.r) && zq3.c(this.s, u68Var.s) && zq3.c(this.t, u68Var.t);
    }

    @Override // defpackage.t68
    public CookieManager f() {
        return this.l;
    }

    @Override // defpackage.t68
    public boolean g() {
        return this.n;
    }

    @Override // defpackage.t68
    public Application getApplication() {
        return this.a;
    }

    @Override // defpackage.t68
    public Resources getResources() {
        return this.c;
    }

    @Override // defpackage.t68
    public c96 h() {
        return this.r;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        h98 h98Var = this.m;
        return ((((((((((((((hashCode2 + (h98Var != null ? h98Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.n)) * 31) + Boolean.hashCode(this.o)) * 31) + Boolean.hashCode(this.p)) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode();
    }

    @Override // defpackage.t68
    public UserSubscriptionProduct i() {
        return this.t;
    }

    @Override // defpackage.t68
    public Context j() {
        return this.b;
    }

    @Override // defpackage.t68
    public boolean k() {
        return this.p;
    }

    @Override // defpackage.t68
    public String l() {
        return this.f;
    }

    @Override // defpackage.t68
    public h98 m() {
        return this.m;
    }

    @Override // defpackage.t68
    public ss2 n() {
        return this.j;
    }

    @Override // defpackage.t68
    public String o() {
        return this.q;
    }

    @Override // defpackage.t68
    public r35 p() {
        return this.g;
    }

    @Override // defpackage.t68
    public boolean q() {
        return this.o;
    }

    public String toString() {
        return "SubauthDependencyProviderImpl(application=" + this.a + ", applicationContext=" + this.b + ", resources=" + this.c + ", graphQLEnvironment=" + this.d + ", okhttpInterceptors=" + this.e + ", dataDomeKey=" + this.f + ", networkConfig=" + this.g + ", samizdatOkHttpProvider=" + this.h + ", agentIdFunc=" + this.i + ", doNotTrackFunc=" + this.j + ", lireClientId=" + this.k + ", cookieManager=" + this.l + ", ssoProviderAPI=" + this.m + ", isPurchasePollingDisabled=" + this.n + ", isTheAthletic=" + this.o + ", isAccountLinkingDisabled=" + this.p + ", purrSourceName=" + this.q + ", purrHeaderProvider=" + this.r + ", purrConfig=" + this.s + ", clientAppSubscriptionProduct=" + this.t + ")";
    }
}
