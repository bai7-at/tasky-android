package defpackage;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes3.dex */
final class r5a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    private r5a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r5a a(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i2 != -1) {
                    return new r5a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, length);
                }
                return null;
            }
            String a = yfe.a(split[i].trim());
            switch (a.hashCode()) {
                case -1178781136:
                    if (a.equals("italic")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026963764:
                    if (a.equals("underline")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -192095652:
                    if (a.equals("strikeout")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -70925746:
                    if (a.equals("primarycolour")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029637:
                    if (a.equals("bold")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (a.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 366554320:
                    if (a.equals("fontsize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 767321349:
                    if (a.equals("borderstyle")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1767875043:
                    if (a.equals("alignment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1988365454:
                    if (a.equals("outlinecolour")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i;
                    break;
                case 1:
                    i3 = i;
                    break;
                case 2:
                    i4 = i;
                    break;
                case 3:
                    i5 = i;
                    break;
                case 4:
                    i6 = i;
                    break;
                case 5:
                    i7 = i;
                    break;
                case 6:
                    i8 = i;
                    break;
                case 7:
                    i9 = i;
                    break;
                case '\b':
                    i10 = i;
                    break;
                case '\t':
                    i11 = i;
                    break;
            }
            i++;
        }
    }
}
