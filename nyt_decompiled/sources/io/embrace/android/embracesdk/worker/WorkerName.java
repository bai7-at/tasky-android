package io.embrace.android.embracesdk.worker;

/* loaded from: classes5.dex */
public enum WorkerName {
    BACKGROUND_REGISTRATION("background-reg"),
    DELIVERY_CACHE("delivery-cache"),
    NETWORK_REQUEST("network-request"),
    PERIODIC_CACHE("periodic-cache"),
    REMOTE_LOGGING("remote-logging"),
    ANR_MONITOR("anr-monitor"),
    SERVICE_INIT("service-init");

    private final String threadName;

    WorkerName(String str) {
        this.threadName = str;
    }

    public final String getThreadName$embrace_android_sdk_release() {
        return this.threadName;
    }
}
