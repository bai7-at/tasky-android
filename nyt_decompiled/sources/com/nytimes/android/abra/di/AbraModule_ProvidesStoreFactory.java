package com.nytimes.android.abra.di;

import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraFileSystem;
import com.nytimes.android.abra.io.AbraService;
import defpackage.ba2;
import defpackage.g16;
import defpackage.m28;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesStoreFactory implements ba2 {
    private final p76 abraFileSystemProvider;
    private final p76 abraServiceProvider;
    private final AbraModule module;
    private final p76 resourceProvider;

    public AbraModule_ProvidesStoreFactory(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = abraModule;
        this.abraServiceProvider = p76Var;
        this.abraFileSystemProvider = p76Var2;
        this.resourceProvider = p76Var3;
    }

    public static AbraModule_ProvidesStoreFactory create(AbraModule abraModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new AbraModule_ProvidesStoreFactory(abraModule, p76Var, p76Var2, p76Var3);
    }

    public static m28 providesStore(AbraModule abraModule, AbraService abraService, AbraFileSystem abraFileSystem, ResourceProvider resourceProvider) {
        return (m28) g16.e(abraModule.providesStore(abraService, abraFileSystem, resourceProvider));
    }

    @Override // defpackage.p76
    public m28 get() {
        return providesStore(this.module, (AbraService) this.abraServiceProvider.get(), (AbraFileSystem) this.abraFileSystemProvider.get(), (ResourceProvider) this.resourceProvider.get());
    }
}
