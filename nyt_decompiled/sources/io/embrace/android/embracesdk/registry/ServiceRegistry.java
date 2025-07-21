package io.embrace.android.embracesdk.registry;

import defpackage.c04;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c;

/* loaded from: classes5.dex */
public final class ServiceRegistry implements Closeable {
    private final c04 activityLifecycleListeners$delegate;
    private final c04 closeables$delegate;
    private final c04 configListeners$delegate;
    private AtomicBoolean initialized;
    private final InternalEmbraceLogger logger;
    private final c04 memoryCleanerListeners$delegate;
    private final c04 processStateListeners$delegate;
    private final List<Object> registry;

    public ServiceRegistry(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
        this.registry = new ArrayList();
        this.initialized = new AtomicBoolean(false);
        this.closeables$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.registry.ServiceRegistry$closeables$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<Closeable> mo865invoke() {
                List list;
                list = ServiceRegistry.this.registry;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof Closeable) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.configListeners$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.registry.ServiceRegistry$configListeners$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<ConfigListener> mo865invoke() {
                List list;
                list = ServiceRegistry.this.registry;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ConfigListener) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.memoryCleanerListeners$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.registry.ServiceRegistry$memoryCleanerListeners$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<MemoryCleanerListener> mo865invoke() {
                List list;
                list = ServiceRegistry.this.registry;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof MemoryCleanerListener) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.processStateListeners$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.registry.ServiceRegistry$processStateListeners$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<ProcessStateListener> mo865invoke() {
                List list;
                list = ServiceRegistry.this.registry;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ProcessStateListener) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.activityLifecycleListeners$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.registry.ServiceRegistry$activityLifecycleListeners$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<ActivityLifecycleListener> mo865invoke() {
                List list;
                list = ServiceRegistry.this.registry;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ActivityLifecycleListener) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
    }

    private final <T> void forEachSafe(List<? extends T> list, String str, ss2 ss2Var) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ss2Var.invoke(it2.next());
            } catch (Throwable th) {
                this.logger.log(str, InternalEmbraceLogger.Severity.ERROR, th, true);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        forEachSafe(getCloseables(), "Failed to close service", ServiceRegistry$close$1.INSTANCE);
    }

    public final void closeRegistration() {
        this.initialized.set(true);
    }

    public final List<ActivityLifecycleListener> getActivityLifecycleListeners() {
        return (List) this.activityLifecycleListeners$delegate.getValue();
    }

    public final List<Closeable> getCloseables() {
        return (List) this.closeables$delegate.getValue();
    }

    public final List<ConfigListener> getConfigListeners() {
        return (List) this.configListeners$delegate.getValue();
    }

    public final List<MemoryCleanerListener> getMemoryCleanerListeners() {
        return (List) this.memoryCleanerListeners$delegate.getValue();
    }

    public final List<ProcessStateListener> getProcessStateListeners() {
        return (List) this.processStateListeners$delegate.getValue();
    }

    public final void registerActivityLifecycleListeners(ActivityTracker activityTracker) {
        zq3.h(activityTracker, "activityLifecycleTracker");
        forEachSafe(getActivityLifecycleListeners(), "Failed to register activity lifecycle listener", new ServiceRegistry$registerActivityLifecycleListeners$1(activityTracker));
    }

    public final void registerActivityListeners(ProcessStateService processStateService) {
        zq3.h(processStateService, "processStateService");
        forEachSafe(getProcessStateListeners(), "Failed to register activity listener", new ServiceRegistry$registerActivityListeners$1(processStateService));
    }

    public final void registerConfigListeners(ConfigService configService) {
        zq3.h(configService, "configService");
        forEachSafe(getConfigListeners(), "Failed to register config listener", new ServiceRegistry$registerConfigListeners$1(configService));
    }

    public final void registerMemoryCleanerListeners(MemoryCleanerService memoryCleanerService) {
        zq3.h(memoryCleanerService, "memoryCleanerService");
        forEachSafe(getMemoryCleanerListeners(), "Failed to register memory cleaner listener", new ServiceRegistry$registerMemoryCleanerListeners$1(memoryCleanerService));
    }

    public final void registerService(Object obj) {
        if (this.initialized.get()) {
            throw new IllegalStateException("Cannot register a service - already initialized.");
        }
        if (obj == null) {
            return;
        }
        this.registry.add(obj);
    }

    public final void registerServices(Object... objArr) {
        zq3.h(objArr, "services");
        for (Object obj : objArr) {
            registerService(obj);
        }
    }
}
