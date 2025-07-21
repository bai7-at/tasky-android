package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideUploadProviderFactory implements ba2 {
    private final ProviderModule module;
    private final p76 uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, p76 p76Var) {
        this.module = providerModule;
        this.uploadServiceProvider = p76Var;
    }

    public static ProviderModule_ProvideUploadProviderFactory create(ProviderModule providerModule, p76 p76Var) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, p76Var);
    }

    public static UploadProvider provideUploadProvider(ProviderModule providerModule, Object obj) {
        return (UploadProvider) g16.c(providerModule.provideUploadProvider((ZendeskUploadService) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public UploadProvider get() {
        return provideUploadProvider(this.module, this.uploadServiceProvider.get());
    }
}
