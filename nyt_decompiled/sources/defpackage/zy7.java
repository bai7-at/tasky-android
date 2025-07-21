package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.GlUtil;
import defpackage.qo8;
import defpackage.yk5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class zy7 extends GLSurfaceView {
    private final CopyOnWriteArrayList a;
    private final SensorManager b;
    private final Sensor c;
    private final yk5 d;
    private final Handler e;
    private final qo8 f;
    private final xa7 g;
    private SurfaceTexture h;
    private Surface i;
    private boolean j;
    private boolean k;
    private boolean l;

    final class a implements GLSurfaceView.Renderer, qo8.a, yk5.a {
        private final xa7 a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(xa7 xa7Var) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.a = xa7Var;
            GlUtil.j(fArr);
            GlUtil.j(fArr2);
            GlUtil.j(fArr3);
            this.h = 3.1415927f;
        }

        private float c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
        }

        @Override // yk5.a
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.h = -f;
            d();
        }

        @Override // qo8.a
        public synchronized void b(PointF pointF) {
            this.g = pointF.y;
            d();
            Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.a.c(this.c, false);
        }

        @Override // qo8.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return zy7.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            zy7.this.g(this.a.d());
        }
    }

    public interface b {
        void A(Surface surface);

        void q(Surface surface);
    }

    public zy7(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.i;
        if (surface != null) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).q(surface);
            }
        }
        h(this.h, surface);
        this.h = null;
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.h;
        Surface surface = this.i;
        Surface surface2 = new Surface(surfaceTexture);
        this.h = surfaceTexture;
        this.i = surface2;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).A(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final SurfaceTexture surfaceTexture) {
        this.e.post(new Runnable() { // from class: xy7
            @Override // java.lang.Runnable
            public final void run() {
                zy7.this.f(surfaceTexture);
            }
        });
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z = this.j && this.k;
        Sensor sensor = this.c;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.l = z;
    }

    public void d(b bVar) {
        this.a.add(bVar);
    }

    public fh0 getCameraMotionListener() {
        return this.g;
    }

    public u79 getVideoFrameMetadataListener() {
        return this.g;
    }

    public Surface getVideoSurface() {
        return this.i;
    }

    public void i(b bVar) {
        this.a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: yy7
            @Override // java.lang.Runnable
            public final void run() {
                zy7.this.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.k = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.k = true;
        j();
    }

    public void setDefaultStereoMode(int i) {
        this.g.g(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        j();
    }

    public zy7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ur.e(context.getSystemService("sensor"));
        this.b = sensorManager;
        Sensor defaultSensor = z19.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        xa7 xa7Var = new xa7();
        this.g = xa7Var;
        a aVar = new a(xa7Var);
        qo8 qo8Var = new qo8(context, aVar, 25.0f);
        this.f = qo8Var;
        this.d = new yk5(((WindowManager) ur.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), qo8Var, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(qo8Var);
    }
}
