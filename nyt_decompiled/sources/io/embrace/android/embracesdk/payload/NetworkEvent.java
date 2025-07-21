package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkEvent {
    private final String appId;
    private final AppInfo appInfo;
    private final String deviceId;
    private final String eventId;
    private final String ipAddress;
    private final NetworkCapturedCall networkCaptureCall;
    private final String sessionId;
    private final String timestamp;

    public NetworkEvent(@bt3(name = "app_id") String str, @bt3(name = "a") AppInfo appInfo, @bt3(name = "device_id") String str2, @bt3(name = "id") String str3, @bt3(name = "n") NetworkCapturedCall networkCapturedCall, @bt3(name = "ts") String str4, @bt3(name = "ip") String str5, @bt3(name = "si") String str6) {
        zq3.h(str, "appId");
        zq3.h(appInfo, "appInfo");
        zq3.h(str2, "deviceId");
        zq3.h(str3, "eventId");
        zq3.h(networkCapturedCall, "networkCaptureCall");
        zq3.h(str4, "timestamp");
        this.appId = str;
        this.appInfo = appInfo;
        this.deviceId = str2;
        this.eventId = str3;
        this.networkCaptureCall = networkCapturedCall;
        this.timestamp = str4;
        this.ipAddress = str5;
        this.sessionId = str6;
    }

    public final String component1() {
        return this.appId;
    }

    public final AppInfo component2() {
        return this.appInfo;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.eventId;
    }

    public final NetworkCapturedCall component5() {
        return this.networkCaptureCall;
    }

    public final String component6() {
        return this.timestamp;
    }

    public final String component7() {
        return this.ipAddress;
    }

    public final String component8() {
        return this.sessionId;
    }

    public final NetworkEvent copy(@bt3(name = "app_id") String str, @bt3(name = "a") AppInfo appInfo, @bt3(name = "device_id") String str2, @bt3(name = "id") String str3, @bt3(name = "n") NetworkCapturedCall networkCapturedCall, @bt3(name = "ts") String str4, @bt3(name = "ip") String str5, @bt3(name = "si") String str6) {
        zq3.h(str, "appId");
        zq3.h(appInfo, "appInfo");
        zq3.h(str2, "deviceId");
        zq3.h(str3, "eventId");
        zq3.h(networkCapturedCall, "networkCaptureCall");
        zq3.h(str4, "timestamp");
        return new NetworkEvent(str, appInfo, str2, str3, networkCapturedCall, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkEvent)) {
            return false;
        }
        NetworkEvent networkEvent = (NetworkEvent) obj;
        return zq3.c(this.appId, networkEvent.appId) && zq3.c(this.appInfo, networkEvent.appInfo) && zq3.c(this.deviceId, networkEvent.deviceId) && zq3.c(this.eventId, networkEvent.eventId) && zq3.c(this.networkCaptureCall, networkEvent.networkCaptureCall) && zq3.c(this.timestamp, networkEvent.timestamp) && zq3.c(this.ipAddress, networkEvent.ipAddress) && zq3.c(this.sessionId, networkEvent.sessionId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final NetworkCapturedCall getNetworkCaptureCall() {
        return this.networkCaptureCall;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.appId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AppInfo appInfo = this.appInfo;
        int hashCode2 = (hashCode + (appInfo != null ? appInfo.hashCode() : 0)) * 31;
        String str2 = this.deviceId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.eventId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        NetworkCapturedCall networkCapturedCall = this.networkCaptureCall;
        int hashCode5 = (hashCode4 + (networkCapturedCall != null ? networkCapturedCall.hashCode() : 0)) * 31;
        String str4 = this.timestamp;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.ipAddress;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.sessionId;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "NetworkEvent(appId=" + this.appId + ", appInfo=" + this.appInfo + ", deviceId=" + this.deviceId + ", eventId=" + this.eventId + ", networkCaptureCall=" + this.networkCaptureCall + ", timestamp=" + this.timestamp + ", ipAddress=" + this.ipAddress + ", sessionId=" + this.sessionId + ")";
    }

    public /* synthetic */ NetworkEvent(String str, AppInfo appInfo, String str2, String str3, NetworkCapturedCall networkCapturedCall, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, appInfo, str2, str3, networkCapturedCall, str4, str5, (i & 128) != 0 ? null : str6);
    }
}
