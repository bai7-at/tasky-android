package okhttp3.internal.http2;

import defpackage.zq3;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        zq3.h(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
