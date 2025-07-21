package defpackage;

import android.graphics.Color;

/* loaded from: classes3.dex */
final class t5a {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    private t5a(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[Catch: RuntimeException -> 0x0055, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0055, blocks: (B:7:0x003a, B:9:0x0049, B:10:0x0059, B:12:0x005d, B:13:0x006a, B:15:0x006e, B:16:0x007b, B:18:0x007f, B:20:0x0085, B:22:0x00a7, B:24:0x00ab, B:27:0x00ba, B:29:0x00be, B:32:0x00cd, B:34:0x00d1, B:37:0x00e0, B:39:0x00e4, B:42:0x00f5, B:44:0x00f9, B:46:0x00ff, B:52:0x011b, B:51:0x010d, B:65:0x008d), top: B:6:0x003a, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.t5a b(java.lang.String r19, defpackage.r5a r20) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5a.b(java.lang.String, r5a):t5a");
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            wad.d(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(oje.a(((parseLong >> 24) & 255) ^ 255), oje.a(parseLong & 255), oje.a((parseLong >> 8) & 255), oje.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            ezd.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                ezd.f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            ezd.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
