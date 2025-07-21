package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideUserProviderFactory implements ba2 {
    private final p76 userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(p76 p76Var) {
        this.userServiceProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(p76Var);
    }

    public static UserProvider provideUserProvider(Object obj) {
        return (UserProvider) g16.c(ZendeskProvidersModule.provideUserProvider((UserService) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}
