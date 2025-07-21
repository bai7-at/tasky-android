package zendesk.support;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class StorageModule_ProvideRequestMigratorFactory implements ba2 {
    private final p76 contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, p76 p76Var) {
        this.module = storageModule;
        this.contextProvider = p76Var;
    }

    public static StorageModule_ProvideRequestMigratorFactory create(StorageModule storageModule, p76 p76Var) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, p76Var);
    }

    public static RequestMigrator provideRequestMigrator(StorageModule storageModule, Context context) {
        return (RequestMigrator) g16.c(storageModule.provideRequestMigrator(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RequestMigrator get() {
        return provideRequestMigrator(this.module, (Context) this.contextProvider.get());
    }
}
