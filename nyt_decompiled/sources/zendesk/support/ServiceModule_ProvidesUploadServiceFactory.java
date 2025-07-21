package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class ServiceModule_ProvidesUploadServiceFactory implements ba2 {
    private final p76 restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(p76 p76Var) {
        this.restServiceProvider = p76Var;
    }

    public static ServiceModule_ProvidesUploadServiceFactory create(p76 p76Var) {
        return new ServiceModule_ProvidesUploadServiceFactory(p76Var);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) g16.c(ServiceModule.providesUploadService(restServiceProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public UploadService get() {
        return providesUploadService((RestServiceProvider) this.restServiceProvider.get());
    }
}
