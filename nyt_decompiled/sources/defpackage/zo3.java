package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public abstract class zo3 {

    public static final class a implements Interceptor {
        final /* synthetic */ ss2 a;

        public a(ss2 ss2Var) {
            this.a = ss2Var;
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            zq3.h(chain, "chain");
            Request.Builder newBuilder = chain.request().newBuilder();
            this.a.invoke(newBuilder);
            return chain.proceed(newBuilder.build());
        }
    }

    public static final Request.Builder a(Request.Builder builder, String str, String str2) {
        zq3.h(builder, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str2 != null) {
            return builder.addHeader(str, str2);
        }
        return null;
    }

    public static final OkHttpClient.Builder b(OkHttpClient.Builder builder, Interceptor[] interceptorArr) {
        zq3.h(builder, "<this>");
        zq3.h(interceptorArr, "interceptors");
        for (Interceptor interceptor : interceptorArr) {
            builder.addInterceptor(interceptor);
        }
        return builder;
    }

    public static final OkHttpClient.Builder c(OkHttpClient.Builder builder, ss2 ss2Var) {
        zq3.h(builder, "<this>");
        zq3.h(ss2Var, QueryKeys.VISIT_FREQUENCY);
        builder.addInterceptor(new a(ss2Var));
        return builder;
    }
}
