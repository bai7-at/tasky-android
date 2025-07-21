package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
final class AFa1dSDK implements SensorEventListener {

    @NonNull
    private final String AFInAppEventParameterName;

    @NonNull
    private final String AFInAppEventType;
    private final int AFKeystoreWrapper;
    private long AFLogger;
    private final int afDebugLog;
    private double afInfoLog;

    @Nullable
    private Executor afRDLog;
    private final float[][] valueOf = new float[2][];
    private final long[] values = new long[2];

    AFa1dSDK(Sensor sensor) {
        int type2 = sensor.getType();
        this.AFKeystoreWrapper = type2;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFInAppEventParameterName = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventType = str;
        this.afDebugLog = ((((type2 + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private static double AFInAppEventParameterName(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    @NonNull
    private synchronized Executor AFInAppEventType() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    private boolean AFKeystoreWrapper() {
        return this.valueOf[0] != null;
    }

    @NonNull
    private static List<Float> valueOf(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFa1dSDK)) {
            return false;
        }
        AFa1dSDK aFa1dSDK = (AFa1dSDK) obj;
        return AFInAppEventType(aFa1dSDK.AFKeystoreWrapper, aFa1dSDK.AFInAppEventParameterName, aFa1dSDK.AFInAppEventType);
    }

    public final int hashCode() {
        return this.afDebugLog;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFInAppEventType().execute(new Runnable() { // from class: com.appsflyer.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1dSDK.this.valueOf(sensorEvent);
                }
            });
        } else {
            valueOf(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void valueOf(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.valueOf;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.values[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.valueOf[1] = copyOf;
            this.values[1] = currentTimeMillis;
            this.afInfoLog = AFInAppEventParameterName(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.AFLogger) {
            this.AFLogger = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.values[1] = currentTimeMillis;
                return;
            }
            double AFInAppEventParameterName = AFInAppEventParameterName(fArr3, fArr);
            if (AFInAppEventParameterName > this.afInfoLog) {
                this.valueOf[1] = Arrays.copyOf(fArr, fArr.length);
                this.values[1] = currentTimeMillis;
                this.afInfoLog = AFInAppEventParameterName;
            }
        }
    }

    private boolean AFInAppEventType(int i, @NonNull String str, @NonNull String str2) {
        return this.AFKeystoreWrapper == i && this.AFInAppEventParameterName.equals(str) && this.AFInAppEventType.equals(str2);
    }

    final void valueOf(@NonNull Map<AFa1dSDK, Map<String, Object>> map, boolean z) {
        if (AFKeystoreWrapper()) {
            map.put(this, AFInAppEventParameterName());
            if (z) {
                int length = this.valueOf.length;
                for (int i = 0; i < length; i++) {
                    this.valueOf[i] = null;
                }
                int length2 = this.values.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.values[i2] = 0;
                }
                this.afInfoLog = 0.0d;
                this.AFLogger = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, AFInAppEventParameterName());
    }

    @NonNull
    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFKeystoreWrapper));
        concurrentHashMap.put("sN", this.AFInAppEventParameterName);
        concurrentHashMap.put("sV", this.AFInAppEventType);
        float[] fArr = this.valueOf[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.valueOf[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }
}
