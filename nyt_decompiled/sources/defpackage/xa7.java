package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
final class xa7 implements u79, fh0 {
    private int i;
    private SurfaceTexture j;
    private byte[] m;
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final c56 c = new c56();
    private final qq2 d = new qq2();
    private final lm8 e = new lm8();
    private final lm8 f = new lm8();
    private final float[] g = new float[16];
    private final float[] h = new float[16];
    private volatile int k = 0;
    private int l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        this.a.set(true);
    }

    private void h(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.m;
        int i2 = this.l;
        this.m = bArr;
        if (i == -1) {
            i = this.k;
        }
        this.l = i;
        if (i2 == i && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        a56 a = bArr3 != null ? b56.a(bArr3, this.l) : null;
        if (a == null || !c56.c(a)) {
            a = a56.b(this.l);
        }
        this.f.a(j, a);
    }

    @Override // defpackage.u79
    public void b(long j, long j2, t0 t0Var, MediaFormat mediaFormat) {
        this.e.a(j2, Long.valueOf(j));
        h(t0Var.B, t0Var.H, j2);
    }

    public void c(float[] fArr, boolean z) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e) {
            a84.e("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.a.compareAndSet(true, false)) {
            ((SurfaceTexture) ur.e(this.j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e2) {
                a84.e("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.b.compareAndSet(true, false)) {
                GlUtil.j(this.g);
            }
            long timestamp = this.j.getTimestamp();
            Long l = (Long) this.e.g(timestamp);
            if (l != null) {
                this.d.c(this.g, l.longValue());
            }
            a56 a56Var = (a56) this.f.j(timestamp);
            if (a56Var != null) {
                this.c.d(a56Var);
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        this.c.a(this.i, this.h, z);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.c.b();
            GlUtil.b();
            this.i = GlUtil.f();
        } catch (GlUtil.GlException e) {
            a84.e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: wa7
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                xa7.this.f(surfaceTexture2);
            }
        });
        return this.j;
    }

    @Override // defpackage.fh0
    public void e(long j, float[] fArr) {
        this.d.e(j, fArr);
    }

    public void g(int i) {
        this.k = i;
    }

    @Override // defpackage.fh0
    public void i() {
        this.e.c();
        this.d.d();
        this.b.set(true);
    }
}
