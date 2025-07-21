package zendesk.core;

import android.content.Context;
import defpackage.r48;
import defpackage.r74;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context) {
        this.context = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        return (!r48.d(request.header(Constants.ACCEPT_LANGUAGE)) || currentLocale == null) ? chain.proceed(request) : chain.proceed(request.newBuilder().addHeader(Constants.ACCEPT_LANGUAGE, r74.a(currentLocale)).build());
    }
}
