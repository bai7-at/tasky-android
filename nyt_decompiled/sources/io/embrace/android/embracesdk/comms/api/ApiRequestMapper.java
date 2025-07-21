package io.embrace.android.embracesdk.comms.api;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.c04;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import io.embrace.android.embracesdk.payload.BlobMessage;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import zendesk.core.Constants;

/* loaded from: classes5.dex */
public final class ApiRequestMapper {
    private final Map<Endpoint, String> apiUrlBuilders;
    private final String appId;
    private final c04 lazyDeviceId;
    private final ApiUrlBuilder urlBuilder;

    public ApiRequestMapper(ApiUrlBuilder apiUrlBuilder, c04 c04Var, String str) {
        zq3.h(apiUrlBuilder, "urlBuilder");
        zq3.h(c04Var, "lazyDeviceId");
        zq3.h(str, "appId");
        this.urlBuilder = apiUrlBuilder;
        this.lazyDeviceId = c04Var;
        this.appId = str;
        Endpoint[] values = Endpoint.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(values.length), 16));
        for (Endpoint endpoint : values) {
            linkedHashMap.put(endpoint, this.urlBuilder.getEmbraceUrlWithSuffix(endpoint.getVersion(), endpoint.getPath()));
        }
        this.apiUrlBuilders = linkedHashMap;
    }

    private final EmbraceUrl asEmbraceUrl(Endpoint endpoint) {
        String str = this.apiUrlBuilders.get(endpoint);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return EmbraceUrl.Companion.create(str);
    }

    private final String createCrashActiveEventsHeader(String str, List<String> list) {
        String str2;
        if (list == null || (str2 = i.u0(list, ",", null, null, 0, null, null, 62, null)) == null) {
            str2 = "";
        }
        return str + ':' + str2;
    }

    private final ApiRequest requestBuilder(EmbraceUrl embraceUrl) {
        return new ApiRequest(null, null, EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP, null, null, this.appId, (String) this.lazyDeviceId.getValue(), null, null, embraceUrl, HttpMethod.POST, null, 2459, null);
    }

    public final ApiRequest aeiBlobRequest(BlobMessage blobMessage) {
        zq3.h(blobMessage, "blobMessage");
        return requestBuilder(asEmbraceUrl(Endpoint.BLOBS));
    }

    public final ApiRequest configRequest(String str) {
        zq3.h(str, "url");
        return new ApiRequest(Constants.APPLICATION_JSON, "Embrace/a/6.6.0", null, Constants.APPLICATION_JSON, null, null, null, null, null, EmbraceUrl.Companion.create(str), HttpMethod.GET, null, 2548, null);
    }

    public final ApiRequest eventMessageRequest(EventMessage eventMessage) {
        String str;
        ApiRequest copy;
        zq3.h(eventMessage, "eventMessage");
        if (eventMessage.getEvent() == null) {
            throw new IllegalStateException("event must be set");
        }
        Event event = eventMessage.getEvent();
        if (event.f83type == null) {
            throw new IllegalStateException("event type must be set");
        }
        if (event.eventId == null) {
            throw new IllegalStateException("event ID must be set");
        }
        EmbraceUrl asEmbraceUrl = asEmbraceUrl(Endpoint.EVENTS);
        String abbreviation = event.f83type.getAbbreviation();
        if (event.f83type == EventType.CRASH) {
            str = createCrashActiveEventsHeader(abbreviation, event.getActiveEventIds());
        } else {
            str = abbreviation + ":" + event.eventId;
        }
        copy = r3.copy((r26 & 1) != 0 ? r3.contentType : null, (r26 & 2) != 0 ? r3.userAgent : null, (r26 & 4) != 0 ? r3.contentEncoding : null, (r26 & 8) != 0 ? r3.accept : null, (r26 & 16) != 0 ? r3.acceptEncoding : null, (r26 & 32) != 0 ? r3.appId : null, (r26 & 64) != 0 ? r3.deviceId : null, (r26 & 128) != 0 ? r3.eventId : str, (r26 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r3.logId : null, (r26 & 512) != 0 ? r3.url : null, (r26 & 1024) != 0 ? r3.httpMethod : null, (r26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? requestBuilder(asEmbraceUrl).eTag : null);
        return copy;
    }

    public final ApiRequest logRequest(EventMessage eventMessage) {
        ApiRequest copy;
        zq3.h(eventMessage, "eventMessage");
        if (eventMessage.getEvent() == null) {
            throw new IllegalStateException("event must be set");
        }
        Event event = eventMessage.getEvent();
        EventType eventType = event.f83type;
        if (eventType == null) {
            throw new IllegalStateException("event type must be set");
        }
        if (event.eventId == null) {
            throw new IllegalStateException("event ID must be set");
        }
        EmbraceUrl asEmbraceUrl = asEmbraceUrl(Endpoint.LOGGING);
        copy = r5.copy((r26 & 1) != 0 ? r5.contentType : null, (r26 & 2) != 0 ? r5.userAgent : null, (r26 & 4) != 0 ? r5.contentEncoding : null, (r26 & 8) != 0 ? r5.accept : null, (r26 & 16) != 0 ? r5.acceptEncoding : null, (r26 & 32) != 0 ? r5.appId : null, (r26 & 64) != 0 ? r5.deviceId : null, (r26 & 128) != 0 ? r5.eventId : null, (r26 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r5.logId : eventType.getAbbreviation() + ":" + event.messageId, (r26 & 512) != 0 ? r5.url : null, (r26 & 1024) != 0 ? r5.httpMethod : null, (r26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? requestBuilder(asEmbraceUrl).eTag : null);
        return copy;
    }

    public final ApiRequest logsEnvelopeRequest(Envelope<LogPayload> envelope) {
        zq3.h(envelope, "envelope");
        return requestBuilder(asEmbraceUrl(Endpoint.LOGS));
    }

    public final ApiRequest networkEventRequest(NetworkEvent networkEvent) {
        ApiRequest copy;
        zq3.h(networkEvent, "networkEvent");
        EmbraceUrl asEmbraceUrl = asEmbraceUrl(Endpoint.NETWORK);
        copy = r5.copy((r26 & 1) != 0 ? r5.contentType : null, (r26 & 2) != 0 ? r5.userAgent : null, (r26 & 4) != 0 ? r5.contentEncoding : null, (r26 & 8) != 0 ? r5.accept : null, (r26 & 16) != 0 ? r5.acceptEncoding : null, (r26 & 32) != 0 ? r5.appId : null, (r26 & 64) != 0 ? r5.deviceId : null, (r26 & 128) != 0 ? r5.eventId : null, (r26 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r5.logId : EventType.NETWORK_LOG.getAbbreviation() + ':' + networkEvent.getEventId(), (r26 & 512) != 0 ? r5.url : null, (r26 & 1024) != 0 ? r5.httpMethod : null, (r26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? requestBuilder(asEmbraceUrl).eTag : null);
        return copy;
    }

    public final ApiRequest sessionEnvelopeRequest(Envelope<SessionPayload> envelope) {
        zq3.h(envelope, "envelope");
        return requestBuilder(asEmbraceUrl(Endpoint.SESSIONS_V2));
    }

    public final ApiRequest sessionRequest(boolean z) {
        return requestBuilder(asEmbraceUrl(Endpoint.SESSIONS));
    }
}
