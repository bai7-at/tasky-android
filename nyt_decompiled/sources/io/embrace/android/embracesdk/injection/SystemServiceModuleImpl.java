package io.embrace.android.embracesdk.injection;

import android.app.ActivityManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.view.WindowManager;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.internal.utils.BuildVersionChecker;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class SystemServiceModuleImpl implements SystemServiceModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(SystemServiceModuleImpl.class, "activityManager", "getActivityManager()Landroid/app/ActivityManager;", 0)), zt6.i(new PropertyReference1Impl(SystemServiceModuleImpl.class, "powerManager", "getPowerManager()Landroid/os/PowerManager;", 0)), zt6.i(new PropertyReference1Impl(SystemServiceModuleImpl.class, "connectivityManager", "getConnectivityManager()Landroid/net/ConnectivityManager;", 0)), zt6.i(new PropertyReference1Impl(SystemServiceModuleImpl.class, "windowManager", "getWindowManager()Landroid/view/WindowManager;", 0))};
    private final hp6 activityManager$delegate;
    private final hp6 connectivityManager$delegate;
    private final Context ctx;
    private final hp6 powerManager$delegate;
    private final StorageStatsManager storageManager;
    private final hp6 windowManager$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemServiceModuleImpl(CoreModule coreModule) {
        this(coreModule, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getSystemServiceSafe(String str) {
        T t;
        try {
            Result.a aVar = Result.a;
            t = (T) Result.b(this.ctx.getSystemService(str));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            t = (T) Result.b(f.a(th));
        }
        if (Result.g(t)) {
            return null;
        }
        return t;
    }

    @Override // io.embrace.android.embracesdk.injection.SystemServiceModule
    public ActivityManager getActivityManager() {
        return (ActivityManager) this.activityManager$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.SystemServiceModule
    public ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) this.connectivityManager$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.SystemServiceModule
    public PowerManager getPowerManager() {
        return (PowerManager) this.powerManager$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.SystemServiceModule
    public StorageStatsManager getStorageManager() {
        return this.storageManager;
    }

    @Override // io.embrace.android.embracesdk.injection.SystemServiceModule
    public WindowManager getWindowManager() {
        return (WindowManager) this.windowManager$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public SystemServiceModuleImpl(CoreModule coreModule, VersionChecker versionChecker) {
        zq3.h(coreModule, "coreModule");
        zq3.h(versionChecker, "versionChecker");
        this.ctx = coreModule.getContext();
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.SystemServiceModuleImpl$activityManager$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ActivityManager mo865invoke() {
                Object systemServiceSafe;
                systemServiceSafe = SystemServiceModuleImpl.this.getSystemServiceSafe("activity");
                return (ActivityManager) systemServiceSafe;
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.activityManager$delegate = new SingletonDelegate(loadType, qs2Var);
        this.powerManager$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SystemServiceModuleImpl$powerManager$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PowerManager mo865invoke() {
                Object systemServiceSafe;
                systemServiceSafe = SystemServiceModuleImpl.this.getSystemServiceSafe("power");
                return (PowerManager) systemServiceSafe;
            }
        });
        this.connectivityManager$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SystemServiceModuleImpl$connectivityManager$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ConnectivityManager mo865invoke() {
                Object systemServiceSafe;
                systemServiceSafe = SystemServiceModuleImpl.this.getSystemServiceSafe("connectivity");
                return (ConnectivityManager) systemServiceSafe;
            }
        });
        this.storageManager = versionChecker.isAtLeast(26) ? (StorageStatsManager) getSystemServiceSafe("storagestats") : null;
        this.windowManager$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SystemServiceModuleImpl$windowManager$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final WindowManager mo865invoke() {
                Object systemServiceSafe;
                systemServiceSafe = SystemServiceModuleImpl.this.getSystemServiceSafe("window");
                return (WindowManager) systemServiceSafe;
            }
        });
    }

    public /* synthetic */ SystemServiceModuleImpl(CoreModule coreModule, VersionChecker versionChecker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coreModule, (i & 2) != 0 ? BuildVersionChecker.INSTANCE : versionChecker);
    }
}
