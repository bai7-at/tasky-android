package kotlinx.coroutines.test;

import defpackage.gt2;
import java.io.PrintStream;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* loaded from: classes5.dex */
public final class TestBuildersJvmKt {
    public static /* synthetic */ void TestResult$annotations() {
    }

    public static final void createTestResult(gt2 gt2Var) {
        BuildersKt__BuildersKt.runBlocking$default(null, new TestBuildersJvmKt$createTestResult$1(gt2Var, null), 1, null);
    }

    public static final void dumpCoroutines() {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        if (debugProbesImpl.isInstalled$kotlinx_coroutines_debug()) {
            debugProbesImpl.install$kotlinx_coroutines_core();
            try {
                PrintStream printStream = System.err;
                debugProbesImpl.dumpCoroutines(printStream);
                printStream.flush();
                debugProbesImpl.uninstall$kotlinx_coroutines_core();
            } catch (Throwable th) {
                DebugProbesImpl.INSTANCE.uninstall$kotlinx_coroutines_core();
                throw th;
            }
        }
    }

    public static final String systemPropertyImpl(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
