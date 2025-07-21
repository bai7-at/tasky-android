package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class z86 implements Interceptor {
    public static final a Companion = new a(null);
    private final c96 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public z86(c96 c96Var) {
        this.a = c96Var;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request.Builder b;
        zq3.h(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        c96 c96Var = this.a;
        String a2 = c96Var != null ? c96Var.a() : null;
        c96 c96Var2 = this.a;
        b = a96.b(newBuilder, "x-nyt-geoip-map", a2, c96Var2 != null ? c96Var2.getRegion() : null);
        return chain.proceed(b.build());
    }
}
