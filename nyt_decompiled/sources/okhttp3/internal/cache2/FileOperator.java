package okhttp3.internal.cache2;

import defpackage.ad0;
import defpackage.zq3;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        zq3.h(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, ad0 ad0Var, long j2) {
        zq3.h(ad0Var, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, ad0Var);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void write(long j, ad0 ad0Var, long j2) throws IOException {
        zq3.h(ad0Var, "source");
        if (j2 < 0 || j2 > ad0Var.h1()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(ad0Var, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
