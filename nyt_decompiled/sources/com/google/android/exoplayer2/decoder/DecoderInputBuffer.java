package com.google.android.exoplayer2.decoder;

import defpackage.bd0;
import defpackage.n72;
import defpackage.t31;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class DecoderInputBuffer extends bd0 {
    public final t31 b;
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    private final int g;
    private final int h;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        n72.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    private ByteBuffer s(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static DecoderInputBuffer w() {
        return new DecoderInputBuffer(0);
    }

    @Override // defpackage.bd0
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public void t(int i) {
        int i2 = i + this.h;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = s(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer s = s(i3);
        s.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            s.put(byteBuffer);
        }
        this.c = s;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean v() {
        return i(1073741824);
    }

    public void x(int i) {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f = ByteBuffer.allocate(i);
        } else {
            this.f.clear();
        }
    }

    public DecoderInputBuffer(int i, int i2) {
        this.b = new t31();
        this.g = i;
        this.h = i2;
    }
}
