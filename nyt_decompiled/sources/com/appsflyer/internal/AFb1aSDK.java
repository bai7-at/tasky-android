package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class AFb1aSDK implements AFc1xSDK {
    private ExecutorService AFInAppEventType;
    private ScheduledExecutorService AFKeystoreWrapper;
    private AFb1ySDK AFLogger;
    private AFe1fSDK AFLogger$LogLevel;
    private AFd1kSDK AFVersionDeclaration;
    private CreateOneLinkHttpTask afDebugLog;
    private AFd1cSDK afErrorLog;
    private AFb1dSDK afInfoLog;
    private PurchaseHandler afRDLog;
    private AFa1pSDK afWarnLog;
    private AFc1lSDK init;
    private ExecutorService valueOf;
    private final int values = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFb1fSDK AFInAppEventParameterName = new AFb1fSDK();

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger AFInAppEventType = new AtomicInteger();
        private final AtomicInteger values = new AtomicInteger();

        public AFa1zSDK() {
            AFInAppEventType.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFInAppEventType.get();
            int incrementAndGet = this.values.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    private synchronized AFb1ySDK onInstallConversionFailureNative() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFb1ySDK(new AFc1sSDK(this.values), valueOf());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    @NonNull
    public final synchronized ExecutorService AFInAppEventParameterName() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @NonNull
    public final synchronized ScheduledExecutorService AFInAppEventType() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = Executors.newScheduledThreadPool(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final AFc1ySDK AFKeystoreWrapper() {
        return new AFc1ySDK(onInstallConversionFailureNative(), values(), AppsFlyerProperties.getInstance());
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized CreateOneLinkHttpTask AFLogger() {
        try {
            if (this.afDebugLog == null) {
                AFd1rSDK aFd1rSDK = new AFd1rSDK(afErrorLog());
                this.afDebugLog = new CreateOneLinkHttpTask(new AFd1oSDK(), values(), AFLogger$LogLevel(), aFd1rSDK, new AFc1ySDK(onInstallConversionFailureNative(), values(), AppsFlyerProperties.getInstance()), new AFd1nSDK(values(), aFd1rSDK), afRDLog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFd1kSDK AFLogger$LogLevel() {
        try {
            if (this.AFVersionDeclaration == null) {
                this.AFVersionDeclaration = new AFd1kSDK(init(), new AFd1mSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFe1fSDK AFVersionDeclaration() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFe1fSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized PurchaseHandler afDebugLog() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final AFd1pSDK afErrorLog() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context != null) {
            return new AFb1cSDK(AFa1aSDK.AFInAppEventType(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFd1cSDK afInfoLog() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFd1cSDK(afErrorLog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFc1lSDK afRDLog() {
        try {
            if (this.init == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFb1aSDK.2
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: values, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: w
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFb1aSDK.AFInAppEventType(runnable, threadPoolExecutor2);
                    }
                });
                this.init = new AFc1lSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFb1oSDK afWarnLog() {
        return AFb1oSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFa1pSDK getLevel() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFa1pSDK(init());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1fSDK init() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized ExecutorService valueOf() {
        try {
            if (this.valueOf == null) {
                this.valueOf = Executors.newCachedThreadPool();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFb1dSDK values() {
        try {
            if (this.afInfoLog == null) {
                AFb1fSDK init = init();
                Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afInfoLog = new AFb1dSDK(init, new AFb1cSDK(AFa1aSDK.AFInAppEventType(context)));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afInfoLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
