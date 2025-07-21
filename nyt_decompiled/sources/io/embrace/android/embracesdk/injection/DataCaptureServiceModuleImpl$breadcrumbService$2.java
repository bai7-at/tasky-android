package io.embrace.android.embracesdk.injection;

import defpackage.qs2;
import io.embrace.android.embracesdk.capture.crumbs.EmbraceBreadcrumbService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class DataCaptureServiceModuleImpl$breadcrumbService$2 extends Lambda implements qs2 {
    final /* synthetic */ DataSourceModule $dataSourceModule;
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ DataCaptureServiceModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataCaptureServiceModuleImpl$breadcrumbService$2(DataCaptureServiceModuleImpl dataCaptureServiceModuleImpl, InitModule initModule, DataSourceModule dataSourceModule) {
        super(0);
        this.this$0 = dataCaptureServiceModuleImpl;
        this.$initModule = initModule;
        this.$dataSourceModule = dataSourceModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final EmbraceBreadcrumbService mo865invoke() {
        ConfigService configService;
        try {
            Systrace.startSynchronous("breadcrumb-service-init");
            Clock clock = this.$initModule.getClock();
            configService = this.this$0.configService;
            return new EmbraceBreadcrumbService(clock, configService, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$breadcrumbService$2$$special$$inlined$traceSynchronous$lambda$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final DataSourceModule mo865invoke() {
                    return DataCaptureServiceModuleImpl$breadcrumbService$2.this.$dataSourceModule;
                }
            }, this.$initModule.getLogger());
        } finally {
        }
    }
}
