package com.nytimes.android.abra.di;

import defpackage.ba2;
import defpackage.g16;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class AbraModule_ProvideScopeFactory implements ba2 {
    private final AbraModule module;

    public AbraModule_ProvideScopeFactory(AbraModule abraModule) {
        this.module = abraModule;
    }

    public static AbraModule_ProvideScopeFactory create(AbraModule abraModule) {
        return new AbraModule_ProvideScopeFactory(abraModule);
    }

    public static CoroutineScope provideScope(AbraModule abraModule) {
        return (CoroutineScope) g16.e(abraModule.provideScope());
    }

    @Override // defpackage.p76
    public CoroutineScope get() {
        return provideScope(this.module);
    }
}
