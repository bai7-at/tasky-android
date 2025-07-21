package io.embrace.android.embracesdk.fcm.swazzle.callback.com.android.fcm;

import com.google.firebase.messaging.RemoteMessage;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public final class FirebaseSwazzledHooks {
    private FirebaseSwazzledHooks() {
    }

    @InternalApi
    public static void _onMessageReceived(RemoteMessage remoteMessage) {
        if (Embrace.getInstance().isStarted()) {
            handleRemoteMessage(remoteMessage);
        } else {
            logError("Embrace received push notification data before the SDK was started", null);
        }
    }

    private static void handleRemoteMessage(RemoteMessage remoteMessage) {
        String str;
        String str2;
        Integer num;
        RemoteMessage.b bVar;
        String str3;
        String str4;
        Integer num2;
        String str5;
        String str6;
        try {
            Embrace.getInstance().getInternalInterface().setProcessStartedByNotification();
            Integer num3 = null;
            try {
                str = remoteMessage.H0();
            } catch (Exception e) {
                logError("Failed to capture FCM messageId", e);
                str = null;
            }
            try {
                str2 = remoteMessage.G0();
            } catch (Exception e2) {
                logError("Failed to capture FCM topic", e2);
                str2 = null;
            }
            try {
                num = Integer.valueOf(remoteMessage.u1());
            } catch (Exception e3) {
                logError("Failed to capture FCM message priority", e3);
                num = null;
            }
            try {
                bVar = remoteMessage.X0();
            } catch (Exception e4) {
                logError("Failed to capture FCM RemoteMessage Notification", e4);
                bVar = null;
            }
            if (bVar != null) {
                try {
                    str3 = bVar.d();
                } catch (Exception e5) {
                    logError("Failed to capture FCM title", e5);
                    str3 = null;
                }
                try {
                    str4 = bVar.a();
                } catch (Exception e6) {
                    logError("Failed to capture FCM body", e6);
                    str4 = null;
                }
                try {
                    num3 = bVar.c();
                } catch (Exception e7) {
                    logError("Failed to capture FCM notificationPriority", e7);
                }
                num2 = num3;
                str5 = str3;
                str6 = str4;
            } else {
                str5 = null;
                str6 = null;
                num2 = null;
            }
            try {
                Embrace.getInstance().logPushNotification(str5, str6, str2, str, num2, num, Boolean.valueOf(bVar != null), Boolean.valueOf(!remoteMessage.t0().isEmpty()));
            } catch (Exception e8) {
                logError("Failed to log push Notification", e8);
            }
        } catch (Exception e9) {
            logError("Push Notification Error", e9);
        }
    }

    private static void logError(String str, Exception exc) {
        Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
        if (exc != null) {
            Embrace.getInstance().getInternalInterface().logInternalError(exc);
        }
    }
}
