package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class zf9 {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(yo5 yo5Var) {
        String s;
        while (true) {
            String s2 = yo5Var.s();
            if (s2 == null) {
                return null;
            }
            if (a.matcher(s2).matches()) {
                do {
                    s = yo5Var.s();
                    if (s != null) {
                    }
                } while (!s.isEmpty());
            } else {
                Matcher matcher = vf9.a.matcher(s2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(yo5 yo5Var) {
        String s = yo5Var.s();
        return s != null && s.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] W0 = z19.W0(str, "\\.");
        long j = 0;
        for (String str2 : z19.V0(W0[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (W0.length == 2) {
            j2 += Long.parseLong(W0[1]);
        }
        return j2 * 1000;
    }

    public static void e(yo5 yo5Var) {
        int f = yo5Var.f();
        if (b(yo5Var)) {
            return;
        }
        yo5Var.U(f);
        throw ParserException.a("Expected WEBVTT. Got " + yo5Var.s(), null);
    }
}
