package com.nytimes.android.meter;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class MeterServiceResponse {
    public static final long LATENCY_DEFAULT = -1;
    private final String assetType;
    private final boolean counted;
    private final boolean deviceOffline;
    private final boolean disabledByBetaSettings;
    private final String errorMessage;
    private final boolean gatewayExempt;

    @SerializedName("gateway")
    private final boolean gatewayOnline;
    private final String gatewayType;
    private final String gatewayTypeVariation;
    private final String grantReason;
    private final boolean granted;
    private final String hash;
    private final boolean hitPaywall;
    private final boolean hitRegiwall;
    private long meterLatencyDelta;
    private final MeterResponseStatus responseStatus;

    @SerializedName(QueryKeys.TOKEN)
    private final int total;

    @SerializedName(TransferTable.COLUMN_KEY)
    private final String userRequestKey;

    @SerializedName(QueryKeys.INTERNAL_REFERRER)
    private final int viewsRaw;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(boolean z, int i, int i2) {
            if (z) {
                return -1;
            }
            return Math.max(0, i - i2);
        }

        private a() {
        }
    }

    public MeterServiceResponse() {
        this(false, false, null, 0, 0, null, false, false, false, null, false, null, false, false, null, null, null, null, 262143, null);
    }

    private final boolean callWasPeek() {
        return h.d0(this.hash);
    }

    public final boolean component1() {
        return this.granted;
    }

    public final String component10() {
        return this.gatewayType;
    }

    public final boolean component11() {
        return this.gatewayExempt;
    }

    public final String component12() {
        return this.grantReason;
    }

    public final boolean component13() {
        return this.hitRegiwall;
    }

    public final boolean component14() {
        return this.hitPaywall;
    }

    public final String component15() {
        return this.gatewayTypeVariation;
    }

    public final String component16() {
        return this.userRequestKey;
    }

    public final MeterResponseStatus component17() {
        return this.responseStatus;
    }

    public final String component18() {
        return this.errorMessage;
    }

    public final boolean component2() {
        return this.counted;
    }

    public final String component3() {
        return this.hash;
    }

    public final int component4() {
        return this.viewsRaw;
    }

    public final int component5() {
        return this.total;
    }

    public final String component6() {
        return this.assetType;
    }

    public final boolean component7() {
        return this.disabledByBetaSettings;
    }

    public final boolean component8() {
        return this.deviceOffline;
    }

    public final boolean component9() {
        return this.gatewayOnline;
    }

    public final MeterServiceResponse copy(boolean z, boolean z2, String str, int i, int i2, String str2, boolean z3, boolean z4, boolean z5, String str3, boolean z6, String str4, boolean z7, boolean z8, String str5, String str6, MeterResponseStatus meterResponseStatus, String str7) {
        zq3.h(str, "hash");
        zq3.h(str3, "gatewayType");
        zq3.h(str4, "grantReason");
        zq3.h(str5, "gatewayTypeVariation");
        zq3.h(str6, "userRequestKey");
        zq3.h(meterResponseStatus, "responseStatus");
        zq3.h(str7, "errorMessage");
        return new MeterServiceResponse(z, z2, str, i, i2, str2, z3, z4, z5, str3, z6, str4, z7, z8, str5, str6, meterResponseStatus, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeterServiceResponse)) {
            return false;
        }
        MeterServiceResponse meterServiceResponse = (MeterServiceResponse) obj;
        return this.granted == meterServiceResponse.granted && this.counted == meterServiceResponse.counted && zq3.c(this.hash, meterServiceResponse.hash) && this.viewsRaw == meterServiceResponse.viewsRaw && this.total == meterServiceResponse.total && zq3.c(this.assetType, meterServiceResponse.assetType) && this.disabledByBetaSettings == meterServiceResponse.disabledByBetaSettings && this.deviceOffline == meterServiceResponse.deviceOffline && this.gatewayOnline == meterServiceResponse.gatewayOnline && zq3.c(this.gatewayType, meterServiceResponse.gatewayType) && this.gatewayExempt == meterServiceResponse.gatewayExempt && zq3.c(this.grantReason, meterServiceResponse.grantReason) && this.hitRegiwall == meterServiceResponse.hitRegiwall && this.hitPaywall == meterServiceResponse.hitPaywall && zq3.c(this.gatewayTypeVariation, meterServiceResponse.gatewayTypeVariation) && zq3.c(this.userRequestKey, meterServiceResponse.userRequestKey) && this.responseStatus == meterServiceResponse.responseStatus && zq3.c(this.errorMessage, meterServiceResponse.errorMessage);
    }

    public final String getAssetType() {
        return this.assetType;
    }

    public final boolean getCounted() {
        return this.counted;
    }

    public final boolean getDeviceOffline() {
        return this.deviceOffline;
    }

    public final boolean getDisabledByBetaSettings() {
        return this.disabledByBetaSettings;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getGatewayExempt() {
        return this.gatewayExempt;
    }

    public final boolean getGatewayOnline() {
        return this.gatewayOnline;
    }

    public final String getGatewayType() {
        return this.gatewayType;
    }

    public final String getGatewayTypeVariation() {
        return this.gatewayTypeVariation;
    }

    public final String getGrantReason() {
        return this.grantReason;
    }

    public final boolean getGranted() {
        return this.granted;
    }

    public final String getHash() {
        return this.hash;
    }

    public final boolean getHitPaywall() {
        return this.hitPaywall;
    }

    public final boolean getHitRegiwall() {
        return this.hitRegiwall;
    }

    public final long getMeterLatencyDelta() {
        return this.meterLatencyDelta;
    }

    public final MeterResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public final int getTotal() {
        return this.total;
    }

    public final String getUserRequestKey() {
        return this.userRequestKey;
    }

    public final int getViewsRaw() {
        return this.viewsRaw;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.granted) * 31) + Boolean.hashCode(this.counted)) * 31) + this.hash.hashCode()) * 31) + Integer.hashCode(this.viewsRaw)) * 31) + Integer.hashCode(this.total)) * 31;
        String str = this.assetType;
        return ((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.disabledByBetaSettings)) * 31) + Boolean.hashCode(this.deviceOffline)) * 31) + Boolean.hashCode(this.gatewayOnline)) * 31) + this.gatewayType.hashCode()) * 31) + Boolean.hashCode(this.gatewayExempt)) * 31) + this.grantReason.hashCode()) * 31) + Boolean.hashCode(this.hitRegiwall)) * 31) + Boolean.hashCode(this.hitPaywall)) * 31) + this.gatewayTypeVariation.hashCode()) * 31) + this.userRequestKey.hashCode()) * 31) + this.responseStatus.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public final int remaining() {
        return Companion.a(this.disabledByBetaSettings, this.total, viewsUsed());
    }

    public final void setMeterLatencyDelta(long j) {
        this.meterLatencyDelta = j;
    }

    public String toString() {
        return "MeterServiceResponse(granted=" + this.granted + ", counted=" + this.counted + ", hash=" + this.hash + ", viewsRaw=" + this.viewsRaw + ", total=" + this.total + ", assetType=" + this.assetType + ", disabledByBetaSettings=" + this.disabledByBetaSettings + ", deviceOffline=" + this.deviceOffline + ", gatewayOnline=" + this.gatewayOnline + ", gatewayType=" + this.gatewayType + ", gatewayExempt=" + this.gatewayExempt + ", grantReason=" + this.grantReason + ", hitRegiwall=" + this.hitRegiwall + ", hitPaywall=" + this.hitPaywall + ", gatewayTypeVariation=" + this.gatewayTypeVariation + ", userRequestKey=" + this.userRequestKey + ", responseStatus=" + this.responseStatus + ", errorMessage=" + this.errorMessage + ")";
    }

    public final int viewsUsed() {
        return (this.granted && callWasPeek()) ? this.viewsRaw - 1 : this.viewsRaw;
    }

    public MeterServiceResponse(boolean z, boolean z2, String str, int i, int i2, String str2, boolean z3, boolean z4, boolean z5, String str3, boolean z6, String str4, boolean z7, boolean z8, String str5, String str6, MeterResponseStatus meterResponseStatus, String str7) {
        zq3.h(str, "hash");
        zq3.h(str3, "gatewayType");
        zq3.h(str4, "grantReason");
        zq3.h(str5, "gatewayTypeVariation");
        zq3.h(str6, "userRequestKey");
        zq3.h(meterResponseStatus, "responseStatus");
        zq3.h(str7, "errorMessage");
        this.granted = z;
        this.counted = z2;
        this.hash = str;
        this.viewsRaw = i;
        this.total = i2;
        this.assetType = str2;
        this.disabledByBetaSettings = z3;
        this.deviceOffline = z4;
        this.gatewayOnline = z5;
        this.gatewayType = str3;
        this.gatewayExempt = z6;
        this.grantReason = str4;
        this.hitRegiwall = z7;
        this.hitPaywall = z8;
        this.gatewayTypeVariation = str5;
        this.userRequestKey = str6;
        this.responseStatus = meterResponseStatus;
        this.errorMessage = str7;
        this.meterLatencyDelta = -1L;
    }

    public /* synthetic */ MeterServiceResponse(boolean z, boolean z2, String str, int i, int i2, String str2, boolean z3, boolean z4, boolean z5, String str3, boolean z6, String str4, boolean z7, boolean z8, String str5, String str6, MeterResponseStatus meterResponseStatus, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? false : z4, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z5, (i3 & 512) != 0 ? "" : str3, (i3 & 1024) != 0 ? false : z6, (i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? "" : str4, (i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z7, (i3 & 8192) != 0 ? false : z8, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str5, (i3 & 32768) != 0 ? "" : str6, (i3 & 65536) != 0 ? MeterResponseStatus.Success : meterResponseStatus, (i3 & 131072) != 0 ? "" : str7);
    }
}
