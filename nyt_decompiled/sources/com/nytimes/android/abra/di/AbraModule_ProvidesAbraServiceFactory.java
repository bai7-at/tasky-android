package com.nytimes.android.abra.di;

import com.nytimes.android.abra.io.AbraService;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesAbraServiceFactory implements ba2 {
    private final AbraModule module;

    public AbraModule_ProvidesAbraServiceFactory(AbraModule abraModule) {
        this.module = abraModule;
    }

    public static AbraModule_ProvidesAbraServiceFactory create(AbraModule abraModule) {
        return new AbraModule_ProvidesAbraServiceFactory(abraModule);
    }

    public static AbraService providesAbraService(AbraModule abraModule) {
        return (AbraService) g16.e(abraModule.providesAbraService());
    }

    @Override // defpackage.p76
    public AbraService get() {
        return providesAbraService(this.module);
    }
}
