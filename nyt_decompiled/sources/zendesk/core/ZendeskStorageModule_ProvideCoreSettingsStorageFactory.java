package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements ba2 {
    private final p76 settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(p76 p76Var) {
        this.settingsStorageProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(p76Var);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        return (CoreSettingsStorage) g16.c(ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}
