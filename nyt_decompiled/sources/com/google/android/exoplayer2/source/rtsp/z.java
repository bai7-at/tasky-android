package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import defpackage.z19;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class z {
    public static final z c = new z(0, -9223372036854775807L);
    private static final Pattern d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    public final long a;
    public final long b;

    private z(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static String b(long j) {
        return z19.D("npt=%.3f-", Double.valueOf(j / 1000.0d));
    }

    public static z d(String str) {
        long parseFloat;
        Matcher matcher = d.matcher(str);
        u.a(matcher.matches(), str);
        String group = matcher.group(1);
        u.a(group != null, str);
        long parseFloat2 = ((String) z19.j(group)).equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                u.a(parseFloat >= parseFloat2, str);
            } catch (NumberFormatException e) {
                throw ParserException.c(group2, e);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new z(parseFloat2, parseFloat);
    }

    public long a() {
        return this.b - this.a;
    }

    public boolean c() {
        return this.b == -9223372036854775807L;
    }
}
