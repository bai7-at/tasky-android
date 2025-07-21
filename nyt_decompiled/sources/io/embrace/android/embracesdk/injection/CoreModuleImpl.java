package io.embrace.android.embracesdk.injection;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import defpackage.c04;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.capture.metadata.AppEnvironment;
import io.embrace.android.embracesdk.internal.AndroidResourcesService;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.EmbraceAndroidResourcesService;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.registry.ServiceRegistry;
import kotlin.c;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class CoreModuleImpl implements CoreModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(CoreModuleImpl.class, "context", "getContext()Landroid/content/Context;", 0)), zt6.i(new PropertyReference1Impl(CoreModuleImpl.class, "application", "getApplication()Landroid/app/Application;", 0)), zt6.i(new PropertyReference1Impl(CoreModuleImpl.class, "serviceRegistry", "getServiceRegistry()Lio/embrace/android/embracesdk/registry/ServiceRegistry;", 0)), zt6.i(new PropertyReference1Impl(CoreModuleImpl.class, "jsonSerializer", "getJsonSerializer()Lio/embrace/android/embracesdk/internal/serialization/EmbraceSerializer;", 0)), zt6.i(new PropertyReference1Impl(CoreModuleImpl.class, "resources", "getResources()Lio/embrace/android/embracesdk/internal/AndroidResourcesService;", 0))};
    private final Embrace.AppFramework appFramework;
    private final hp6 application$delegate;
    private final c04 buildInfo$delegate;
    private final hp6 context$delegate;
    private final c04 isDebug$delegate;
    private final hp6 jsonSerializer$delegate;
    private final hp6 resources$delegate;
    private final hp6 serviceRegistry$delegate;

    public CoreModuleImpl(final Context context, Embrace.AppFramework appFramework, final InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(context, "ctx");
        zq3.h(appFramework, "appFramework");
        zq3.h(internalEmbraceLogger, "logger");
        this.appFramework = appFramework;
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$context$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Context mo865invoke() {
                Context context2 = context;
                return context2 instanceof Application ? context2 : context2.getApplicationContext();
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.context$delegate = new SingletonDelegate(loadType, qs2Var);
        this.application$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$application$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Application mo865invoke() {
                Context context2 = CoreModuleImpl.this.getContext();
                if (context2 != null) {
                    return (Application) context2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        });
        this.serviceRegistry$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$serviceRegistry$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ServiceRegistry mo865invoke() {
                return new ServiceRegistry(InternalEmbraceLogger.this);
            }
        });
        this.jsonSerializer$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$jsonSerializer$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSerializer mo865invoke() {
                return new EmbraceSerializer();
            }
        });
        this.resources$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$resources$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceAndroidResourcesService mo865invoke() {
                return new EmbraceAndroidResourcesService(CoreModuleImpl.this.getContext());
            }
        });
        this.isDebug$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$isDebug$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                ApplicationInfo applicationInfo = CoreModuleImpl.this.getContext().getApplicationInfo();
                zq3.g(applicationInfo, "context.applicationInfo");
                return new AppEnvironment(applicationInfo).isDebug();
            }
        });
        this.buildInfo$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.CoreModuleImpl$buildInfo$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final BuildInfo mo865invoke() {
                BuildInfo.Companion companion = BuildInfo.Companion;
                AndroidResourcesService resources = CoreModuleImpl.this.getResources();
                String packageName = CoreModuleImpl.this.getContext().getPackageName();
                zq3.g(packageName, "context.packageName");
                return companion.fromResources(resources, packageName);
            }
        });
    }

    public static /* synthetic */ void getPackageInfo$annotations() {
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public Embrace.AppFramework getAppFramework() {
        return this.appFramework;
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public Application getApplication() {
        return (Application) this.application$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public BuildInfo getBuildInfo() {
        return (BuildInfo) this.buildInfo$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public Context getContext() {
        return (Context) this.context$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public EmbraceSerializer getJsonSerializer() {
        return (EmbraceSerializer) this.jsonSerializer$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public PackageInfo getPackageInfo() {
        PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
        zq3.g(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
        return packageInfo;
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public AndroidResourcesService getResources() {
        return (AndroidResourcesService) this.resources$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public ServiceRegistry getServiceRegistry() {
        return (ServiceRegistry) this.serviceRegistry$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.CoreModule
    public boolean isDebug() {
        return ((Boolean) this.isDebug$delegate.getValue()).booleanValue();
    }
}
