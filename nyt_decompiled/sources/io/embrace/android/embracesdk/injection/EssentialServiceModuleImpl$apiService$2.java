package io.embrace.android.embracesdk.injection;

import defpackage.c04;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.comms.api.ApiClient;
import io.embrace.android.embracesdk.comms.api.ApiRequest;
import io.embrace.android.embracesdk.comms.api.CachedConfig;
import io.embrace.android.embracesdk.comms.api.EmbraceApiService;
import io.embrace.android.embracesdk.comms.api.EmbraceApiUrlBuilder;
import io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager;
import io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class EssentialServiceModuleImpl$apiService$2 extends Lambda implements qs2 {
    final /* synthetic */ CoreModule $coreModule;
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ StorageModule $storageModule;
    final /* synthetic */ EssentialServiceModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EssentialServiceModuleImpl$apiService$2(EssentialServiceModuleImpl essentialServiceModuleImpl, CoreModule coreModule, StorageModule storageModule, InitModule initModule) {
        super(0);
        this.this$0 = essentialServiceModuleImpl;
        this.$coreModule = coreModule;
        this.$storageModule = storageModule;
        this.$initModule = initModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final EmbraceApiService mo865invoke() {
        BackgroundWorker backgroundWorker;
        c04 c04Var;
        String str;
        try {
            Systrace.startSynchronous("api-service-init");
            ApiClient apiClient = this.this$0.getApiClient();
            EmbraceSerializer jsonSerializer = this.$coreModule.getJsonSerializer();
            gt2 gt2Var = new gt2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$apiService$2$$special$$inlined$traceSynchronous$lambda$1
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public final CachedConfig invoke(String str2, ApiRequest apiRequest) {
                    zq3.h(str2, "url");
                    zq3.h(apiRequest, "request");
                    try {
                        Systrace.startSynchronous("provide-cache-config");
                        return EssentialServiceModuleImpl$apiService$2.this.$storageModule.getCache().retrieveCachedConfig(str2, apiRequest);
                    } finally {
                    }
                }
            };
            InternalEmbraceLogger logger = this.$initModule.getLogger();
            backgroundWorker = this.this$0.networkRequestWorker;
            try {
                Systrace.startSynchronous("cache-manager");
                DeliveryCacheManager deliveryCacheManager = this.$storageModule.getDeliveryCacheManager();
                Systrace.endSynchronous();
                PendingApiCallsSender pendingApiCallsSender = this.this$0.getPendingApiCallsSender();
                c04Var = this.this$0.lazyDeviceId;
                str = this.this$0.appId;
                EmbraceApiUrlBuilder urlBuilder = this.this$0.getUrlBuilder();
                try {
                    Systrace.startSynchronous("network-connectivity");
                    NetworkConnectivityService networkConnectivityService = this.this$0.getNetworkConnectivityService();
                    Systrace.endSynchronous();
                    return new EmbraceApiService(apiClient, jsonSerializer, gt2Var, logger, backgroundWorker, deliveryCacheManager, pendingApiCallsSender, c04Var, str, urlBuilder, networkConnectivityService);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }
}
