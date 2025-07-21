package io.embrace.android.embracesdk.session.id;

import android.app.ActivityManager;
import android.os.Build;
import defpackage.yj0;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NdkService;

/* loaded from: classes5.dex */
public final class SessionIdTrackerImpl implements SessionIdTracker {
    private final ActivityManager activityManager;
    private final InternalEmbraceLogger logger;
    private NdkService ndkService;
    private volatile String sessionId;

    public SessionIdTrackerImpl(ActivityManager activityManager, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.activityManager = activityManager;
        this.logger = internalEmbraceLogger;
    }

    private final void setSessionId(String str) {
        this.sessionId = str;
        NdkService ndkService = getNdkService();
        if (ndkService != null) {
            if (str == null) {
                str = "";
            }
            ndkService.updateSessionId(str);
        }
    }

    private final void setSessionIdToProcessStateSummary(String str) {
        if (Build.VERSION.SDK_INT < 30 || str == null) {
            return;
        }
        try {
            ActivityManager activityManager = this.activityManager;
            if (activityManager != null) {
                byte[] bytes = str.getBytes(yj0.b);
                zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
                activityManager.setProcessStateSummary(bytes);
            }
        } catch (Throwable th) {
            this.logger.log("Couldn't set Process State Summary", InternalEmbraceLogger.Severity.ERROR, th, false);
        }
    }

    @Override // io.embrace.android.embracesdk.session.id.SessionIdTracker
    public String getActiveSessionId() {
        return this.sessionId;
    }

    @Override // io.embrace.android.embracesdk.session.id.SessionIdTracker
    public NdkService getNdkService() {
        return this.ndkService;
    }

    @Override // io.embrace.android.embracesdk.session.id.SessionIdTracker
    public void setActiveSessionId(String str, boolean z) {
        setSessionId(str);
        if (z) {
            setSessionIdToProcessStateSummary(this.sessionId);
        }
    }

    @Override // io.embrace.android.embracesdk.session.id.SessionIdTracker
    public void setNdkService(NdkService ndkService) {
        this.ndkService = ndkService;
        NdkService ndkService2 = getNdkService();
        if (ndkService2 != null) {
            String str = this.sessionId;
            if (str == null) {
                str = "";
            }
            ndkService2.updateSessionId(str);
        }
    }
}
