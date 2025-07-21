package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class ServiceModule_ProvidesRequestServiceFactory implements ba2 {
    private final p76 restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(p76 p76Var) {
        this.restServiceProvider = p76Var;
    }

    public static ServiceModule_ProvidesRequestServiceFactory create(p76 p76Var) {
        return new ServiceModule_ProvidesRequestServiceFactory(p76Var);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) g16.c(ServiceModule.providesRequestService(restServiceProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RequestService get() {
        return providesRequestService((RestServiceProvider) this.restServiceProvider.get());
    }
}
