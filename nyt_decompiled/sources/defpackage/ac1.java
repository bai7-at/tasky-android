package defpackage;

/* loaded from: classes5.dex */
public abstract class ac1 {
    private static boolean a = Boolean.parseBoolean(fu0.d("otel.experimental.sdk.metrics.debug", "false"));

    public static String a() {
        return "To enable better debugging, run your JVM with -Dotel.experimental.sdk.metrics.debug=true";
    }
}
