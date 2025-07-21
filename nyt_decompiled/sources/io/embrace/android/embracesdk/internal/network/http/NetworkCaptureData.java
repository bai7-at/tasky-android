package io.embrace.android.embracesdk.internal.network.http;

import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@InternalApi
/* loaded from: classes5.dex */
public final class NetworkCaptureData {
    private final byte[] capturedRequestBody;
    private final byte[] capturedResponseBody;
    private final String dataCaptureErrorMessage;
    private final Map<String, String> requestHeaders;
    private final String requestQueryParams;
    private final Map<String, String> responseHeaders;

    public NetworkCaptureData(Map<String, String> map, String str, byte[] bArr, Map<String, String> map2, byte[] bArr2, String str2) {
        this.requestHeaders = map;
        this.requestQueryParams = str;
        this.capturedRequestBody = bArr;
        this.responseHeaders = map2;
        this.capturedResponseBody = bArr2;
        this.dataCaptureErrorMessage = str2;
    }

    public static /* synthetic */ NetworkCaptureData copy$default(NetworkCaptureData networkCaptureData, Map map, String str, byte[] bArr, Map map2, byte[] bArr2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = networkCaptureData.requestHeaders;
        }
        if ((i & 2) != 0) {
            str = networkCaptureData.requestQueryParams;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            bArr = networkCaptureData.capturedRequestBody;
        }
        byte[] bArr3 = bArr;
        if ((i & 8) != 0) {
            map2 = networkCaptureData.responseHeaders;
        }
        Map map3 = map2;
        if ((i & 16) != 0) {
            bArr2 = networkCaptureData.capturedResponseBody;
        }
        byte[] bArr4 = bArr2;
        if ((i & 32) != 0) {
            str2 = networkCaptureData.dataCaptureErrorMessage;
        }
        return networkCaptureData.copy(map, str3, bArr3, map3, bArr4, str2);
    }

    public final Map<String, String> component1() {
        return this.requestHeaders;
    }

    public final String component2() {
        return this.requestQueryParams;
    }

    public final byte[] component3() {
        return this.capturedRequestBody;
    }

    public final Map<String, String> component4() {
        return this.responseHeaders;
    }

    public final byte[] component5() {
        return this.capturedResponseBody;
    }

    public final String component6() {
        return this.dataCaptureErrorMessage;
    }

    public final NetworkCaptureData copy(Map<String, String> map, String str, byte[] bArr, Map<String, String> map2, byte[] bArr2, String str2) {
        return new NetworkCaptureData(map, str, bArr, map2, bArr2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCaptureData)) {
            return false;
        }
        NetworkCaptureData networkCaptureData = (NetworkCaptureData) obj;
        return zq3.c(this.requestHeaders, networkCaptureData.requestHeaders) && zq3.c(this.requestQueryParams, networkCaptureData.requestQueryParams) && zq3.c(this.capturedRequestBody, networkCaptureData.capturedRequestBody) && zq3.c(this.responseHeaders, networkCaptureData.responseHeaders) && zq3.c(this.capturedResponseBody, networkCaptureData.capturedResponseBody) && zq3.c(this.dataCaptureErrorMessage, networkCaptureData.dataCaptureErrorMessage);
    }

    public final byte[] getCapturedRequestBody() {
        return this.capturedRequestBody;
    }

    public final byte[] getCapturedResponseBody() {
        return this.capturedResponseBody;
    }

    public final String getDataCaptureErrorMessage() {
        return this.dataCaptureErrorMessage;
    }

    public final int getRequestBodySize() {
        byte[] bArr = this.capturedRequestBody;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestQueryParams() {
        return this.requestQueryParams;
    }

    public final int getResponseBodySize() {
        byte[] bArr = this.capturedResponseBody;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public int hashCode() {
        Map<String, String> map = this.requestHeaders;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.requestQueryParams;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.capturedRequestBody;
        int hashCode3 = (hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        Map<String, String> map2 = this.responseHeaders;
        int hashCode4 = (hashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        byte[] bArr2 = this.capturedResponseBody;
        int hashCode5 = (hashCode4 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        String str2 = this.dataCaptureErrorMessage;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkCaptureData(requestHeaders=" + this.requestHeaders + ", requestQueryParams=" + this.requestQueryParams + ", capturedRequestBody=" + Arrays.toString(this.capturedRequestBody) + ", responseHeaders=" + this.responseHeaders + ", capturedResponseBody=" + Arrays.toString(this.capturedResponseBody) + ", dataCaptureErrorMessage=" + this.dataCaptureErrorMessage + ")";
    }

    public /* synthetic */ NetworkCaptureData(Map map, String str, byte[] bArr, Map map2, byte[] bArr2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, str, bArr, map2, bArr2, (i & 32) != 0 ? null : str2);
    }
}
