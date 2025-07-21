package io.embrace.android.embracesdk.samples;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class EmbraceSampleCodeException extends Exception {
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbraceSampleCodeException(String str) {
        super(str);
        zq3.h(str, "msg");
        this.msg = str;
    }

    public final String getMsg() {
        return this.msg;
    }
}
