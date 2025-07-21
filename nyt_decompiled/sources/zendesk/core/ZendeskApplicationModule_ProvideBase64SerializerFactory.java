package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements ba2 {
    private final p76 gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, p76 p76Var) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = p76Var;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, p76 p76Var) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, p76Var);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        return (Serializer) g16.c(zendeskApplicationModule.provideBase64Serializer((Serializer) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
