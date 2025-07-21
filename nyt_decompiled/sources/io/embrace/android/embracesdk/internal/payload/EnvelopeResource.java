package io.embrace.android.embracesdk.internal.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.uo6;
import defpackage.zq3;
import java.util.LinkedHashMap;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class EnvelopeResource {
    private final String appEcosystemId;
    private final AppFramework appFramework;
    private final String appVersion;
    private final String buildFlavor;
    private final String buildId;
    private final String buildType;
    private final String bundleVersion;
    private final Integer cpuName;
    private final String deviceArchitecture;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final Long diskTotalCapacity;
    private final Integer eglInfo;
    private final String environment;
    private final String hostedPlatformVersion;
    private final String hostedSdkVersion;
    private final Boolean jailbroken;
    private final String javascriptPatchNumber;
    private final Integer numCores;
    private final String osCode;
    private final String osName;
    private final String osType;
    private final String osVersion;
    private final String reactNativeBundleId;
    private final String reactNativeVersion;
    private final String screenResolution;
    private final Integer sdkSimpleVersion;
    private final String sdkVersion;
    private final String unityBuildId;

    public enum AppFramework {
        NATIVE(1),
        REACT_NATIVE(2),
        UNITY(3),
        FLUTTER(4);

        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            private Companion() {
            }

            public final AppFramework fromInt(int i) {
                AppFramework[] values = AppFramework.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(values.length), 16));
                for (AppFramework appFramework : values) {
                    linkedHashMap.put(Integer.valueOf(appFramework.getValue()), appFramework);
                }
                return (AppFramework) linkedHashMap.get(Integer.valueOf(i));
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        AppFramework(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public EnvelopeResource() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final String component1() {
        return this.appVersion;
    }

    public final Integer component10() {
        return this.sdkSimpleVersion;
    }

    public final String component11() {
        return this.reactNativeBundleId;
    }

    public final String component12() {
        return this.reactNativeVersion;
    }

    public final String component13() {
        return this.javascriptPatchNumber;
    }

    public final String component14() {
        return this.hostedPlatformVersion;
    }

    public final String component15() {
        return this.hostedSdkVersion;
    }

    public final String component16() {
        return this.unityBuildId;
    }

    public final String component17() {
        return this.deviceManufacturer;
    }

    public final String component18() {
        return this.deviceModel;
    }

    public final String component19() {
        return this.deviceArchitecture;
    }

    public final AppFramework component2() {
        return this.appFramework;
    }

    public final Boolean component20() {
        return this.jailbroken;
    }

    public final Long component21() {
        return this.diskTotalCapacity;
    }

    public final String component22() {
        return this.osType;
    }

    public final String component23() {
        return this.osName;
    }

    public final String component24() {
        return this.osVersion;
    }

    public final String component25() {
        return this.osCode;
    }

    public final String component26() {
        return this.screenResolution;
    }

    public final Integer component27() {
        return this.numCores;
    }

    public final Integer component28() {
        return this.cpuName;
    }

    public final Integer component29() {
        return this.eglInfo;
    }

    public final String component3() {
        return this.buildId;
    }

    public final String component4() {
        return this.appEcosystemId;
    }

    public final String component5() {
        return this.buildType;
    }

    public final String component6() {
        return this.buildFlavor;
    }

    public final String component7() {
        return this.environment;
    }

    public final String component8() {
        return this.bundleVersion;
    }

    public final String component9() {
        return this.sdkVersion;
    }

    public final EnvelopeResource copy(@bt3(name = "app_version") String str, @bt3(name = "app_framework") AppFramework appFramework, @bt3(name = "build_id") String str2, @bt3(name = "app_ecosystem_id") String str3, @bt3(name = "build_type") String str4, @bt3(name = "build_flavor") String str5, @bt3(name = "environment") String str6, @bt3(name = "bundle_version") String str7, @bt3(name = "sdk_version") String str8, @bt3(name = "sdk_simple_version") Integer num, @bt3(name = "react_native_bundle_id") String str9, @bt3(name = "react_native_version") String str10, @bt3(name = "javascript_patch_number") String str11, @bt3(name = "hosted_platform_version") String str12, @bt3(name = "hosted_sdk_version") String str13, @bt3(name = "unity_build_id") String str14, @bt3(name = "device_manufacturer") String str15, @bt3(name = "device_model") String str16, @bt3(name = "device_architecture") String str17, @bt3(name = "jailbroken") Boolean bool, @bt3(name = "disk_total_capacity") Long l, @bt3(name = "os_type") String str18, @bt3(name = "os_name") String str19, @bt3(name = "os_version") String str20, @bt3(name = "os_code") String str21, @bt3(name = "screen_resolution") String str22, @bt3(name = "num_cores") Integer num2, @bt3(name = "cpu_name") Integer num3, @bt3(name = "egl_info") Integer num4) {
        return new EnvelopeResource(str, appFramework, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, l, str18, str19, str20, str21, str22, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnvelopeResource)) {
            return false;
        }
        EnvelopeResource envelopeResource = (EnvelopeResource) obj;
        return zq3.c(this.appVersion, envelopeResource.appVersion) && zq3.c(this.appFramework, envelopeResource.appFramework) && zq3.c(this.buildId, envelopeResource.buildId) && zq3.c(this.appEcosystemId, envelopeResource.appEcosystemId) && zq3.c(this.buildType, envelopeResource.buildType) && zq3.c(this.buildFlavor, envelopeResource.buildFlavor) && zq3.c(this.environment, envelopeResource.environment) && zq3.c(this.bundleVersion, envelopeResource.bundleVersion) && zq3.c(this.sdkVersion, envelopeResource.sdkVersion) && zq3.c(this.sdkSimpleVersion, envelopeResource.sdkSimpleVersion) && zq3.c(this.reactNativeBundleId, envelopeResource.reactNativeBundleId) && zq3.c(this.reactNativeVersion, envelopeResource.reactNativeVersion) && zq3.c(this.javascriptPatchNumber, envelopeResource.javascriptPatchNumber) && zq3.c(this.hostedPlatformVersion, envelopeResource.hostedPlatformVersion) && zq3.c(this.hostedSdkVersion, envelopeResource.hostedSdkVersion) && zq3.c(this.unityBuildId, envelopeResource.unityBuildId) && zq3.c(this.deviceManufacturer, envelopeResource.deviceManufacturer) && zq3.c(this.deviceModel, envelopeResource.deviceModel) && zq3.c(this.deviceArchitecture, envelopeResource.deviceArchitecture) && zq3.c(this.jailbroken, envelopeResource.jailbroken) && zq3.c(this.diskTotalCapacity, envelopeResource.diskTotalCapacity) && zq3.c(this.osType, envelopeResource.osType) && zq3.c(this.osName, envelopeResource.osName) && zq3.c(this.osVersion, envelopeResource.osVersion) && zq3.c(this.osCode, envelopeResource.osCode) && zq3.c(this.screenResolution, envelopeResource.screenResolution) && zq3.c(this.numCores, envelopeResource.numCores) && zq3.c(this.cpuName, envelopeResource.cpuName) && zq3.c(this.eglInfo, envelopeResource.eglInfo);
    }

    public final String getAppEcosystemId() {
        return this.appEcosystemId;
    }

    public final AppFramework getAppFramework() {
        return this.appFramework;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBuildFlavor() {
        return this.buildFlavor;
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

    public final Integer getCpuName() {
        return this.cpuName;
    }

    public final String getDeviceArchitecture() {
        return this.deviceArchitecture;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final Long getDiskTotalCapacity() {
        return this.diskTotalCapacity;
    }

    public final Integer getEglInfo() {
        return this.eglInfo;
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

    public final Boolean getJailbroken() {
        return this.jailbroken;
    }

    public final String getJavascriptPatchNumber() {
        return this.javascriptPatchNumber;
    }

    public final Integer getNumCores() {
        return this.numCores;
    }

    public final String getOsCode() {
        return this.osCode;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsType() {
        return this.osType;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getReactNativeBundleId() {
        return this.reactNativeBundleId;
    }

    public final String getReactNativeVersion() {
        return this.reactNativeVersion;
    }

    public final String getScreenResolution() {
        return this.screenResolution;
    }

    public final Integer getSdkSimpleVersion() {
        return this.sdkSimpleVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getUnityBuildId() {
        return this.unityBuildId;
    }

    public int hashCode() {
        String str = this.appVersion;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AppFramework appFramework = this.appFramework;
        int hashCode2 = (hashCode + (appFramework != null ? appFramework.hashCode() : 0)) * 31;
        String str2 = this.buildId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appEcosystemId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buildType;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.buildFlavor;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.environment;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.bundleVersion;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.sdkVersion;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num = this.sdkSimpleVersion;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str9 = this.reactNativeBundleId;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.reactNativeVersion;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.javascriptPatchNumber;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.hostedPlatformVersion;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.hostedSdkVersion;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.unityBuildId;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.deviceManufacturer;
        int hashCode17 = (hashCode16 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.deviceModel;
        int hashCode18 = (hashCode17 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.deviceArchitecture;
        int hashCode19 = (hashCode18 + (str17 != null ? str17.hashCode() : 0)) * 31;
        Boolean bool = this.jailbroken;
        int hashCode20 = (hashCode19 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.diskTotalCapacity;
        int hashCode21 = (hashCode20 + (l != null ? l.hashCode() : 0)) * 31;
        String str18 = this.osType;
        int hashCode22 = (hashCode21 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.osName;
        int hashCode23 = (hashCode22 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.osVersion;
        int hashCode24 = (hashCode23 + (str20 != null ? str20.hashCode() : 0)) * 31;
        String str21 = this.osCode;
        int hashCode25 = (hashCode24 + (str21 != null ? str21.hashCode() : 0)) * 31;
        String str22 = this.screenResolution;
        int hashCode26 = (hashCode25 + (str22 != null ? str22.hashCode() : 0)) * 31;
        Integer num2 = this.numCores;
        int hashCode27 = (hashCode26 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.cpuName;
        int hashCode28 = (hashCode27 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.eglInfo;
        return hashCode28 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "EnvelopeResource(appVersion=" + this.appVersion + ", appFramework=" + this.appFramework + ", buildId=" + this.buildId + ", appEcosystemId=" + this.appEcosystemId + ", buildType=" + this.buildType + ", buildFlavor=" + this.buildFlavor + ", environment=" + this.environment + ", bundleVersion=" + this.bundleVersion + ", sdkVersion=" + this.sdkVersion + ", sdkSimpleVersion=" + this.sdkSimpleVersion + ", reactNativeBundleId=" + this.reactNativeBundleId + ", reactNativeVersion=" + this.reactNativeVersion + ", javascriptPatchNumber=" + this.javascriptPatchNumber + ", hostedPlatformVersion=" + this.hostedPlatformVersion + ", hostedSdkVersion=" + this.hostedSdkVersion + ", unityBuildId=" + this.unityBuildId + ", deviceManufacturer=" + this.deviceManufacturer + ", deviceModel=" + this.deviceModel + ", deviceArchitecture=" + this.deviceArchitecture + ", jailbroken=" + this.jailbroken + ", diskTotalCapacity=" + this.diskTotalCapacity + ", osType=" + this.osType + ", osName=" + this.osName + ", osVersion=" + this.osVersion + ", osCode=" + this.osCode + ", screenResolution=" + this.screenResolution + ", numCores=" + this.numCores + ", cpuName=" + this.cpuName + ", eglInfo=" + this.eglInfo + ")";
    }

    public EnvelopeResource(@bt3(name = "app_version") String str, @bt3(name = "app_framework") AppFramework appFramework, @bt3(name = "build_id") String str2, @bt3(name = "app_ecosystem_id") String str3, @bt3(name = "build_type") String str4, @bt3(name = "build_flavor") String str5, @bt3(name = "environment") String str6, @bt3(name = "bundle_version") String str7, @bt3(name = "sdk_version") String str8, @bt3(name = "sdk_simple_version") Integer num, @bt3(name = "react_native_bundle_id") String str9, @bt3(name = "react_native_version") String str10, @bt3(name = "javascript_patch_number") String str11, @bt3(name = "hosted_platform_version") String str12, @bt3(name = "hosted_sdk_version") String str13, @bt3(name = "unity_build_id") String str14, @bt3(name = "device_manufacturer") String str15, @bt3(name = "device_model") String str16, @bt3(name = "device_architecture") String str17, @bt3(name = "jailbroken") Boolean bool, @bt3(name = "disk_total_capacity") Long l, @bt3(name = "os_type") String str18, @bt3(name = "os_name") String str19, @bt3(name = "os_version") String str20, @bt3(name = "os_code") String str21, @bt3(name = "screen_resolution") String str22, @bt3(name = "num_cores") Integer num2, @bt3(name = "cpu_name") Integer num3, @bt3(name = "egl_info") Integer num4) {
        this.appVersion = str;
        this.appFramework = appFramework;
        this.buildId = str2;
        this.appEcosystemId = str3;
        this.buildType = str4;
        this.buildFlavor = str5;
        this.environment = str6;
        this.bundleVersion = str7;
        this.sdkVersion = str8;
        this.sdkSimpleVersion = num;
        this.reactNativeBundleId = str9;
        this.reactNativeVersion = str10;
        this.javascriptPatchNumber = str11;
        this.hostedPlatformVersion = str12;
        this.hostedSdkVersion = str13;
        this.unityBuildId = str14;
        this.deviceManufacturer = str15;
        this.deviceModel = str16;
        this.deviceArchitecture = str17;
        this.jailbroken = bool;
        this.diskTotalCapacity = l;
        this.osType = str18;
        this.osName = str19;
        this.osVersion = str20;
        this.osCode = str21;
        this.screenResolution = str22;
        this.numCores = num2;
        this.cpuName = num3;
        this.eglInfo = num4;
    }

    public /* synthetic */ EnvelopeResource(String str, AppFramework appFramework, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, Long l, String str18, String str19, String str20, String str21, String str22, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : appFramework, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str8, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str9, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str10, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : bool, (i & Constants.MB) != 0 ? null : l, (i & 2097152) != 0 ? null : str18, (i & 4194304) != 0 ? null : str19, (i & 8388608) != 0 ? null : str20, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str21, (i & 33554432) != 0 ? null : str22, (i & 67108864) != 0 ? null : num2, (i & 134217728) != 0 ? null : num3, (i & 268435456) != 0 ? null : num4);
    }
}
