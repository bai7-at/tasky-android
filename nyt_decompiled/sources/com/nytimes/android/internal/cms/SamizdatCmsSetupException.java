package com.nytimes.android.internal.cms;

/* loaded from: classes4.dex */
public final class SamizdatCmsSetupException extends RuntimeException {
    private final String message;

    public SamizdatCmsSetupException(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
