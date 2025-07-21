package com.nytimes.android.comments.writenewcomment.mvi.view;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ResponseError {
    public static final int $stable = 0;
    private final String errorDetails;
    private final Results results;
    private final String status;

    @et3(generateAdapter = true)
    public static final class Results {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Results() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Results copy$default(Results results, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = results.errorMessage;
            }
            return results.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Results copy(@bt3(name = "Error") String str) {
            return new Results(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Results) && zq3.c(this.errorMessage, ((Results) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Results(errorMessage=" + this.errorMessage + ")";
        }

        public Results(@bt3(name = "Error") String str) {
            this.errorMessage = str;
        }

        public /* synthetic */ Results(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public ResponseError() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, String str, Results results, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseError.status;
        }
        if ((i & 2) != 0) {
            results = responseError.results;
        }
        if ((i & 4) != 0) {
            str2 = responseError.errorDetails;
        }
        return responseError.copy(str, results, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final Results component2() {
        return this.results;
    }

    public final String component3() {
        return this.errorDetails;
    }

    public final ResponseError copy(String str, Results results, String str2) {
        return new ResponseError(str, results, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) obj;
        return zq3.c(this.status, responseError.status) && zq3.c(this.results, responseError.results) && zq3.c(this.errorDetails, responseError.errorDetails);
    }

    public final String getErrorDetails() {
        return this.errorDetails;
    }

    public final Results getResults() {
        return this.results;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Results results = this.results;
        int hashCode2 = (hashCode + (results == null ? 0 : results.hashCode())) * 31;
        String str2 = this.errorDetails;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ResponseError(status=" + this.status + ", results=" + this.results + ", errorDetails=" + this.errorDetails + ")";
    }

    public ResponseError(String str, Results results, String str2) {
        this.status = str;
        this.results = results;
        this.errorDetails = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ResponseError(String str, Results results, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Results(null, 1, 0 == true ? 1 : 0) : results, (i & 4) != 0 ? null : str2);
    }
}
