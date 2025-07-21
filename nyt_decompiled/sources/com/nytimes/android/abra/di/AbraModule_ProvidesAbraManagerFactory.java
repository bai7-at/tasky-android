package com.nytimes.android.abra.di;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import com.nytimes.android.abra.sources.AbraLocalSource;
import defpackage.b04;
import defpackage.ba2;
import defpackage.g16;
import defpackage.nt1;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesAbraManagerFactory implements ba2 {
    private final p76 abraAllocatorProvider;
    private final p76 abraNetworkUpdaterProvider;
    private final p76 abraSourceProvider;
    private final AbraModule module;
    private final p76 resourceProvider;

    public AbraModule_ProvidesAbraManagerFactory(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.module = abraModule;
        this.abraSourceProvider = p76Var;
        this.abraNetworkUpdaterProvider = p76Var2;
        this.abraAllocatorProvider = p76Var3;
        this.resourceProvider = p76Var4;
    }

    public static AbraModule_ProvidesAbraManagerFactory create(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new AbraModule_ProvidesAbraManagerFactory(abraModule, p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static AbraManager providesAbraManager(AbraModule abraModule, AbraLocalSource abraLocalSource, AbraNetworkUpdater abraNetworkUpdater, b04 b04Var, ResourceProvider resourceProvider) {
        return (AbraManager) g16.e(abraModule.providesAbraManager(abraLocalSource, abraNetworkUpdater, b04Var, resourceProvider));
    }

    @Override // defpackage.p76
    public AbraManager get() {
        return providesAbraManager(this.module, (AbraLocalSource) this.abraSourceProvider.get(), (AbraNetworkUpdater) this.abraNetworkUpdaterProvider.get(), nt1.a(this.abraAllocatorProvider), (ResourceProvider) this.resourceProvider.get());
    }
}
