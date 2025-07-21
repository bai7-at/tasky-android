package defpackage;

import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class fm8 {
    private long a;

    private final boolean a(long j, long j2, long j3) {
        synchronized (this) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return false;
            }
            this.a = j + j4;
            return true;
        }
    }

    public final boolean b(long j, long j2, boolean z, Long l) {
        if (!z) {
            return false;
        }
        zq3.e(l);
        return a(j, j2, l.longValue());
    }

    public final boolean c(Response response) {
        zq3.h(response, "okHttpResponse");
        gm8 gm8Var = new gm8(response.code(), response.headers());
        Request request = response.request();
        String header = request.header("NYT-Timestamp");
        zq3.e(header);
        long parseLong = Long.parseLong(header);
        String header2 = request.header("NYT-Timestamp_skew");
        return b(header2 != null ? Long.parseLong(header2) : 0L, parseLong, gm8Var.b(), Long.valueOf(gm8Var.a()));
    }

    public final long d() {
        return this.a;
    }
}
