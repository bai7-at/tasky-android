package okhttp3.internal.io;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.px7;
import defpackage.wd5;
import defpackage.xd5;
import defpackage.yt7;
import defpackage.zq3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public yt7 appendingSink(File file) throws FileNotFoundException {
                zq3.h(file, TransferTable.COLUMN_FILE);
                try {
                    return wd5.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return wd5.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                zq3.h(file, TransferTable.COLUMN_FILE);
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                zq3.h(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        zq3.g(file2, TransferTable.COLUMN_FILE);
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                zq3.h(file, TransferTable.COLUMN_FILE);
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                zq3.h(file, "from");
                zq3.h(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public yt7 sink(File file) throws FileNotFoundException {
                zq3.h(file, TransferTable.COLUMN_FILE);
                try {
                    return xd5.h(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return xd5.h(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                zq3.h(file, TransferTable.COLUMN_FILE);
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public px7 source(File file) throws FileNotFoundException {
                zq3.h(file, TransferTable.COLUMN_FILE);
                return wd5.k(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    yt7 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    yt7 sink(File file) throws FileNotFoundException;

    long size(File file);

    px7 source(File file) throws FileNotFoundException;
}
