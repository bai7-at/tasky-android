package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.t0;
import defpackage.t31;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface j {

    public static final class a {
        public final k a;
        public final MediaFormat b;
        public final t0 c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;

        private a(k kVar, MediaFormat mediaFormat, t0 t0Var, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.a = kVar;
            this.b = mediaFormat;
            this.c = t0Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
        }

        public static a a(k kVar, MediaFormat mediaFormat, t0 t0Var, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, t0Var, null, mediaCrypto, 0);
        }

        public static a b(k kVar, MediaFormat mediaFormat, t0 t0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, t0Var, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        j a(a aVar);
    }

    public interface c {
        void a(j jVar, long j, long j2);
    }

    void a(int i, int i2, t31 t31Var, long j, int i3);

    MediaFormat b();

    void c(c cVar, Handler handler);

    void d(int i);

    ByteBuffer e(int i);

    void f(Surface surface);

    void flush();

    void g(int i, int i2, int i3, long j, int i4);

    boolean h();

    void i(Bundle bundle);

    void j(int i, long j);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i, boolean z);

    ByteBuffer n(int i);

    void release();
}
