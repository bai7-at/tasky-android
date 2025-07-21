package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements ba2 {
    private final p76 identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(p76 p76Var) {
        this.identityStorageProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(p76Var);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        return (IdentityManager) g16.c(ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}
