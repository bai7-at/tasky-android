package zendesk.support;

/* loaded from: classes5.dex */
class ZendeskProviderStore implements ProviderStore {
    private final HelpCenterProvider helpCenterProvider;
    private final RequestProvider requestProvider;
    private final UploadProvider uploadProvider;

    ZendeskProviderStore(HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        this.helpCenterProvider = helpCenterProvider;
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
    }

    @Override // zendesk.support.ProviderStore
    public RequestProvider requestProvider() {
        return this.requestProvider;
    }

    @Override // zendesk.support.ProviderStore
    public UploadProvider uploadProvider() {
        return this.uploadProvider;
    }
}
