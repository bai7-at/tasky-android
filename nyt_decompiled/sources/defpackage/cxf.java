package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class cxf implements mxf {
    private final MediaCodec a;
    private final ixf b;
    private final nxf c;
    private boolean d;
    private int e = 0;

    /* synthetic */ cxf(MediaCodec mediaCodec, HandlerThread handlerThread, nxf nxfVar, bxf bxfVar) {
        this.a = mediaCodec;
        this.b = new ixf(handlerThread);
        this.c = nxfVar;
    }

    static /* synthetic */ void i(cxf cxfVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        cxfVar.b.f(cxfVar.a);
        int i2 = khe.a;
        Trace.beginSection("configureCodec");
        cxfVar.a.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        cxfVar.c.zzh();
        Trace.beginSection("startCodec");
        cxfVar.a.start();
        Trace.endSection();
        cxfVar.e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.mxf
    public final void a(int i, int i2, int i3, long j, int i4) {
        this.c.c(i, 0, i3, j, i4);
    }

    @Override // defpackage.mxf
    public final void b(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.mxf
    public final void c(int i, int i2, j7f j7fVar, long j, int i3) {
        this.c.a(i, 0, j7fVar, j, 0);
    }

    @Override // defpackage.mxf
    public final void d(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.mxf
    public final void e(int i, boolean z) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.mxf
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        this.c.zzc();
        return this.b.b(bufferInfo);
    }

    @Override // defpackage.mxf
    public final void y(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.mxf
    public final int zza() {
        this.c.zzc();
        return this.b.a();
    }

    @Override // defpackage.mxf
    public final MediaFormat zzc() {
        return this.b.c();
    }

    @Override // defpackage.mxf
    public final ByteBuffer zzf(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.mxf
    public final ByteBuffer zzg(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.mxf
    public final void zzi() {
        this.c.zzb();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // defpackage.mxf
    public final void zzl() {
        try {
            if (this.e == 1) {
                this.c.zzg();
                this.b.g();
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // defpackage.mxf
    public final void zzm(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }
}
