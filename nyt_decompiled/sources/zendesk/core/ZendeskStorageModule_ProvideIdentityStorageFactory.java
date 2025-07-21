package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements ba2 {
    private final p76 baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(p76 p76Var) {
        this.baseStorageProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(p76Var);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return (IdentityStorage) g16.c(ZendeskStorageModule.provideIdentityStorage(baseStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public IdentityStorage get() {
        return provideIdentityStorage((BaseStorage) this.baseStorageProvider.get());
    }
}
