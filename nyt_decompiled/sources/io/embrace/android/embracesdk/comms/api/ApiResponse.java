package io.embrace.android.embracesdk.comms.api;

import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class ApiResponse {

    public static final class Failure extends ApiResponse {
        private final int code;
        private final Map<String, String> headers;

        public Failure(int i, Map<String, String> map) {
            super(null);
            this.code = i;
            this.headers = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failure copy$default(Failure failure, int i, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failure.code;
            }
            if ((i2 & 2) != 0) {
                map = failure.headers;
            }
            return failure.copy(i, map);
        }

        public final int component1() {
            return this.code;
        }

        public final Map<String, String> component2() {
            return this.headers;
        }

        public final Failure copy(int i, Map<String, String> map) {
            return new Failure(i, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.code == failure.code && zq3.c(this.headers, failure.headers);
        }

        public final int getCode() {
            return this.code;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.code) * 31;
            Map<String, String> map = this.headers;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "Failure(code=" + this.code + ", headers=" + this.headers + ")";
        }
    }

    public static final class Incomplete extends ApiResponse {
        private final Throwable exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Incomplete(Throwable th) {
            super(null);
            zq3.h(th, "exception");
            this.exception = th;
        }

        public static /* synthetic */ Incomplete copy$default(Incomplete incomplete, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = incomplete.exception;
            }
            return incomplete.copy(th);
        }

        public final Throwable component1() {
            return this.exception;
        }

        public final Incomplete copy(Throwable th) {
            zq3.h(th, "exception");
            return new Incomplete(th);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Incomplete) && zq3.c(this.exception, ((Incomplete) obj).exception);
            }
            return true;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            Throwable th = this.exception;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Incomplete(exception=" + this.exception + ")";
        }
    }

    public static final class NotModified extends ApiResponse {
        public static final NotModified INSTANCE = new NotModified();

        private NotModified() {
            super(null);
        }
    }

    public static final class PayloadTooLarge extends ApiResponse {
        public static final PayloadTooLarge INSTANCE = new PayloadTooLarge();

        private PayloadTooLarge() {
            super(null);
        }
    }

    public static final class Success extends ApiResponse {
        private final String body;
        private final Map<String, String> headers;

        public Success(String str, Map<String, String> map) {
            super(null);
            this.body = str;
            this.headers = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.body;
            }
            if ((i & 2) != 0) {
                map = success.headers;
            }
            return success.copy(str, map);
        }

        public final String component1() {
            return this.body;
        }

        public final Map<String, String> component2() {
            return this.headers;
        }

        public final Success copy(String str, Map<String, String> map) {
            return new Success(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return zq3.c(this.body, success.body) && zq3.c(this.headers, success.headers);
        }

        public final String getBody() {
            return this.body;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            String str = this.body;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Map<String, String> map = this.headers;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "Success(body=" + this.body + ", headers=" + this.headers + ")";
        }
    }

    public static final class TooManyRequests extends ApiResponse {
        private final Endpoint endpoint;
        private final Long retryAfter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooManyRequests(Endpoint endpoint, Long l) {
            super(null);
            zq3.h(endpoint, "endpoint");
            this.endpoint = endpoint;
            this.retryAfter = l;
        }

        public static /* synthetic */ TooManyRequests copy$default(TooManyRequests tooManyRequests, Endpoint endpoint, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                endpoint = tooManyRequests.endpoint;
            }
            if ((i & 2) != 0) {
                l = tooManyRequests.retryAfter;
            }
            return tooManyRequests.copy(endpoint, l);
        }

        public final Endpoint component1() {
            return this.endpoint;
        }

        public final Long component2() {
            return this.retryAfter;
        }

        public final TooManyRequests copy(Endpoint endpoint, Long l) {
            zq3.h(endpoint, "endpoint");
            return new TooManyRequests(endpoint, l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooManyRequests)) {
                return false;
            }
            TooManyRequests tooManyRequests = (TooManyRequests) obj;
            return zq3.c(this.endpoint, tooManyRequests.endpoint) && zq3.c(this.retryAfter, tooManyRequests.retryAfter);
        }

        public final Endpoint getEndpoint() {
            return this.endpoint;
        }

        public final Long getRetryAfter() {
            return this.retryAfter;
        }

        public int hashCode() {
            Endpoint endpoint = this.endpoint;
            int hashCode = (endpoint != null ? endpoint.hashCode() : 0) * 31;
            Long l = this.retryAfter;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            return "TooManyRequests(endpoint=" + this.endpoint + ", retryAfter=" + this.retryAfter + ")";
        }
    }

    private ApiResponse() {
    }

    public final boolean getShouldRetry() {
        return (this instanceof TooManyRequests) || (this instanceof Incomplete);
    }

    public /* synthetic */ ApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
