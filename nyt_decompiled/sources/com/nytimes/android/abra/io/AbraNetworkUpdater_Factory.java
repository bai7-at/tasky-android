package com.nytimes.android.abra.io;

import com.nytimes.android.abra.utilities.ParamProvider;
import defpackage.b04;
import defpackage.ba2;
import defpackage.nt1;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes2.dex */
public final class AbraNetworkUpdater_Factory implements ba2 {
    private final p76 dispatcherProvider;
    private final p76 paramProvider;
    private final p76 storeProvider;

    public AbraNetworkUpdater_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.storeProvider = p76Var;
        this.paramProvider = p76Var2;
        this.dispatcherProvider = p76Var3;
    }

    public static AbraNetworkUpdater_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new AbraNetworkUpdater_Factory(p76Var, p76Var2, p76Var3);
    }

    public static AbraNetworkUpdater newInstance(b04 b04Var, ParamProvider paramProvider, CoroutineDispatcher coroutineDispatcher) {
        return new AbraNetworkUpdater(b04Var, paramProvider, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public AbraNetworkUpdater get() {
        return newInstance(nt1.a(this.storeProvider), (ParamProvider) this.paramProvider.get(), (CoroutineDispatcher) this.dispatcherProvider.get());
    }
}
