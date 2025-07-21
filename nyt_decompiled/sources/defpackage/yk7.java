package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class yk7 {
    public static final yk7 a = new yk7();
    private static final String b;

    static {
        String name = yk7.class.getName();
        zq3.g(name, "ServerProtocol::class.java.name");
        b = name;
    }

    private yk7() {
    }

    public static final String a() {
        return "v14.0";
    }

    public static final String b() {
        z38 z38Var = z38.a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{w92.u()}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection d() {
        return i.o("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection e() {
        return i.o("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        z38 z38Var = z38.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{w92.u()}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String g() {
        z38 z38Var = z38.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{w92.w()}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String h(String str) {
        zq3.h(str, "subdomain");
        z38 z38Var = z38.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String i() {
        z38 z38Var = z38.a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{w92.w()}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String j() {
        z38 z38Var = z38.a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{w92.x()}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
