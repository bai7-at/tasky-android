package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class mzf {
    private static final AtomicLong d = new AtomicLong();
    public final u1f a;
    public final Uri b;
    public final Map c;

    public mzf(long j, u1f u1fVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = u1fVar;
        this.b = uri;
        this.c = map;
    }

    public static long a() {
        return d.getAndIncrement();
    }
}
