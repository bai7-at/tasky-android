package com.nytimes.android.abra.di;

import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraFileSystem;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class AbraModule_AbraFileSystemFactory implements ba2 {
    private final AbraModule module;
    private final p76 resourceProvider;

    public AbraModule_AbraFileSystemFactory(AbraModule abraModule, p76 p76Var) {
        this.module = abraModule;
        this.resourceProvider = p76Var;
    }

    public static AbraFileSystem abraFileSystem(AbraModule abraModule, ResourceProvider resourceProvider) {
        return (AbraFileSystem) g16.e(abraModule.abraFileSystem(resourceProvider));
    }

    public static AbraModule_AbraFileSystemFactory create(AbraModule abraModule, p76 p76Var) {
        return new AbraModule_AbraFileSystemFactory(abraModule, p76Var);
    }

    @Override // defpackage.p76
    public AbraFileSystem get() {
        return abraFileSystem(this.module, (ResourceProvider) this.resourceProvider.get());
    }
}
