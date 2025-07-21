package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class gxf implements nxf {
    private static final ArrayDeque g = new ArrayDeque();
    private static final Object h = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference d;
    private final jfd e;
    private boolean f;

    public gxf(MediaCodec mediaCodec, HandlerThread handlerThread) {
        jfd jfdVar = new jfd(acd.a);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = jfdVar;
        this.d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void d(defpackage.gxf r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L58
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            defpackage.dxf.a(r9, r1, r0)
            goto L72
        L1f:
            java.lang.Object r10 = r10.obj
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.media.MediaCodec r0 = r9.a     // Catch: java.lang.RuntimeException -> L29
            r0.setParameters(r10)     // Catch: java.lang.RuntimeException -> L29
            goto L72
        L29:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            defpackage.dxf.a(r9, r1, r10)
            goto L72
        L30:
            jfd r9 = r9.e
            r9.e()
            goto L72
        L36:
            java.lang.Object r10 = r10.obj
            fxf r10 = (defpackage.fxf) r10
            int r3 = r10.a
            android.media.MediaCodec$CryptoInfo r5 = r10.d
            long r6 = r10.e
            int r8 = r10.f
            java.lang.Object r0 = defpackage.gxf.h     // Catch: java.lang.RuntimeException -> L50
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L50
            android.media.MediaCodec r2 = r9.a     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L56
        L4d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.RuntimeException -> L50
        L50:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            defpackage.dxf.a(r9, r1, r0)
        L56:
            r1 = r10
            goto L72
        L58:
            java.lang.Object r10 = r10.obj
            fxf r10 = (defpackage.fxf) r10
            int r3 = r10.a
            int r5 = r10.c
            long r6 = r10.e
            int r8 = r10.f
            android.media.MediaCodec r2 = r9.a     // Catch: java.lang.RuntimeException -> L6b
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L6b
            goto L56
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            defpackage.dxf.a(r9, r1, r0)
            goto L56
        L72:
            if (r1 == 0) goto L7f
            java.util.ArrayDeque r9 = defpackage.gxf.g
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            throw r10
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxf.d(gxf, android.os.Message):void");
    }

    private static fxf e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new fxf();
                }
                return (fxf) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] g(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // defpackage.nxf
    public final void a(int i, int i2, j7f j7fVar, long j, int i3) {
        zzc();
        fxf e = e();
        e.a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = e.d;
        cryptoInfo.numSubSamples = j7fVar.f;
        cryptoInfo.numBytesOfClearData = g(j7fVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(j7fVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] f = f(j7fVar.b, cryptoInfo.key);
        f.getClass();
        cryptoInfo.key = f;
        byte[] f2 = f(j7fVar.a, cryptoInfo.iv);
        f2.getClass();
        cryptoInfo.iv = f2;
        cryptoInfo.mode = j7fVar.c;
        if (khe.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(j7fVar.g, j7fVar.h));
        }
        this.c.obtainMessage(1, e).sendToTarget();
    }

    @Override // defpackage.nxf
    public final void b(Bundle bundle) {
        zzc();
        Handler handler = this.c;
        int i = khe.a;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // defpackage.nxf
    public final void c(int i, int i2, int i3, long j, int i4) {
        zzc();
        fxf e = e();
        e.a(i, 0, i3, j, i4);
        Handler handler = this.c;
        int i5 = khe.a;
        handler.obtainMessage(0, e).sendToTarget();
    }

    @Override // defpackage.nxf
    public final void zzb() {
        if (this.f) {
            try {
                Handler handler = this.c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.e.c();
                Handler handler2 = this.c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.nxf
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.nxf
    public final void zzg() {
        if (this.f) {
            zzb();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.nxf
    public final void zzh() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new exf(this, this.b.getLooper());
        this.f = true;
    }
}
