package com.appsflyer;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFc1ySDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1pSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1xSDK;

@Deprecated
/* loaded from: classes2.dex */
public final class CreateOneLinkHttpTask implements AFc1qSDK {
    private final AFd1oSDK AFInAppEventParameterName;
    private final AFb1dSDK AFInAppEventType;
    private final Object AFKeystoreWrapper;
    private final AFc1lSDK AFLogger;
    private final AFd1nSDK afErrorLog;

    @Nullable
    private AFb1mSDK afInfoLog;
    private final AFc1ySDK afRDLog;
    private final AFd1kSDK valueOf;
    private final AFd1rSDK values;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFInAppEventType(AFc1nSDK<?> aFc1nSDK, AFc1rSDK aFc1rSDK) {
        if (aFc1nSDK instanceof AFd1xSDK) {
            AFd1xSDK aFd1xSDK = (AFd1xSDK) aFc1nSDK;
            AFd1qSDK aFd1qSDK = aFd1xSDK.afRDLog;
            if (aFd1qSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFd1qSDK = AFd1qSDK.FAILURE;
            }
            if (aFd1qSDK != AFd1qSDK.USE_CACHED) {
                AFb1mSDK aFb1mSDK = aFd1xSDK.afDebugLog;
                synchronized (this.AFKeystoreWrapper) {
                    this.afInfoLog = aFb1mSDK;
                }
            }
            synchronized (this.AFKeystoreWrapper) {
            }
        }
    }

    @Nullable
    public final AFb1mSDK AFKeystoreWrapper() {
        AFb1mSDK aFb1mSDK;
        synchronized (this.AFKeystoreWrapper) {
            aFb1mSDK = this.afInfoLog;
            this.afInfoLog = null;
        }
        return aFb1mSDK;
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void values(AFc1nSDK<?> aFc1nSDK) {
    }

    public CreateOneLinkHttpTask(AFd1oSDK aFd1oSDK, AFb1dSDK aFb1dSDK, AFd1kSDK aFd1kSDK, AFd1rSDK aFd1rSDK, AFc1ySDK aFc1ySDK, AFd1nSDK aFd1nSDK, AFc1lSDK aFc1lSDK) {
        this.AFKeystoreWrapper = new Object();
        this.AFInAppEventParameterName = aFd1oSDK;
        this.AFInAppEventType = aFb1dSDK;
        this.valueOf = aFd1kSDK;
        this.values = aFd1rSDK;
        this.afRDLog = aFc1ySDK;
        this.afErrorLog = aFd1nSDK;
        this.AFLogger = aFc1lSDK;
        aFc1lSDK.AFInAppEventParameterName.add(this);
    }

    public final void values(AFd1pSDK aFd1pSDK) {
        AFd1xSDK aFd1xSDK = new AFd1xSDK(this.AFInAppEventParameterName, this.AFInAppEventType, this.valueOf, this.values, this.afRDLog, this.afErrorLog, "v1", aFd1pSDK);
        AFc1lSDK aFc1lSDK = this.AFLogger;
        aFc1lSDK.AFKeystoreWrapper.execute(aFc1lSDK.new AnonymousClass4(aFd1xSDK));
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFInAppEventType(AFc1nSDK<?> aFc1nSDK) {
        if (aFc1nSDK instanceof AFd1xSDK) {
            synchronized (this.AFKeystoreWrapper) {
                this.afInfoLog = null;
            }
            AFd1qSDK aFd1qSDK = AFd1qSDK.SUCCESS;
            synchronized (this.AFKeystoreWrapper) {
            }
        }
    }
}
