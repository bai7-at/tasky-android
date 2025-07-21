package zendesk.core;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
class PushRegistrationResponseWrapper {

    @SerializedName("push_notification_device")
    private PushRegistrationResponse registrationResponse;

    PushRegistrationResponseWrapper() {
    }

    PushRegistrationResponse getRegistrationResponse() {
        return this.registrationResponse;
    }
}
