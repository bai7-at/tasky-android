package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import defpackage.iyf;
import defpackage.j7f;
import defpackage.khe;
import defpackage.mxf;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class rp implements mxf {
    private final MediaCodec a;

    /* synthetic */ rp(MediaCodec mediaCodec, iyf iyfVar) {
        this.a = mediaCodec;
        int i = khe.a;
    }

    @Override // defpackage.mxf
    public final void a(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // defpackage.mxf
    public final void b(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.mxf
    public final void c(int i, int i2, j7f j7fVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, j7fVar.a(), j, 0);
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
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                int i = khe.a;
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.mxf
    public final void y(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.mxf
    public final int zza() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.mxf
    public final MediaFormat zzc() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.mxf
    public final ByteBuffer zzf(int i) {
        int i2 = khe.a;
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.mxf
    public final ByteBuffer zzg(int i) {
        int i2 = khe.a;
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.mxf
    public final void zzi() {
        this.a.flush();
    }

    @Override // defpackage.mxf
    public final void zzl() {
        this.a.release();
    }

    @Override // defpackage.mxf
    public final void zzm(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }
}
