package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import zendesk.core.Constants;

/* loaded from: classes4.dex */
public final class su4 implements Interceptor {
    public static final a Companion = new a(null);
    private final qu4 a;
    private final ru4 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public su4(qu4 qu4Var, ru4 ru4Var) {
        zq3.h(qu4Var, "purrFactory");
        zq3.h(ru4Var, "subauthFactory");
        this.a = qu4Var;
        this.b = ru4Var;
    }

    private final boolean a(Request request) {
        return zq3.c(request.method(), "POST") && request.headers("X-APOLLO-OPERATION-NAME").contains("MutateTcfPreference");
    }

    private final boolean b(Request request) {
        return zq3.c(request.method(), "GET") && request.headers("X-APOLLO-OPERATION-NAME").contains("PrivacyDirectivesV2");
    }

    private final boolean c(Request request) {
        return zq3.c(request.method(), "GET") && request.headers("X-APOLLO-OPERATION-NAME").contains("UserDetails");
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Request request = chain.request();
        if (b(request) && this.a.f()) {
            ul8.a.z("PURR").a("Using Mock Query PURR Results: " + this.a.k(), new Object[0]);
            return chain.proceed(chain.request()).newBuilder().code(200).body(this.a.j()).addHeader("content-type", Constants.APPLICATION_JSON).build();
        }
        if (a(request) && this.a.e()) {
            ul8.a.z("PURR").a("Using Mock Mutate PURR Results: " + this.a.i(), new Object[0]);
            return chain.proceed(chain.request()).newBuilder().code(200).body(this.a.h()).addHeader("content-type", Constants.APPLICATION_JSON).build();
        }
        if (!c(request) || !this.b.c()) {
            return chain.proceed(request);
        }
        ul8.a.z("SUBAUTH").a("Using Mock Query UserDetails Results: " + this.b.e(), new Object[0]);
        return chain.proceed(chain.request()).newBuilder().code(200).body(this.b.f()).addHeader("content-type", Constants.APPLICATION_JSON).build();
    }
}
