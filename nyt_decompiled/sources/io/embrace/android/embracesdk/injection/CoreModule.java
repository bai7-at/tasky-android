package io.embrace.android.embracesdk.injection;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.internal.AndroidResourcesService;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.registry.ServiceRegistry;

/* loaded from: classes5.dex */
public interface CoreModule {
    Embrace.AppFramework getAppFramework();

    Application getApplication();

    BuildInfo getBuildInfo();

    Context getContext();

    EmbraceSerializer getJsonSerializer();

    PackageInfo getPackageInfo();

    AndroidResourcesService getResources();

    ServiceRegistry getServiceRegistry();

    boolean isDebug();
}
