package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes3.dex */
public final class uib extends Thread implements SurfaceTexture.OnFrameAvailableListener, sib {
    private static final float[] S = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private EGL10 B;
    private EGLDisplay H;
    private EGLContext L;
    private EGLSurface M;
    private volatile boolean N;
    private volatile boolean Q;
    private final tib a;
    private final float[] b;
    private final float[] c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final float[] h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private SurfaceTexture n;
    private SurfaceTexture r;
    private int s;
    private int t;
    private int u;
    private final FloatBuffer w;
    private final CountDownLatch x;
    private final Object y;

    public uib(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = S;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.w = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.b = new float[9];
        this.c = new float[9];
        this.d = new float[9];
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[9];
        this.i = Float.NaN;
        tib tibVar = new tib(context);
        this.a = tibVar;
        tibVar.b(this);
        this.x = new CountDownLatch(1);
        this.y = new Object();
    }

    private static final void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        fArr[7] = (f19 * f25) + (f22 * fArr3[4]) + (f9 * f24);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    private static final void i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static final void j(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.r == null) {
            return null;
        }
        try {
            this.x.await();
        } catch (InterruptedException unused) {
        }
        return this.n;
    }

    public final void b(int i, int i2) {
        synchronized (this.y) {
            this.m = i;
            this.l = i2;
            this.N = true;
            this.y.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.m = i;
        this.l = i2;
        this.r = surfaceTexture;
    }

    public final void d() {
        synchronized (this.y) {
            this.Q = true;
            this.r = null;
            this.y.notifyAll();
        }
    }

    public final void e(float f, float f2) {
        int i = this.m;
        int i2 = this.l;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.j -= (f * 1.7453293f) / f3;
        float f4 = this.k - ((f2 * 1.7453293f) / f3);
        this.k = f4;
        if (f4 < -1.5707964f) {
            this.k = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.k = 1.5707964f;
        }
    }

    final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.M;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.B.eglDestroySurface(this.H, this.M) | this.B.eglMakeCurrent(this.H, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.M = null;
        }
        EGLContext eGLContext = this.L;
        if (eGLContext != null) {
            z |= this.B.eglDestroyContext(this.H, eGLContext);
            this.L = null;
        }
        EGLDisplay eGLDisplay = this.H;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.B.eglTerminate(eGLDisplay) | z;
        this.H = null;
        return eglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.u++;
        synchronized (this.y) {
            this.y.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b1  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uib.run():void");
    }

    @Override // defpackage.sib
    public final void zza() {
        synchronized (this.y) {
            this.y.notifyAll();
        }
    }
}
