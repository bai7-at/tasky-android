package okhttp3.internal.ws;

import defpackage.ad0;
import defpackage.px7;
import defpackage.qj3;
import defpackage.zq3;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public final class MessageInflater implements Closeable {
    private final ad0 deflatedBytes;
    private final Inflater inflater;
    private final qj3 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        ad0 ad0Var = new ad0();
        this.deflatedBytes = ad0Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new qj3((px7) ad0Var, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(ad0 ad0Var) throws IOException {
        zq3.h(ad0Var, "buffer");
        if (this.deflatedBytes.h1() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.I0(ad0Var);
        this.deflatedBytes.F(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.h1();
        do {
            this.inflaterSource.a(ad0Var, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
