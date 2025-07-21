package zendesk.core;

import defpackage.tm9;

/* loaded from: classes5.dex */
public interface PushRegistrationProvider {
    boolean isRegisteredForPush();

    void registerWithDeviceIdentifier(String str, tm9 tm9Var);

    void registerWithUAChannelId(String str, tm9 tm9Var);

    void unregisterDevice(tm9 tm9Var);
}
