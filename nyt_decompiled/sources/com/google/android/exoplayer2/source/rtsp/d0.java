package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.c0;
import defpackage.ur;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class d0 {
    private static final Pattern a = Pattern.compile("([a-z])=\\s?(.+)");
    private static final Pattern b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    private static final Pattern c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    private static void a(c0.b bVar, a.b bVar2) {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.c(null, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.source.rtsp.c0 b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.d0.b(java.lang.String):com.google.android.exoplayer2.source.rtsp.c0");
    }

    private static a.b c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new a.b((String) ur.e(matcher.group(1)), Integer.parseInt((String) ur.e(matcher.group(2))), (String) ur.e(matcher.group(3)), Integer.parseInt((String) ur.e(matcher.group(4))));
        } catch (NumberFormatException e) {
            throw ParserException.c("Malformed SDP media description line: " + str, e);
        }
    }
}
