package com.comscore.util;

import android.os.Looper;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* loaded from: classes2.dex */
public class CrossPublisherIdUtil {

    public static class GeneratedCrossPublisherId {
        private String a;
        private boolean b;

        GeneratedCrossPublisherId(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getValue() {
            return this.a;
        }

        public boolean isChanged() {
            return this.b;
        }
    }

    public interface Listener {
        void onCrossPublisherIdRequested(String str, boolean z);
    }

    public static GeneratedCrossPublisherId getGeneratedCrossPublisherDeviceId() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!Setup.isSetUpFinished()) {
            Logger.e("Library not initialised. Unable to retrieve the crosspublisher ID");
            return null;
        }
        try {
            String generatedCrossPublisherUniqueDeviceIdNative = getGeneratedCrossPublisherUniqueDeviceIdNative();
            return new GeneratedCrossPublisherId(generatedCrossPublisherUniqueDeviceIdNative.substring(2), generatedCrossPublisherUniqueDeviceIdNative.charAt(0) == '1');
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library: ", e);
            return null;
        }
    }

    private static native String getGeneratedCrossPublisherUniqueDeviceIdNative();

    public static String getMD5CrossPublisherDeviceId() {
        if (!Setup.isSetUpFinished()) {
            Logger.e("Library not initialised. Unable to retrieve the MD5 crosspublisher ID");
            return null;
        }
        try {
            return getMD5CrossPublisherDeviceIdNative();
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library: ", e);
            return null;
        }
    }

    private static native String getMD5CrossPublisherDeviceIdNative();

    public static void requestCrossPublisherId(Listener listener) {
        if (!Setup.isSetUpFinished()) {
            Logger.e("Library not initialised. Unable to retrieve the crosspublisher ID");
            return;
        }
        try {
            requestCrossPublisherIdNative(listener);
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library: ", e);
        }
    }

    private static native void requestCrossPublisherIdNative(Listener listener);
}
