package com.nytimes.android.abra.di;

import com.nytimes.android.abra.allocator.AbraAllocator;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraFileSystem;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesAbraAllocatorFactory implements ba2 {
    private final p76 abraFileSystemProvider;
    private final AbraModule module;
    private final p76 networkUpdaterProvider;
    private final p76 resourceProvider;

    public AbraModule_ProvidesAbraAllocatorFactory(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = abraModule;
        this.abraFileSystemProvider = p76Var;
        this.networkUpdaterProvider = p76Var2;
        this.resourceProvider = p76Var3;
    }

    public static AbraModule_ProvidesAbraAllocatorFactory create(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new AbraModule_ProvidesAbraAllocatorFactory(abraModule, p76Var, p76Var2, p76Var3);
    }

    public static AbraAllocator providesAbraAllocator(AbraModule abraModule, AbraFileSystem abraFileSystem, AbraNetworkUpdater abraNetworkUpdater, ResourceProvider resourceProvider) {
        return (AbraAllocator) g16.e(abraModule.providesAbraAllocator(abraFileSystem, abraNetworkUpdater, resourceProvider));
    }

    @Override // defpackage.p76
    public AbraAllocator get() {
        return providesAbraAllocator(this.module, (AbraFileSystem) this.abraFileSystemProvider.get(), (AbraNetworkUpdater) this.networkUpdaterProvider.get(), (ResourceProvider) this.resourceProvider.get());
    }
}
