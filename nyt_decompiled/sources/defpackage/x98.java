package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.subauth.ui.SubauthUserUIManager;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteDebugUseCase;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase;
import com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class x98 {
    private final NYTUser a;
    private final c05 b;
    private final o98 c;
    private final p78 d;
    private final a e;
    private final PurrDirectiveOverrider f;
    private final SubauthListenerManager g;
    private final f68 h;
    private final SubauthEnvironment i;
    private final Context j;

    public x98(NYTUser nYTUser, c05 c05Var, o98 o98Var, p78 p78Var, a aVar, PurrDirectiveOverrider purrDirectiveOverrider, SubauthListenerManager subauthListenerManager, f68 f68Var, SubauthEnvironment subauthEnvironment, Context context) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(o98Var, "subauthUser");
        zq3.h(p78Var, "loginLinkingAPI");
        zq3.h(aVar, "purrManager");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(f68Var, "subauthConfig");
        zq3.h(subauthEnvironment, "subauthEnvironment");
        zq3.h(context, "context");
        this.a = nYTUser;
        this.b = c05Var;
        this.c = o98Var;
        this.d = p78Var;
        this.e = aVar;
        this.f = purrDirectiveOverrider;
        this.g = subauthListenerManager;
        this.h = f68Var;
        this.i = subauthEnvironment;
        this.j = context;
    }

    public final ConnectivityManager a() {
        Object systemService = this.j.getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public final dr2 b(Resources resources) {
        zq3.h(resources, "resources");
        return new dr2(resources);
    }

    public final p60 c(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "connectivityManager");
        return new p60(connectivityManager);
    }

    public final MutableSharedFlow d() {
        return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    public final c05 e() {
        return this.b;
    }

    public final NYTUser f() {
        return this.a;
    }

    public final PurrDirectiveOverrider g() {
        return this.f;
    }

    public final a h() {
        return this.e;
    }

    public final Resources i() {
        Resources resources = this.j.getResources();
        zq3.g(resources, "getResources(...)");
        return resources;
    }

    public final com.nytimes.subauth.ui.accountdelete.a j(h78 h78Var) {
        zq3.h(h78Var, "subauthFeatureFlagUtil");
        return h78Var.a() ? new AccountDeleteDebugUseCase(this.c) : new AccountDeleteMainUseCase(this.c);
    }

    public final MutableSharedFlow k() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final f68 l() {
        f68 f68Var = this.h;
        j98.a.e(f68Var);
        return f68Var;
    }

    public final SubauthEnvironment m() {
        return this.i;
    }

    public final h78 n() {
        return new h78(this.j);
    }

    public final MutableSharedFlow o() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final SubauthLIREFlowAnalyticsManager p(o98 o98Var, MutableSharedFlow mutableSharedFlow) {
        zq3.h(o98Var, "subauthUser");
        zq3.h(mutableSharedFlow, "analyticsEventFlow");
        return new SubauthLIREFlowAnalyticsManager(o98Var, mutableSharedFlow, this.g);
    }

    public final p78 q() {
        return this.d;
    }

    public final o98 r() {
        return this.c;
    }

    public final SubauthUserUIManager s(NYTUser nYTUser, p78 p78Var, o98 o98Var, a aVar, PurrDirectiveOverrider purrDirectiveOverrider, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableSharedFlow mutableSharedFlow3) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(p78Var, "subauthLoginLinkingAPI");
        zq3.h(o98Var, "subauthUser");
        zq3.h(aVar, "purrManager");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(mutableSharedFlow, "subauthLIREResultStateFlow");
        zq3.h(mutableSharedFlow2, "subauthLIREAnalyticsEventFlow");
        zq3.h(mutableSharedFlow3, "accountDeleteAnalyticsEventFlow");
        return new SubauthUserUIManager(nYTUser, o98Var, p78Var, aVar, purrDirectiveOverrider, mutableSharedFlow, mutableSharedFlow2, mutableSharedFlow3);
    }
}
