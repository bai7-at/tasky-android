package com.datadog.android;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkCoreRegistry;
import com.datadog.android.core.internal.Sha256HashGenerator;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.d75;
import defpackage.j73;
import defpackage.k47;
import defpackage.kl8;
import defpackage.qs2;
import defpackage.vc7;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class Datadog {
    public static final Datadog a = new Datadog();
    private static final SdkCoreRegistry b = new SdkCoreRegistry(k47.a());
    private static j73 c = new Sha256HashGenerator();
    private static int d = Integer.MAX_VALUE;

    private Datadog() {
    }

    public static final vc7 a(final String str) {
        vc7 a2;
        SdkCoreRegistry sdkCoreRegistry = b;
        synchronized (sdkCoreRegistry) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                a2 = sdkCoreRegistry.a(str);
                if (a2 == null) {
                    final Throwable fillInStackTrace = new Throwable().fillInStackTrace();
                    InternalLogger.b.a(k47.a(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.Datadog$getInstance$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            Locale locale = Locale.US;
                            String str2 = str;
                            Throwable th = fillInStackTrace;
                            zq3.g(th, "stackCapture");
                            String format = String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{str2, i.u0(i.e0(h.k0(kl8.a(th)), 1), "\n", null, null, 0, null, null, 62, null)}, 2));
                            zq3.g(format, "format(...)");
                            return format;
                        }
                    }, null, false, null, 56, null);
                    a2 = d75.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    public static /* synthetic */ vc7 b(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(str);
    }

    public static final int c() {
        return d;
    }

    public static final vc7 d(Context context, Configuration configuration, TrackingConsent trackingConsent) {
        zq3.h(context, "context");
        zq3.h(configuration, "configuration");
        zq3.h(trackingConsent, "trackingConsent");
        return e(null, context, configuration, trackingConsent);
    }

    public static final vc7 e(String str, Context context, Configuration configuration, TrackingConsent trackingConsent) {
        String str2 = str;
        zq3.h(context, "context");
        zq3.h(configuration, "configuration");
        zq3.h(trackingConsent, "trackingConsent");
        SdkCoreRegistry sdkCoreRegistry = b;
        synchronized (sdkCoreRegistry) {
            vc7 a2 = sdkCoreRegistry.a(str2);
            if (a2 != null) {
                InternalLogger.b.a(k47.a(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.Datadog$initialize$1$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "The Datadog library has already been initialized.";
                    }
                }, null, false, null, 56, null);
                return a2;
            }
            String a3 = c.a(str2 + "/" + configuration.f().m().getSiteName$dd_sdk_android_core_release());
            if (a3 == null) {
                InternalLogger.b.a(k47.a(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.Datadog$initialize$1$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Cannot create SDK instance ID, stopping SDK initialization.";
                    }
                }, null, false, null, 56, null);
                return null;
            }
            if (str2 == null) {
                str2 = "_dd.sdk_core.default";
            }
            DatadogCore datadogCore = new DatadogCore(context, a3, str2, null, null, null, 56, null);
            datadogCore.s(configuration);
            datadogCore.D(trackingConsent);
            sdkCoreRegistry.b(str2, datadogCore);
            return datadogCore;
        }
    }

    public static final boolean f(String str) {
        boolean z;
        SdkCoreRegistry sdkCoreRegistry = b;
        synchronized (sdkCoreRegistry) {
            z = sdkCoreRegistry.a(str) != null;
        }
        return z;
    }

    public static /* synthetic */ boolean g(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return f(str);
    }

    public static final void h(int i) {
        d = i;
    }
}
