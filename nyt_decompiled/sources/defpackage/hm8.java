package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class hm8 implements Interceptor {
    public static final a Companion = new a(null);
    private final fm8 a;
    private final u77 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public hm8(fm8 fm8Var, u77 u77Var) {
        zq3.h(fm8Var, "timeSkewAdjuster");
        zq3.h(u77Var, "reporter");
        this.a = fm8Var;
        this.b = u77Var;
    }

    private final Response a(Response response, Interceptor.Chain chain) {
        if (response.request().header("time_skew_retry_attempt") != null || !this.a.c(response)) {
            return response;
        }
        ul8.a.z("Network").a("Retrying request " + response.request().url() + " adjusted for Samizdat time skew", new Object[0]);
        return chain.proceed(response.request().newBuilder().headers(response.request().headers().newBuilder().add("time_skew_retry_attempt", "true").build()).build());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        if (proceed.isSuccessful()) {
            return proceed;
        }
        if (proceed.code() != 404 && proceed.code() != 304) {
            this.b.a(0, proceed);
        }
        return a(proceed, chain);
    }

    public /* synthetic */ hm8(fm8 fm8Var, u77 u77Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fm8Var, (i & 2) != 0 ? new v77() : u77Var);
    }
}
