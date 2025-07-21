package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AppInfo {
    private final Integer appFramework;
    private final Boolean appUpdated;
    private final Boolean appUpdatedThisLaunch;
    private final String appVersion;
    private final String buildFlavor;
    private final String buildGuid;
    private final String buildId;
    private final String buildType;
    private final String bundleVersion;
    private final String environment;
    private final String hostedPlatformVersion;
    private final String hostedSdkVersion;
    private final String javaScriptPatchNumber;
    private final Boolean osUpdated;
    private final Boolean osUpdatedThisLaunch;
    private final String reactNativeBundleId;
    private final String reactNativeVersion;
    private final String sdkSimpleVersion;
    private final String sdkVersion;

    public AppInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final String component1() {
        return this.appVersion;
    }

    public final Boolean component10() {
        return this.osUpdated;
    }

    public final Boolean component11() {
        return this.osUpdatedThisLaunch;
    }

    public final String component12() {
        return this.sdkVersion;
    }

    public final String component13() {
        return this.sdkSimpleVersion;
    }

    public final String component14() {
        return this.reactNativeBundleId;
    }

    public final String component15() {
        return this.javaScriptPatchNumber;
    }

    public final String component16() {
        return this.reactNativeVersion;
    }

    public final String component17() {
        return this.hostedPlatformVersion;
    }

    public final String component18() {
        return this.buildGuid;
    }

    public final String component19() {
        return this.hostedSdkVersion;
    }

    public final Integer component2() {
        return this.appFramework;
    }

    public final String component3() {
        return this.buildId;
    }

    public final String component4() {
        return this.buildType;
    }

    public final String component5() {
        return this.buildFlavor;
    }

    public final String component6() {
        return this.environment;
    }

    public final Boolean component7() {
        return this.appUpdated;
    }

    public final Boolean component8() {
        return this.appUpdatedThisLaunch;
    }

    public final String component9() {
        return this.bundleVersion;
    }

    public final AppInfo copy(@bt3(name = "v") String str, @bt3(name = "f") Integer num, @bt3(name = "bi") String str2, @bt3(name = "bt") String str3, @bt3(name = "fl") String str4, @bt3(name = "e") String str5, @bt3(name = "vu") Boolean bool, @bt3(name = "vul") Boolean bool2, @bt3(name = "bv") String str6, @bt3(name = "ou") Boolean bool3, @bt3(name = "oul") Boolean bool4, @bt3(name = "sdk") String str7, @bt3(name = "sdc") String str8, @bt3(name = "rn") String str9, @bt3(name = "jsp") String str10, @bt3(name = "rnv") String str11, @bt3(name = "unv") String str12, @bt3(name = "ubg") String str13, @bt3(name = "usv") String str14) {
        return new AppInfo(str, num, str2, str3, str4, str5, bool, bool2, str6, bool3, bool4, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return zq3.c(this.appVersion, appInfo.appVersion) && zq3.c(this.appFramework, appInfo.appFramework) && zq3.c(this.buildId, appInfo.buildId) && zq3.c(this.buildType, appInfo.buildType) && zq3.c(this.buildFlavor, appInfo.buildFlavor) && zq3.c(this.environment, appInfo.environment) && zq3.c(this.appUpdated, appInfo.appUpdated) && zq3.c(this.appUpdatedThisLaunch, appInfo.appUpdatedThisLaunch) && zq3.c(this.bundleVersion, appInfo.bundleVersion) && zq3.c(this.osUpdated, appInfo.osUpdated) && zq3.c(this.osUpdatedThisLaunch, appInfo.osUpdatedThisLaunch) && zq3.c(this.sdkVersion, appInfo.sdkVersion) && zq3.c(this.sdkSimpleVersion, appInfo.sdkSimpleVersion) && zq3.c(this.reactNativeBundleId, appInfo.reactNativeBundleId) && zq3.c(this.javaScriptPatchNumber, appInfo.javaScriptPatchNumber) && zq3.c(this.reactNativeVersion, appInfo.reactNativeVersion) && zq3.c(this.hostedPlatformVersion, appInfo.hostedPlatformVersion) && zq3.c(this.buildGuid, appInfo.buildGuid) && zq3.c(this.hostedSdkVersion, appInfo.hostedSdkVersion);
    }

    public final Integer getAppFramework() {
        return this.appFramework;
    }

    public final Boolean getAppUpdated() {
        return this.appUpdated;
    }

    public final Boolean getAppUpdatedThisLaunch() {
        return this.appUpdatedThisLaunch;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBuildFlavor() {
        return this.buildFlavor;
    }

    public final String getBuildGuid() {
        return this.buildGuid;
    }

    public final String getBuildId() {
        return this.buildId;
    }

    public final String getBuildType() {
        return this.buildType;
    }

    public final String getBundleVersion() {
        return this.bundleVersion;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getHostedPlatformVersion() {
        return this.hostedPlatformVersion;
    }

    public final String getHostedSdkVersion() {
        return this.hostedSdkVersion;
    }

    public final String getJavaScriptPatchNumber() {
        return this.javaScriptPatchNumber;
    }

    public final Boolean getOsUpdated() {
        return this.osUpdated;
    }

    public final Boolean getOsUpdatedThisLaunch() {
        return this.osUpdatedThisLaunch;
    }

    public final String getReactNativeBundleId() {
        return this.reactNativeBundleId;
    }

    public final String getReactNativeVersion() {
        return this.reactNativeVersion;
    }

    public final String getSdkSimpleVersion() {
        return this.sdkSimpleVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        String str = this.appVersion;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.appFramework;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.buildId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buildType;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buildFlavor;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.environment;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.appUpdated;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.appUpdatedThisLaunch;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str6 = this.bundleVersion;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool3 = this.osUpdated;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.osUpdatedThisLaunch;
        int hashCode11 = (hashCode10 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        String str7 = this.sdkVersion;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.sdkSimpleVersion;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.reactNativeBundleId;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.javaScriptPatchNumber;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.reactNativeVersion;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.hostedPlatformVersion;
        int hashCode17 = (hashCode16 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.buildGuid;
        int hashCode18 = (hashCode17 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.hostedSdkVersion;
        return hashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "AppInfo(appVersion=" + this.appVersion + ", appFramework=" + this.appFramework + ", buildId=" + this.buildId + ", buildType=" + this.buildType + ", buildFlavor=" + this.buildFlavor + ", environment=" + this.environment + ", appUpdated=" + this.appUpdated + ", appUpdatedThisLaunch=" + this.appUpdatedThisLaunch + ", bundleVersion=" + this.bundleVersion + ", osUpdated=" + this.osUpdated + ", osUpdatedThisLaunch=" + this.osUpdatedThisLaunch + ", sdkVersion=" + this.sdkVersion + ", sdkSimpleVersion=" + this.sdkSimpleVersion + ", reactNativeBundleId=" + this.reactNativeBundleId + ", javaScriptPatchNumber=" + this.javaScriptPatchNumber + ", reactNativeVersion=" + this.reactNativeVersion + ", hostedPlatformVersion=" + this.hostedPlatformVersion + ", buildGuid=" + this.buildGuid + ", hostedSdkVersion=" + this.hostedSdkVersion + ")";
    }

    public AppInfo(@bt3(name = "v") String str, @bt3(name = "f") Integer num, @bt3(name = "bi") String str2, @bt3(name = "bt") String str3, @bt3(name = "fl") String str4, @bt3(name = "e") String str5, @bt3(name = "vu") Boolean bool, @bt3(name = "vul") Boolean bool2, @bt3(name = "bv") String str6, @bt3(name = "ou") Boolean bool3, @bt3(name = "oul") Boolean bool4, @bt3(name = "sdk") String str7, @bt3(name = "sdc") String str8, @bt3(name = "rn") String str9, @bt3(name = "jsp") String str10, @bt3(name = "rnv") String str11, @bt3(name = "unv") String str12, @bt3(name = "ubg") String str13, @bt3(name = "usv") String str14) {
        this.appVersion = str;
        this.appFramework = num;
        this.buildId = str2;
        this.buildType = str3;
        this.buildFlavor = str4;
        this.environment = str5;
        this.appUpdated = bool;
        this.appUpdatedThisLaunch = bool2;
        this.bundleVersion = str6;
        this.osUpdated = bool3;
        this.osUpdatedThisLaunch = bool4;
        this.sdkVersion = str7;
        this.sdkSimpleVersion = str8;
        this.reactNativeBundleId = str9;
        this.javaScriptPatchNumber = str10;
        this.reactNativeVersion = str11;
        this.hostedPlatformVersion = str12;
        this.buildGuid = str13;
        this.hostedSdkVersion = str14;
    }

    public /* synthetic */ AppInfo(String str, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, Boolean bool3, Boolean bool4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str6, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : bool4, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str7, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : str13, (i & 262144) != 0 ? null : str14);
    }
}
