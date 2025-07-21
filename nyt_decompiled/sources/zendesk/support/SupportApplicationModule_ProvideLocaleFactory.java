package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class SupportApplicationModule_ProvideLocaleFactory implements ba2 {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvideLocaleFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public static Locale provideLocale(SupportApplicationModule supportApplicationModule) {
        return (Locale) g16.c(supportApplicationModule.provideLocale(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Locale get() {
        return provideLocale(this.module);
    }
}
