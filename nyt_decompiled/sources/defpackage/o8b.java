package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class o8b {
    final Map a = new ConcurrentHashMap();
    private final AtomicInteger b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return (Bitmap) this.a.get(num);
    }
}
