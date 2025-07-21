package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.io.File;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesCacheDirFactory implements ba2 {
    private final p76 contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(p76 p76Var) {
        this.contextProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvidesCacheDirFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(p76Var);
    }

    public static File providesCacheDir(Context context) {
        return (File) g16.c(ZendeskStorageModule.providesCacheDir(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public File get() {
        return providesCacheDir((Context) this.contextProvider.get());
    }
}
