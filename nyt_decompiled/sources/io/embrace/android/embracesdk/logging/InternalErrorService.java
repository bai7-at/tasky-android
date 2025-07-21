package io.embrace.android.embracesdk.logging;

import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.payload.LegacyExceptionError;

/* loaded from: classes5.dex */
public interface InternalErrorService {
    LegacyExceptionError getCurrentExceptionError();

    void handleInternalError(Throwable th);

    void resetExceptionErrorObject();

    void setConfigService(ConfigService configService);
}
