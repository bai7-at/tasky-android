package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory implements ba2 {
    private final p76 contextProvider;

    public ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(p76 p76Var) {
        this.contextProvider = p76Var;
    }

    public static ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory create(p76 p76Var) {
        return new ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(p76Var);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return (AcceptLanguageHeaderInterceptor) g16.c(ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor((Context) this.contextProvider.get());
    }
}
