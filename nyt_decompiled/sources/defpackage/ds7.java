package defpackage;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class ds7 implements Interceptor {
    public static final a Companion = new a(null);
    private final fm8 a;
    private final cs7 b;
    private final String c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ds7(fm8 fm8Var, cs7 cs7Var, String str, String str2) {
        zq3.h(fm8Var, "timeSkewAdjuster");
        zq3.h(cs7Var, "signer");
        zq3.h(str, "headerValue");
        zq3.h(str2, "appVersion");
        this.a = fm8Var;
        this.b = cs7Var;
        this.c = str;
        this.d = str2;
    }

    public final fm8 a() {
        return this.a;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        long d = this.a.d();
        long currentTimeMillis = (System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) + d;
        newBuilder.addHeader("NYT-Signature", this.b.a(chain.request().url().toString(), currentTimeMillis, this.c, this.d));
        if (d != 0) {
            newBuilder.addHeader("NYT-Timestamp_skew", String.valueOf(d));
        }
        newBuilder.addHeader("NYT-Timestamp", String.valueOf(currentTimeMillis));
        return chain.proceed(newBuilder.build());
    }
}
