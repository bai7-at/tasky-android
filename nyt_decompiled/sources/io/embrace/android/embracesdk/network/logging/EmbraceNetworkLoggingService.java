package io.embrace.android.embracesdk.network.logging;

import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.utils.NetworkUtils;

/* loaded from: classes5.dex */
public final class EmbraceNetworkLoggingService implements NetworkLoggingService {
    private final DomainCountLimiter embraceDomainCountLimiter;
    private final NetworkCaptureService networkCaptureService;
    private final SpanService spanService;

    public EmbraceNetworkLoggingService(DomainCountLimiter domainCountLimiter, NetworkCaptureService networkCaptureService, SpanService spanService) {
        zq3.h(domainCountLimiter, "embraceDomainCountLimiter");
        zq3.h(networkCaptureService, "networkCaptureService");
        zq3.h(spanService, "spanService");
        this.embraceDomainCountLimiter = domainCountLimiter;
        this.networkCaptureService = networkCaptureService;
        this.spanService = spanService;
    }

    private final void logNetworkCaptureData(EmbraceNetworkRequest embraceNetworkRequest) {
        if (embraceNetworkRequest.getNetworkCaptureData() != null) {
            NetworkCaptureService networkCaptureService = this.networkCaptureService;
            String url = embraceNetworkRequest.getUrl();
            zq3.g(url, "networkRequest.url");
            String httpMethod = embraceNetworkRequest.getHttpMethod();
            zq3.g(httpMethod, "networkRequest.httpMethod");
            Integer responseCode = embraceNetworkRequest.getResponseCode();
            if (responseCode == null) {
                responseCode = -1;
            }
            zq3.g(responseCode, "networkRequest.responseCode ?: NETWORK_ERROR_CODE");
            int intValue = responseCode.intValue();
            Long startTime = embraceNetworkRequest.getStartTime();
            zq3.g(startTime, "networkRequest.startTime");
            long longValue = startTime.longValue();
            Long endTime = embraceNetworkRequest.getEndTime();
            zq3.g(endTime, "networkRequest.endTime");
            networkCaptureService.logNetworkCapturedData(url, httpMethod, intValue, longValue, endTime.longValue(), embraceNetworkRequest.getNetworkCaptureData(), embraceNetworkRequest.getErrorMessage());
        }
    }

    private final void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        String url = embraceNetworkRequest.getUrl();
        zq3.g(url, "networkRequest.url");
        String domain = NetworkUtils.getDomain(NetworkUtils.stripUrl(url));
        if (domain != null && this.embraceDomainCountLimiter.canLogNetworkRequest(domain)) {
            String url2 = embraceNetworkRequest.getUrl();
            zq3.g(url2, "networkRequest.url");
            String stripUrl = NetworkUtils.stripUrl(url2);
            SchemaType.NetworkRequest networkRequest = new SchemaType.NetworkRequest(embraceNetworkRequest);
            SpanService spanService = this.spanService;
            String str = embraceNetworkRequest.getHttpMethod() + ' ' + NetworkUtils.getUrlPath(stripUrl);
            Long startTime = embraceNetworkRequest.getStartTime();
            zq3.g(startTime, "networkRequest.startTime");
            long longValue = startTime.longValue();
            Long endTime = embraceNetworkRequest.getEndTime();
            zq3.g(endTime, "networkRequest.endTime");
            SpanService.DefaultImpls.recordCompletedSpan$default(spanService, str, longValue, endTime.longValue(), null, EmbType.Performance.Network.INSTANCE, false, false, networkRequest.attributes(), null, null, 352, null);
        }
    }

    @Override // io.embrace.android.embracesdk.network.logging.NetworkLoggingService
    public void logNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        zq3.h(embraceNetworkRequest, "networkRequest");
        logNetworkCaptureData(embraceNetworkRequest);
        recordNetworkRequest(embraceNetworkRequest);
    }
}
