package zendesk.core;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* loaded from: classes5.dex */
interface PushRegistrationService {
    @POST("/api/mobile/push_notification_devices.json")
    Call<PushRegistrationResponseWrapper> registerDevice(@Body PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @DELETE("/api/mobile/push_notification_devices/{id}.json")
    Call<Void> unregisterDevice(@Path("id") String str);
}
