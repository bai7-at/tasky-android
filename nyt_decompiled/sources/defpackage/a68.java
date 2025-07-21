package defpackage;

import android.content.Context;
import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.network.response.d;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import defpackage.n98;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class a68 implements z58, c78, z88, n98, n98.b, s98 {
    private final /* synthetic */ c78 a;
    private final /* synthetic */ z88 b;
    private final /* synthetic */ n98 c;
    private final /* synthetic */ n98.b d;
    private final /* synthetic */ s98 e;

    public a68(c78 c78Var, z88 z88Var, n98 n98Var, n98.b bVar, s98 s98Var) {
        zq3.h(c78Var, "subauthEntitlementClient");
        zq3.h(z88Var, "subauthPurchaseClient");
        zq3.h(n98Var, "subauthUserClient");
        zq3.h(bVar, "subauthUserClientRxJavaCompat");
        zq3.h(s98Var, "subauthUserUIClient");
        this.a = c78Var;
        this.b = z88Var;
        this.c = n98Var;
        this.d = bVar;
        this.e = s98Var;
    }

    @Override // defpackage.n98
    public Object A(String str, by0 by0Var) {
        return this.c.A(str, by0Var);
    }

    @Override // defpackage.n98
    public Flow B() {
        return this.c.B();
    }

    @Override // defpackage.n98
    public Object C(by0 by0Var) {
        return this.c.C(by0Var);
    }

    @Override // defpackage.n98
    public String D() {
        return this.c.D();
    }

    @Override // defpackage.s98
    public Flow E() {
        return this.e.E();
    }

    @Override // defpackage.c78
    public boolean F() {
        return this.a.F();
    }

    @Override // defpackage.n98
    public String G() {
        return this.c.G();
    }

    @Override // defpackage.z88
    public Object H(Iterable iterable, int i, by0 by0Var) {
        return this.b.H(iterable, i, by0Var);
    }

    @Override // defpackage.n98
    public Object I(Context context, boolean z, RegiInterface regiInterface, String str, by0 by0Var) {
        return this.c.I(context, z, regiInterface, str, by0Var);
    }

    @Override // defpackage.z88
    public Object J(Context context, String str, RegiInterface regiInterface, String str2, PurchaseLinkSource purchaseLinkSource, by0 by0Var) {
        return this.b.J(context, str, regiInterface, str2, purchaseLinkSource, by0Var);
    }

    @Override // defpackage.z88
    public Object K(f fVar, by0 by0Var) {
        return this.b.K(fVar, by0Var);
    }

    @Override // defpackage.n98
    public String L() {
        return this.c.L();
    }

    @Override // defpackage.z88
    public Object M(f fVar, String str, CampaignCodeSource campaignCodeSource, String str2, String str3, by0 by0Var) {
        return this.b.M(fVar, str, campaignCodeSource, str2, str3, by0Var);
    }

    @Override // defpackage.c78
    public List N() {
        return this.a.N();
    }

    @Override // defpackage.c78
    public boolean O() {
        return this.a.O();
    }

    @Override // defpackage.s98
    public Flow P() {
        return this.e.P();
    }

    @Override // defpackage.c78
    public boolean Q() {
        return this.a.Q();
    }

    @Override // defpackage.s98
    public Flow R() {
        return this.e.R();
    }

    @Override // defpackage.z88
    public String S() {
        return this.b.S();
    }

    @Override // defpackage.n98
    public d a() {
        return this.c.a();
    }

    @Override // defpackage.z88
    public Object b(by0 by0Var) {
        return this.b.b(by0Var);
    }

    @Override // defpackage.n98
    public Object c(String str, by0 by0Var) {
        return this.c.c(str, by0Var);
    }

    @Override // defpackage.n98
    public Object d(by0 by0Var) {
        return this.c.d(by0Var);
    }

    @Override // defpackage.n98
    public Flow e() {
        return this.c.e();
    }

    @Override // defpackage.z88
    public Object f(by0 by0Var) {
        Object f = this.b.f(by0Var);
        a.h();
        return f;
    }

    @Override // defpackage.n98
    public Object g(by0 by0Var) {
        return this.c.g(by0Var);
    }

    @Override // defpackage.n98
    public NYTUser h() {
        return this.c.h();
    }

    @Override // defpackage.z88
    public Flow i() {
        return this.b.i();
    }

    @Override // defpackage.n98
    public Object j(Context context, RegiInterface regiInterface, qs2 qs2Var, by0 by0Var) {
        return this.c.j(context, regiInterface, qs2Var, by0Var);
    }

    @Override // defpackage.n98
    public Object k(String str, by0 by0Var) {
        return this.c.k(str, by0Var);
    }

    @Override // defpackage.n98
    public Object l(List list, by0 by0Var) {
        return this.c.l(list, by0Var);
    }

    @Override // defpackage.n98
    public Flow m() {
        return this.c.m();
    }

    @Override // defpackage.n98
    public Object n(by0 by0Var) {
        return this.c.n(by0Var);
    }

    @Override // defpackage.c78
    public Set o() {
        return this.a.o();
    }

    @Override // defpackage.c78
    public boolean p() {
        return this.a.p();
    }

    @Override // defpackage.n98
    public boolean q() {
        return this.c.q();
    }

    @Override // n98.b
    public Observable r() {
        return this.d.r();
    }

    @Override // defpackage.c78
    public boolean s() {
        return this.a.s();
    }

    @Override // defpackage.z88
    public String t() {
        return this.b.t();
    }

    @Override // n98.b
    public Single u() {
        return this.d.u();
    }

    @Override // defpackage.n98
    public Object v(by0 by0Var) {
        return this.c.v(by0Var);
    }

    @Override // defpackage.s98
    public Flow w() {
        return this.e.w();
    }

    @Override // defpackage.c78
    public boolean x() {
        return this.a.x();
    }

    @Override // defpackage.s98
    public Object y(Context context, SubauthUiParams subauthUiParams, by0 by0Var) {
        return this.e.y(context, subauthUiParams, by0Var);
    }

    @Override // defpackage.c78
    public boolean z() {
        return this.a.z();
    }
}
