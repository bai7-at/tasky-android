package com.nytimes.android.abra;

import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import com.nytimes.android.abra.sources.AbraSource;
import com.nytimes.android.abra.utilities.TestReporter;
import defpackage.b04;
import defpackage.ba2;
import defpackage.nt1;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class AbraManagerImpl_Factory implements ba2 {
    private final p76 abraAllocatorProvider;
    private final p76 abraNetworkUpdaterProvider;
    private final p76 abraSourceProvider;
    private final p76 reporterProvider;
    private final p76 resourceProvider;

    public AbraManagerImpl_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.reporterProvider = p76Var;
        this.abraSourceProvider = p76Var2;
        this.abraNetworkUpdaterProvider = p76Var3;
        this.abraAllocatorProvider = p76Var4;
        this.resourceProvider = p76Var5;
    }

    public static AbraManagerImpl_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new AbraManagerImpl_Factory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static AbraManagerImpl newInstance(TestReporter testReporter, AbraSource abraSource, AbraNetworkUpdater abraNetworkUpdater, b04 b04Var, ResourceProvider resourceProvider) {
        return new AbraManagerImpl(testReporter, abraSource, abraNetworkUpdater, b04Var, resourceProvider);
    }

    @Override // defpackage.p76
    public AbraManagerImpl get() {
        return newInstance((TestReporter) this.reporterProvider.get(), (AbraSource) this.abraSourceProvider.get(), (AbraNetworkUpdater) this.abraNetworkUpdaterProvider.get(), nt1.a(this.abraAllocatorProvider), (ResourceProvider) this.resourceProvider.get());
    }
}
