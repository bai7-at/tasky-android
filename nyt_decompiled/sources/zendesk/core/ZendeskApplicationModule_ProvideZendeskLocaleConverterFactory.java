package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements ba2 {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        return (ZendeskLocaleConverter) g16.c(zendeskApplicationModule.provideZendeskLocaleConverter(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
