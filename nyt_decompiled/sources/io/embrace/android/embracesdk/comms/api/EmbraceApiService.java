package io.embrace.android.embracesdk.comms.api;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.squareup.moshi.j;
import defpackage.c04;
import defpackage.gm0;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityListener;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.comms.api.ApiResponse;
import io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager;
import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;
import io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.compression.ConditionalGzipOutputStream;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.payload.BlobMessage;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c;
import zendesk.core.Constants;

/* loaded from: classes5.dex */
public final class EmbraceApiService implements ApiService, NetworkConnectivityListener {
    private final ApiClient apiClient;
    private final BackgroundWorker backgroundWorker;
    private final DeliveryCacheManager cacheManager;
    private final gt2 cachedConfigProvider;
    private final c04 configUrl$delegate;
    private NetworkStatus lastNetworkStatus;
    private final InternalEmbraceLogger logger;
    private final c04 mapper$delegate;
    private final PendingApiCallsSender pendingApiCallsSender;
    private final EmbraceSerializer serializer;

    public EmbraceApiService(ApiClient apiClient, EmbraceSerializer embraceSerializer, gt2 gt2Var, InternalEmbraceLogger internalEmbraceLogger, BackgroundWorker backgroundWorker, DeliveryCacheManager deliveryCacheManager, PendingApiCallsSender pendingApiCallsSender, final c04 c04Var, final String str, final ApiUrlBuilder apiUrlBuilder, NetworkConnectivityService networkConnectivityService) {
        zq3.h(apiClient, "apiClient");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(gt2Var, "cachedConfigProvider");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(deliveryCacheManager, "cacheManager");
        zq3.h(pendingApiCallsSender, "pendingApiCallsSender");
        zq3.h(c04Var, "lazyDeviceId");
        zq3.h(str, "appId");
        zq3.h(apiUrlBuilder, "urlBuilder");
        zq3.h(networkConnectivityService, "networkConnectivityService");
        this.apiClient = apiClient;
        this.serializer = embraceSerializer;
        this.cachedConfigProvider = gt2Var;
        this.logger = internalEmbraceLogger;
        this.backgroundWorker = backgroundWorker;
        this.cacheManager = deliveryCacheManager;
        this.pendingApiCallsSender = pendingApiCallsSender;
        this.mapper$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$mapper$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ApiRequestMapper mo865invoke() {
                try {
                    Systrace.startSynchronous("api-request-mapper-init");
                    return new ApiRequestMapper(ApiUrlBuilder.this, c04Var, str);
                } finally {
                }
            }
        });
        this.configUrl$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$configUrl$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                try {
                    Systrace.startSynchronous("config-url-init");
                    return ApiUrlBuilder.this.getConfigUrl();
                } finally {
                }
            }
        });
        this.lastNetworkStatus = NetworkStatus.UNKNOWN;
        try {
            Systrace.startSynchronous("api-service-init-block");
            networkConnectivityService.addNetworkConnectivityListener(this);
            this.lastNetworkStatus = networkConnectivityService.getCurrentNetworkStatus();
            pendingApiCallsSender.setSendMethod(new EmbraceApiService$1$1(this));
            ww8 ww8Var = ww8.a;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiResponse executePost(ApiRequest apiRequest, ss2 ss2Var) {
        return this.apiClient.executePost(apiRequest, ss2Var);
    }

    private final String getConfigUrl() {
        return (String) this.configUrl$delegate.getValue();
    }

    private final ApiRequestMapper getMapper() {
        return (ApiRequestMapper) this.mapper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleApiRequest(ApiRequest apiRequest, ss2 ss2Var) {
        Endpoint endpoint = apiRequest.getUrl().endpoint();
        if (!this.lastNetworkStatus.isReachable() || endpoint.isRateLimited()) {
            PendingApiCallsSender.DefaultImpls.savePendingApiCall$default(this.pendingApiCallsSender, apiRequest, ss2Var, false, 4, null);
            return false;
        }
        ApiResponse executePost = executePost(apiRequest, ss2Var);
        if (executePost.getShouldRetry()) {
            PendingApiCallsSender.DefaultImpls.savePendingApiCall$default(this.pendingApiCallsSender, apiRequest, ss2Var, false, 4, null);
            this.pendingApiCallsSender.scheduleRetry(executePost);
        }
        if (executePost instanceof ApiResponse.Success) {
            return true;
        }
        throw new IllegalStateException("Failed to post Embrace API call. ");
    }

    private final /* synthetic */ <T> Future<?> post(T t, ss2 ss2Var, ParameterizedType parameterizedType, ss2 ss2Var2) {
        ApiRequest apiRequest = (ApiRequest) ss2Var.invoke(t);
        zq3.m();
        return postOnWorker(new EmbraceApiService$post$action$1(this, parameterizedType, t), apiRequest, ss2Var2);
    }

    static /* synthetic */ Future post$default(EmbraceApiService embraceApiService, Object obj, ss2 ss2Var, ParameterizedType parameterizedType, ss2 ss2Var2, int i, Object obj2) {
        if ((i & 4) != 0) {
            parameterizedType = null;
        }
        if ((i & 8) != 0) {
            ss2Var2 = null;
        }
        ApiRequest apiRequest = (ApiRequest) ss2Var.invoke(obj);
        zq3.m();
        return embraceApiService.postOnWorker(new EmbraceApiService$post$action$1(embraceApiService, parameterizedType, obj), apiRequest, ss2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future<?> postOnWorker(final ss2 ss2Var, final ApiRequest apiRequest, final ss2 ss2Var2) {
        return this.backgroundWorker.submit(apiRequest.isSessionRequest() ? TaskPriority.CRITICAL : TaskPriority.NORMAL, new Runnable() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$postOnWorker$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean handleApiRequest;
                try {
                    handleApiRequest = EmbraceApiService.this.handleApiRequest(apiRequest, ss2Var);
                    ss2 ss2Var3 = ss2Var2;
                    if (ss2Var3 != null) {
                        ss2Var3.invoke(Boolean.valueOf(handleApiRequest));
                    }
                } catch (Throwable th) {
                    ss2 ss2Var4 = ss2Var2;
                    if (ss2Var4 != null) {
                        ss2Var4.invoke(Boolean.FALSE);
                    }
                    throw th;
                }
            }
        });
    }

    private final ApiRequest prepareConfigRequest(String str) {
        return new ApiRequest(Constants.APPLICATION_JSON, "Embrace/a/6.6.0", null, Constants.APPLICATION_JSON, null, null, null, null, null, EmbraceUrl.Companion.create(str), HttpMethod.GET, null, 2548, null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public CachedConfig getCachedConfig() {
        return (CachedConfig) this.cachedConfigProvider.invoke(getConfigUrl(), prepareConfigRequest(getConfigUrl()));
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public RemoteConfig getConfig() throws IllegalStateException {
        ApiRequest prepareConfigRequest = prepareConfigRequest(getConfigUrl());
        CachedConfig cachedConfig = (CachedConfig) this.cachedConfigProvider.invoke(getConfigUrl(), prepareConfigRequest);
        if (cachedConfig.isValid()) {
            prepareConfigRequest = prepareConfigRequest.copy((r26 & 1) != 0 ? prepareConfigRequest.contentType : null, (r26 & 2) != 0 ? prepareConfigRequest.userAgent : null, (r26 & 4) != 0 ? prepareConfigRequest.contentEncoding : null, (r26 & 8) != 0 ? prepareConfigRequest.accept : null, (r26 & 16) != 0 ? prepareConfigRequest.acceptEncoding : null, (r26 & 32) != 0 ? prepareConfigRequest.appId : null, (r26 & 64) != 0 ? prepareConfigRequest.deviceId : null, (r26 & 128) != 0 ? prepareConfigRequest.eventId : null, (r26 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? prepareConfigRequest.logId : null, (r26 & 512) != 0 ? prepareConfigRequest.url : null, (r26 & 1024) != 0 ? prepareConfigRequest.httpMethod : null, (r26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? prepareConfigRequest.eTag : cachedConfig.getETag());
        }
        ApiResponse executeGet = this.apiClient.executeGet(prepareConfigRequest);
        if (executeGet instanceof ApiResponse.Success) {
            this.logger.log("Fetched new config successfully.", InternalEmbraceLogger.Severity.INFO, null, true);
            String body = ((ApiResponse.Success) executeGet).getBody();
            if (body != null) {
                return (RemoteConfig) this.serializer.fromJson(body, RemoteConfig.class);
            }
            return null;
        }
        if (executeGet instanceof ApiResponse.NotModified) {
            this.logger.log("Confirmed config has not been modified.", InternalEmbraceLogger.Severity.INFO, null, true);
            return cachedConfig.getRemoteConfig();
        }
        if (executeGet instanceof ApiResponse.TooManyRequests) {
            this.logger.log("Too many requests. ", InternalEmbraceLogger.Severity.WARNING, null, false);
            return null;
        }
        if (executeGet instanceof ApiResponse.Failure) {
            this.logger.log("Failed to fetch config (no response).", InternalEmbraceLogger.Severity.INFO, null, true);
            return null;
        }
        if (!(executeGet instanceof ApiResponse.Incomplete)) {
            if (zq3.c(executeGet, ApiResponse.PayloadTooLarge.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ApiResponse.Incomplete incomplete = (ApiResponse.Incomplete) executeGet;
        this.logger.log("Failed to fetch config.", InternalEmbraceLogger.Severity.WARNING, incomplete.getException(), false);
        throw incomplete.getException();
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityListener
    public void onNetworkConnectivityStatusChanged(NetworkStatus networkStatus) {
        zq3.h(networkStatus, "status");
        this.lastNetworkStatus = networkStatus;
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void saveLogEnvelope(final Envelope<LogPayload> envelope) {
        zq3.h(envelope, "logEnvelope");
        final ParameterizedType j = j.j(Envelope.class, LogPayload.class);
        this.pendingApiCallsSender.savePendingApiCall(getMapper().logsEnvelopeRequest(envelope), new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$saveLogEnvelope$action$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    embraceSerializer = EmbraceApiService.this.serializer;
                    Envelope envelope2 = envelope;
                    ParameterizedType parameterizedType = j;
                    zq3.g(parameterizedType, "parameterizedType");
                    embraceSerializer.toJson((EmbraceSerializer) envelope2, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, true);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void sendAEIBlob(final BlobMessage blobMessage) {
        zq3.h(blobMessage, "blobMessage");
        final ParameterizedType parameterizedType = null;
        postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendAEIBlob$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (parameterizedType != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) blobMessage, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) blobMessage, (Class<EmbraceSerializer>) BlobMessage.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, getMapper().aeiBlobRequest(blobMessage), null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public Future<?> sendCrash(final EventMessage eventMessage) {
        zq3.h(eventMessage, "crash");
        ApiRequestMapper mapper = getMapper();
        ss2 ss2Var = new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendCrash$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                DeliveryCacheManager deliveryCacheManager;
                deliveryCacheManager = EmbraceApiService.this.cacheManager;
                deliveryCacheManager.deleteCrash();
            }
        };
        final ParameterizedType parameterizedType = null;
        return postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendCrash$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (parameterizedType != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) eventMessage, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) eventMessage, (Class<EmbraceSerializer>) EventMessage.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, mapper.eventMessageRequest(eventMessage), ss2Var);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void sendEvent(final EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        final ParameterizedType parameterizedType = null;
        postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendEvent$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (parameterizedType != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) eventMessage, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) eventMessage, (Class<EmbraceSerializer>) EventMessage.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, getMapper().eventMessageRequest(eventMessage), null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void sendLog(final EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        final ParameterizedType parameterizedType = null;
        postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendLog$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (parameterizedType != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) eventMessage, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) eventMessage, (Class<EmbraceSerializer>) EventMessage.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, getMapper().logRequest(eventMessage), null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void sendLogEnvelope(final Envelope<LogPayload> envelope) {
        zq3.h(envelope, "logEnvelope");
        final ParameterizedType j = j.j(Envelope.class, LogPayload.class);
        postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendLogEnvelope$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (j != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) envelope, j, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) envelope, (Class<EmbraceSerializer>) Envelope.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, getMapper().logsEnvelopeRequest(envelope), null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public void sendNetworkCall(final NetworkEvent networkEvent) {
        zq3.h(networkEvent, "networkEvent");
        final ParameterizedType parameterizedType = null;
        postOnWorker(new ss2() { // from class: io.embrace.android.embracesdk.comms.api.EmbraceApiService$sendNetworkCall$$inlined$post$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                EmbraceSerializer embraceSerializer;
                EmbraceSerializer embraceSerializer2;
                zq3.h(outputStream, "stream");
                ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                try {
                    if (parameterizedType != null) {
                        embraceSerializer2 = EmbraceApiService.this.serializer;
                        embraceSerializer2.toJson((EmbraceSerializer) networkEvent, parameterizedType, (OutputStream) conditionalGzipOutputStream);
                    } else {
                        embraceSerializer = EmbraceApiService.this.serializer;
                        embraceSerializer.toJson((EmbraceSerializer) networkEvent, (Class<EmbraceSerializer>) NetworkEvent.class, (OutputStream) conditionalGzipOutputStream);
                    }
                    ww8 ww8Var = ww8.a;
                    gm0.a(conditionalGzipOutputStream, null);
                } finally {
                }
            }
        }, getMapper().networkEventRequest(networkEvent), null);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiService
    public Future<?> sendSession(boolean z, ss2 ss2Var, ss2 ss2Var2) {
        zq3.h(ss2Var, "action");
        return postOnWorker(ss2Var, getMapper().sessionRequest(z), ss2Var2);
    }
}
