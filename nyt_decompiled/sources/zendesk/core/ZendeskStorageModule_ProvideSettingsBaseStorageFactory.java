package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements ba2 {
    private final p76 contextProvider;
    private final p76 serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(p76 p76Var, p76 p76Var2) {
        this.contextProvider = p76Var;
        this.serializerProvider = p76Var2;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(p76Var, p76Var2);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        return (BaseStorage) g16.c(ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public BaseStorage get() {
        return provideSettingsBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
