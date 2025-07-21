package com.nytimes.android.ads.models;

import defpackage.zq3;

/* loaded from: classes2.dex */
public final class AdRequestError extends Throwable {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRequestError(String str) {
        super(str);
        zq3.h(str, "reason");
        this.reason = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdRequestError) && zq3.c(this.reason, ((AdRequestError) obj).reason);
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AdRequestError(reason=" + this.reason + ")";
    }
}
