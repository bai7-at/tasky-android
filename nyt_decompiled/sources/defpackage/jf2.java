package defpackage;

import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public abstract class jf2 {
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        zq3.h(readableByteChannel, "input");
        zq3.h(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
