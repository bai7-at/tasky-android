package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.io.File;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesDataDirFactory implements ba2 {
    private final p76 contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(p76 p76Var) {
        this.contextProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvidesDataDirFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(p76Var);
    }

    public static File providesDataDir(Context context) {
        return (File) g16.c(ZendeskStorageModule.providesDataDir(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public File get() {
        return providesDataDir((Context) this.contextProvider.get());
    }
}
