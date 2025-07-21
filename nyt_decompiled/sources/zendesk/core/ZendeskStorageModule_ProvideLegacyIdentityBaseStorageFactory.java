package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory implements ba2 {
    private final p76 contextProvider;
    private final p76 serializerProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(p76 p76Var, p76 p76Var2) {
        this.contextProvider = p76Var;
        this.serializerProvider = p76Var2;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(p76Var, p76Var2);
    }

    public static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Object obj) {
        return (SharedPreferencesStorage) g16.c(ZendeskStorageModule.provideLegacyIdentityBaseStorage(context, (Serializer) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SharedPreferencesStorage get() {
        return provideLegacyIdentityBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
