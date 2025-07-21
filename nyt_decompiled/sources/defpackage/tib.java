package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
final class tib extends lde {
    private final SensorManager b;
    private final Object c;
    private final Display d;
    private final float[] e;
    private final float[] f;
    private float[] g;
    private Handler h;
    private sib i;

    tib(Context context) {
        super("OrientationMonitor", "ads");
        this.b = (SensorManager) context.getSystemService("sensor");
        this.d = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.e = new float[9];
        this.f = new float[9];
        this.c = new Object();
    }

    @Override // defpackage.lde
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    this.g = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.e, fArr);
        int rotation = this.d.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.e, 2, 129, this.f);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.e, 129, 130, this.f);
        } else if (rotation != 3) {
            System.arraycopy(this.e, 0, this.f, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.e, 130, 1, this.f);
        }
        float[] fArr2 = this.f;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.c) {
            System.arraycopy(this.f, 0, this.g, 0, 9);
        }
        sib sibVar = this.i;
        if (sibVar != null) {
            sibVar.zza();
        }
    }

    final void b(sib sibVar) {
        this.i = sibVar;
    }

    final void c() {
        if (this.h != null) {
            return;
        }
        Sensor defaultSensor = this.b.getDefaultSensor(11);
        if (defaultSensor == null) {
            fgb.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        cde cdeVar = new cde(handlerThread.getLooper());
        this.h = cdeVar;
        if (this.b.registerListener(this, defaultSensor, 0, cdeVar)) {
            return;
        }
        fgb.d("SensorManager.registerListener failed.");
        d();
    }

    final void d() {
        if (this.h == null) {
            return;
        }
        this.b.unregisterListener(this);
        this.h.post(new rib(this));
        this.h = null;
    }

    final boolean e(float[] fArr) {
        synchronized (this.c) {
            try {
                float[] fArr2 = this.g;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
