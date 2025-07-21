package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.sd0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;

/* loaded from: classes5.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final sd0 source;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(sd0 sd0Var) {
        zq3.h(sd0Var, "source");
        this.source = sd0Var;
        this.headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public final sd0 getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String Q = this.source.Q(this.headerLimit);
        this.headerLimit -= Q.length();
        return Q;
    }
}
