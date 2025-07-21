package zendesk.core;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
class PushRegistrationRequestWrapper {

    @SerializedName("push_notification_device")
    private PushRegistrationRequest pushRegistrationRequest;

    public PushRegistrationRequestWrapper(PushRegistrationRequest pushRegistrationRequest) {
        this.pushRegistrationRequest = pushRegistrationRequest;
    }

    public PushRegistrationRequest getPushRegistrationRequest() {
        return this.pushRegistrationRequest;
    }
}
