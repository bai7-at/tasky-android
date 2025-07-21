package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class AFa1bSDK {
    private static final BitSet afDebugLog;

    @VisibleForTesting
    private static volatile AFa1bSDK afRDLog;
    final Runnable AFInAppEventParameterName;
    final Handler AFInAppEventType;
    boolean AFKeystoreWrapper;
    private final Map<AFa1dSDK, AFa1dSDK> AFLogger;
    private final Runnable AFLogger$LogLevel;
    private final SensorManager AFVersionDeclaration;
    final Runnable afErrorLog;
    private final Map<AFa1dSDK, Map<String, Object>> afInfoLog;
    private int getLevel;
    private boolean init;
    final Runnable valueOf;
    final Object values = new Object();

    /* renamed from: com.appsflyer.internal.AFa1bSDK$8, reason: invalid class name */
    final class AnonymousClass8 implements Runnable {
        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFa1bSDK.this.AFLogger.isEmpty()) {
                    for (AFa1dSDK aFa1dSDK : AFa1bSDK.this.AFLogger.values()) {
                        AFa1bSDK.this.AFVersionDeclaration.unregisterListener(aFa1dSDK);
                        aFa1dSDK.valueOf(AFa1bSDK.this.afInfoLog, true);
                    }
                }
            } catch (Throwable unused) {
            }
            AFa1bSDK.this.getLevel = 0;
            AFa1bSDK.this.init = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afDebugLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFa1bSDK(@NonNull SensorManager sensorManager, Handler handler) {
        BitSet bitSet = afDebugLog;
        this.AFLogger = new HashMap(bitSet.size());
        this.afInfoLog = new ConcurrentHashMap(bitSet.size());
        this.valueOf = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.values) {
                    final AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    aFa1bSDK.AFInAppEventType.post(new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFa1bSDK.this.AFVersionDeclaration.getSensorList(-1)) {
                                    if (AFa1bSDK.AFInAppEventParameterName(sensor.getType())) {
                                        AFa1dSDK aFa1dSDK = new AFa1dSDK(sensor);
                                        if (!AFa1bSDK.this.AFLogger.containsKey(aFa1dSDK)) {
                                            AFa1bSDK.this.AFLogger.put(aFa1dSDK, aFa1dSDK);
                                        }
                                        AFa1bSDK.this.AFVersionDeclaration.registerListener((SensorEventListener) AFa1bSDK.this.AFLogger.get(aFa1dSDK), sensor, 0, AFa1bSDK.this.AFInAppEventType);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            AFa1bSDK.this.init = true;
                        }
                    });
                    AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                    aFa1bSDK2.AFInAppEventType.postDelayed(aFa1bSDK2.AFLogger$LogLevel, 100L);
                    AFa1bSDK.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.values) {
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    aFa1bSDK.AFInAppEventType.post(aFa1bSDK.new AnonymousClass8());
                }
            }
        };
        this.afErrorLog = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.values) {
                    try {
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        if (aFa1bSDK.AFKeystoreWrapper) {
                            aFa1bSDK.AFInAppEventType.removeCallbacks(aFa1bSDK.valueOf);
                            AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                            aFa1bSDK2.AFInAppEventType.removeCallbacks(aFa1bSDK2.AFInAppEventParameterName);
                            AFa1bSDK aFa1bSDK3 = AFa1bSDK.this;
                            aFa1bSDK3.AFInAppEventType.post(aFa1bSDK3.new AnonymousClass8());
                            AFa1bSDK.this.AFKeystoreWrapper = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.getLevel = 1;
        this.AFLogger$LogLevel = new Runnable() { // from class: com.appsflyer.internal.AFa1bSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1bSDK.this.values) {
                    try {
                        if (AFa1bSDK.this.getLevel == 0) {
                            AFa1bSDK.this.getLevel = 1;
                        }
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        aFa1bSDK.AFInAppEventType.postDelayed(aFa1bSDK.AFInAppEventParameterName, aFa1bSDK.getLevel * 500);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.AFVersionDeclaration = sensorManager;
        this.AFInAppEventType = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFInAppEventParameterName(int i) {
        return i >= 0 && afDebugLog.get(i);
    }

    static AFa1bSDK AFInAppEventType(Context context) {
        if (afRDLog != null) {
            return afRDLog;
        }
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        return AFKeystoreWrapper(sensorManager, new Handler(handlerThread.getLooper()));
    }

    private static AFa1bSDK AFKeystoreWrapper(SensorManager sensorManager, Handler handler) {
        if (afRDLog == null) {
            synchronized (AFa1bSDK.class) {
                try {
                    if (afRDLog == null) {
                        afRDLog = new AFa1bSDK(sensorManager, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return afRDLog;
    }

    final List<Map<String, Object>> AFInAppEventParameterName() {
        Iterator<AFa1dSDK> it2 = this.AFLogger.values().iterator();
        while (it2.hasNext()) {
            it2.next().valueOf(this.afInfoLog, true);
        }
        Map<AFa1dSDK, Map<String, Object>> map = this.afInfoLog;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.afInfoLog.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    final Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> AFInAppEventType = AFInAppEventType();
        if (!AFInAppEventType.isEmpty()) {
            concurrentHashMap.put("sensors", AFInAppEventType);
        } else {
            List<Map<String, Object>> AFInAppEventParameterName = AFInAppEventParameterName();
            if (!AFInAppEventParameterName.isEmpty()) {
                concurrentHashMap.put("sensors", AFInAppEventParameterName);
            }
        }
        return concurrentHashMap;
    }

    final synchronized void AFKeystoreWrapper() {
        this.AFInAppEventType.post(this.afErrorLog);
    }

    @NonNull
    private List<Map<String, Object>> AFInAppEventType() {
        synchronized (this.values) {
            try {
                if (!this.AFLogger.isEmpty() && this.init) {
                    Iterator<AFa1dSDK> it2 = this.AFLogger.values().iterator();
                    while (it2.hasNext()) {
                        it2.next().valueOf(this.afInfoLog, false);
                    }
                }
                if (this.afInfoLog.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.afInfoLog.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
