package com.appsflyer.internal;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public abstract class AFe1lSDK extends Observable {
    final Runnable AFKeystoreWrapper;
    public final String afDebugLog;
    long afErrorLog;
    public final String valueOf;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    public AFa1wSDK afRDLog = AFa1wSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFe1lSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Observer {
        AnonymousClass4() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFe1lSDK.this.AFKeystoreWrapper.run();
        }
    }

    public enum AFa1wSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFe1lSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.valueOf = str2;
        this.afDebugLog = str;
    }

    public abstract void AFInAppEventType(Context context);

    public final void values() {
        this.AFInAppEventType.put("source", this.valueOf);
        this.AFInAppEventType.put(TransferTable.COLUMN_TYPE, this.afDebugLog);
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.afErrorLog));
        this.afRDLog = AFa1wSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
