package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* loaded from: classes3.dex */
public final class c0d extends lde {
    private final Context b;
    private SensorManager c;
    private Sensor d;
    private long e;
    private int f;
    private b0d g;
    private boolean h;

    c0d(Context context) {
        super("ShakeDetector", "ads");
        this.b = context;
    }

    @Override // defpackage.lde
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) pla.c().a(mpa.R8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) pla.c().a(mpa.S8)).floatValue()) {
                long currentTimeMillis = dyf.b().currentTimeMillis();
                if (this.e + ((Integer) pla.c().a(mpa.T8)).intValue() <= currentTimeMillis) {
                    if (this.e + ((Integer) pla.c().a(mpa.U8)).intValue() < currentTimeMillis) {
                        this.f = 0;
                    }
                    pzc.k("Shake detected.");
                    this.e = currentTimeMillis;
                    int i = this.f + 1;
                    this.f = i;
                    b0d b0dVar = this.g;
                    if (b0dVar != null) {
                        if (i == ((Integer) pla.c().a(mpa.V8)).intValue()) {
                            eyc eycVar = (eyc) b0dVar;
                            eycVar.h(new cyc(eycVar), zzdzc.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.h) {
                    SensorManager sensorManager = this.c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.d);
                        pzc.k("Stopped listening for shake gestures.");
                    }
                    this.h = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) pla.c().a(mpa.R8)).booleanValue()) {
                    if (this.c == null) {
                        SensorManager sensorManager2 = (SensorManager) this.b.getSystemService("sensor");
                        this.c = sensorManager2;
                        if (sensorManager2 == null) {
                            fgb.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.d = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.h && (sensorManager = this.c) != null && (sensor = this.d) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.e = dyf.b().currentTimeMillis() - ((Integer) pla.c().a(mpa.T8)).intValue();
                        this.h = true;
                        pzc.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(b0d b0dVar) {
        this.g = b0dVar;
    }
}
