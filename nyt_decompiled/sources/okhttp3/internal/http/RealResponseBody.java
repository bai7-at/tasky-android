package okhttp3.internal.http;

import defpackage.sd0;
import defpackage.zq3;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final sd0 source;

    public RealResponseBody(String str, long j, sd0 sd0Var) {
        zq3.h(sd0Var, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = sd0Var;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public sd0 source() {
        return this.source;
    }
}
