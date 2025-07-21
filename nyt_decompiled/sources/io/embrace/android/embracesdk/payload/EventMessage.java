package io.embrace.android.embracesdk.payload;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class EventMessage {
    private final AppInfo appInfo;
    private final Crash crash;
    private final DeviceInfo deviceInfo;
    private final Event event;
    private final NativeCrash nativeCrash;
    private final PerformanceInfo performanceInfo;
    private final Stacktraces stacktraces;
    private final UserInfo userInfo;
    private final int version;

    public EventMessage(@bt3(name = "et") Event event, @bt3(name = "cr") Crash crash, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "u") UserInfo userInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "sk") Stacktraces stacktraces, @bt3(name = "v") int i, @bt3(name = "crn") NativeCrash nativeCrash) {
        zq3.h(event, "event");
        this.event = event;
        this.crash = crash;
        this.deviceInfo = deviceInfo;
        this.appInfo = appInfo;
        this.userInfo = userInfo;
        this.performanceInfo = performanceInfo;
        this.stacktraces = stacktraces;
        this.version = i;
        this.nativeCrash = nativeCrash;
    }

    public final Event component1() {
        return this.event;
    }

    public final Crash component2() {
        return this.crash;
    }

    public final DeviceInfo component3() {
        return this.deviceInfo;
    }

    public final AppInfo component4() {
        return this.appInfo;
    }

    public final UserInfo component5() {
        return this.userInfo;
    }

    public final PerformanceInfo component6() {
        return this.performanceInfo;
    }

    public final Stacktraces component7() {
        return this.stacktraces;
    }

    public final int component8() {
        return this.version;
    }

    public final NativeCrash component9() {
        return this.nativeCrash;
    }

    public final EventMessage copy(@bt3(name = "et") Event event, @bt3(name = "cr") Crash crash, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "u") UserInfo userInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "sk") Stacktraces stacktraces, @bt3(name = "v") int i, @bt3(name = "crn") NativeCrash nativeCrash) {
        zq3.h(event, "event");
        return new EventMessage(event, crash, deviceInfo, appInfo, userInfo, performanceInfo, stacktraces, i, nativeCrash);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMessage)) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return zq3.c(this.event, eventMessage.event) && zq3.c(this.crash, eventMessage.crash) && zq3.c(this.deviceInfo, eventMessage.deviceInfo) && zq3.c(this.appInfo, eventMessage.appInfo) && zq3.c(this.userInfo, eventMessage.userInfo) && zq3.c(this.performanceInfo, eventMessage.performanceInfo) && zq3.c(this.stacktraces, eventMessage.stacktraces) && this.version == eventMessage.version && zq3.c(this.nativeCrash, eventMessage.nativeCrash);
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Crash getCrash() {
        return this.crash;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final NativeCrash getNativeCrash() {
        return this.nativeCrash;
    }

    public final PerformanceInfo getPerformanceInfo() {
        return this.performanceInfo;
    }

    public final Stacktraces getStacktraces() {
        return this.stacktraces;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        Event event = this.event;
        int hashCode = (event != null ? event.hashCode() : 0) * 31;
        Crash crash = this.crash;
        int hashCode2 = (hashCode + (crash != null ? crash.hashCode() : 0)) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int hashCode3 = (hashCode2 + (deviceInfo != null ? deviceInfo.hashCode() : 0)) * 31;
        AppInfo appInfo = this.appInfo;
        int hashCode4 = (hashCode3 + (appInfo != null ? appInfo.hashCode() : 0)) * 31;
        UserInfo userInfo = this.userInfo;
        int hashCode5 = (hashCode4 + (userInfo != null ? userInfo.hashCode() : 0)) * 31;
        PerformanceInfo performanceInfo = this.performanceInfo;
        int hashCode6 = (hashCode5 + (performanceInfo != null ? performanceInfo.hashCode() : 0)) * 31;
        Stacktraces stacktraces = this.stacktraces;
        int hashCode7 = (((hashCode6 + (stacktraces != null ? stacktraces.hashCode() : 0)) * 31) + Integer.hashCode(this.version)) * 31;
        NativeCrash nativeCrash = this.nativeCrash;
        return hashCode7 + (nativeCrash != null ? nativeCrash.hashCode() : 0);
    }

    public String toString() {
        return "EventMessage(event=" + this.event + ", crash=" + this.crash + ", deviceInfo=" + this.deviceInfo + ", appInfo=" + this.appInfo + ", userInfo=" + this.userInfo + ", performanceInfo=" + this.performanceInfo + ", stacktraces=" + this.stacktraces + ", version=" + this.version + ", nativeCrash=" + this.nativeCrash + ")";
    }

    public /* synthetic */ EventMessage(Event event, Crash crash, DeviceInfo deviceInfo, AppInfo appInfo, UserInfo userInfo, PerformanceInfo performanceInfo, Stacktraces stacktraces, int i, NativeCrash nativeCrash, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, (i2 & 2) != 0 ? null : crash, (i2 & 4) != 0 ? null : deviceInfo, (i2 & 8) != 0 ? null : appInfo, (i2 & 16) != 0 ? null : userInfo, (i2 & 32) != 0 ? null : performanceInfo, (i2 & 64) != 0 ? null : stacktraces, (i2 & 128) != 0 ? 13 : i, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 ? nativeCrash : null);
    }
}
