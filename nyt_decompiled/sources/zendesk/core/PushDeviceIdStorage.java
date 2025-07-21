package zendesk.core;

/* loaded from: classes5.dex */
interface PushDeviceIdStorage {
    PushRegistrationRequest getPushRegistrationRequest();

    String getRegisteredDeviceId();

    boolean hasRegisteredDeviceId();

    void removePushRegistrationRequest();

    void removeRegisteredDeviceId();

    void storePushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest);

    void storeRegisteredDeviceId(String str);
}
