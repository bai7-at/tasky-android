package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.n;
import com.google.android.exoplayer2.w0;
import defpackage.fw1;
import defpackage.n72;
import defpackage.ob;
import defpackage.rt7;
import defpackage.sq8;
import defpackage.ur;
import defpackage.z19;
import java.io.IOException;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
public final class RtspMediaSource extends com.google.android.exoplayer2.source.a {
    private final w0 h;
    private final b.a i;
    private final String j;
    private final Uri k;
    private final SocketFactory l;
    private final boolean m;
    private boolean r;
    private boolean s;
    private long n = -9223372036854775807L;
    private boolean t = true;

    public static final class Factory implements com.google.android.exoplayer2.source.q {
        public static final /* synthetic */ int h = 0;
        private long c = 8000;
        private String d = "ExoPlayerLib/2.19.1";
        private SocketFactory e = SocketFactory.getDefault();
        private boolean f;
        private boolean g;

        @Override // com.google.android.exoplayer2.source.o.a
        public int[] b() {
            return new int[]{3};
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource a(w0 w0Var) {
            ur.e(w0Var.b);
            return new RtspMediaSource(w0Var, this.f ? new f0(this.c) : new h0(this.c), this.d, this.e, this.g);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(fw1 fw1Var) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory d(com.google.android.exoplayer2.upstream.h hVar) {
            return this;
        }
    }

    public static class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th) {
            super(th);
        }

        public RtspPlaybackException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static final class RtspUdpUnsupportedTransportException extends RtspPlaybackException {
        public RtspUdpUnsupportedTransportException(String str) {
            super(str);
        }
    }

    class a implements n.c {
        a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void a() {
            RtspMediaSource.this.r = false;
            RtspMediaSource.this.J();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void b(z zVar) {
            RtspMediaSource.this.n = z19.D0(zVar.a());
            RtspMediaSource.this.r = !zVar.c();
            RtspMediaSource.this.s = zVar.c();
            RtspMediaSource.this.t = false;
            RtspMediaSource.this.J();
        }
    }

    class b extends com.google.android.exoplayer2.source.j {
        b(g2 g2Var) {
            super(g2Var);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            super.t(i, dVar, j);
            dVar.l = true;
            return dVar;
        }
    }

    static {
        n72.a("goog.exo.rtsp");
    }

    RtspMediaSource(w0 w0Var, b.a aVar, String str, SocketFactory socketFactory, boolean z) {
        this.h = w0Var;
        this.i = aVar;
        this.j = str;
        this.k = ((w0.h) ur.e(w0Var.b)).a;
        this.l = socketFactory;
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        g2 rt7Var = new rt7(this.n, this.r, false, this.s, null, this.h);
        if (this.t) {
            rt7Var = new b(rt7Var);
        }
        C(rt7Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        J();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.source.o
    public com.google.android.exoplayer2.source.n g(o.b bVar, ob obVar, long j) {
        return new n(obVar, this.i, this.k, new a(), this.j, this.l, this.m);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(com.google.android.exoplayer2.source.n nVar) {
        ((n) nVar).W();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
    }
}
