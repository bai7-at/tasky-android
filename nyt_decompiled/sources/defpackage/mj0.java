package defpackage;

import okhttp3.internal.http2.Http2;

/* loaded from: classes5.dex */
public final class mj0 extends lj0 {
    public static final mj0 c = new mj0();

    private mj0() {
    }

    public final void c(char[] cArr) {
        zq3.h(cArr, "array");
        if (cArr.length == 16384) {
            a(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    public final char[] d() {
        return super.b(Http2.INITIAL_MAX_FRAME_SIZE);
    }
}
