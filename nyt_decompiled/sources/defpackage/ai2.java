package defpackage;

import com.nytimes.android.utils.TimeDuration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class ai2 {
    private static final TimeDuration a = new TimeDuration(6, TimeUnit.HOURS);
    private static final TimeDuration b;
    private static final TimeDuration c;
    private static final TimeDuration d;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = new TimeDuration(2L, timeUnit);
        c = new TimeDuration(0L, timeUnit);
        d = new TimeDuration(0L, TimeUnit.SECONDS);
    }

    public static final TimeDuration a() {
        return d;
    }

    public static final TimeDuration b() {
        return b;
    }

    public static final TimeDuration c() {
        return a;
    }

    public static final TimeDuration d() {
        return c;
    }
}
