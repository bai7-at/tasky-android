package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.io.File;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements ba2 {
    private final p76 fileProvider;
    private final p76 serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(p76 p76Var, p76 p76Var2) {
        this.fileProvider = p76Var;
        this.serializerProvider = p76Var2;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(p76Var, p76Var2);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        return (BaseStorage) g16.c(ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public BaseStorage get() {
        return providesDiskLruStorage((File) this.fileProvider.get(), this.serializerProvider.get());
    }
}
