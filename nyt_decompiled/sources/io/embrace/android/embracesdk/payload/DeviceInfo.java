package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class DeviceInfo {
    private final String architecture;
    private final Integer cores;
    private final String cpuName;
    private final String egl;
    private final Long internalStorageTotalCapacity;
    private final Boolean jailbroken;
    private final String locale;
    private final String manufacturer;
    private final String model;
    private final String operatingSystemType;
    private final String operatingSystemVersion;
    private final Integer operatingSystemVersionCode;
    private final String screenResolution;
    private final String timezoneDescription;

    public DeviceInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.manufacturer;
    }

    public final String component10() {
        return this.screenResolution;
    }

    public final String component11() {
        return this.timezoneDescription;
    }

    public final Integer component12() {
        return this.cores;
    }

    public final String component13() {
        return this.cpuName;
    }

    public final String component14() {
        return this.egl;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.architecture;
    }

    public final Boolean component4() {
        return this.jailbroken;
    }

    public final String component5() {
        return this.locale;
    }

    public final Long component6() {
        return this.internalStorageTotalCapacity;
    }

    public final String component7() {
        return this.operatingSystemType;
    }

    public final String component8() {
        return this.operatingSystemVersion;
    }

    public final Integer component9() {
        return this.operatingSystemVersionCode;
    }

    public final DeviceInfo copy(@bt3(name = "dm") String str, @bt3(name = "do") String str2, @bt3(name = "da") String str3, @bt3(name = "jb") Boolean bool, @bt3(name = "lc") String str4, @bt3(name = "ms") Long l, @bt3(name = "os") String str5, @bt3(name = "ov") String str6, @bt3(name = "oc") Integer num, @bt3(name = "sr") String str7, @bt3(name = "tz") String str8, @bt3(name = "nc") Integer num2, @bt3(name = "pt") String str9, @bt3(name = "gp") String str10) {
        return new DeviceInfo(str, str2, str3, bool, str4, l, str5, str6, num, str7, str8, num2, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return zq3.c(this.manufacturer, deviceInfo.manufacturer) && zq3.c(this.model, deviceInfo.model) && zq3.c(this.architecture, deviceInfo.architecture) && zq3.c(this.jailbroken, deviceInfo.jailbroken) && zq3.c(this.locale, deviceInfo.locale) && zq3.c(this.internalStorageTotalCapacity, deviceInfo.internalStorageTotalCapacity) && zq3.c(this.operatingSystemType, deviceInfo.operatingSystemType) && zq3.c(this.operatingSystemVersion, deviceInfo.operatingSystemVersion) && zq3.c(this.operatingSystemVersionCode, deviceInfo.operatingSystemVersionCode) && zq3.c(this.screenResolution, deviceInfo.screenResolution) && zq3.c(this.timezoneDescription, deviceInfo.timezoneDescription) && zq3.c(this.cores, deviceInfo.cores) && zq3.c(this.cpuName, deviceInfo.cpuName) && zq3.c(this.egl, deviceInfo.egl);
    }

    public final String getArchitecture() {
        return this.architecture;
    }

    public final Integer getCores() {
        return this.cores;
    }

    public final String getCpuName() {
        return this.cpuName;
    }

    public final String getEgl() {
        return this.egl;
    }

    public final Long getInternalStorageTotalCapacity() {
        return this.internalStorageTotalCapacity;
    }

    public final Boolean getJailbroken() {
        return this.jailbroken;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOperatingSystemType() {
        return this.operatingSystemType;
    }

    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public final Integer getOperatingSystemVersionCode() {
        return this.operatingSystemVersionCode;
    }

    public final String getScreenResolution() {
        return this.screenResolution;
    }

    public final String getTimezoneDescription() {
        return this.timezoneDescription;
    }

    public int hashCode() {
        String str = this.manufacturer;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.model;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.architecture;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.jailbroken;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.locale;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.internalStorageTotalCapacity;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        String str5 = this.operatingSystemType;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.operatingSystemVersion;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.operatingSystemVersionCode;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.screenResolution;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.timezoneDescription;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num2 = this.cores;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str9 = this.cpuName;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.egl;
        return hashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "DeviceInfo(manufacturer=" + this.manufacturer + ", model=" + this.model + ", architecture=" + this.architecture + ", jailbroken=" + this.jailbroken + ", locale=" + this.locale + ", internalStorageTotalCapacity=" + this.internalStorageTotalCapacity + ", operatingSystemType=" + this.operatingSystemType + ", operatingSystemVersion=" + this.operatingSystemVersion + ", operatingSystemVersionCode=" + this.operatingSystemVersionCode + ", screenResolution=" + this.screenResolution + ", timezoneDescription=" + this.timezoneDescription + ", cores=" + this.cores + ", cpuName=" + this.cpuName + ", egl=" + this.egl + ")";
    }

    public DeviceInfo(@bt3(name = "dm") String str, @bt3(name = "do") String str2, @bt3(name = "da") String str3, @bt3(name = "jb") Boolean bool, @bt3(name = "lc") String str4, @bt3(name = "ms") Long l, @bt3(name = "os") String str5, @bt3(name = "ov") String str6, @bt3(name = "oc") Integer num, @bt3(name = "sr") String str7, @bt3(name = "tz") String str8, @bt3(name = "nc") Integer num2, @bt3(name = "pt") String str9, @bt3(name = "gp") String str10) {
        this.manufacturer = str;
        this.model = str2;
        this.architecture = str3;
        this.jailbroken = bool;
        this.locale = str4;
        this.internalStorageTotalCapacity = l;
        this.operatingSystemType = str5;
        this.operatingSystemVersion = str6;
        this.operatingSystemVersionCode = num;
        this.screenResolution = str7;
        this.timezoneDescription = str8;
        this.cores = num2;
        this.cpuName = str9;
        this.egl = str10;
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, Boolean bool, String str4, Long l, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : num, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : num2, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str9, (i & 8192) == 0 ? str10 : null);
    }
}
