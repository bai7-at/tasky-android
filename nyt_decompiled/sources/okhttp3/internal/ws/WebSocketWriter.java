package okhttp3.internal.ws;

import defpackage.ad0;
import defpackage.qd0;
import defpackage.zq3;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final ad0.c maskCursor;
    private final byte[] maskKey;
    private final ad0 messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final qd0 sink;
    private final ad0 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, qd0 qd0Var, Random random, boolean z2, boolean z3, long j) {
        zq3.h(qd0Var, "sink");
        zq3.h(random, "random");
        this.isClient = z;
        this.sink = qd0Var;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new ad0();
        this.sinkBuffer = qd0Var.g();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new ad0.c() : null;
    }

    private final void writeControlFrame(int i, ByteString byteString) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int E = byteString.E();
        if (E > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.D0(i | 128);
        if (this.isClient) {
            this.sinkBuffer.D0(E | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            zq3.e(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.j0(this.maskKey);
            if (E > 0) {
                long h1 = this.sinkBuffer.h1();
                this.sinkBuffer.m1(byteString);
                ad0 ad0Var = this.sinkBuffer;
                ad0.c cVar = this.maskCursor;
                zq3.e(cVar);
                ad0Var.c0(cVar);
                this.maskCursor.h(h1);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.D0(E);
            this.sinkBuffer.m1(byteString);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final qd0 getSink() {
        return this.sink;
    }

    public final void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.d;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            ad0 ad0Var = new ad0();
            ad0Var.x0(i);
            if (byteString != null) {
                ad0Var.m1(byteString);
            }
            byteString2 = ad0Var.a1();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, ByteString byteString) throws IOException {
        zq3.h(byteString, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m1(byteString);
        int i2 = i | 128;
        if (this.perMessageDeflate && byteString.E() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | 192;
        }
        long h1 = this.messageBuffer.h1();
        this.sinkBuffer.D0(i2);
        int i3 = this.isClient ? 128 : 0;
        if (h1 <= 125) {
            this.sinkBuffer.D0(i3 | ((int) h1));
        } else if (h1 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.D0(i3 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.x0((int) h1);
        } else {
            this.sinkBuffer.D0(i3 | 127);
            this.sinkBuffer.G1(h1);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            zq3.e(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.j0(this.maskKey);
            if (h1 > 0) {
                ad0 ad0Var = this.messageBuffer;
                ad0.c cVar = this.maskCursor;
                zq3.e(cVar);
                ad0Var.c0(cVar);
                this.maskCursor.h(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, h1);
        this.sink.e();
    }

    public final void writePing(ByteString byteString) throws IOException {
        zq3.h(byteString, "payload");
        writeControlFrame(9, byteString);
    }

    public final void writePong(ByteString byteString) throws IOException {
        zq3.h(byteString, "payload");
        writeControlFrame(10, byteString);
    }
}
