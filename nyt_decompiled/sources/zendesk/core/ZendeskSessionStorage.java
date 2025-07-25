package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.mn0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cache;

/* loaded from: classes5.dex */
class ZendeskSessionStorage implements SessionStorage {
    private static final String LOG_TAG = "SessionStorage";
    private final BaseStorage additionalSdkStorage;
    private final IdentityStorage identityStorage;
    private final BaseStorage mediaCache;
    private final List<File> registeredFolders;
    private final Cache responseCache;
    private final File zendeskCacheDir;
    private final File zendeskDataDir;

    ZendeskSessionStorage(IdentityStorage identityStorage, BaseStorage baseStorage, Cache cache, BaseStorage baseStorage2, File file, File file2, File file3) {
        this.identityStorage = identityStorage;
        this.additionalSdkStorage = baseStorage;
        this.responseCache = cache;
        this.zendeskCacheDir = file;
        this.zendeskDataDir = file2;
        this.mediaCache = baseStorage2;
        this.registeredFolders = new ArrayList(Arrays.asList(file, file2, file3));
    }

    private static void clearDirectory(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && file.isDirectory() && mn0.i(listFiles)) {
            for (File file2 : listFiles) {
                clearDirectory(file2);
            }
        }
        file.delete();
    }

    private File createDirIfNotExists(File file) {
        if (file.exists()) {
            Logger.b(LOG_TAG, "Created dir %s, success: %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdirs()));
        }
        return file;
    }

    @Override // zendesk.core.SessionStorage
    public void clear() {
        this.identityStorage.clear();
        this.additionalSdkStorage.clear();
        this.mediaCache.clear();
        try {
            this.responseCache.evictAll();
        } catch (IOException unused) {
        }
        Iterator<File> it2 = this.registeredFolders.iterator();
        while (it2.hasNext()) {
            clearDirectory(it2.next());
        }
    }

    @Override // zendesk.core.SessionStorage
    public BaseStorage getAdditionalSdkStorage() {
        return this.additionalSdkStorage;
    }

    @Override // zendesk.core.SessionStorage
    public File getZendeskCacheDir() {
        return createDirIfNotExists(this.zendeskCacheDir);
    }

    @Override // zendesk.core.SessionStorage
    public File getZendeskDataDir() {
        return createDirIfNotExists(this.zendeskDataDir);
    }
}
