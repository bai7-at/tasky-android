package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.video.VideoReferringSource;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c99 implements b99 {
    public static final a Companion = new a(null);
    private static final long h;
    private static final long i;
    private final w89 a;
    private final ConcurrentMap b;
    private final ConcurrentMap c;
    private final ConcurrentMap d;
    private final ConcurrentMap e;
    private final ConcurrentMap f;
    private final ConcurrentMap g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        h = timeUnit.convert(3L, timeUnit2);
        i = timeUnit.convert(30L, timeUnit2);
    }

    public c99(w89 w89Var) {
        zq3.h(w89Var, "videoEventReporter");
        this.a = w89Var;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
    }

    private final void c(v50 v50Var) {
        if (((Boolean) this.c.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.g((NYTMediaItem) v50Var);
        }
    }

    private final void d(v50 v50Var) {
        if (((Boolean) this.b.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.r((NYTMediaItem) v50Var);
        }
    }

    private final void e(v50 v50Var) {
        if (((Boolean) this.d.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.d((NYTMediaItem) v50Var);
        }
    }

    private final void f(v50 v50Var) {
        if (((Boolean) this.e.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.t((NYTMediaItem) v50Var);
        }
    }

    private final void g(v50 v50Var) {
        if (((Boolean) this.f.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.a((NYTMediaItem) v50Var);
        }
    }

    private final void h(v50 v50Var) {
        if (((Boolean) this.g.putIfAbsent(v50Var.a(), Boolean.TRUE)) == null && (v50Var instanceof NYTMediaItem)) {
            this.a.a((NYTMediaItem) v50Var);
        }
    }

    @Override // defpackage.b99
    public void a() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.b.clear();
        this.c.clear();
    }

    @Override // defpackage.b99
    public void b(v50 v50Var, VideoReferringSource videoReferringSource, long j, long j2) {
        zq3.h(v50Var, "item");
        if (j >= h) {
            d(v50Var);
        }
        if (j >= i) {
            c(v50Var);
        }
        double d = j / j2;
        if (d >= 0.25d) {
            e(v50Var);
        }
        if (d >= 0.5d) {
            f(v50Var);
        }
        if (d >= 0.75d) {
            g(v50Var);
        }
        if (d >= 0.8999999761581421d) {
            h(v50Var);
        }
    }
}
