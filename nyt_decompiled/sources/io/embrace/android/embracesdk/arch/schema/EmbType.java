package io.embrace.android.embracesdk.arch.schema;

import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class EmbType implements TelemetryType {
    private final EmbraceAttributeKey key;
    private final boolean sendImmediately;
    private final String value;

    public static abstract class Performance extends EmbType {

        public static final class Default extends Performance {
            public static final Default INSTANCE = new Default();

            /* JADX WARN: Multi-variable type inference failed */
            private Default() {
                super(null, 0 == true ? 1 : 0);
            }
        }

        public static final class MemoryWarning extends Performance {
            public static final MemoryWarning INSTANCE = new MemoryWarning();

            private MemoryWarning() {
                super("memory_warning", null);
            }
        }

        public static final class NativeThreadBlockage extends Performance {
            public static final NativeThreadBlockage INSTANCE = new NativeThreadBlockage();

            private NativeThreadBlockage() {
                super("native_thread_blockage", null);
            }
        }

        public static final class NativeThreadBlockageSample extends Performance {
            public static final NativeThreadBlockageSample INSTANCE = new NativeThreadBlockageSample();

            private NativeThreadBlockageSample() {
                super("native_thread_blockage_sample", null);
            }
        }

        public static final class Network extends Performance {
            public static final Network INSTANCE = new Network();

            private Network() {
                super("network_request", null);
            }
        }

        public static final class ThreadBlockage extends Performance {
            public static final ThreadBlockage INSTANCE = new ThreadBlockage();

            private ThreadBlockage() {
                super("thread_blockage", null);
            }
        }

        public static final class ThreadBlockageSample extends Performance {
            public static final ThreadBlockageSample INSTANCE = new ThreadBlockageSample();

            private ThreadBlockageSample() {
                super("thread_blockage_sample", null);
            }
        }

        private Performance(String str) {
            super("perf", str, null);
        }

        public /* synthetic */ Performance(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public static abstract class System extends EmbType {
        private final boolean sendImmediately;

        public static final class Breadcrumb extends System {
            public static final Breadcrumb INSTANCE = new Breadcrumb();

            private Breadcrumb() {
                super("breadcrumb", false, 2, null);
            }
        }

        public static final class Crash extends System {
            public static final Crash INSTANCE = new Crash();
            private static final EmbraceAttributeKey embAndroidCrashExceptionCause = new EmbraceAttributeKey("android.crash.exception_cause", null, false, false, 14, null);

            private Crash() {
                super("android.crash", true, null);
            }

            public final EmbraceAttributeKey getEmbAndroidCrashExceptionCause() {
                return embAndroidCrashExceptionCause;
            }
        }

        public static final class Exception extends System {
            public static final Exception INSTANCE = new Exception();

            private Exception() {
                super("exception", false, 2, null);
            }
        }

        public static final class Exit extends System {
            public static final Exit INSTANCE = new Exit();

            private Exit() {
                super("exit", true, null);
            }
        }

        public static final class FlutterException extends System {
            public static final FlutterException INSTANCE = new FlutterException();
            private static final EmbraceAttributeKey embFlutterExceptionContext = new EmbraceAttributeKey("exception.context", null, false, false, 14, null);
            private static final EmbraceAttributeKey embFlutterExceptionLibrary = new EmbraceAttributeKey("exception.library", null, false, false, 14, null);

            private FlutterException() {
                super("flutter_exception", false, 2, null);
            }

            public final EmbraceAttributeKey getEmbFlutterExceptionContext() {
                return embFlutterExceptionContext;
            }

            public final EmbraceAttributeKey getEmbFlutterExceptionLibrary() {
                return embFlutterExceptionLibrary;
            }
        }

        public static final class Log extends System {
            public static final Log INSTANCE = new Log();

            private Log() {
                super("log", false, 2, null);
            }
        }

        public static final class LowPower extends System {
            public static final LowPower INSTANCE = new LowPower();

            private LowPower() {
                super("low_power", false, 2, null);
            }
        }

        public static final class NativeCrash extends System {
            public static final NativeCrash INSTANCE = new NativeCrash();
            private static final EmbraceAttributeKey embNativeCrashException = new EmbraceAttributeKey("android.native_crash.exception", null, false, false, 14, null);
            private static final EmbraceAttributeKey embNativeCrashSymbols = new EmbraceAttributeKey("android.native_crash.symbols", null, false, false, 14, null);
            private static final EmbraceAttributeKey embNativeCrashErrors = new EmbraceAttributeKey("android.native_crash.errors", null, false, false, 14, null);
            private static final EmbraceAttributeKey embNativeCrashUnwindError = new EmbraceAttributeKey("android.native_crash.unwind_error", null, false, false, 14, null);

            private NativeCrash() {
                super("android.native_crash", true, null);
            }

            public final EmbraceAttributeKey getEmbNativeCrashErrors() {
                return embNativeCrashErrors;
            }

            public final EmbraceAttributeKey getEmbNativeCrashException() {
                return embNativeCrashException;
            }

            public final EmbraceAttributeKey getEmbNativeCrashSymbols() {
                return embNativeCrashSymbols;
            }

            public final EmbraceAttributeKey getEmbNativeCrashUnwindError() {
                return embNativeCrashUnwindError;
            }
        }

        public static final class NetworkCapturedRequest extends System {
            public static final NetworkCapturedRequest INSTANCE = new NetworkCapturedRequest();

            private NetworkCapturedRequest() {
                super("network_capture", true, null);
            }
        }

        public static final class NetworkStatus extends System {
            public static final NetworkStatus INSTANCE = new NetworkStatus();

            private NetworkStatus() {
                super("network_status", false, 2, null);
            }
        }

        public static final class PushNotification extends System {
            public static final PushNotification INSTANCE = new PushNotification();

            private PushNotification() {
                super("push_notification", false, 2, null);
            }
        }

        public static final class ReactNativeCrash extends System {
            public static final ReactNativeCrash INSTANCE = new ReactNativeCrash();
            private static final EmbraceAttributeKey embAndroidReactNativeCrashJsException = new EmbraceAttributeKey("android.react_native_crash.js_exception", null, false, false, 14, null);

            private ReactNativeCrash() {
                super("android.react_native_crash", true, null);
            }

            public final EmbraceAttributeKey getEmbAndroidReactNativeCrashJsException() {
                return embAndroidReactNativeCrashJsException;
            }
        }

        public /* synthetic */ System(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z);
        }

        @Override // io.embrace.android.embracesdk.arch.schema.EmbType, io.embrace.android.embracesdk.arch.schema.TelemetryType
        public boolean getSendImmediately() {
            return this.sendImmediately;
        }

        /* synthetic */ System(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        private System(String str, boolean z) {
            super("sys", str, null);
            this.sendImmediately = z;
        }
    }

    public static abstract class Ux extends EmbType {

        public static final class Session extends Ux {
            public static final Session INSTANCE = new Session();

            private Session() {
                super("session", null);
            }
        }

        public static final class Tap extends Ux {
            public static final Tap INSTANCE = new Tap();

            private Tap() {
                super("tap", null);
            }
        }

        public static final class View extends Ux {
            public static final View INSTANCE = new View();

            private View() {
                super("view", null);
            }
        }

        public static final class WebView extends Ux {
            public static final WebView INSTANCE = new WebView();

            private WebView() {
                super("webview", null);
            }
        }

        private Ux(String str) {
            super("ux", str, null);
        }

        public /* synthetic */ Ux(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r9 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private EmbType(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey r7 = new io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey
            r5 = 14
            r6 = 0
            java.lang.String r1 = "type"
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.key = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            if (r10 == 0) goto L30
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r1 = 46
            r9.append(r1)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L32
        L30:
            java.lang.String r9 = ""
        L32:
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.value = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.arch.schema.EmbType.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public EmbraceAttributeKey getKey() {
        return this.key;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.TelemetryType
    public boolean getSendImmediately() {
        return this.sendImmediately;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public String getValue() {
        return this.value;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Pair<String, String> toEmbraceKeyValuePair() {
        return TelemetryType.DefaultImpls.toEmbraceKeyValuePair(this);
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Attribute toPayload() {
        return TelemetryType.DefaultImpls.toPayload(this);
    }

    public /* synthetic */ EmbType(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
