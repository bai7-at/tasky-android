package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements ba2 {
    private final p76 baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(p76 p76Var) {
        this.baseStorageProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(p76Var);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return (SettingsStorage) g16.c(ZendeskStorageModule.provideSettingsStorage(baseStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SettingsStorage get() {
        return provideSettingsStorage((BaseStorage) this.baseStorageProvider.get());
    }
}
