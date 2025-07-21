package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.trace.TracingHeaderType;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class pb5 extends TracingInterceptor {
    public static final a Companion = new a(null);
    private static final Set m = b0.j(TracingHeaderType.DATADOG, TracingHeaderType.B3MULTI, TracingHeaderType.TRACECONTEXT);
    private final com.nytimes.android.performancetrackerclientphoenix.tracing.a l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pb5(com.nytimes.android.performancetrackerclientphoenix.tracing.a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "tracingMetadata"
            defpackage.zq3.h(r9, r0)
            java.util.Set r0 = defpackage.pb5.m
            java.lang.String r1 = "nytimes.com"
            kotlin.Pair r1 = defpackage.du8.a(r1, r0)
            java.lang.String r2 = "nyt.com"
            kotlin.Pair r0 = defpackage.du8.a(r2, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r1, r0}
            java.util.Map r3 = kotlin.collections.t.m(r0)
            r6 = 13
            r7 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.l = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb5.<init>(com.nytimes.android.performancetrackerclientphoenix.tracing.a):void");
    }

    private final boolean A(Request request) {
        return !h.K(request.url().host(), "static", false, 2, null);
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor, okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        return A(chain.request()) ? super.intercept(chain) : chain.proceed(chain.request());
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    protected void q(jb2 jb2Var, Request request, tx7 tx7Var, Response response, Throwable th) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(request, "request");
        if (tx7Var != null) {
            tx7Var.e("eid", this.l.a());
        }
        if (tx7Var != null) {
            tx7Var.e("isBna", String.valueOf(this.l.b()));
        }
        String queryParameter = request.url().queryParameter("operationName");
        if (queryParameter != null && tx7Var != null) {
            tx7Var.d(queryParameter);
        }
        super.q(jb2Var, request, tx7Var, response, th);
    }
}
