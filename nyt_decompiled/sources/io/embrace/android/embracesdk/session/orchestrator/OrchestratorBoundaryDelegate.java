package io.embrace.android.embracesdk.session.orchestrator;

import defpackage.zq3;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;

/* loaded from: classes5.dex */
public final class OrchestratorBoundaryDelegate {
    private final InternalErrorService internalErrorService;
    private final MemoryCleanerService memoryCleanerService;
    private final NdkService ndkService;
    private final NetworkConnectivityService networkConnectivityService;
    private final EmbraceSessionProperties sessionProperties;
    private final UserService userService;

    public OrchestratorBoundaryDelegate(MemoryCleanerService memoryCleanerService, UserService userService, NdkService ndkService, EmbraceSessionProperties embraceSessionProperties, InternalErrorService internalErrorService, NetworkConnectivityService networkConnectivityService) {
        zq3.h(memoryCleanerService, "memoryCleanerService");
        zq3.h(userService, "userService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(internalErrorService, "internalErrorService");
        zq3.h(networkConnectivityService, "networkConnectivityService");
        this.memoryCleanerService = memoryCleanerService;
        this.userService = userService;
        this.ndkService = ndkService;
        this.sessionProperties = embraceSessionProperties;
        this.internalErrorService = internalErrorService;
        this.networkConnectivityService = networkConnectivityService;
    }

    public static /* synthetic */ void prepareForNewSession$default(OrchestratorBoundaryDelegate orchestratorBoundaryDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        orchestratorBoundaryDelegate.prepareForNewSession(z);
    }

    public final void onSessionStarted(long j) {
        this.networkConnectivityService.networkStatusOnSessionStarted(j);
    }

    public final void prepareForNewSession(boolean z) {
        this.memoryCleanerService.cleanServicesCollections(this.internalErrorService);
        this.sessionProperties.clearTemporary();
        if (z) {
            this.userService.clearAllUserInfo();
            NdkService ndkService = this.ndkService;
            if (ndkService != null) {
                ndkService.onUserInfoUpdate();
            }
        }
    }
}
