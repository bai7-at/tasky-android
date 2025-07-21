package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.common.collect.ImmutableList;
import defpackage.ur;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {
    private final ImmutableList a;
    private final List b = new ArrayList();
    private ByteBuffer[] c = new ByteBuffer[0];
    private AudioProcessor.a d;
    private AudioProcessor.a e;
    private boolean f;

    public d(ImmutableList immutableList) {
        this.a = immutableList;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }

    private int c() {
        return this.c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    AudioProcessor audioProcessor = (AudioProcessor) this.b.get(i);
                    if (!audioProcessor.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.a;
                        long remaining = byteBuffer2.remaining();
                        audioProcessor.c(byteBuffer2);
                        this.c[i] = audioProcessor.b();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((AudioProcessor) this.b.get(i + 1)).f();
                    }
                }
                i++;
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) {
        if (aVar.equals(AudioProcessor.a.e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i = 0; i < this.a.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.a.get(i);
            AudioProcessor.a e = audioProcessor.e(aVar);
            if (audioProcessor.isActive()) {
                ur.g(!e.equals(AudioProcessor.a.e));
                aVar = e;
            }
        }
        this.e = aVar;
        return aVar;
    }

    public void b() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for (int i = 0; i < this.a.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.a.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.b.add(audioProcessor);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((AudioProcessor) this.b.get(i2)).b();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (!byteBuffer.hasRemaining()) {
            g(AudioProcessor.a);
        }
        return byteBuffer;
    }

    public boolean e() {
        return this.f && ((AudioProcessor) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a.size() != dVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i) != dVar.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.b.isEmpty();
    }

    public void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        ((AudioProcessor) this.b.get(0)).f();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i = 0; i < this.a.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.a.get(i);
            audioProcessor.flush();
            audioProcessor.a();
        }
        this.c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }
}
