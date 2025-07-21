package io.embrace.android.embracesdk.injection;

import android.os.PowerManager;
import defpackage.qs2;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class DataSourceModuleImpl$lowPowerDataSource$2 extends Lambda implements qs2 {
    final /* synthetic */ CoreModule $coreModule;
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ OpenTelemetryModule $otelModule;
    final /* synthetic */ SystemServiceModule $systemServiceModule;
    final /* synthetic */ WorkerThreadModule $workerThreadModule;
    final /* synthetic */ DataSourceModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataSourceModuleImpl$lowPowerDataSource$2(DataSourceModuleImpl dataSourceModuleImpl, CoreModule coreModule, WorkerThreadModule workerThreadModule, InitModule initModule, SystemServiceModule systemServiceModule, OpenTelemetryModule openTelemetryModule) {
        super(0);
        this.this$0 = dataSourceModuleImpl;
        this.$coreModule = coreModule;
        this.$workerThreadModule = workerThreadModule;
        this.$initModule = initModule;
        this.$systemServiceModule = systemServiceModule;
        this.$otelModule = openTelemetryModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final DataSourceState<LowPowerDataSource> mo865invoke() {
        return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$lowPowerDataSource$2.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LowPowerDataSource mo865invoke() {
                return new LowPowerDataSource(DataSourceModuleImpl$lowPowerDataSource$2.this.$coreModule.getContext(), DataSourceModuleImpl$lowPowerDataSource$2.this.$otelModule.getSpanService(), DataSourceModuleImpl$lowPowerDataSource$2.this.$initModule.getLogger(), DataSourceModuleImpl$lowPowerDataSource$2.this.$workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), DataSourceModuleImpl$lowPowerDataSource$2.this.$initModule.getClock(), new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl.lowPowerDataSource.2.1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final PowerManager mo865invoke() {
                        return DataSourceModuleImpl$lowPowerDataSource$2.this.$systemServiceModule.getPowerManager();
                    }
                });
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$lowPowerDataSource$2.2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                ConfigService configService;
                configService = DataSourceModuleImpl$lowPowerDataSource$2.this.this$0.configService;
                return configService.getAutoDataCaptureBehavior().isPowerSaveModeServiceEnabled();
            }
        }, null, null, 12, null);
    }
}
