package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class kz1 implements Interceptor {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        String header = request.header("X-APOLLO-OPERATION-NAME");
        if (header != null && header.length() > 0) {
            newBuilder.header("x-emb-path", "/graphql/" + header);
        }
        return chain.proceed(newBuilder.build());
    }
}
