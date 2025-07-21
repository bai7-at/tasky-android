package com.nytimes.android.abra.di;

import defpackage.ba2;
import defpackage.g16;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes2.dex */
public final class AbraModule_ProvidesCoroutinesDispatcherFactory implements ba2 {
    private final AbraModule module;

    public AbraModule_ProvidesCoroutinesDispatcherFactory(AbraModule abraModule) {
        this.module = abraModule;
    }

    public static AbraModule_ProvidesCoroutinesDispatcherFactory create(AbraModule abraModule) {
        return new AbraModule_ProvidesCoroutinesDispatcherFactory(abraModule);
    }

    public static CoroutineDispatcher providesCoroutinesDispatcher(AbraModule abraModule) {
        return (CoroutineDispatcher) g16.e(abraModule.providesCoroutinesDispatcher());
    }

    @Override // defpackage.p76
    public CoroutineDispatcher get() {
        return providesCoroutinesDispatcher(this.module);
    }
}
