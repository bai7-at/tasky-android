package io.embrace.android.embracesdk.comms.api;

import defpackage.ss2;

/* loaded from: classes5.dex */
public interface ApiClient {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int MESSAGE_VERSION = 13;
    public static final int NO_HTTP_RESPONSE = -1;
    public static final int TOO_MANY_REQUESTS = 429;
    public static final int defaultTimeoutMs = 60000;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MESSAGE_VERSION = 13;
        public static final int NO_HTTP_RESPONSE = -1;
        public static final int TOO_MANY_REQUESTS = 429;
        public static final int defaultTimeoutMs = 60000;

        private Companion() {
        }
    }

    ApiResponse executeGet(ApiRequest apiRequest);

    ApiResponse executePost(ApiRequest apiRequest, ss2 ss2Var);
}
