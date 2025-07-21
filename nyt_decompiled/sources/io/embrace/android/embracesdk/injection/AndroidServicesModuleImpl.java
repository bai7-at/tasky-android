package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class AndroidServicesModuleImpl implements AndroidServicesModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(AndroidServicesModuleImpl.class, "preferencesService", "getPreferencesService()Lio/embrace/android/embracesdk/prefs/PreferencesService;", 0))};
    private final hp6 preferencesService$delegate;

    public AndroidServicesModuleImpl(InitModule initModule, CoreModule coreModule, WorkerThreadModule workerThreadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        this.preferencesService$delegate = new SingletonDelegate(LoadType.LAZY, new AndroidServicesModuleImpl$preferencesService$2(coreModule, workerThreadModule, initModule));
    }

    @Override // io.embrace.android.embracesdk.injection.AndroidServicesModule
    public PreferencesService getPreferencesService() {
        return (PreferencesService) this.preferencesService$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
