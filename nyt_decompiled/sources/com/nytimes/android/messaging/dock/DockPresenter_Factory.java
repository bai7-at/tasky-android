package com.nytimes.android.messaging.dock;

import com.nytimes.android.entitlements.a;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.ba2;
import defpackage.id9;
import defpackage.p76;
import defpackage.qv6;

/* loaded from: classes4.dex */
public final class DockPresenter_Factory implements ba2 {
    private final p76 deepLinkManagerProvider;
    private final p76 ecommClientProvider;
    private final p76 et2ScopeProvider;
    private final p76 remoteConfigProvider;
    private final p76 webActivityNavigatorProvider;

    public DockPresenter_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.ecommClientProvider = p76Var;
        this.remoteConfigProvider = p76Var2;
        this.deepLinkManagerProvider = p76Var3;
        this.webActivityNavigatorProvider = p76Var4;
        this.et2ScopeProvider = p76Var5;
    }

    public static DockPresenter_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new DockPresenter_Factory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static DockPresenter newInstance(a aVar, qv6 qv6Var, DeepLinkManager deepLinkManager, id9 id9Var, ET2Scope eT2Scope) {
        return new DockPresenter(aVar, qv6Var, deepLinkManager, id9Var, eT2Scope);
    }

    @Override // defpackage.p76
    public DockPresenter get() {
        return newInstance((a) this.ecommClientProvider.get(), (qv6) this.remoteConfigProvider.get(), (DeepLinkManager) this.deepLinkManagerProvider.get(), (id9) this.webActivityNavigatorProvider.get(), (ET2Scope) this.et2ScopeProvider.get());
    }
}
