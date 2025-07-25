package com.comscore.util.setup;

import com.comscore.Analytics;
import com.comscore.util.ObfuscationChecker;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;

/* loaded from: classes2.dex */
public class Setup {
    static final String a = "comScore";
    private static JniComScoreHelper b;
    private static PlatformSetup c;
    private static boolean d;
    private static boolean e;
    private static final Object f = new Object();

    private static void a() {
        String version = Analytics.getVersion();
        String javaCodeVersion = c.getJavaCodeVersion();
        if (version == null) {
            Logger.e("Unable to retrieve the native version.");
            return;
        }
        if (version.equals(javaCodeVersion)) {
            return;
        }
        throw new IllegalStateException("The version of the comScore java code (" + javaCodeVersion + ") and the native library (" + version + ") are different. Check which version of the comScore SDK is being used.");
    }

    private static boolean b() {
        if (!c.shouldLoadCppLibrary()) {
            Logger.e("Unsupported platform", new RuntimeException("This platform is not supported. The comScore native library will not be loaded."));
            return false;
        }
        PlatformSetup platformSetup = c;
        String str = a;
        String buildNativeLibraryName = platformSetup.buildNativeLibraryName(a);
        if (buildNativeLibraryName != null) {
            str = buildNativeLibraryName;
        }
        String buildNativeLibraryPath = c.buildNativeLibraryPath(str);
        if (buildNativeLibraryPath != null) {
            try {
                if (buildNativeLibraryPath.length() != 0) {
                    System.load(buildNativeLibraryPath);
                    configureNative(b);
                    return true;
                }
            } catch (UnsatisfiedLinkError e2) {
                if (buildNativeLibraryPath != null && buildNativeLibraryPath.length() != 0) {
                    str = buildNativeLibraryPath;
                }
                Logger.e("Error loading the native library: " + str, e2);
                return false;
            }
        }
        System.loadLibrary(str);
        configureNative(b);
        return true;
    }

    private static native void configureNative(JniComScoreHelper jniComScoreHelper);

    public static JniComScoreHelper getJniComScoreHelper() {
        return b;
    }

    public static PlatformSetup getPlatformSetup() {
        return c;
    }

    public static boolean isNativeLibrarySuccessfullyLoaded() {
        return e;
    }

    public static boolean isSetUpFinished() {
        return d;
    }

    public static void setUp() {
        if (d) {
            return;
        }
        synchronized (f) {
            try {
                if (!d) {
                    if (new ObfuscationChecker().isCodeObfuscated()) {
                        throw new IllegalStateException("comScore SDK has been obfuscated. Did you add in your proguard-project.txt the following lines?\n-keep class com.comscore.** { *; }\n-dontwarn com.comscore.**");
                    }
                    CustomPlatformSetup customPlatformSetup = new CustomPlatformSetup();
                    c = customPlatformSetup;
                    b = customPlatformSetup.createApplicationInfoHelper();
                    Logger.log = c.createLogger();
                    boolean b2 = b();
                    e = b2;
                    d = true;
                    if (b2) {
                        a();
                        Logger.syncrhonizeLogLevelWithNative();
                    }
                }
            } finally {
            }
        }
    }
}
