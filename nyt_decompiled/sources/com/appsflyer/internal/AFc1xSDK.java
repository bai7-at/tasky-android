package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public interface AFc1xSDK {
    @NonNull
    AFc1ySDK AFKeystoreWrapper();

    @NonNull
    CreateOneLinkHttpTask AFLogger();

    @NonNull
    AFd1kSDK AFLogger$LogLevel();

    @NonNull
    AFe1fSDK AFVersionDeclaration();

    @NonNull
    PurchaseHandler afDebugLog();

    @NonNull
    AFd1pSDK afErrorLog();

    @NonNull
    AFd1cSDK afInfoLog();

    @NonNull
    AFc1lSDK afRDLog();

    @NonNull
    AFb1oSDK afWarnLog();

    @NonNull
    AFa1pSDK getLevel();

    @NonNull
    AFb1fSDK init();

    @NonNull
    ExecutorService valueOf();

    @NonNull
    AFb1dSDK values();
}
