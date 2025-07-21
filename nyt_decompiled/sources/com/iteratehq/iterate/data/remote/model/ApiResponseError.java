package com.iteratehq.iterate.data.remote.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class ApiResponseError {
    private final int code;
    private final String message;

    /* renamed from: type, reason: collision with root package name */
    private final String f51type;

    @SerializedName("user_message")
    private final String userMessage;

    public ApiResponseError(int i, String str, String str2, String str3) {
        this.code = i;
        this.message = str;
        this.f51type = str2;
        this.userMessage = str3;
    }

    public static /* synthetic */ ApiResponseError copy$default(ApiResponseError apiResponseError, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = apiResponseError.code;
        }
        if ((i2 & 2) != 0) {
            str = apiResponseError.message;
        }
        if ((i2 & 4) != 0) {
            str2 = apiResponseError.f51type;
        }
        if ((i2 & 8) != 0) {
            str3 = apiResponseError.userMessage;
        }
        return apiResponseError.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.f51type;
    }

    public final String component4() {
        return this.userMessage;
    }

    public final ApiResponseError copy(int i, String str, String str2, String str3) {
        return new ApiResponseError(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponseError)) {
            return false;
        }
        ApiResponseError apiResponseError = (ApiResponseError) obj;
        return this.code == apiResponseError.code && zq3.c(this.message, apiResponseError.message) && zq3.c(this.f51type, apiResponseError.f51type) && zq3.c(this.userMessage, apiResponseError.userMessage);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.f51type;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userMessage;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ApiResponseError(code=" + this.code + ", message=" + this.message + ", type=" + this.f51type + ", userMessage=" + this.userMessage + ')';
    }
}
