package com.nytimes.android.utils.retrofitutils;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ResponseError {
    private final String a;
    private final Results b;
    private final String c;

    public ResponseError(String str, Results results, String str2) {
        this.a = str;
        this.b = results;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final Results b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) obj;
        return zq3.c(this.a, responseError.a) && zq3.c(this.b, responseError.b) && zq3.c(this.c, responseError.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Results results = this.b;
        int hashCode2 = (hashCode + (results == null ? 0 : results.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ResponseError(status=" + this.a + ", results=" + this.b + ", errorDetails=" + this.c + ")";
    }

    @et3(generateAdapter = true)
    public static final class Results {
        private final String a;

        public Results(@bt3(name = "Error") String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final Results copy(@bt3(name = "Error") String str) {
            return new Results(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Results) && zq3.c(this.a, ((Results) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Results(errorMessage=" + this.a + ")";
        }

        public /* synthetic */ Results(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ResponseError(String str, Results results, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Results(null, 1, 0 == true ? 1 : 0) : results, (i & 4) != 0 ? null : str2);
    }
}
