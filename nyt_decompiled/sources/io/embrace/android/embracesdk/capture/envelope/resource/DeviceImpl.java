package io.embrace.android.embracesdk.capture.envelope.resource;

import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import defpackage.c04;
import defpackage.qs2;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.c;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class DeviceImpl implements Device {
    private final BackgroundWorker backgroundWorker;
    private final String cpuName;
    private final String eglInfo;
    private final c04 internalStorageTotalCapacity;
    private Boolean isJailbroken;
    private final List<String> jailbreakLocations;
    private final InternalEmbraceLogger logger;
    private final int numberOfCores;
    private final PreferencesService preferencesService;
    private String screenResolution;
    private final SystemInfo systemInfo;
    private final WindowManager windowManager;

    public DeviceImpl(WindowManager windowManager, PreferencesService preferencesService, BackgroundWorker backgroundWorker, SystemInfo systemInfo, CpuInfoDelegate cpuInfoDelegate, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(preferencesService, "preferencesService");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(systemInfo, "systemInfo");
        zq3.h(cpuInfoDelegate, "cpuInfoDelegate");
        zq3.h(internalEmbraceLogger, "logger");
        this.windowManager = windowManager;
        this.preferencesService = preferencesService;
        this.backgroundWorker = backgroundWorker;
        this.systemInfo = systemInfo;
        this.logger = internalEmbraceLogger;
        this.screenResolution = "";
        this.jailbreakLocations = i.o("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");
        asyncRetrieveIsJailbroken();
        asyncRetrieveScreenResolution();
        this.numberOfCores = Runtime.getRuntime().availableProcessors();
        this.internalStorageTotalCapacity = c.a(new qs2() { // from class: io.embrace.android.embracesdk.capture.envelope.resource.DeviceImpl$internalStorageTotalCapacity$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Long.valueOf(invoke());
            }

            public final long invoke() {
                File dataDirectory = Environment.getDataDirectory();
                zq3.g(dataDirectory, "Environment.getDataDirectory()");
                return new StatFs(dataDirectory.getPath()).getTotalBytes();
            }
        });
        this.cpuName = cpuInfoDelegate.getCpuName();
        this.eglInfo = cpuInfoDelegate.getEgl();
    }

    private final void asyncRetrieveIsJailbroken() {
        if (isJailbroken() != null) {
            return;
        }
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.envelope.resource.DeviceImpl$asyncRetrieveIsJailbroken$1
            @Override // java.lang.Runnable
            public final void run() {
                PreferencesService preferencesService;
                boolean checkIfIsJailbroken;
                PreferencesService preferencesService2;
                preferencesService = DeviceImpl.this.preferencesService;
                Boolean jailbroken = preferencesService.getJailbroken();
                if (jailbroken != null) {
                    DeviceImpl.this.setJailbroken(jailbroken);
                    return;
                }
                DeviceImpl deviceImpl = DeviceImpl.this;
                checkIfIsJailbroken = deviceImpl.checkIfIsJailbroken();
                deviceImpl.setJailbroken(Boolean.valueOf(checkIfIsJailbroken));
                preferencesService2 = DeviceImpl.this.preferencesService;
                preferencesService2.setJailbroken(DeviceImpl.this.isJailbroken());
            }
        }, 1, (Object) null);
    }

    private final void asyncRetrieveScreenResolution() {
        if (getScreenResolution().length() > 0) {
            return;
        }
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.envelope.resource.DeviceImpl$asyncRetrieveScreenResolution$1
            @Override // java.lang.Runnable
            public final void run() {
                PreferencesService preferencesService;
                WindowManager windowManager;
                String screenResolution;
                PreferencesService preferencesService2;
                preferencesService = DeviceImpl.this.preferencesService;
                String screenResolution2 = preferencesService.getScreenResolution();
                if (screenResolution2 != null) {
                    DeviceImpl.this.setScreenResolution(screenResolution2);
                    return;
                }
                DeviceImpl deviceImpl = DeviceImpl.this;
                windowManager = deviceImpl.windowManager;
                screenResolution = deviceImpl.getScreenResolution(windowManager);
                deviceImpl.setScreenResolution(screenResolution);
                preferencesService2 = DeviceImpl.this.preferencesService;
                preferencesService2.setScreenResolution(DeviceImpl.this.getScreenResolution());
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfIsJailbroken() {
        if (DeviceKt.isEmulator(getSystemInfo())) {
            return false;
        }
        Iterator<String> it2 = this.jailbreakLocations.iterator();
        while (it2.hasNext()) {
            if (new File(it2.next() + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public String getCpuName() {
        return this.cpuName;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public String getEglInfo() {
        return this.eglInfo;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public c04 getInternalStorageTotalCapacity() {
        return this.internalStorageTotalCapacity;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public int getNumberOfCores() {
        return this.numberOfCores;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public String getScreenResolution() {
        return this.screenResolution;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public Boolean isJailbroken() {
        return this.isJailbroken;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public void setJailbroken(Boolean bool) {
        this.isJailbroken = bool;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.resource.Device
    public void setScreenResolution(String str) {
        zq3.h(str, "<set-?>");
        this.screenResolution = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getScreenResolution(WindowManager windowManager) {
        Display defaultDisplay;
        if (windowManager != null) {
            try {
                defaultDisplay = windowManager.getDefaultDisplay();
            } catch (Exception e) {
                this.logger.log("Could not determine screen resolution", InternalEmbraceLogger.Severity.DEBUG, e, true);
                return "";
            }
        } else {
            defaultDisplay = null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        z38 z38Var = z38.a;
        String format = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)}, 2));
        zq3.g(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
