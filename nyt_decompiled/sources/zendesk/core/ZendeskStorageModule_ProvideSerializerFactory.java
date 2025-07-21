package zendesk.core;

import com.google.gson.Gson;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSerializerFactory implements ba2 {
    private final p76 gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(p76 p76Var) {
        this.gsonProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideSerializerFactory(p76Var);
    }

    public static Serializer provideSerializer(Gson gson) {
        return (Serializer) g16.c(ZendeskStorageModule.provideSerializer(gson), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Serializer get() {
        return provideSerializer((Gson) this.gsonProvider.get());
    }
}
