package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class yj0 {
    public static final yj0 a = new yj0();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;
    private static volatile Charset h;
    private static volatile Charset i;

    static {
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        zq3.g(forName, "forName(...)");
        b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        zq3.g(forName2, "forName(...)");
        c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        zq3.g(forName3, "forName(...)");
        d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        zq3.g(forName4, "forName(...)");
        e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        zq3.g(forName5, "forName(...)");
        f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        zq3.g(forName6, "forName(...)");
        g = forName6;
    }

    private yj0() {
    }

    public final Charset a() {
        Charset charset = i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        zq3.g(forName, "forName(...)");
        i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        zq3.g(forName, "forName(...)");
        h = forName;
        return forName;
    }
}
