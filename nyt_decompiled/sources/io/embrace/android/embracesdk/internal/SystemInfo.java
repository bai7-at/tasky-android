package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SystemInfo {
    private final String androidOsApiLevel;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String osBuild;
    private final String osName;
    private final String osType;
    private final String osVersion;

    public SystemInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ SystemInfo copy$default(SystemInfo systemInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = systemInfo.osName;
        }
        if ((i & 2) != 0) {
            str2 = systemInfo.osType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = systemInfo.osBuild;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = systemInfo.osVersion;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = systemInfo.androidOsApiLevel;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = systemInfo.deviceManufacturer;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = systemInfo.deviceModel;
        }
        return systemInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.osName;
    }

    public final String component2() {
        return this.osType;
    }

    public final String component3() {
        return this.osBuild;
    }

    public final String component4() {
        return this.osVersion;
    }

    public final String component5() {
        return this.androidOsApiLevel;
    }

    public final String component6() {
        return this.deviceManufacturer;
    }

    public final String component7() {
        return this.deviceModel;
    }

    public final SystemInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        zq3.h(str, "osName");
        zq3.h(str2, "osType");
        zq3.h(str3, "osBuild");
        zq3.h(str4, "osVersion");
        zq3.h(str5, "androidOsApiLevel");
        zq3.h(str6, "deviceManufacturer");
        zq3.h(str7, "deviceModel");
        return new SystemInfo(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) obj;
        return zq3.c(this.osName, systemInfo.osName) && zq3.c(this.osType, systemInfo.osType) && zq3.c(this.osBuild, systemInfo.osBuild) && zq3.c(this.osVersion, systemInfo.osVersion) && zq3.c(this.androidOsApiLevel, systemInfo.androidOsApiLevel) && zq3.c(this.deviceManufacturer, systemInfo.deviceManufacturer) && zq3.c(this.deviceModel, systemInfo.deviceModel);
    }

    public final String getAndroidOsApiLevel() {
        return this.androidOsApiLevel;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getOsBuild() {
        return this.osBuild;
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

    public int hashCode() {
        String str = this.osName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.osType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.osBuild;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.osVersion;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.androidOsApiLevel;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.deviceManufacturer;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.deviceModel;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "SystemInfo(osName=" + this.osName + ", osType=" + this.osType + ", osBuild=" + this.osBuild + ", osVersion=" + this.osVersion + ", androidOsApiLevel=" + this.androidOsApiLevel + ", deviceManufacturer=" + this.deviceManufacturer + ", deviceModel=" + this.deviceModel + ")";
    }

    public SystemInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        zq3.h(str, "osName");
        zq3.h(str2, "osType");
        zq3.h(str3, "osBuild");
        zq3.h(str4, "osVersion");
        zq3.h(str5, "androidOsApiLevel");
        zq3.h(str6, "deviceManufacturer");
        zq3.h(str7, "deviceModel");
        this.osName = str;
        this.osType = str2;
        this.osBuild = str3;
        this.osVersion = str4;
        this.androidOsApiLevel = str5;
        this.deviceManufacturer = str6;
        this.deviceModel = str7;
    }

    public /* synthetic */ SystemInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "android" : str, (i & 2) != 0 ? "linux" : str2, (i & 4) != 0 ? SystemInfoKt.getOsBuild() : str3, (i & 8) != 0 ? SystemInfoKt.getOsVersion() : str4, (i & 16) != 0 ? SystemInfoKt.getOsApiLevel() : str5, (i & 32) != 0 ? SystemInfoKt.getDeviceManufacturer() : str6, (i & 64) != 0 ? SystemInfoKt.getDeviceModel() : str7);
    }
}
