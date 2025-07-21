package com.google.android.exoplayer2.mediacodec;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.ur;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class f extends DecoderInputBuffer {
    private long i;
    private int j;
    private int k;

    public f() {
        super(2);
        this.k = 32;
    }

    private boolean z(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!D()) {
            return true;
        }
        if (this.j >= this.k || decoderInputBuffer.k() != k()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.c;
        return byteBuffer2 == null || (byteBuffer = this.c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long A() {
        return this.e;
    }

    public long B() {
        return this.i;
    }

    public int C() {
        return this.j;
    }

    public boolean D() {
        return this.j > 0;
    }

    public void E(int i) {
        ur.a(i > 0);
        this.k = i;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, defpackage.bd0
    public void f() {
        super.f();
        this.j = 0;
    }

    public boolean y(DecoderInputBuffer decoderInputBuffer) {
        ur.a(!decoderInputBuffer.v());
        ur.a(!decoderInputBuffer.j());
        ur.a(!decoderInputBuffer.l());
        if (!z(decoderInputBuffer)) {
            return false;
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.e = decoderInputBuffer.e;
            if (decoderInputBuffer.o()) {
                q(1);
            }
        }
        if (decoderInputBuffer.k()) {
            q(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.c;
        if (byteBuffer != null) {
            t(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.i = decoderInputBuffer.e;
        return true;
    }
}
