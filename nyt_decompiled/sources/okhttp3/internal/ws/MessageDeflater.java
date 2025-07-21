package okhttp3.internal.ws;

import defpackage.ad0;
import defpackage.gm0;
import defpackage.ml1;
import defpackage.yt7;
import defpackage.zq3;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class MessageDeflater implements Closeable {
    private final ad0 deflatedBytes;
    private final Deflater deflater;
    private final ml1 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        ad0 ad0Var = new ad0();
        this.deflatedBytes = ad0Var;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new ml1((yt7) ad0Var, deflater);
    }

    private final boolean endsWith(ad0 ad0Var, ByteString byteString) {
        return ad0Var.W(ad0Var.h1() - byteString.E(), byteString);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(ad0 ad0Var) throws IOException {
        ByteString byteString;
        zq3.h(ad0Var, "buffer");
        if (this.deflatedBytes.h1() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(ad0Var, ad0Var.h1());
        this.deflaterSink.flush();
        ad0 ad0Var2 = this.deflatedBytes;
        byteString = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(ad0Var2, byteString)) {
            long h1 = this.deflatedBytes.h1() - 4;
            ad0.c w0 = ad0.w0(this.deflatedBytes, null, 1, null);
            try {
                w0.d(h1);
                gm0.a(w0, null);
            } finally {
            }
        } else {
            this.deflatedBytes.D0(0);
        }
        ad0 ad0Var3 = this.deflatedBytes;
        ad0Var.write(ad0Var3, ad0Var3.h1());
    }
}
