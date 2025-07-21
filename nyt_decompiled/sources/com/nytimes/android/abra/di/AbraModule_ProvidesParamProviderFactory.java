package com.nytimes.android.abra.di;

import com.nytimes.android.abra.utilities.ParamProvider;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesParamProviderFactory implements ba2 {
    private final AbraModule module;

    public AbraModule_ProvidesParamProviderFactory(AbraModule abraModule) {
        this.module = abraModule;
    }

    public static AbraModule_ProvidesParamProviderFactory create(AbraModule abraModule) {
        return new AbraModule_ProvidesParamProviderFactory(abraModule);
    }

    public static ParamProvider providesParamProvider(AbraModule abraModule) {
        return (ParamProvider) g16.e(abraModule.providesParamProvider());
    }

    @Override // defpackage.p76
    public ParamProvider get() {
        return providesParamProvider(this.module);
    }
}
