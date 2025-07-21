package zendesk.core;

/* loaded from: classes5.dex */
class ZendeskProviderStore implements ProviderStore {
    private final PushRegistrationProvider pushRegistrationProvider;
    private final UserProvider userProvider;

    ZendeskProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        this.userProvider = userProvider;
        this.pushRegistrationProvider = pushRegistrationProvider;
    }

    @Override // zendesk.core.ProviderStore
    public PushRegistrationProvider pushRegistrationProvider() {
        return this.pushRegistrationProvider;
    }

    @Override // zendesk.core.ProviderStore
    public UserProvider userProvider() {
        return this.userProvider;
    }
}
