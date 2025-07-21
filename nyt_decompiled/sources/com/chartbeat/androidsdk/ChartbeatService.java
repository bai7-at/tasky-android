package com.chartbeat.androidsdk;

import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;

/* loaded from: classes2.dex */
public class ChartbeatService extends Service {
    private static final String TAG = "ChartbeatService";
    private static final String TRACKER_THREAD = "TRACKER_THREAD";
    private HandlerThread bgThread;
    private ChartbeatServiceHandler handler;

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: Exception -> 0x000b, TRY_LEAVE, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x001b, B:9:0x0023, B:14:0x000d), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void init() {
        /*
            r4 = this;
            android.os.HandlerThread r0 = r4.bgThread     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.isAlive()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L1b
            goto Ld
        Lb:
            r4 = move-exception
            goto L36
        Ld:
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = "TRACKER_THREAD"
            r2 = 10
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> Lb
            r4.bgThread = r0     // Catch: java.lang.Exception -> Lb
            r0.start()     // Catch: java.lang.Exception -> Lb
        L1b:
            java.lang.String r0 = com.chartbeat.androidsdk.SystemUtils.getSystemUserAgent(r4)     // Catch: java.lang.Exception -> Lb
            com.chartbeat.androidsdk.ChartbeatServiceHandler r1 = r4.handler     // Catch: java.lang.Exception -> Lb
            if (r1 != 0) goto L39
            com.chartbeat.androidsdk.ChartbeatServiceHandler r1 = new com.chartbeat.androidsdk.ChartbeatServiceHandler     // Catch: java.lang.Exception -> Lb
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Lb
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lb
            android.os.HandlerThread r3 = r4.bgThread     // Catch: java.lang.Exception -> Lb
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Exception -> Lb
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Exception -> Lb
            r4.handler = r1     // Catch: java.lang.Exception -> Lb
            goto L39
        L36:
            r4.printStackTrace()
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartbeat.androidsdk.ChartbeatService.init():void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        init();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.pauseTracker();
            if (this.bgThread.getLooper() != null) {
                this.bgThread.getLooper().quitSafely();
            }
            this.bgThread.quitSafely();
            this.bgThread = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        try {
            Message obtainMessage = this.handler.obtainMessage();
            obtainMessage.arg1 = i2;
            obtainMessage.setData(intent.getExtras());
            this.handler.sendMessage(obtainMessage);
            return 2;
        } catch (Exception e) {
            e.printStackTrace();
            return 2;
        }
    }
}
