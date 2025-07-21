package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* loaded from: classes3.dex */
public final class qxc extends lde {
    private final SensorManager b;
    private final Sensor c;
    private float d;
    private Float e;
    private long f;
    private int g;
    private boolean h;
    private boolean i;
    private pxc j;
    private boolean k;

    qxc(Context context) {
        super("FlickDetector", "ads");
        this.d = 0.0f;
        this.e = Float.valueOf(0.0f);
        this.f = dyf.b().currentTimeMillis();
        this.g = 0;
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        if (sensorManager != null) {
            this.c = sensorManager.getDefaultSensor(4);
        } else {
            this.c = null;
        }
    }

    @Override // defpackage.lde
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) pla.c().a(mpa.W8)).booleanValue()) {
            long currentTimeMillis = dyf.b().currentTimeMillis();
            if (this.f + ((Integer) pla.c().a(mpa.Y8)).intValue() < currentTimeMillis) {
                this.g = 0;
                this.f = currentTimeMillis;
                this.h = false;
                this.i = false;
                this.d = this.e.floatValue();
            }
            Float valueOf = Float.valueOf(this.e.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.e = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.d;
            zoa zoaVar = mpa.X8;
            if (floatValue > f + ((Float) pla.c().a(zoaVar)).floatValue()) {
                this.d = this.e.floatValue();
                this.i = true;
            } else if (this.e.floatValue() < this.d - ((Float) pla.c().a(zoaVar)).floatValue()) {
                this.d = this.e.floatValue();
                this.h = true;
            }
            if (this.e.isInfinite()) {
                this.e = Float.valueOf(0.0f);
                this.d = 0.0f;
            }
            if (this.h && this.i) {
                pzc.k("Flick detected.");
                this.f = currentTimeMillis;
                int i = this.g + 1;
                this.g = i;
                this.h = false;
                this.i = false;
                pxc pxcVar = this.j;
                if (pxcVar != null) {
                    if (i == ((Integer) pla.c().a(mpa.Z8)).intValue()) {
                        eyc eycVar = (eyc) pxcVar;
                        eycVar.h(new dyc(eycVar), zzdzc.GESTURE);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.k && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.k = false;
                    pzc.k("Stopped listening for flick gestures.");
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
                if (((Boolean) pla.c().a(mpa.W8)).booleanValue()) {
                    if (!this.k && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.k = true;
                        pzc.k("Listening for flick gestures.");
                    }
                    if (this.b == null || this.c == null) {
                        fgb.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(pxc pxcVar) {
        this.j = pxcVar;
    }
}
