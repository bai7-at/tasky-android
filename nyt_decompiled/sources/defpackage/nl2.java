package defpackage;

import com.facebook.appevents.FlushResult;

/* loaded from: classes2.dex */
public final class nl2 {
    private int a;
    private FlushResult b = FlushResult.SUCCESS;

    public final int a() {
        return this.a;
    }

    public final FlushResult b() {
        return this.b;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d(FlushResult flushResult) {
        zq3.h(flushResult, "<set-?>");
        this.b = flushResult;
    }
}
