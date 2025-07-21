package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideDeviceLocaleFactory implements ba2 {
    private final GuideProviderModule module;

    public GuideProviderModule_ProvideDeviceLocaleFactory(GuideProviderModule guideProviderModule) {
        this.module = guideProviderModule;
    }

    public static GuideProviderModule_ProvideDeviceLocaleFactory create(GuideProviderModule guideProviderModule) {
        return new GuideProviderModule_ProvideDeviceLocaleFactory(guideProviderModule);
    }

    public static Locale provideDeviceLocale(GuideProviderModule guideProviderModule) {
        return (Locale) g16.c(guideProviderModule.provideDeviceLocale(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Locale get() {
        return provideDeviceLocale(this.module);
    }
}
