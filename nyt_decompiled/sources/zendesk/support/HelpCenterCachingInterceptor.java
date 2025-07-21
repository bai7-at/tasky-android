package zendesk.support;

import com.amazonaws.services.s3.Headers;
import defpackage.r48;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class HelpCenterCachingInterceptor implements Interceptor {
    HelpCenterCachingInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        return r48.b(proceed.headers().get("X-ZD-Cache-Control")) ? proceed.newBuilder().header(Headers.CACHE_CONTROL, proceed.header("X-ZD-Cache-Control")).build() : proceed;
    }
}
