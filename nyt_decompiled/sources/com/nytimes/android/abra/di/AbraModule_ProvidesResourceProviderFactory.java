package com.nytimes.android.abra.di;

import com.nytimes.android.abra.allocator.ResourceProvider;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesResourceProviderFactory implements ba2 {
    private final AbraModule module;

    public AbraModule_ProvidesResourceProviderFactory(AbraModule abraModule) {
        this.module = abraModule;
    }

    public static AbraModule_ProvidesResourceProviderFactory create(AbraModule abraModule) {
        return new AbraModule_ProvidesResourceProviderFactory(abraModule);
    }

    public static ResourceProvider providesResourceProvider(AbraModule abraModule) {
        return (ResourceProvider) g16.e(abraModule.providesResourceProvider());
    }

    @Override // defpackage.p76
    public ResourceProvider get() {
        return providesResourceProvider(this.module);
    }
}
