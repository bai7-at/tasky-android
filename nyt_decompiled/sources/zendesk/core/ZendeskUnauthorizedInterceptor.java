package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskUnauthorizedInterceptor implements Interceptor {
    private final SessionStorage sessionStorage;

    ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        this.sessionStorage = sessionStorage;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful() && 401 == proceed.code()) {
            onHttpUnauthorized();
        }
        return proceed;
    }

    void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}
