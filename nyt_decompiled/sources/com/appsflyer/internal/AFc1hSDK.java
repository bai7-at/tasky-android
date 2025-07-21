package com.appsflyer.internal;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class AFc1hSDK<Result> extends AFc1nSDK<AFc1oSDK<Result>> {
    public final AFd1kSDK AFLogger;

    @Nullable
    private String AFLogger$LogLevel;
    protected final AFc1ySDK afDebugLog;
    protected final AFb1oSDK afErrorLog;

    @Nullable
    public AFc1oSDK<Result> afInfoLog;
    private AFa1pSDK afRDLog;

    private AFc1hSDK(@NonNull AFc1jSDK aFc1jSDK, @NonNull AFc1jSDK[] aFc1jSDKArr, @NonNull AFc1ySDK aFc1ySDK, @NonNull AFd1kSDK aFd1kSDK, @NonNull AFb1oSDK aFb1oSDK, @NonNull AFa1pSDK aFa1pSDK, @Nullable String str) {
        super(aFc1jSDK, aFc1jSDKArr, str);
        this.afDebugLog = aFc1ySDK;
        this.AFLogger = aFd1kSDK;
        this.afErrorLog = aFb1oSDK;
        this.afRDLog = aFa1pSDK;
    }

    @WorkerThread
    protected abstract AFb1bSDK<Result> AFInAppEventParameterName(@NonNull String str);

    @Override // com.appsflyer.internal.AFc1nSDK
    @CallSuper
    @NonNull
    public AFc1rSDK AFInAppEventParameterName() throws Exception {
        if (getLevel() && this.AFLogger.values()) {
            AppsFlyerRequestListener afErrorLog = afErrorLog();
            if (afErrorLog != null) {
                afErrorLog.onError(RequestError.STOP_TRACKING, AFb1eSDK.valueOf);
            }
            throw new AFc1mSDK();
        }
        String str = this.AFLogger.AFInAppEventType;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener afErrorLog2 = afErrorLog();
            if (afErrorLog2 != null) {
                afErrorLog2.onError(RequestError.NO_DEV_KEY, AFb1eSDK.values);
            }
            throw new AFc1iSDK();
        }
        AFb1bSDK<Result> AFInAppEventParameterName = AFInAppEventParameterName(str);
        if (afInfoLog()) {
            values(AFInAppEventParameterName.valueOf);
        }
        AFc1oSDK<Result> AFKeystoreWrapper = AFInAppEventParameterName.AFKeystoreWrapper();
        this.afInfoLog = AFKeystoreWrapper;
        this.afErrorLog.values(AFInAppEventParameterName.valueOf.AFInAppEventParameterName, AFKeystoreWrapper.getStatusCode(), AFKeystoreWrapper.getBody().toString());
        AppsFlyerRequestListener afErrorLog3 = afErrorLog();
        if (afErrorLog3 != null) {
            if (AFKeystoreWrapper.isSuccessful()) {
                afErrorLog3.onSuccess();
            } else {
                int i = RequestError.RESPONSE_CODE_FAILURE;
                StringBuilder sb = new StringBuilder();
                sb.append(AFb1eSDK.AFInAppEventParameterName);
                sb.append(" ");
                sb.append(AFKeystoreWrapper.getStatusCode());
                afErrorLog3.onError(i, sb.toString());
            }
        }
        return AFKeystoreWrapper.isSuccessful() ? AFc1rSDK.SUCCESS : AFc1rSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public boolean AFInAppEventType() {
        if (afDebugLog() instanceof AFc1mSDK) {
            return false;
        }
        if (this.AFInAppEventType == AFc1rSDK.TIMEOUT) {
            return true;
        }
        Throwable afDebugLog = afDebugLog();
        return (afDebugLog instanceof IOException) && !(afDebugLog instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public long AFKeystoreWrapper() {
        return 60000L;
    }

    @Nullable
    protected abstract AppsFlyerRequestListener afErrorLog();

    protected abstract boolean afInfoLog();

    protected boolean getLevel() {
        return true;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final void valueOf() {
        String str;
        super.valueOf();
        if (!afInfoLog() || (str = this.AFLogger.AFInAppEventType) == null || str.trim().isEmpty()) {
            return;
        }
        values(AFInAppEventParameterName(str).valueOf);
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @CallSuper
    public final void values(Throwable th) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th)), th, true);
        AppsFlyerRequestListener afErrorLog = afErrorLog();
        if (afErrorLog != null) {
            String message = th.getMessage();
            int i = RequestError.NETWORK_FAILURE;
            if (message == null) {
                message = "";
            }
            afErrorLog.onError(i, message);
        }
    }

    @WorkerThread
    private void values(AFb1wSDK aFb1wSDK) {
        String str = this.AFLogger$LogLevel;
        this.AFLogger$LogLevel = this.afRDLog.AFInAppEventType(new AFa1fSDK(aFb1wSDK.AFInAppEventParameterName, aFb1wSDK.AFInAppEventType(), "6.8.2", this.AFInAppEventParameterName));
        if (str != null) {
            this.afRDLog.AFKeystoreWrapper(str);
        }
    }

    public AFc1hSDK(@NonNull AFc1jSDK aFc1jSDK, @NonNull AFc1jSDK[] aFc1jSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str) {
        this(aFc1jSDK, aFc1jSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.AFLogger$LogLevel(), aFc1xSDK.afWarnLog(), aFc1xSDK.getLevel(), str);
    }

    public AFc1hSDK(@NonNull AFc1jSDK aFc1jSDK, @NonNull AFc1jSDK[] aFc1jSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str, @Nullable String str2) {
        this(aFc1jSDK, aFc1jSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.AFLogger$LogLevel(), aFc1xSDK.afWarnLog(), aFc1xSDK.getLevel(), str);
        this.AFLogger$LogLevel = str2;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @CallSuper
    public void values() {
        String str;
        if (this.AFInAppEventType == AFc1rSDK.SUCCESS) {
            String str2 = this.AFLogger$LogLevel;
            if (str2 != null) {
                this.afRDLog.AFKeystoreWrapper(str2);
                return;
            }
            return;
        }
        if (AFInAppEventType() || (str = this.AFLogger$LogLevel) == null) {
            return;
        }
        this.afRDLog.AFKeystoreWrapper(str);
    }
}
