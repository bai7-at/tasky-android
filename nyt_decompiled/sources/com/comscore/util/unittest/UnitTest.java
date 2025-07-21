package com.comscore.util.unittest;

import com.comscore.PublisherConfiguration;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* loaded from: classes2.dex */
public class UnitTest {

    public interface UnitTestOutputListener {
        void onLogMessage(String str);

        void onTestFinished(boolean z, String str);

        void onTestStarted();
    }

    static {
        Setup.setUp();
    }

    public static boolean isUnitTestAvailable() {
        try {
            return isUnitTestAvailableNative();
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    private static native boolean isUnitTestAvailableNative();

    public static void runUnitTest(PublisherConfiguration publisherConfiguration) {
        if (publisherConfiguration == null) {
            throw new NullPointerException("The templatePublisher can not be null.");
        }
        runUnitTest(publisherConfiguration, null);
    }

    private static native void runUnitTestNative(PublisherConfiguration publisherConfiguration, UnitTestOutputListener unitTestOutputListener);

    public static boolean runUnitTest(PublisherConfiguration publisherConfiguration, UnitTestOutputListener unitTestOutputListener) {
        if (publisherConfiguration == null) {
            throw new NullPointerException("The templatePublisher can not be null.");
        }
        try {
            runUnitTestNative(publisherConfiguration, unitTestOutputListener);
            return true;
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library", e);
            return false;
        }
    }
}
