package io.embrace.android.embracesdk.storage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* loaded from: classes5.dex */
public interface StorageService {

    public static final class DefaultImpls {
        public static /* synthetic */ List listFiles$default(StorageService storageService, FilenameFilter filenameFilter, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listFiles");
            }
            if ((i & 1) != 0) {
                filenameFilter = new FilenameFilter() { // from class: io.embrace.android.embracesdk.storage.StorageService$listFiles$1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        return true;
                    }
                };
            }
            return storageService.listFiles(filenameFilter);
        }
    }

    File getConfigCacheDir();

    File getFileForRead(String str);

    File getFileForWrite(String str);

    File getNativeCrashDir();

    List<File> listFiles(FilenameFilter filenameFilter);

    void logStorageTelemetry();
}
