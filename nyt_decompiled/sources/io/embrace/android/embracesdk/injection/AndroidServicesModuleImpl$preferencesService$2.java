package io.embrace.android.embracesdk.injection;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import defpackage.qs2;
import io.embrace.android.embracesdk.prefs.EmbracePreferencesService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.c;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class AndroidServicesModuleImpl$preferencesService$2 extends Lambda implements qs2 {
    final /* synthetic */ CoreModule $coreModule;
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ WorkerThreadModule $workerThreadModule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidServicesModuleImpl$preferencesService$2(CoreModule coreModule, WorkerThreadModule workerThreadModule, InitModule initModule) {
        super(0);
        this.$coreModule = coreModule;
        this.$workerThreadModule = workerThreadModule;
        this.$initModule = initModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final EmbracePreferencesService mo865invoke() {
        return new EmbracePreferencesService(this.$workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.AndroidServicesModuleImpl$preferencesService$2$lazyPrefs$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SharedPreferences mo865invoke() {
                return PreferenceManager.getDefaultSharedPreferences(AndroidServicesModuleImpl$preferencesService$2.this.$coreModule.getContext());
            }
        }), this.$initModule.getClock(), this.$coreModule.getJsonSerializer());
    }
}
