package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ServiceModule_ProvideZendeskRequestServiceFactory implements ba2 {
    private final p76 requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(p76 p76Var) {
        this.requestServiceProvider = p76Var;
    }

    public static ServiceModule_ProvideZendeskRequestServiceFactory create(p76 p76Var) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(p76Var);
    }

    public static ZendeskRequestService provideZendeskRequestService(Object obj) {
        return (ZendeskRequestService) g16.c(ServiceModule.provideZendeskRequestService((RequestService) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskRequestService get() {
        return provideZendeskRequestService(this.requestServiceProvider.get());
    }
}
