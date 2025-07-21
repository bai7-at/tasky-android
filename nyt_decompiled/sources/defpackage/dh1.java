package defpackage;

import io.embrace.android.embracesdk.Embrace;

/* loaded from: classes4.dex */
public final class dh1 implements pz1 {
    @Override // defpackage.pz1
    public boolean a() {
        return Embrace.getInstance().isStarted();
    }

    @Override // defpackage.pz1
    public String getDeviceId() {
        String deviceId = Embrace.getInstance().getDeviceId();
        zq3.g(deviceId, "getDeviceId(...)");
        return deviceId;
    }
}
