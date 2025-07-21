package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideAuthProviderFactory implements ba2 {
    private final p76 identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(p76 p76Var) {
        this.identityManagerProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(p76Var);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        return (AuthenticationProvider) g16.c(ZendeskStorageModule.provideAuthProvider((IdentityManager) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}
