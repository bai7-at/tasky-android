package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes2.dex */
public final class AFd1ySDK extends AFc1nSDK<DeepLinkResult> {
    private final AFb1pSDK afInfoLog;
    private DeepLinkResult afRDLog;

    /* renamed from: com.appsflyer.internal.AFd1ySDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            valueOf = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1ySDK(@NonNull AFb1pSDK aFb1pSDK) {
        super(AFc1jSDK.DLSDK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, "DdlSdk");
        this.afInfoLog = aFb1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        DeepLinkResult afErrorLog = this.afInfoLog.afErrorLog();
        this.afRDLog = afErrorLog;
        return AnonymousClass5.valueOf[afErrorLog.getStatus().ordinal()] != 1 ? this.afRDLog.getError() == DeepLinkResult.Error.TIMEOUT ? AFc1rSDK.TIMEOUT : AFc1rSDK.FAILURE : AFc1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 90000L;
    }
}
