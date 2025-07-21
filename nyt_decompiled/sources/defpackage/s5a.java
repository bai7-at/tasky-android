package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class s5a {
    private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    public final int a;
    public final PointF b;

    static {
        Locale locale = Locale.US;
        d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f = Pattern.compile("\\\\an(\\d+)");
    }

    private s5a(int i, PointF pointF) {
        this.a = i;
        this.b = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:19:0x0082, B:21:0x008e, B:29:0x0094, B:24:0x0099), top: B:18:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.s5a a(java.lang.String r12) {
        /*
            java.util.regex.Pattern r0 = defpackage.s5a.c
            java.util.regex.Matcher r12 = r0.matcher(r12)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = r1
        La:
            boolean r4 = r12.find()
            if (r4 == 0) goto La0
            r4 = 1
            java.lang.String r5 = r12.group(r4)
            r5.getClass()
            java.util.regex.Pattern r6 = defpackage.s5a.d     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Pattern r7 = defpackage.s5a.e     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r7 = r7.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            boolean r8 = r6.find()     // Catch: java.lang.RuntimeException -> L82
            boolean r9 = r7.find()     // Catch: java.lang.RuntimeException -> L82
            r10 = 2
            if (r8 == 0) goto L55
            if (r9 == 0) goto L4c
            java.lang.String r7 = "SsaStyle.Overrides"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L82
            r8.<init>()     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            r8.append(r5)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L82
            defpackage.ezd.e(r7, r8)     // Catch: java.lang.RuntimeException -> L82
        L4c:
            java.lang.String r7 = r6.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r6 = r6.group(r10)     // Catch: java.lang.RuntimeException -> L82
            goto L62
        L55:
            if (r9 == 0) goto L7e
            java.lang.String r6 = r7.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r7 = r7.group(r10)     // Catch: java.lang.RuntimeException -> L82
            r11 = r7
            r7 = r6
            r6 = r11
        L62:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.RuntimeException -> L82
            if (r7 == 0) goto L7d
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L82
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.RuntimeException -> L82
            if (r6 == 0) goto L7c
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L82
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.RuntimeException -> L82
            r8.<init>(r7, r6)     // Catch: java.lang.RuntimeException -> L82
            goto L7f
        L7c:
            throw r0     // Catch: java.lang.RuntimeException -> L82
        L7d:
            throw r0     // Catch: java.lang.RuntimeException -> L82
        L7e:
            r8 = r0
        L7f:
            if (r8 == 0) goto L82
            r3 = r8
        L82:
            java.util.regex.Pattern r6 = defpackage.s5a.f     // Catch: java.lang.RuntimeException -> La
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> La
            boolean r6 = r5.find()     // Catch: java.lang.RuntimeException -> La
            if (r6 == 0) goto L9a
            java.lang.String r4 = r5.group(r4)     // Catch: java.lang.RuntimeException -> La
            if (r4 == 0) goto L99
            int r4 = defpackage.t5a.a(r4)     // Catch: java.lang.RuntimeException -> La
            goto L9b
        L99:
            throw r0     // Catch: java.lang.RuntimeException -> La
        L9a:
            r4 = r1
        L9b:
            if (r4 == r1) goto La
            r2 = r4
            goto La
        La0:
            s5a r12 = new s5a
            r12.<init>(r2, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5a.a(java.lang.String):s5a");
    }

    public static String b(String str) {
        return c.matcher(str).replaceAll("");
    }
}
