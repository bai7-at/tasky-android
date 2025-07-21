package com.nytimes.android.internal.graphql.exceptions;

import com.nytimes.android.internal.auth.graphql.APIException;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SamizdatException extends APIException {
    public static final a Companion = new a(null);
    private final int attempt;
    private final int code;
    private final String errorHeader;
    private final String requestTimestamp;
    private final String responseTimestamp;
    private final Throwable throwable;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ SamizdatException(int i, int i2, String str, String str2, String str3, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, (i3 & 32) != 0 ? null : th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamizdatException)) {
            return false;
        }
        SamizdatException samizdatException = (SamizdatException) obj;
        return this.attempt == samizdatException.attempt && this.code == samizdatException.code && zq3.c(this.errorHeader, samizdatException.errorHeader) && zq3.c(this.requestTimestamp, samizdatException.requestTimestamp) && zq3.c(this.responseTimestamp, samizdatException.responseTimestamp) && zq3.c(this.throwable, samizdatException.throwable);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.attempt) * 31) + Integer.hashCode(this.code)) * 31;
        String str = this.errorHeader;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestTimestamp;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.responseTimestamp;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Throwable th = this.throwable;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SamizdatException(attempt=" + this.attempt + ", code=" + this.code + ", errorHeader=" + this.errorHeader + ", requestTimestamp=" + this.requestTimestamp + ", responseTimestamp=" + this.responseTimestamp + ", throwable=" + this.throwable + ")";
    }

    public SamizdatException(int i, int i2, String str, String str2, String str3, Throwable th) {
        super(th, "Request failed with {} {} on attempt={} with requestTimestamp={}, responseTimestamp={}", Integer.valueOf(i2), str, Integer.valueOf(i), str2, str3);
        this.attempt = i;
        this.code = i2;
        this.errorHeader = str;
        this.requestTimestamp = str2;
        this.responseTimestamp = str3;
        this.throwable = th;
    }
}
