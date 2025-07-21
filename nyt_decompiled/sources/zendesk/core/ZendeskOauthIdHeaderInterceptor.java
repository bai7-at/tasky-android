package zendesk.core;

import defpackage.r48;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskOauthIdHeaderInterceptor implements Interceptor {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (r48.b(this.oauthId)) {
            newBuilder.addHeader(Constants.CLIENT_IDENTIFIER_HEADER, this.oauthId);
        }
        return chain.proceed(newBuilder.build());
    }
}
