package com.nytimes.android.performancetrackerclientphoenix.dimodules;

import android.app.ActivityManager;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.storage.StorageManager;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.PerformanceTrackerClientImpl;
import com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.monitor.DiskUsageMonitor;
import com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor;
import defpackage.cd;
import defpackage.cr5;
import defpackage.fx1;
import defpackage.g52;
import defpackage.gb6;
import defpackage.gx1;
import defpackage.hx1;
import defpackage.jz1;
import defpackage.qs2;
import defpackage.so1;
import defpackage.wk8;
import defpackage.yk8;
import defpackage.zo2;
import defpackage.zq3;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public interface PerformanceTrackerClientModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        public static final class a implements DiskUsageMonitor.a {
            final /* synthetic */ Application a;

            a(Application application) {
                this.a = application;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.DiskUsageMonitor.a
            public Long a() {
                Application application = this.a;
                StorageManager storageManager = (StorageManager) application.getApplicationContext().getSystemService(StorageManager.class);
                try {
                    UUID uuidForPath = storageManager.getUuidForPath(application.getFilesDir());
                    zq3.g(uuidForPath, "getUuidForPath(...)");
                    return Long.valueOf(storageManager.getAllocatableBytes(uuidForPath));
                } catch (IOException unused) {
                    return null;
                }
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.DiskUsageMonitor.a
            public long b() {
                return new StatFs(this.a.getApplicationInfo().dataDir).getAvailableBytes();
            }
        }

        private Companion() {
        }

        public final DiskUsageMonitor.a a(Application application) {
            zq3.h(application, "application");
            return new a(application);
        }

        public final hx1 b(cd cdVar, cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope, so1 so1Var) {
            zq3.h(cdVar, "analyticsSubauthLogger");
            zq3.h(cr5Var, "performanceTrackerClient");
            zq3.h(appEventFactory, "appEventFactory");
            zq3.h(coroutineScope, "scope");
            zq3.h(so1Var, "deviceConfig");
            return new hx1(cdVar instanceof fx1.a ? (fx1.a) cdVar : new gx1(), cr5Var, appEventFactory, so1Var, coroutineScope);
        }

        public final yk8 c() {
            return new jz1();
        }

        public final yk8 d(ET2Scope eT2Scope) {
            zq3.h(eT2Scope, "et2Scope");
            return new g52(eT2Scope);
        }

        public final zo2 e() {
            return new zo2(false, 1, null);
        }

        public final MainThreadTracker f(Application application, cr5 cr5Var, boolean z) {
            zq3.h(application, "application");
            zq3.h(cr5Var, "performanceTrackerClient");
            return new MainThreadTracker(application, cr5Var, z);
        }

        public final MemoryUsageMonitor g(final Application application, cr5 cr5Var, SharedPreferences sharedPreferences) {
            zq3.h(application, "application");
            zq3.h(cr5Var, "performanceTrackerClient");
            zq3.h(sharedPreferences, "prefs");
            return new MemoryUsageMonitor(sharedPreferences, cr5Var, new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.dimodules.PerformanceTrackerClientModule$Companion$provideMemoryUsageMonitor$memoryUsageMonitor$1

                public static final class a implements MemoryUsageMonitor.b {
                    final /* synthetic */ ActivityManager.MemoryInfo a;

                    a(ActivityManager.MemoryInfo memoryInfo) {
                        this.a = memoryInfo;
                    }

                    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor.b
                    public long a() {
                        return this.a.totalMem;
                    }

                    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor.b
                    public boolean b() {
                        return this.a.lowMemory;
                    }

                    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor.b
                    public long c() {
                        return this.a.availMem;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a mo865invoke() {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    Object systemService = application.getSystemService("activity");
                    zq3.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                    return new a(memoryInfo);
                }
            }, null, 8, null);
        }

        public final cr5 h(Set set, zo2 zo2Var) {
            zq3.h(set, "dataConsumers");
            zq3.h(zo2Var, "foregroundState");
            return new PerformanceTrackerClientImpl(new PerformanceTracker(), set, zo2Var);
        }

        public final wk8 i(Application application) {
            zq3.h(application, "application");
            Object systemService = application.getSystemService("power");
            zq3.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            return new gb6((PowerManager) systemService);
        }
    }
}
