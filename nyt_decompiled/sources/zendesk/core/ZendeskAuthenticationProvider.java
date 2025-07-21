package zendesk.core;

/* loaded from: classes5.dex */
class ZendeskAuthenticationProvider implements AuthenticationProvider {
    private final IdentityManager identityManager;

    ZendeskAuthenticationProvider(IdentityManager identityManager) {
        this.identityManager = identityManager;
    }

    @Override // zendesk.core.AuthenticationProvider
    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }
}
