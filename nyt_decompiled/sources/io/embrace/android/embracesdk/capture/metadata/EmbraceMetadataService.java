package io.embrace.android.embracesdk.capture.metadata;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.streaming.EventType;
import defpackage.c04;
import defpackage.gm0;
import defpackage.qs2;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.BuildConfig;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate;
import io.embrace.android.embracesdk.capture.metadata.AppEnvironment;
import io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.AppInfo;
import io.embrace.android.embracesdk.payload.DeviceInfo;
import io.embrace.android.embracesdk.payload.DiskUsage;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceMetadataService implements MetadataService, ActivityLifecycleListener {
    public static final Companion Companion = new Companion(null);
    private final Embrace.AppFramework appFramework;
    private final c04 appUpdated;
    private final BuildInfo buildInfo;
    private final Clock clock;
    private final ConfigService configService;
    private volatile String cpuName;
    private final DeviceArchitecture deviceArchitecture;
    private final c04 deviceId;
    private volatile DiskUsage diskUsage;
    private volatile String egl;
    private final CpuInfoDelegate embraceCpuInfoDelegate;
    private final AppEnvironment.Environment environment;
    private final HostedSdkVersionInfo hostedSdkVersionInfo;
    private volatile Boolean isJailbroken;
    private final c04 lazyAppVersionCode;
    private final c04 lazyAppVersionName;
    private final InternalEmbraceLogger logger;
    private final BackgroundWorker metadataBackgroundWorker;
    private final c04 osUpdated;
    private final PackageManager packageManager;
    private final String packageName;
    private final PreferencesService preferencesService;
    private final ProcessStateService processStateService;
    private Future<String> reactNativeBundleId;
    private volatile String screenResolution;
    private final c04 statFs;
    private final StorageStatsManager storageStatsManager;
    private final SystemInfo systemInfo;
    private final WindowManager windowManager;

    public static final class Companion {
        private Companion() {
        }

        private final InputStream getBundleAsset(Context context, String str, InternalEmbraceLogger internalEmbraceLogger) {
            try {
                return context.getAssets().open(getBundleAssetName(str));
            } catch (Exception e) {
                internalEmbraceLogger.log("Failed to retrieve RN bundle file from assets.", InternalEmbraceLogger.Severity.ERROR, e, false);
                return null;
            }
        }

        private final String getBundleAssetName(String str) {
            int b0 = h.b0(str, "://", 0, false, 6, null) + 3;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str.substring(b0);
            zq3.g(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }

        private final InputStream getCustomBundleStream(String str, InternalEmbraceLogger internalEmbraceLogger) {
            try {
                return new FileInputStream(str);
            } catch (FileNotFoundException e) {
                internalEmbraceLogger.log("Failed to retrieve the custom RN bundle file.", InternalEmbraceLogger.Severity.ERROR, e, false);
                return null;
            } catch (NullPointerException e2) {
                internalEmbraceLogger.log("Failed to retrieve the custom RN bundle file.", InternalEmbraceLogger.Severity.ERROR, e2, false);
                return null;
            }
        }

        private final String hashBundleToMd5(byte[] bArr) {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                z38 z38Var = z38.a;
                String format = String.format(Locale.getDefault(), "%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                sb.append(format);
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "sb.toString()");
            Locale locale = Locale.getDefault();
            zq3.g(locale, "Locale.getDefault()");
            if (sb2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase = sb2.toUpperCase(locale);
            zq3.g(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }

        public final String computeReactNativeBundleId$embrace_android_sdk_release(Context context, String str, String str2, InternalEmbraceLogger internalEmbraceLogger) {
            zq3.h(context, "context");
            zq3.h(internalEmbraceLogger, "logger");
            if (str == null) {
                return str2;
            }
            InputStream bundleAsset = h.P(str, "assets", false, 2, null) ? getBundleAsset(context, str, internalEmbraceLogger) : getCustomBundleStream(str, internalEmbraceLogger);
            try {
                if (bundleAsset == null) {
                    return str2;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16];
                        while (true) {
                            int read = bundleAsset.read(bArr, 0, 16);
                            if (read == -1) {
                                Companion companion = EmbraceMetadataService.Companion;
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                zq3.g(byteArray, "buffer.toByteArray()");
                                String hashBundleToMd5 = companion.hashBundleToMd5(byteArray);
                                gm0.a(byteArrayOutputStream, null);
                                gm0.a(bundleAsset, null);
                                return hashBundleToMd5;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                internalEmbraceLogger.log("Failed to compute the RN bundle file.", InternalEmbraceLogger.Severity.ERROR, e, false);
                return str2;
            }
        }

        public final EmbraceMetadataService ofContext(final Context context, AppEnvironment.Environment environment, final SystemInfo systemInfo, final BuildInfo buildInfo, ConfigService configService, Embrace.AppFramework appFramework, final PreferencesService preferencesService, ProcessStateService processStateService, BackgroundWorker backgroundWorker, StorageStatsManager storageStatsManager, WindowManager windowManager, Clock clock, CpuInfoDelegate cpuInfoDelegate, DeviceArchitecture deviceArchitecture, final c04 c04Var, c04 c04Var2, HostedSdkVersionInfo hostedSdkVersionInfo, final InternalEmbraceLogger internalEmbraceLogger) {
            zq3.h(context, "context");
            zq3.h(environment, "environment");
            zq3.h(systemInfo, "systemInfo");
            zq3.h(buildInfo, "buildInfo");
            zq3.h(configService, "configService");
            zq3.h(appFramework, "appFramework");
            zq3.h(preferencesService, "preferencesService");
            zq3.h(processStateService, "processStateService");
            zq3.h(backgroundWorker, "metadataBackgroundWorker");
            zq3.h(clock, "clock");
            zq3.h(cpuInfoDelegate, "embraceCpuInfoDelegate");
            zq3.h(deviceArchitecture, "deviceArchitecture");
            zq3.h(c04Var, "lazyAppVersionName");
            zq3.h(c04Var2, "lazyAppVersionCode");
            zq3.h(hostedSdkVersionInfo, "hostedSdkVersionInfo");
            zq3.h(internalEmbraceLogger, "logger");
            c04 a = c.a(new qs2() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$Companion$ofContext$isAppUpdated$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return Boolean.valueOf(invoke());
                }

                public final boolean invoke() {
                    String appVersion = PreferencesService.this.getAppVersion();
                    return (appVersion == null || h.w(appVersion, (String) c04Var.getValue(), true)) ? false : true;
                }
            });
            c04 a2 = c.a(new qs2() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$Companion$ofContext$isOsUpdated$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return Boolean.valueOf(invoke());
                }

                public final boolean invoke() {
                    String osVersion = PreferencesService.this.getOsVersion();
                    return (osVersion == null || h.w(osVersion, systemInfo.getOsVersion(), true)) ? false : true;
                }
            });
            c04 a3 = c.a(new MutablePropertyReference0Impl(preferencesService) { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$Companion$ofContext$deviceIdentifier$1
                @Override // defpackage.jv3
                public Object get() {
                    return ((PreferencesService) this.receiver).getDeviceIdentifier();
                }

                public void set(Object obj) {
                    ((PreferencesService) this.receiver).setDeviceIdentifier((String) obj);
                }
            });
            Future submit$default = appFramework == Embrace.AppFramework.REACT_NATIVE ? BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$Companion$ofContext$1
                @Override // java.util.concurrent.Callable
                public final String call() {
                    String javaScriptBundleURL = PreferencesService.this.getJavaScriptBundleURL();
                    String javaScriptBundleId = PreferencesService.this.getJavaScriptBundleId();
                    return (javaScriptBundleURL == null || javaScriptBundleURL.length() == 0 || javaScriptBundleId == null || javaScriptBundleId.length() == 0) ? EmbraceMetadataService.Companion.computeReactNativeBundleId$embrace_android_sdk_release(context, javaScriptBundleURL, buildInfo.getBuildId(), internalEmbraceLogger) : javaScriptBundleId;
                }
            }, 1, (Object) null) : BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$Companion$ofContext$2
                @Override // java.util.concurrent.Callable
                public final String call() {
                    return BuildInfo.this.getBuildId();
                }
            }, 1, (Object) null);
            PackageManager packageManager = context.getPackageManager();
            zq3.g(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            zq3.g(packageName, "context.packageName");
            return new EmbraceMetadataService(windowManager, packageManager, storageStatsManager, systemInfo, buildInfo, configService, environment, a3, packageName, c04Var, c04Var2, appFramework, a, a2, preferencesService, processStateService, submit$default, hostedSdkVersionInfo, backgroundWorker, clock, cpuInfoDelegate, deviceArchitecture, internalEmbraceLogger, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EmbraceMetadataService(WindowManager windowManager, PackageManager packageManager, StorageStatsManager storageStatsManager, SystemInfo systemInfo, BuildInfo buildInfo, ConfigService configService, AppEnvironment.Environment environment, c04 c04Var, String str, c04 c04Var2, c04 c04Var3, Embrace.AppFramework appFramework, c04 c04Var4, c04 c04Var5, PreferencesService preferencesService, ProcessStateService processStateService, Future<String> future, HostedSdkVersionInfo hostedSdkVersionInfo, BackgroundWorker backgroundWorker, Clock clock, CpuInfoDelegate cpuInfoDelegate, DeviceArchitecture deviceArchitecture, InternalEmbraceLogger internalEmbraceLogger) {
        this.windowManager = windowManager;
        this.packageManager = packageManager;
        this.storageStatsManager = storageStatsManager;
        this.systemInfo = systemInfo;
        this.buildInfo = buildInfo;
        this.configService = configService;
        this.environment = environment;
        this.deviceId = c04Var;
        this.packageName = str;
        this.lazyAppVersionName = c04Var2;
        this.lazyAppVersionCode = c04Var3;
        this.appFramework = appFramework;
        this.appUpdated = c04Var4;
        this.osUpdated = c04Var5;
        this.preferencesService = preferencesService;
        this.processStateService = processStateService;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.metadataBackgroundWorker = backgroundWorker;
        this.clock = clock;
        this.embraceCpuInfoDelegate = cpuInfoDelegate;
        this.deviceArchitecture = deviceArchitecture;
        this.logger = internalEmbraceLogger;
        this.statFs = c.a(new qs2() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$statFs$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final StatFs mo865invoke() {
                File dataDirectory = Environment.getDataDirectory();
                zq3.g(dataDirectory, "Environment.getDataDirectory()");
                return new StatFs(dataDirectory.getPath());
            }
        });
        if (appFramework == Embrace.AppFramework.REACT_NATIVE) {
            this.reactNativeBundleId = future;
        } else {
            this.reactNativeBundleId = BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService.1
                @Override // java.util.concurrent.Callable
                public final String call() {
                    return EmbraceMetadataService.this.buildInfo.getBuildId();
                }
            }, 1, (Object) null);
        }
    }

    private final void asyncRetrieveAdditionalDeviceInfo() {
        String str;
        String str2 = this.cpuName;
        if (str2 == null || str2.length() == 0 || (str = this.egl) == null || str.length() == 0) {
            BackgroundWorker.submit$default(this.metadataBackgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$asyncRetrieveAdditionalDeviceInfo$1
                @Override // java.lang.Runnable
                public final void run() {
                    PreferencesService preferencesService;
                    PreferencesService preferencesService2;
                    CpuInfoDelegate cpuInfoDelegate;
                    PreferencesService preferencesService3;
                    String str3;
                    CpuInfoDelegate cpuInfoDelegate2;
                    PreferencesService preferencesService4;
                    String str4;
                    preferencesService = EmbraceMetadataService.this.preferencesService;
                    String cpuName = preferencesService.getCpuName();
                    preferencesService2 = EmbraceMetadataService.this.preferencesService;
                    String egl = preferencesService2.getEgl();
                    if (cpuName != null) {
                        EmbraceMetadataService.this.cpuName = cpuName;
                    } else {
                        EmbraceMetadataService embraceMetadataService = EmbraceMetadataService.this;
                        cpuInfoDelegate = embraceMetadataService.embraceCpuInfoDelegate;
                        embraceMetadataService.cpuName = cpuInfoDelegate.getCpuName();
                        preferencesService3 = EmbraceMetadataService.this.preferencesService;
                        str3 = EmbraceMetadataService.this.cpuName;
                        preferencesService3.setCpuName(str3);
                    }
                    if (egl != null) {
                        EmbraceMetadataService.this.egl = egl;
                        return;
                    }
                    EmbraceMetadataService embraceMetadataService2 = EmbraceMetadataService.this;
                    cpuInfoDelegate2 = embraceMetadataService2.embraceCpuInfoDelegate;
                    embraceMetadataService2.egl = cpuInfoDelegate2.getEgl();
                    preferencesService4 = EmbraceMetadataService.this.preferencesService;
                    str4 = EmbraceMetadataService.this.egl;
                    preferencesService4.setEgl(str4);
                }
            }, 1, (Object) null);
        }
    }

    private final void asyncRetrieveDiskUsage(final boolean z) {
        BackgroundWorker.submit$default(this.metadataBackgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$asyncRetrieveDiskUsage$1
            @Override // java.lang.Runnable
            public final void run() {
                c04 c04Var;
                DiskUsage diskUsage;
                ConfigService configService;
                StorageStatsManager storageStatsManager;
                PackageManager packageManager;
                String str;
                c04Var = EmbraceMetadataService.this.statFs;
                long internalStorageFreeCapacity = MetadataUtils.getInternalStorageFreeCapacity((StatFs) c04Var.getValue());
                if (z) {
                    configService = EmbraceMetadataService.this.configService;
                    if (configService.getAutoDataCaptureBehavior().isDiskUsageReportingEnabled()) {
                        EmbraceMetadataService embraceMetadataService = EmbraceMetadataService.this;
                        storageStatsManager = embraceMetadataService.storageStatsManager;
                        packageManager = EmbraceMetadataService.this.packageManager;
                        str = EmbraceMetadataService.this.packageName;
                        Long deviceDiskAppUsage = embraceMetadataService.getDeviceDiskAppUsage(storageStatsManager, packageManager, str);
                        if (deviceDiskAppUsage != null) {
                            EmbraceMetadataService.this.diskUsage = new DiskUsage(deviceDiskAppUsage, Long.valueOf(internalStorageFreeCapacity));
                        }
                    }
                }
                diskUsage = EmbraceMetadataService.this.diskUsage;
                if (diskUsage == null) {
                    EmbraceMetadataService.this.diskUsage = new DiskUsage(null, Long.valueOf(internalStorageFreeCapacity));
                }
            }
        }, 1, (Object) null);
    }

    private final void asyncRetrieveIsJailbroken() {
        if (this.isJailbroken != null) {
            return;
        }
        BackgroundWorker.submit$default(this.metadataBackgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$asyncRetrieveIsJailbroken$1
            @Override // java.lang.Runnable
            public final void run() {
                PreferencesService preferencesService;
                PreferencesService preferencesService2;
                Boolean bool;
                preferencesService = EmbraceMetadataService.this.preferencesService;
                Boolean jailbroken = preferencesService.getJailbroken();
                if (jailbroken != null) {
                    EmbraceMetadataService.this.isJailbroken = jailbroken;
                    return;
                }
                EmbraceMetadataService embraceMetadataService = EmbraceMetadataService.this;
                embraceMetadataService.isJailbroken = embraceMetadataService.isJailbroken();
                preferencesService2 = EmbraceMetadataService.this.preferencesService;
                bool = EmbraceMetadataService.this.isJailbroken;
                preferencesService2.setJailbroken(bool);
            }
        }, 1, (Object) null);
    }

    private final void asyncRetrieveScreenResolution() {
        String str = this.screenResolution;
        if (str == null || str.length() == 0) {
            BackgroundWorker.submit$default(this.metadataBackgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$asyncRetrieveScreenResolution$1
                @Override // java.lang.Runnable
                public final void run() {
                    PreferencesService preferencesService;
                    WindowManager windowManager;
                    String str2;
                    PreferencesService preferencesService2;
                    String str3;
                    WindowManager windowManager2;
                    preferencesService = EmbraceMetadataService.this.preferencesService;
                    String screenResolution = preferencesService.getScreenResolution();
                    if (screenResolution != null) {
                        EmbraceMetadataService.this.screenResolution = screenResolution;
                        return;
                    }
                    windowManager = EmbraceMetadataService.this.windowManager;
                    if (windowManager != null) {
                        EmbraceMetadataService embraceMetadataService = EmbraceMetadataService.this;
                        try {
                            windowManager2 = embraceMetadataService.windowManager;
                            Display defaultDisplay = windowManager2.getDefaultDisplay();
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            if (defaultDisplay != null) {
                                defaultDisplay.getMetrics(displayMetrics);
                            }
                            z38 z38Var = z38.a;
                            str2 = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)}, 2));
                            zq3.g(str2, "java.lang.String.format(locale, format, *args)");
                        } catch (Exception unused) {
                            str2 = null;
                        }
                        embraceMetadataService.screenResolution = str2;
                        preferencesService2 = EmbraceMetadataService.this.preferencesService;
                        str3 = EmbraceMetadataService.this.screenResolution;
                        preferencesService2.setScreenResolution(str3);
                    }
                }
            }, 1, (Object) null);
        }
    }

    public static final EmbraceMetadataService ofContext(Context context, AppEnvironment.Environment environment, SystemInfo systemInfo, BuildInfo buildInfo, ConfigService configService, Embrace.AppFramework appFramework, PreferencesService preferencesService, ProcessStateService processStateService, BackgroundWorker backgroundWorker, StorageStatsManager storageStatsManager, WindowManager windowManager, Clock clock, CpuInfoDelegate cpuInfoDelegate, DeviceArchitecture deviceArchitecture, c04 c04Var, c04 c04Var2, HostedSdkVersionInfo hostedSdkVersionInfo, InternalEmbraceLogger internalEmbraceLogger) {
        return Companion.ofContext(context, environment, systemInfo, buildInfo, configService, appFramework, preferencesService, processStateService, backgroundWorker, storageStatsManager, windowManager, clock, cpuInfoDelegate, deviceArchitecture, c04Var, c04Var2, hostedSdkVersionInfo, internalEmbraceLogger);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        String appVersionName = getAppVersionName();
        String osVersion = this.systemInfo.getOsVersion();
        String deviceId = getDeviceId();
        long now = this.clock.now();
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        z38 z38Var = z38.a;
        String format = String.format(Locale.getDefault(), "Setting metadata on preferences service. App version: {%s}, OS version {%s}, device ID: {%s}, install date: {%d}", Arrays.copyOf(new Object[]{appVersionName, osVersion, deviceId, Long.valueOf(now)}, 4));
        zq3.g(format, "java.lang.String.format(locale, format, *args)");
        internalEmbraceLogger.log(format, InternalEmbraceLogger.Severity.DEBUG, null, true);
        this.preferencesService.setAppVersion(appVersionName);
        this.preferencesService.setOsVersion(osVersion);
        this.preferencesService.setDeviceIdentifier(deviceId);
        if (this.preferencesService.getInstallDate() == null) {
            this.preferencesService.setInstallDate(Long.valueOf(now));
        }
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public Embrace.AppFramework getAppFramework() {
        return this.appFramework;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getAppId() {
        return this.configService.getSdkModeBehavior().getAppId();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public AppInfo getAppInfo() {
        return getAppInfo(true);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getAppState() {
        return this.processStateService.isInBackground() ? Session.APPLICATION_STATE_BACKGROUND : Session.APPLICATION_STATE_FOREGROUND;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getAppVersionCode() {
        return (String) this.lazyAppVersionCode.getValue();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getAppVersionName() {
        return (String) this.lazyAppVersionName.getValue();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getCpuName() {
        return this.cpuName;
    }

    @TargetApi(EventType.CDN)
    public final Long getDeviceDiskAppUsage(StorageStatsManager storageStatsManager, PackageManager packageManager, String str) {
        zq3.h(packageManager, AndroidJniHelper.KEY_PACKAGE_MANAGER);
        try {
            zq3.e(str);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if ((packageInfo != null ? packageInfo.packageName : null) != null && storageStatsManager != null) {
                StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage(StorageManager.UUID_DEFAULT, packageInfo.packageName, Process.myUserHandle());
                zq3.g(queryStatsForPackage, "storageStatsManager.quer…andle()\n                )");
                return Long.valueOf(queryStatsForPackage.getAppBytes() + queryStatsForPackage.getDataBytes() + queryStatsForPackage.getCacheBytes());
            }
        } catch (Exception e) {
            this.logger.log("Error retrieving device disk usage", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getDeviceId() {
        return (String) this.deviceId.getValue();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public DeviceInfo getDeviceInfo() {
        return getDeviceInfo(true);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public DiskUsage getDiskUsage() {
        return this.diskUsage;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getEgl() {
        return this.egl;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public AppInfo getLightweightAppInfo() {
        return getAppInfo(false);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public DeviceInfo getLightweightDeviceInfo() {
        return getDeviceInfo(false);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getPackageName() {
        return this.packageName;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getReactNativeBundleId() {
        if (this.appFramework == Embrace.AppFramework.REACT_NATIVE && this.reactNativeBundleId.isDone()) {
            return this.reactNativeBundleId.get();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public String getScreenResolution() {
        return this.screenResolution;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public boolean isAppUpdated() {
        return ((Boolean) this.appUpdated.getValue()).booleanValue();
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public Boolean isJailbroken() {
        return this.isJailbroken;
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public boolean isOsUpdated() {
        return ((Boolean) this.osUpdated.getValue()).booleanValue();
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onView(this, activity);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onViewClose(this, activity);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public void precomputeValues() {
        asyncRetrieveIsJailbroken();
        asyncRetrieveScreenResolution();
        asyncRetrieveAdditionalDeviceInfo();
        asyncRetrieveDiskUsage(true);
    }

    @Override // io.embrace.android.embracesdk.capture.metadata.MetadataService
    public void setReactNativeBundleId(final Context context, final String str, final Boolean bool) {
        zq3.h(context, "context");
        if (!zq3.c(this.preferencesService.getJavaScriptBundleURL(), str) || zq3.c(bool, Boolean.TRUE)) {
            this.preferencesService.setJavaScriptBundleURL(str);
            this.reactNativeBundleId = BackgroundWorker.submit$default(this.metadataBackgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService$setReactNativeBundleId$1
                @Override // java.util.concurrent.Callable
                public final String call() {
                    InternalEmbraceLogger internalEmbraceLogger;
                    PreferencesService preferencesService;
                    EmbraceMetadataService.Companion companion = EmbraceMetadataService.Companion;
                    Context context2 = context;
                    String str2 = str;
                    String buildId = EmbraceMetadataService.this.buildInfo.getBuildId();
                    internalEmbraceLogger = EmbraceMetadataService.this.logger;
                    String computeReactNativeBundleId$embrace_android_sdk_release = companion.computeReactNativeBundleId$embrace_android_sdk_release(context2, str2, buildId, internalEmbraceLogger);
                    if (bool != null) {
                        preferencesService = EmbraceMetadataService.this.preferencesService;
                        preferencesService.setJavaScriptBundleId(computeReactNativeBundleId$embrace_android_sdk_release);
                    }
                    return computeReactNativeBundleId$embrace_android_sdk_release;
                }
            }, 1, (Object) null);
        }
    }

    private final AppInfo getAppInfo(boolean z) {
        return new AppInfo((String) this.lazyAppVersionName.getValue(), Integer.valueOf(this.appFramework.getValue()), this.buildInfo.getBuildId(), this.buildInfo.getBuildType(), this.buildInfo.getBuildFlavor(), this.environment.getValue(), Boolean.valueOf(z ? ((Boolean) this.appUpdated.getValue()).booleanValue() : false), Boolean.valueOf(z ? ((Boolean) this.appUpdated.getValue()).booleanValue() : false), (String) this.lazyAppVersionCode.getValue(), Boolean.valueOf(z ? ((Boolean) this.osUpdated.getValue()).booleanValue() : false), Boolean.valueOf(z ? ((Boolean) this.osUpdated.getValue()).booleanValue() : false), BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE, getReactNativeBundleId(), this.hostedSdkVersionInfo.getJavaScriptPatchNumber(), this.hostedSdkVersionInfo.getHostedPlatformVersion(), this.hostedSdkVersionInfo.getHostedPlatformVersion(), this.hostedSdkVersionInfo.getUnityBuildIdNumber(), this.hostedSdkVersionInfo.getHostedSdkVersion());
    }

    private final DeviceInfo getDeviceInfo(boolean z) {
        return new DeviceInfo(this.systemInfo.getDeviceManufacturer(), this.systemInfo.getDeviceModel(), this.deviceArchitecture.getArchitecture(), isJailbroken(), MetadataUtils.getLocale(), Long.valueOf(z ? MetadataUtils.getInternalStorageTotalCapacity((StatFs) this.statFs.getValue()) : 0L), this.systemInfo.getOsName(), this.systemInfo.getOsVersion(), Integer.valueOf(Integer.parseInt(this.systemInfo.getAndroidOsApiLevel())), getScreenResolution(), MetadataUtils.getTimezoneId(), Integer.valueOf(MetadataUtils.getNumberOfCores()), z ? getCpuName() : null, z ? getEgl() : null);
    }

    public /* synthetic */ EmbraceMetadataService(WindowManager windowManager, PackageManager packageManager, StorageStatsManager storageStatsManager, SystemInfo systemInfo, BuildInfo buildInfo, ConfigService configService, AppEnvironment.Environment environment, c04 c04Var, String str, c04 c04Var2, c04 c04Var3, Embrace.AppFramework appFramework, c04 c04Var4, c04 c04Var5, PreferencesService preferencesService, ProcessStateService processStateService, Future future, HostedSdkVersionInfo hostedSdkVersionInfo, BackgroundWorker backgroundWorker, Clock clock, CpuInfoDelegate cpuInfoDelegate, DeviceArchitecture deviceArchitecture, InternalEmbraceLogger internalEmbraceLogger, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, packageManager, storageStatsManager, systemInfo, buildInfo, configService, environment, c04Var, str, c04Var2, c04Var3, appFramework, c04Var4, c04Var5, preferencesService, processStateService, future, hostedSdkVersionInfo, backgroundWorker, clock, cpuInfoDelegate, deviceArchitecture, internalEmbraceLogger);
    }
}
