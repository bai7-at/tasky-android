package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.m;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import defpackage.gx8;
import defpackage.s48;
import defpackage.ur;
import defpackage.ys3;
import defpackage.z19;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class u {
    private static final Pattern a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final Pattern b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final Pattern d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    private static final Pattern f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    private static final String g = new String(new byte[]{10});
    private static final String h = new String(new byte[]{13, 10});

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static final class b {
        public final String a;
        public final long b;

        public b(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw ParserException.c(str, null);
        }
    }

    public static byte[] b(List list) {
        return ys3.g(h).d(list).getBytes(s.g);
    }

    private static String c(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 301) {
            return "Move Permanently";
        }
        if (i == 302) {
            return "Move Temporarily";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(s.g);
    }

    public static boolean e(List list) {
        return b.matcher((CharSequence) list.get(0)).matches();
    }

    public static boolean f(String str) {
        return a.matcher(str).matches() || b.matcher(str).matches();
    }

    public static long g(String str) {
        try {
            Matcher matcher = c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) ur.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e2) {
            throw ParserException.c(str, e2);
        }
    }

    public static int h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            throw ParserException.c(str, e2);
        }
    }

    private static int i(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static ImmutableList j(String str) {
        if (str == null) {
            return ImmutableList.x();
        }
        ImmutableList.a aVar = new ImmutableList.a();
        for (String str2 : z19.V0(str, ",\\s?")) {
            aVar.a(Integer.valueOf(i(str2)));
        }
        return aVar.k();
    }

    public static x k(List list) {
        Matcher matcher = a.matcher((CharSequence) list.get(0));
        ur.a(matcher.matches());
        int i = i((String) ur.e(matcher.group(1)));
        Uri parse = Uri.parse((String) ur.e(matcher.group(2)));
        int indexOf = list.indexOf("");
        ur.a(indexOf > 0);
        return new x(parse, i, new m.b().c(list.subList(1, indexOf)).e(), ys3.g(h).d(list.subList(indexOf + 1, list.size())));
    }

    public static y l(List list) {
        Matcher matcher = b.matcher((CharSequence) list.get(0));
        ur.a(matcher.matches());
        int parseInt = Integer.parseInt((String) ur.e(matcher.group(1)));
        int indexOf = list.indexOf("");
        ur.a(indexOf > 0);
        return new y(parseInt, new m.b().c(list.subList(1, indexOf)).e(), ys3.g(h).d(list.subList(indexOf + 1, list.size())));
    }

    public static b m(String str) {
        long parseInt;
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.c(str, null);
        }
        String str2 = (String) ur.e(matcher.group(1));
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e2) {
                throw ParserException.c(str, e2);
            }
        } else {
            parseInt = 60000;
        }
        return new b(str2, parseInt);
    }

    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] W0 = z19.W0(userInfo, ":");
        return new a(W0[0], W0[1]);
    }

    public static i o(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            return new i(2, (String) ur.e(matcher.group(1)), (String) ur.e(matcher.group(3)), s48.e(matcher.group(4)));
        }
        Matcher matcher2 = f.matcher(str);
        if (matcher2.matches()) {
            return new i(1, (String) ur.e(matcher2.group(1)), "", "");
        }
        throw ParserException.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) ur.e(uri.getAuthority());
        ur.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(z19.V0(str, "@")[1]).build();
    }

    public static ImmutableList q(x xVar) {
        ur.a(xVar.c.d("CSeq") != null);
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.a(z19.D("%s %s %s", t(xVar.b), xVar.a, "RTSP/1.0"));
        ImmutableListMultimap b2 = xVar.c.b();
        gx8 it2 = b2.keySet().iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            ImmutableList immutableList = b2.get(str);
            for (int i = 0; i < immutableList.size(); i++) {
                aVar.a(z19.D("%s: %s", str, immutableList.get(i)));
            }
        }
        aVar.a("");
        aVar.a(xVar.d);
        return aVar.k();
    }

    public static ImmutableList r(y yVar) {
        ur.a(yVar.b.d("CSeq") != null);
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.a(z19.D("%s %s %s", "RTSP/1.0", Integer.valueOf(yVar.a), c(yVar.a)));
        ImmutableListMultimap b2 = yVar.b.b();
        gx8 it2 = b2.keySet().iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            ImmutableList immutableList = b2.get(str);
            for (int i = 0; i < immutableList.size(); i++) {
                aVar.a(z19.D("%s: %s", str, immutableList.get(i)));
            }
        }
        aVar.a("");
        aVar.a(yVar.c);
        return aVar.k();
    }

    public static String[] s(String str) {
        String str2 = h;
        if (!str.contains(str2)) {
            str2 = g;
        }
        return z19.V0(str, str2);
    }

    public static String t(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
