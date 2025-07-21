package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class h implements AudioProcessor {
    protected AudioProcessor.a b;
    protected AudioProcessor.a c;
    private AudioProcessor.a d;
    private AudioProcessor.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public h() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void a() {
        flush();
        this.f = AudioProcessor.a;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        k();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean d() {
        return this.h && this.g == AudioProcessor.a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.d = aVar;
        this.e = h(aVar);
        return isActive() ? this.e : AudioProcessor.a.e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        this.h = true;
        j();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    protected final boolean g() {
        return this.g.hasRemaining();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar);

    protected void i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.a.e;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
