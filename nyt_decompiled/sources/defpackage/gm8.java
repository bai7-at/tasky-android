package defpackage;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;

/* loaded from: classes4.dex */
public final class gm8 {
    public static final a Companion = new a(null);
    private final int a;
    private final Headers b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public gm8(int i, Headers headers) {
        zq3.h(headers, "headers");
        this.a = i;
        this.b = headers;
    }

    public final long a() {
        try {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US).parse(this.b.values("Date").get(0)).getTime() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        } catch (Exception unused) {
            return System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        }
    }

    public final boolean b() {
        return this.a == 403;
    }
}
