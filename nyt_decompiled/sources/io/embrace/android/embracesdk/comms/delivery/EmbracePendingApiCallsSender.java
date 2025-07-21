package io.embrace.android.embracesdk.comms.delivery;

import defpackage.c04;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityListener;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.comms.api.ApiRequest;
import io.embrace.android.embracesdk.comms.api.ApiResponse;
import io.embrace.android.embracesdk.comms.api.Endpoint;
import io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.c;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes5.dex */
public final class EmbracePendingApiCallsSender implements PendingApiCallsSender, NetworkConnectivityListener {
    private final DeliveryCacheManager cacheManager;
    private final Clock clock;
    private ScheduledFuture<?> lastDeliveryTask;
    private NetworkStatus lastNetworkStatus;
    private final InternalEmbraceLogger logger;
    private final c04 pendingApiCalls$delegate;
    private final ScheduledWorker scheduledWorker;
    private gt2 sendMethod;

    /* renamed from: io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSender$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements qs2 {
        AnonymousClass1(EmbracePendingApiCallsSender embracePendingApiCallsSender) {
            super(0, embracePendingApiCallsSender, EmbracePendingApiCallsSender.class, "scheduleApiCallsDelivery", "scheduleApiCallsDelivery(J)V", 0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            invoke();
            return ww8.a;
        }

        public final void invoke() {
            EmbracePendingApiCallsSender.scheduleApiCallsDelivery$default((EmbracePendingApiCallsSender) this.receiver, 0L, 1, null);
        }
    }

    public EmbracePendingApiCallsSender(NetworkConnectivityService networkConnectivityService, ScheduledWorker scheduledWorker, DeliveryCacheManager deliveryCacheManager, Clock clock, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(networkConnectivityService, "networkConnectivityService");
        zq3.h(scheduledWorker, "scheduledWorker");
        zq3.h(deliveryCacheManager, "cacheManager");
        zq3.h(clock, "clock");
        zq3.h(internalEmbraceLogger, "logger");
        this.scheduledWorker = scheduledWorker;
        this.cacheManager = deliveryCacheManager;
        this.clock = clock;
        this.logger = internalEmbraceLogger;
        this.pendingApiCalls$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSender$pendingApiCalls$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PendingApiCalls mo865invoke() {
                DeliveryCacheManager deliveryCacheManager2;
                deliveryCacheManager2 = EmbracePendingApiCallsSender.this.cacheManager;
                return deliveryCacheManager2.loadPendingApiCalls();
            }
        });
        this.lastNetworkStatus = NetworkStatus.UNKNOWN;
        networkConnectivityService.addNetworkConnectivityListener(this);
        this.lastNetworkStatus = networkConnectivityService.getCurrentNetworkStatus();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        scheduledWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSenderKt$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zq3.g(qs2.this.mo865invoke(), "invoke(...)");
            }
        });
    }

    private final void clearRateLimitIfApplies(Endpoint endpoint, ApiResponse apiResponse) {
        if (apiResponse instanceof ApiResponse.TooManyRequests) {
            return;
        }
        endpoint.clearRateLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeDelivery(final long j) {
        if (!this.lastNetworkStatus.isReachable()) {
            this.logger.log("Did not retry api calls as scheduled because network is not reachable", InternalEmbraceLogger.Severity.INFO, null, true);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            while (true) {
                PendingApiCall pollNextPendingApiCall = getPendingApiCalls().pollNextPendingApiCall();
                if (pollNextPendingApiCall == null) {
                    break;
                }
                ApiResponse sendPendingApiCall = sendPendingApiCall(pollNextPendingApiCall);
                if (sendPendingApiCall != null) {
                    clearRateLimitIfApplies(pollNextPendingApiCall.getApiRequest().getUrl().endpoint(), sendPendingApiCall);
                    if (sendPendingApiCall.getShouldRetry()) {
                        if (sendPendingApiCall instanceof ApiResponse.TooManyRequests) {
                            Endpoint endpoint = ((ApiResponse.TooManyRequests) sendPendingApiCall).getEndpoint();
                            endpoint.updateRateLimitStatus();
                            endpoint.scheduleRetry(this.scheduledWorker, ((ApiResponse.TooManyRequests) sendPendingApiCall).getRetryAfter(), new EmbracePendingApiCallsSender$executeDelivery$1$1$1(this));
                        } else if (sendPendingApiCall instanceof ApiResponse.Incomplete) {
                            ref$BooleanRef.element = true;
                        }
                        arrayList.add(pollNextPendingApiCall);
                    } else {
                        this.cacheManager.deletePayload(pollNextPendingApiCall.getCachedPayloadFilename());
                        DeliveryCacheManager.DefaultImpls.savePendingApiCalls$default(this.cacheManager, getPendingApiCalls(), false, 2, null);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                getPendingApiCalls().add((PendingApiCall) it2.next());
            }
            if (getPendingApiCalls().hasPendingApiCallsToSend()) {
                this.scheduledWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSender$executeDelivery$3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbracePendingApiCallsSender.this.scheduleNextApiCallsDelivery(ref$BooleanRef.element, j);
                    }
                });
            }
        } catch (Exception e) {
            this.logger.log("Error when sending API call", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    private final PendingApiCalls getPendingApiCalls() {
        return (PendingApiCalls) this.pendingApiCalls$delegate.getValue();
    }

    private final void scheduleApiCallsDelivery(final long j) {
        String str;
        synchronized (this) {
            try {
                if (shouldScheduleDelivery()) {
                    this.lastDeliveryTask = this.scheduledWorker.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSender$scheduleApiCallsDelivery$$inlined$synchronized$lambda$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            EmbracePendingApiCallsSender.this.executeDelivery(j);
                        }
                    }, j, TimeUnit.SECONDS);
                    InternalEmbraceLogger internalEmbraceLogger = this.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduled failed API calls to retry ");
                    if (j == 0) {
                        str = "now";
                    } else {
                        str = "in " + j + " seconds";
                    }
                    sb.append(str);
                    internalEmbraceLogger.log(sb.toString(), InternalEmbraceLogger.Severity.INFO, null, true);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void scheduleApiCallsDelivery$default(EmbracePendingApiCallsSender embracePendingApiCallsSender, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        embracePendingApiCallsSender.scheduleApiCallsDelivery(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleNextApiCallsDelivery(boolean z, long j) {
        long max = z ? Math.max(120L, j * 2) : 120L;
        if (max <= 3600) {
            scheduleApiCallsDelivery(max);
        }
    }

    private final ApiResponse sendPendingApiCall(PendingApiCall pendingApiCall) {
        ss2 loadPayloadAsAction = this.cacheManager.loadPayloadAsAction(pendingApiCall.getCachedPayloadFilename());
        gt2 gt2Var = this.sendMethod;
        if (gt2Var == null) {
            zq3.z("sendMethod");
        }
        return (ApiResponse) gt2Var.invoke(pendingApiCall.getApiRequest(), loadPayloadAsAction);
    }

    private final boolean shouldScheduleDelivery() {
        return !isDeliveryTaskActive() && getPendingApiCalls().hasPendingApiCallsToSend();
    }

    public final boolean isDeliveryTaskActive() {
        ScheduledFuture<?> scheduledFuture = this.lastDeliveryTask;
        return (scheduledFuture == null || scheduledFuture.isCancelled() || scheduledFuture.isDone()) ? false : true;
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityListener
    public void onNetworkConnectivityStatusChanged(NetworkStatus networkStatus) {
        zq3.h(networkStatus, "status");
        this.lastNetworkStatus = networkStatus;
        if (networkStatus.isReachable()) {
            scheduleApiCallsDelivery$default(this, 0L, 1, null);
            return;
        }
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.lastDeliveryTask;
                if (scheduledFuture != null) {
                    if (scheduledFuture.cancel(false)) {
                        this.logger.log("Api Calls Delivery Action was stopped because there is no connection. ", InternalEmbraceLogger.Severity.DEBUG, null, true);
                        this.lastDeliveryTask = null;
                    } else {
                        this.logger.log("Api Calls Delivery Action could not be stopped.", InternalEmbraceLogger.Severity.ERROR, null, false);
                    }
                    ww8 ww8Var = ww8.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender
    public void savePendingApiCall(ApiRequest apiRequest, ss2 ss2Var, boolean z) {
        zq3.h(apiRequest, "request");
        zq3.h(ss2Var, "action");
        getPendingApiCalls().add(new PendingApiCall(apiRequest, this.cacheManager.savePayload(ss2Var), Long.valueOf(this.clock.now())));
        this.cacheManager.savePendingApiCalls(getPendingApiCalls(), z);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender
    public void scheduleRetry(ApiResponse apiResponse) {
        zq3.h(apiResponse, "response");
        if (apiResponse instanceof ApiResponse.Incomplete) {
            scheduleApiCallsDelivery(120L);
        } else if (apiResponse instanceof ApiResponse.TooManyRequests) {
            ApiResponse.TooManyRequests tooManyRequests = (ApiResponse.TooManyRequests) apiResponse;
            Endpoint endpoint = tooManyRequests.getEndpoint();
            endpoint.updateRateLimitStatus();
            endpoint.scheduleRetry(this.scheduledWorker, tooManyRequests.getRetryAfter(), new EmbracePendingApiCallsSender$scheduleRetry$1$1(this));
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender
    public void setSendMethod(gt2 gt2Var) {
        zq3.h(gt2Var, "sendMethod");
        this.sendMethod = gt2Var;
    }
}
