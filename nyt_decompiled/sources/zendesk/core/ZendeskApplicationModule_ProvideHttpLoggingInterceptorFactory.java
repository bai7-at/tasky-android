package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements ba2 {
    private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return (HttpLoggingInterceptor) g16.c(ZendeskApplicationModule.provideHttpLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}
