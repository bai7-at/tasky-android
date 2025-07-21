package zendesk.support;

/* loaded from: classes5.dex */
interface ZendeskTracker {

    public static class DefaultTracker implements ZendeskTracker {
        @Override // zendesk.support.ZendeskTracker
        public void requestCreated() {
        }

        @Override // zendesk.support.ZendeskTracker
        public void requestUpdated() {
        }
    }

    void requestCreated();

    void requestUpdated();
}
