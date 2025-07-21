package com.iteratehq.iterate.data.remote.model;

import androidx.annotation.Keep;
import defpackage.zq3;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class ApiResponse<T> {
    private final Object error;
    private final List<ApiResponseError> errors;
    private final T results;

    public ApiResponse(List<ApiResponseError> list, Object obj, T t) {
        this.errors = list;
        this.error = obj;
        this.results = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, List list, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            list = apiResponse.errors;
        }
        if ((i & 2) != 0) {
            obj = apiResponse.error;
        }
        if ((i & 4) != 0) {
            obj2 = apiResponse.results;
        }
        return apiResponse.copy(list, obj, obj2);
    }

    public final List<ApiResponseError> component1() {
        return this.errors;
    }

    public final Object component2() {
        return this.error;
    }

    public final T component3() {
        return this.results;
    }

    public final ApiResponse<T> copy(List<ApiResponseError> list, Object obj, T t) {
        return new ApiResponse<>(list, obj, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return zq3.c(this.errors, apiResponse.errors) && zq3.c(this.error, apiResponse.error) && zq3.c(this.results, apiResponse.results);
    }

    public final Object getError() {
        return this.error;
    }

    public final List<ApiResponseError> getErrors() {
        return this.errors;
    }

    public final T getResults() {
        return this.results;
    }

    public int hashCode() {
        List<ApiResponseError> list = this.errors;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Object obj = this.error;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        T t = this.results;
        return hashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "ApiResponse(errors=" + this.errors + ", error=" + this.error + ", results=" + this.results + ')';
    }
}
