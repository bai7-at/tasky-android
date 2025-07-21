package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ServiceModule_ProvideZendeskUploadServiceFactory implements ba2 {
    private final p76 uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(p76 p76Var) {
        this.uploadServiceProvider = p76Var;
    }

    public static ServiceModule_ProvideZendeskUploadServiceFactory create(p76 p76Var) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(p76Var);
    }

    public static ZendeskUploadService provideZendeskUploadService(Object obj) {
        return (ZendeskUploadService) g16.c(ServiceModule.provideZendeskUploadService((UploadService) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskUploadService get() {
        return provideZendeskUploadService(this.uploadServiceProvider.get());
    }
}
