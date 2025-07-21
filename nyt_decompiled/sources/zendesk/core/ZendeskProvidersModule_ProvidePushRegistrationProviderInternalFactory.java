package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory implements ba2 {
    private final p76 pushRegistrationProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(p76 p76Var) {
        this.pushRegistrationProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(p76Var);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (PushRegistrationProviderInternal) g16.c(ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal((PushRegistrationProvider) this.pushRegistrationProvider.get());
    }
}
