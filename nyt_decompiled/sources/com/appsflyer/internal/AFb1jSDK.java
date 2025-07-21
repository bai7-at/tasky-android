package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class AFb1jSDK<T> {
    public final AFc1xSDK AFInAppEventParameterName;
    public final String AFInAppEventType;
    private final String[] AFKeystoreWrapper;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1jSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1jSDK.this.values()) {
                return (T) AFb1jSDK.this.valueOf();
            }
            return null;
        }
    });
    public final Context values;

    public AFb1jSDK(Context context, AFc1xSDK aFc1xSDK, String str, String... strArr) {
        this.values = context;
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = strArr;
        this.AFInAppEventParameterName = aFc1xSDK;
    }

    @Nullable
    public T AFInAppEventParameterName() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    protected abstract T valueOf();

    public final boolean values() {
        try {
            ProviderInfo resolveContentProvider = this.values.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.AFKeystoreWrapper).contains(AFb1wSDK.valueOf(this.values.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return false;
        }
    }
}
