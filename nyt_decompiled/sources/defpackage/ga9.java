package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ga9 implements SensorEventListener {
    public static final a b = new a(null);
    private b a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (c11.d(this)) {
            return;
        }
        try {
            this.a = bVar;
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(sensor, "sensor");
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(sensorEvent, "event");
            b bVar = this.a;
            if (bVar == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            double d = fArr[0] / 9.80665f;
            double d2 = fArr[1] / 9.80665f;
            double d3 = fArr[2] / 9.80665f;
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                bVar.a();
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
