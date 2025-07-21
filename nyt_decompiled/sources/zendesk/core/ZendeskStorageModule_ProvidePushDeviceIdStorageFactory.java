package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements ba2 {
    private final p76 additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(p76 p76Var) {
        this.additionalSdkStorageProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(p76Var);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return (PushDeviceIdStorage) g16.c(ZendeskStorageModule.providePushDeviceIdStorage(baseStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage((BaseStorage) this.additionalSdkStorageProvider.get());
    }
}
