package io.embrace.android.embracesdk.anr.ndk;

import android.os.Handler;
import android.os.Looper;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class NativeThreadSamplerInstaller {
    private Thread currentThread;
    private final AtomicBoolean isMonitoring;
    private final InternalEmbraceLogger logger;
    private final SharedObjectLoader sharedObjectLoader;
    private Handler targetHandler;

    public NativeThreadSamplerInstaller(SharedObjectLoader sharedObjectLoader, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(sharedObjectLoader, "sharedObjectLoader");
        zq3.h(internalEmbraceLogger, "logger");
        this.sharedObjectLoader = sharedObjectLoader;
        this.logger = internalEmbraceLogger;
        this.isMonitoring = new AtomicBoolean(false);
    }

    private final boolean isMonitoringCurrentThread() {
        if (this.isMonitoring.get()) {
            Thread currentThread = Thread.currentThread();
            zq3.g(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Thread thread = this.currentThread;
            if (thread != null && id == thread.getId()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfigChange(final ConfigService configService, final NativeThreadSamplerService nativeThreadSamplerService, final AnrService anrService) {
        Handler handler = this.targetHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller$onConfigChange$1
                @Override // java.lang.Runnable
                public final void run() {
                    AtomicBoolean atomicBoolean;
                    if (configService.getAnrBehavior().isNativeThreadAnrSamplingEnabled()) {
                        atomicBoolean = NativeThreadSamplerInstaller.this.isMonitoring;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        NativeThreadSamplerInstaller.this.monitorCurrentThread(nativeThreadSamplerService, anrService);
                    }
                }
            });
        }
    }

    private final void prepareTargetHandler() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        Looper myLooper = Looper.myLooper();
        Handler handler = myLooper != null ? new Handler(myLooper) : null;
        this.targetHandler = handler;
        if (handler == null) {
            this.logger.log("Native thread sampler init failed: Failed to create Handler for target native thread", InternalEmbraceLogger.Severity.ERROR, null, false);
        }
    }

    public final Thread getCurrentThread$embrace_android_sdk_release() {
        return this.currentThread;
    }

    public final void monitorCurrentThread(final NativeThreadSamplerService nativeThreadSamplerService, final ConfigService configService, final AnrService anrService) {
        zq3.h(nativeThreadSamplerService, "sampler");
        zq3.h(configService, "configService");
        zq3.h(anrService, "anrService");
        if (isMonitoringCurrentThread()) {
            return;
        }
        this.isMonitoring.set(false);
        this.currentThread = Thread.currentThread();
        if (this.sharedObjectLoader.loadEmbraceNative()) {
            prepareTargetHandler();
            if (configService.getAnrBehavior().isNativeThreadAnrSamplingEnabled()) {
                monitorCurrentThread(nativeThreadSamplerService, anrService);
            }
            configService.addListener(new ConfigListener() { // from class: io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller$monitorCurrentThread$1
                @Override // io.embrace.android.embracesdk.config.ConfigListener
                public final void onConfigChange(ConfigService configService2) {
                    zq3.h(configService2, "it");
                    NativeThreadSamplerInstaller.this.onConfigChange(configService, nativeThreadSamplerService, anrService);
                }
            });
        }
    }

    public final void setCurrentThread$embrace_android_sdk_release(Thread thread) {
        this.currentThread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void monitorCurrentThread(NativeThreadSamplerService nativeThreadSamplerService, AnrService anrService) {
        synchronized (this) {
            try {
                if (!this.isMonitoring.get()) {
                    InternalEmbraceLogger internalEmbraceLogger = this.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Installing native sampling on '");
                    Thread currentThread = Thread.currentThread();
                    zq3.g(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append('\'');
                    internalEmbraceLogger.log(sb.toString(), InternalEmbraceLogger.Severity.INFO, null, true);
                    if (nativeThreadSamplerService.monitorCurrentThread()) {
                        anrService.addBlockedThreadListener(nativeThreadSamplerService);
                        this.isMonitoring.set(true);
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
