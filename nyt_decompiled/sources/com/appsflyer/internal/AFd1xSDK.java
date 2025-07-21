package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
public final class AFd1xSDK extends AFc1nSDK<AFd1qSDK> {

    @Nullable
    public final AFd1pSDK AFLogger;
    private final AFd1rSDK AFLogger$LogLevel;
    private final AFd1kSDK AFVersionDeclaration;
    public AFb1mSDK afDebugLog;
    private final AFb1dSDK afErrorLog;
    private final AFd1oSDK afInfoLog;

    @Nullable
    public AFd1qSDK afRDLog;
    private final AFd1nSDK afWarnLog;
    private final String getLevel;
    private final AFc1ySDK init;

    public AFd1xSDK(@NonNull AFd1oSDK aFd1oSDK, @NonNull AFb1dSDK aFb1dSDK, @NonNull AFd1kSDK aFd1kSDK, @NonNull AFd1rSDK aFd1rSDK, @NonNull AFc1ySDK aFc1ySDK, @NonNull AFd1nSDK aFd1nSDK, @NonNull String str, @Nullable AFd1pSDK aFd1pSDK) {
        super(AFc1jSDK.RC_CDN, new AFc1jSDK[0], "UpdateRemoteConfiguration");
        this.afRDLog = null;
        this.afInfoLog = aFd1oSDK;
        this.afErrorLog = aFb1dSDK;
        this.AFVersionDeclaration = aFd1kSDK;
        this.AFLogger$LogLevel = aFd1rSDK;
        this.init = aFc1ySDK;
        this.afWarnLog = aFd1nSDK;
        this.getLevel = str;
        this.AFLogger = aFd1pSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFd1qSDK afErrorLog() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1xSDK.afErrorLog():com.appsflyer.internal.AFd1qSDK");
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        try {
            AFd1qSDK afErrorLog = afErrorLog();
            this.afRDLog = afErrorLog;
            return afErrorLog == AFd1qSDK.FAILURE ? AFc1rSDK.FAILURE : AFc1rSDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException unused) {
            this.afRDLog = AFd1qSDK.FAILURE;
            return AFc1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 1500L;
    }

    private void AFInAppEventType(String str, long j, @Nullable AFc1oSDK<?> aFc1oSDK, AFb1vSDK aFb1vSDK, AFe1rSDK aFe1rSDK, @Nullable Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (aFc1oSDK != null) {
            j2 = aFc1oSDK.values.values;
            i = aFc1oSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().values;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.afDebugLog = new AFb1mSDK(aFb1vSDK != null ? aFb1vSDK.valueOf : null, str, j3, System.currentTimeMillis() - j, i2, aFe1rSDK, th2);
    }
}
