package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ad0;
import defpackage.pm8;
import defpackage.px7;
import defpackage.sd0;
import defpackage.tk5;
import defpackage.wd5;
import defpackage.zq3;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http1.HeadersReader;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final tk5 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final sd0 source;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tk5 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable {
        private final sd0 body;
        private final Headers headers;

        public Part(Headers headers, sd0 sd0Var) {
            zq3.h(headers, "headers");
            zq3.h(sd0Var, "body");
            this.headers = headers;
            this.body = sd0Var;
        }

        public final sd0 body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    private final class PartSource implements px7 {
        private final pm8 timeout = new pm8();

        public PartSource() {
        }

        @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
        public void close() {
            if (zq3.c(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.px7
        public long read(ad0 ad0Var, long j) {
            zq3.h(ad0Var, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!zq3.c(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            pm8 timeout = MultipartReader.this.source.timeout();
            pm8 pm8Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.timeoutNanos();
            long a = pm8.Companion.a(pm8Var.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(a, timeUnit);
            if (!timeout.hasDeadline()) {
                if (pm8Var.hasDeadline()) {
                    timeout.deadlineNanoTime(pm8Var.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    long read = currentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(ad0Var, currentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (pm8Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (pm8Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (pm8Var.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), pm8Var.deadlineNanoTime()));
            }
            try {
                long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                long read2 = currentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(ad0Var, currentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (pm8Var.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th2) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (pm8Var.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // defpackage.px7, defpackage.yt7
        public pm8 timeout() {
            return this.timeout;
        }
    }

    static {
        tk5.a aVar = tk5.d;
        ByteString.a aVar2 = ByteString.c;
        afterBoundaryOptions = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    public MultipartReader(sd0 sd0Var, String str) throws IOException {
        zq3.h(sd0Var, "source");
        zq3.h(str, "boundary");
        this.source = sd0Var;
        this.boundary = str;
        this.dashDashBoundary = new ad0().V("--").V(str).a1();
        this.crlfDashDashBoundary = new ad0().V("\r\n--").V(str).a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.o0(this.crlfDashDashBoundary.E());
        long J = this.source.g().J(this.crlfDashDashBoundary);
        return J == -1 ? Math.min(j, (this.source.g().h1() - this.crlfDashDashBoundary.E()) + 1) : Math.min(j, J);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.W(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.E());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.E());
        }
        boolean z = false;
        while (true) {
            int y0 = this.source.y0(afterBoundaryOptions);
            if (y0 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (y0 == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, wd5.d(partSource));
            }
            if (y0 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (y0 == 2 || y0 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            defpackage.zq3.h(r3, r0)
            sd0 r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r3 = "expected the Content-Type to have a boundary parameter"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
