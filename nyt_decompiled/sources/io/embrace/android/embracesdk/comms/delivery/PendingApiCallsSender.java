package io.embrace.android.embracesdk.comms.delivery;

import defpackage.gt2;
import defpackage.ss2;
import io.embrace.android.embracesdk.comms.api.ApiRequest;
import io.embrace.android.embracesdk.comms.api.ApiResponse;

/* loaded from: classes5.dex */
public interface PendingApiCallsSender {

    public static final class DefaultImpls {
        public static /* synthetic */ void savePendingApiCall$default(PendingApiCallsSender pendingApiCallsSender, ApiRequest apiRequest, ss2 ss2Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: savePendingApiCall");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            pendingApiCallsSender.savePendingApiCall(apiRequest, ss2Var, z);
        }
    }

    void savePendingApiCall(ApiRequest apiRequest, ss2 ss2Var, boolean z);

    void scheduleRetry(ApiResponse apiResponse);

    void setSendMethod(gt2 gt2Var);
}
