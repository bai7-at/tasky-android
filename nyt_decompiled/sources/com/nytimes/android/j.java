package com.nytimes.android;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.meter.MeterServiceResponse;
import defpackage.du8;
import defpackage.ue4;
import defpackage.zq3;

/* loaded from: classes2.dex */
final class j extends ue4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MeterServiceResponse meterServiceResponse) {
        super(du8.a("granted", Boolean.valueOf(meterServiceResponse.getGranted())), du8.a("hash", meterServiceResponse.getHash()), du8.a(QueryKeys.INTERNAL_REFERRER, Integer.valueOf(meterServiceResponse.getViewsRaw())), du8.a(QueryKeys.TOKEN, Integer.valueOf(meterServiceResponse.getTotal())), du8.a("assetType", meterServiceResponse.getAssetType()), du8.a("disabledByBetaSettings", Boolean.valueOf(meterServiceResponse.getDisabledByBetaSettings())), du8.a("deviceOffline", Boolean.valueOf(meterServiceResponse.getDeviceOffline())), du8.a("gatewayType", meterServiceResponse.getGatewayType()));
        zq3.h(meterServiceResponse, "response");
    }
}
