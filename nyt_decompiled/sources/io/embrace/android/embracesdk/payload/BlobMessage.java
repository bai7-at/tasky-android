package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BlobMessage {
    private final AppInfo appInfo;
    private final List<AppExitInfoData> applicationExits;
    private final DeviceInfo deviceInfo;
    private final BlobSession session;
    private final UserInfo userInfo;
    private final int version;

    public BlobMessage() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public static /* synthetic */ BlobMessage copy$default(BlobMessage blobMessage, AppInfo appInfo, List list, DeviceInfo deviceInfo, BlobSession blobSession, UserInfo userInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appInfo = blobMessage.appInfo;
        }
        if ((i2 & 2) != 0) {
            list = blobMessage.applicationExits;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            deviceInfo = blobMessage.deviceInfo;
        }
        DeviceInfo deviceInfo2 = deviceInfo;
        if ((i2 & 8) != 0) {
            blobSession = blobMessage.session;
        }
        BlobSession blobSession2 = blobSession;
        if ((i2 & 16) != 0) {
            userInfo = blobMessage.userInfo;
        }
        UserInfo userInfo2 = userInfo;
        if ((i2 & 32) != 0) {
            i = blobMessage.version;
        }
        return blobMessage.copy(appInfo, list2, deviceInfo2, blobSession2, userInfo2, i);
    }

    public final AppInfo component1() {
        return this.appInfo;
    }

    public final List<AppExitInfoData> component2() {
        return this.applicationExits;
    }

    public final DeviceInfo component3() {
        return this.deviceInfo;
    }

    public final BlobSession component4() {
        return this.session;
    }

    public final UserInfo component5() {
        return this.userInfo;
    }

    public final int component6() {
        return this.version;
    }

    public final BlobMessage copy(@bt3(name = "a") AppInfo appInfo, @bt3(name = "bae") List<AppExitInfoData> list, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "s") BlobSession blobSession, @bt3(name = "u") UserInfo userInfo, @bt3(name = "v") int i) {
        zq3.h(list, "applicationExits");
        return new BlobMessage(appInfo, list, deviceInfo, blobSession, userInfo, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlobMessage)) {
            return false;
        }
        BlobMessage blobMessage = (BlobMessage) obj;
        return zq3.c(this.appInfo, blobMessage.appInfo) && zq3.c(this.applicationExits, blobMessage.applicationExits) && zq3.c(this.deviceInfo, blobMessage.deviceInfo) && zq3.c(this.session, blobMessage.session) && zq3.c(this.userInfo, blobMessage.userInfo) && this.version == blobMessage.version;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final List<AppExitInfoData> getApplicationExits() {
        return this.applicationExits;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final BlobSession getSession() {
        return this.session;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        AppInfo appInfo = this.appInfo;
        int hashCode = (appInfo != null ? appInfo.hashCode() : 0) * 31;
        List<AppExitInfoData> list = this.applicationExits;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int hashCode3 = (hashCode2 + (deviceInfo != null ? deviceInfo.hashCode() : 0)) * 31;
        BlobSession blobSession = this.session;
        int hashCode4 = (hashCode3 + (blobSession != null ? blobSession.hashCode() : 0)) * 31;
        UserInfo userInfo = this.userInfo;
        return ((hashCode4 + (userInfo != null ? userInfo.hashCode() : 0)) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "BlobMessage(appInfo=" + this.appInfo + ", applicationExits=" + this.applicationExits + ", deviceInfo=" + this.deviceInfo + ", session=" + this.session + ", userInfo=" + this.userInfo + ", version=" + this.version + ")";
    }

    public BlobMessage(@bt3(name = "a") AppInfo appInfo, @bt3(name = "bae") List<AppExitInfoData> list, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "s") BlobSession blobSession, @bt3(name = "u") UserInfo userInfo, @bt3(name = "v") int i) {
        zq3.h(list, "applicationExits");
        this.appInfo = appInfo;
        this.applicationExits = list;
        this.deviceInfo = deviceInfo;
        this.session = blobSession;
        this.userInfo = userInfo;
        this.version = i;
    }

    public /* synthetic */ BlobMessage(AppInfo appInfo, List list, DeviceInfo deviceInfo, BlobSession blobSession, UserInfo userInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : appInfo, (i2 & 2) != 0 ? i.l() : list, (i2 & 4) != 0 ? null : deviceInfo, (i2 & 8) != 0 ? null : blobSession, (i2 & 16) != 0 ? null : userInfo, (i2 & 32) != 0 ? 13 : i);
    }
}
