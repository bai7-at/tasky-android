package io.embrace.android.embracesdk.internal.compression;

import defpackage.zq3;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public final class ConditionalGzipOutputStream extends OutputStream {
    private boolean drainedBuffer;
    private OutputStream impl;
    private final List<Byte> magicNumberBuffer;
    private final OutputStream outputStream;

    public ConditionalGzipOutputStream(OutputStream outputStream) {
        zq3.h(outputStream, "outputStream");
        this.outputStream = outputStream;
        this.magicNumberBuffer = new ArrayList();
    }

    private final void drainBufferIfNeeded() {
        if (this.drainedBuffer) {
            return;
        }
        this.impl = generateOutputStream();
        Iterator<T> it2 = this.magicNumberBuffer.iterator();
        while (it2.hasNext()) {
            byte byteValue = ((Number) it2.next()).byteValue();
            OutputStream outputStream = this.impl;
            if (outputStream == null) {
                zq3.z("impl");
            }
            outputStream.write(byteValue);
        }
        this.drainedBuffer = true;
    }

    private final OutputStream generateOutputStream() {
        if (this.magicNumberBuffer.isEmpty() || isCompressed(this.magicNumberBuffer)) {
            OutputStream outputStream = this.outputStream;
            return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        }
        OutputStream outputStream2 = this.outputStream;
        return new GZIPOutputStream(outputStream2 instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream2 : new BufferedOutputStream(outputStream2, 8192));
    }

    private final boolean isCompressed(List<Byte> list) {
        return list.size() >= 2 && list.get(0).byteValue() == ((byte) 31) && list.get(1).byteValue() == ((byte) 139);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        drainBufferIfNeeded();
        OutputStream outputStream = this.impl;
        if (outputStream == null) {
            zq3.z("impl");
        }
        outputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        drainBufferIfNeeded();
        OutputStream outputStream = this.impl;
        if (outputStream == null) {
            zq3.z("impl");
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.magicNumberBuffer.size() < 2) {
            this.magicNumberBuffer.add(Byte.valueOf((byte) i));
            return;
        }
        drainBufferIfNeeded();
        OutputStream outputStream = this.impl;
        if (outputStream == null) {
            zq3.z("impl");
        }
        outputStream.write(i);
    }
}
