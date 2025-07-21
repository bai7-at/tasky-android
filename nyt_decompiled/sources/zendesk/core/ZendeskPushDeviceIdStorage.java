package zendesk.core;

/* loaded from: classes5.dex */
class ZendeskPushDeviceIdStorage implements PushDeviceIdStorage {
    private final BaseStorage deviceIdStorage;

    ZendeskPushDeviceIdStorage(BaseStorage baseStorage) {
        this.deviceIdStorage = baseStorage;
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public PushRegistrationRequest getPushRegistrationRequest() {
        return (PushRegistrationRequest) this.deviceIdStorage.get(Constants.PUSH_REGISTRATION_REQUEST, PushRegistrationRequest.class);
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public String getRegisteredDeviceId() {
        return this.deviceIdStorage.get(Constants.PUSH_DEVICE_IDENTIFIER);
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public boolean hasRegisteredDeviceId() {
        return this.deviceIdStorage.get(Constants.PUSH_DEVICE_IDENTIFIER) != null;
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public void removePushRegistrationRequest() {
        this.deviceIdStorage.remove(Constants.PUSH_REGISTRATION_REQUEST);
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public void removeRegisteredDeviceId() {
        this.deviceIdStorage.remove(Constants.PUSH_DEVICE_IDENTIFIER);
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public void storePushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        this.deviceIdStorage.put(Constants.PUSH_REGISTRATION_REQUEST, pushRegistrationRequest);
    }

    @Override // zendesk.core.PushDeviceIdStorage
    public void storeRegisteredDeviceId(String str) {
        if (str != null) {
            this.deviceIdStorage.put(Constants.PUSH_DEVICE_IDENTIFIER, str);
        }
    }
}
