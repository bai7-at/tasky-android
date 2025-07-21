package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideZendeskLocaleConverterFactory implements ba2 {
    private static final GuideProviderModule_ProvideZendeskLocaleConverterFactory INSTANCE = new GuideProviderModule_ProvideZendeskLocaleConverterFactory();

    public static GuideProviderModule_ProvideZendeskLocaleConverterFactory create() {
        return INSTANCE;
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return (ZendeskLocaleConverter) g16.c(GuideProviderModule.provideZendeskLocaleConverter(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter();
    }
}
