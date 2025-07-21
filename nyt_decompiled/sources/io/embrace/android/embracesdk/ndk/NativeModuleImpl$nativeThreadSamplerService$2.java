package io.embrace.android.embracesdk.ndk;

import defpackage.qs2;
import io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService;
import io.embrace.android.embracesdk.injection.EssentialServiceModule;
import io.embrace.android.embracesdk.injection.InitModule;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.Map;
import kotlin.c;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class NativeModuleImpl$nativeThreadSamplerService$2 extends Lambda implements qs2 {
    final /* synthetic */ EssentialServiceModule $essentialServiceModule;
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ WorkerThreadModule $workerThreadModule;
    final /* synthetic */ NativeModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeModuleImpl$nativeThreadSamplerService$2(NativeModuleImpl nativeModuleImpl, EssentialServiceModule essentialServiceModule, InitModule initModule, WorkerThreadModule workerThreadModule) {
        super(0);
        this.this$0 = nativeModuleImpl;
        this.$essentialServiceModule = essentialServiceModule;
        this.$initModule = initModule;
        this.$workerThreadModule = workerThreadModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final EmbraceNativeThreadSamplerService mo865invoke() {
        boolean nativeThreadSamplingEnabled;
        try {
            Systrace.startSynchronous("native-thread-sampler-init");
            nativeThreadSamplingEnabled = this.this$0.nativeThreadSamplingEnabled(this.$essentialServiceModule.getConfigService());
            return nativeThreadSamplingEnabled ? new EmbraceNativeThreadSamplerService(this.$essentialServiceModule.getConfigService(), c.a(new qs2() { // from class: io.embrace.android.embracesdk.ndk.NativeModuleImpl$nativeThreadSamplerService$2$$special$$inlined$traceSynchronous$lambda$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Map<String, String> mo865invoke() {
                    return NativeModuleImpl$nativeThreadSamplerService$2.this.this$0.getNdkService().getSymbolsForCurrentArch();
                }
            }), null, this.$initModule.getLogger(), null, this.$workerThreadModule.scheduledWorker(WorkerName.BACKGROUND_REGISTRATION), this.$essentialServiceModule.getDeviceArchitecture(), this.$essentialServiceModule.getSharedObjectLoader(), 20, null) : null;
        } finally {
        }
    }
}
