package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class AcceptHeaderInterceptor implements Interceptor {
    AcceptHeaderInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().addHeader("Accept", Constants.APPLICATION_JSON).build());
    }
}
