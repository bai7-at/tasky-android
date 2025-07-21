package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideZendeskLocaleConverterFactory implements ba2 {
    private final ProviderModule module;

    public ProviderModule_ProvideZendeskLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideZendeskLocaleConverterFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideZendeskLocaleConverterFactory(providerModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ProviderModule providerModule) {
        return (ZendeskLocaleConverter) g16.c(providerModule.provideZendeskLocaleConverter(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
