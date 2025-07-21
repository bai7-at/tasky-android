package io.embrace.android.embracesdk.internal.network.http;

/* loaded from: classes5.dex */
public final class HttpUrlConnectionTracker {
    public static final HttpUrlConnectionTracker INSTANCE = new HttpUrlConnectionTracker();

    private HttpUrlConnectionTracker() {
    }

    public static final void registerFactory(boolean z) {
        StreamHandlerFactoryInstaller.registerFactory(Boolean.valueOf(z));
    }
}
