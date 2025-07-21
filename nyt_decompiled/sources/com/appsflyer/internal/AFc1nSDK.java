package com.appsflyer.internal;

import android.net.TrafficStats;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class AFc1nSDK<Result> implements Comparable<AFc1nSDK<?>>, Callable<AFc1rSDK> {
    private static final AtomicInteger afInfoLog = new AtomicInteger();

    @NonNull
    public final AFc1jSDK AFInAppEventParameterName;

    @Nullable
    public AFc1rSDK AFInAppEventType;
    public volatile int AFKeystoreWrapper;
    private final int AFLogger;
    private final String afDebugLog;
    private boolean afErrorLog;

    @Nullable
    private Throwable afRDLog;

    @NonNull
    public final Set<AFc1jSDK> valueOf;

    @NonNull
    public final Set<AFc1jSDK> values;

    public AFc1nSDK(@NonNull AFc1jSDK aFc1jSDK, @NonNull AFc1jSDK[] aFc1jSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.valueOf = hashSet;
        this.values = new HashSet();
        int incrementAndGet = afInfoLog.incrementAndGet();
        this.AFLogger = incrementAndGet;
        this.afErrorLog = false;
        this.AFKeystoreWrapper = 0;
        this.AFInAppEventParameterName = aFc1jSDK;
        Collections.addAll(hashSet, aFc1jSDKArr);
        if (str != null) {
            this.afDebugLog = str;
        } else {
            this.afDebugLog = String.valueOf(incrementAndGet);
        }
    }

    @WorkerThread
    @NonNull
    protected abstract AFc1rSDK AFInAppEventParameterName() throws Exception;

    @WorkerThread
    protected abstract boolean AFInAppEventType();

    @Override // java.lang.Comparable
    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFc1nSDK<?> aFc1nSDK) {
        int i = this.AFInAppEventParameterName.onInstallConversionFailureNative - aFc1nSDK.AFInAppEventParameterName.onInstallConversionFailureNative;
        if (i != 0) {
            return i;
        }
        if (this.afDebugLog.equals(aFc1nSDK.afDebugLog)) {
            return 0;
        }
        return this.AFLogger - aFc1nSDK.AFLogger;
    }

    protected abstract long AFKeystoreWrapper();

    @Override // java.util.concurrent.Callable
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public final AFc1rSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.AFInAppEventType = null;
        this.afRDLog = null;
        this.AFKeystoreWrapper++;
        try {
            AFc1rSDK AFInAppEventParameterName = AFInAppEventParameterName();
            this.AFInAppEventType = AFInAppEventParameterName;
            return AFInAppEventParameterName;
        } finally {
        }
    }

    @Nullable
    public final Throwable afDebugLog() {
        return this.afRDLog;
    }

    protected final boolean afRDLog() {
        return this.afErrorLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1nSDK aFc1nSDK = (AFc1nSDK) obj;
        if (this.AFInAppEventParameterName != aFc1nSDK.AFInAppEventParameterName) {
            return false;
        }
        return this.afDebugLog.equals(aFc1nSDK.afDebugLog);
    }

    public final int hashCode() {
        return (this.AFInAppEventParameterName.hashCode() * 31) + this.afDebugLog.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AFInAppEventParameterName);
        sb.append("-");
        sb.append(this.afDebugLog);
        String obj = sb.toString();
        if (String.valueOf(this.AFLogger).equals(this.afDebugLog)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.AFLogger);
        return sb2.toString();
    }

    @WorkerThread
    @CallSuper
    public void valueOf() {
        this.afErrorLog = true;
    }

    @WorkerThread
    protected void values() {
    }

    @WorkerThread
    protected void values(Throwable th) {
    }
}
