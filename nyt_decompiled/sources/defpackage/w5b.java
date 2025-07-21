package defpackage;

import com.comscore.streaming.EventType;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w5b {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final Integer x;
    public static final w5b y = new w5b(new o3b());
    private static final String z = Integer.toString(0, 36);
    private static final String A = Integer.toString(1, 36);
    private static final String B = Integer.toString(2, 36);
    private static final String C = Integer.toString(3, 36);
    private static final String D = Integer.toString(4, 36);
    private static final String E = Integer.toString(5, 36);
    private static final String F = Integer.toString(6, 36);
    private static final String G = Integer.toString(8, 36);
    private static final String H = Integer.toString(9, 36);
    private static final String I = Integer.toString(10, 36);
    private static final String J = Integer.toString(11, 36);
    private static final String K = Integer.toString(12, 36);
    private static final String L = Integer.toString(13, 36);
    private static final String M = Integer.toString(14, 36);
    private static final String N = Integer.toString(15, 36);
    private static final String O = Integer.toString(16, 36);
    private static final String P = Integer.toString(17, 36);
    private static final String Q = Integer.toString(18, 36);
    private static final String R = Integer.toString(19, 36);
    private static final String S = Integer.toString(20, 36);
    private static final String T = Integer.toString(21, 36);
    private static final String U = Integer.toString(22, 36);
    private static final String V = Integer.toString(23, 36);
    private static final String W = Integer.toString(24, 36);
    private static final String X = Integer.toString(25, 36);
    private static final String Y = Integer.toString(26, 36);
    private static final String Z = Integer.toString(27, 36);
    private static final String a0 = Integer.toString(28, 36);
    private static final String b0 = Integer.toString(29, 36);
    private static final String c0 = Integer.toString(30, 36);
    private static final String d0 = Integer.toString(31, 36);
    private static final String e0 = Integer.toString(32, 36);
    private static final String f0 = Integer.toString(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 36);
    public static final zhf g0 = new zhf() { // from class: d1b
    };

    public final o3b a() {
        return new o3b(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w5b.class == obj.getClass()) {
            w5b w5bVar = (w5b) obj;
            if (khe.f(this.a, w5bVar.a) && khe.f(this.b, w5bVar.b) && khe.f(this.c, w5bVar.c) && khe.f(this.d, w5bVar.d) && khe.f(null, null) && khe.f(null, null) && khe.f(this.e, w5bVar.e) && khe.f(null, null) && khe.f(null, null) && Arrays.equals(this.f, w5bVar.f) && khe.f(this.g, w5bVar.g) && khe.f(null, null) && khe.f(this.h, w5bVar.h) && khe.f(this.i, w5bVar.i) && khe.f(this.j, w5bVar.j) && khe.f(this.k, w5bVar.k) && khe.f(null, null) && khe.f(this.m, w5bVar.m) && khe.f(this.n, w5bVar.n) && khe.f(this.o, w5bVar.o) && khe.f(this.p, w5bVar.p) && khe.f(this.q, w5bVar.q) && khe.f(this.r, w5bVar.r) && khe.f(this.s, w5bVar.s) && khe.f(this.t, w5bVar.t) && khe.f(this.u, w5bVar.u) && khe.f(null, null) && khe.f(null, null) && khe.f(this.v, w5bVar.v) && khe.f(null, null) && khe.f(this.w, w5bVar.w) && khe.f(this.x, w5bVar.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, null, null, this.e, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, null, null, this.v, null, this.w, this.x});
    }

    private w5b(o3b o3bVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        bool = o3bVar.k;
        num = o3bVar.j;
        num2 = o3bVar.w;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case EventType.SUBS /* 25 */:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            boolean z2 = num.intValue() != -1;
            bool = Boolean.valueOf(z2);
            if (z2 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        } else {
            num = null;
        }
        charSequence = o3bVar.a;
        this.a = charSequence;
        charSequence2 = o3bVar.b;
        this.b = charSequence2;
        charSequence3 = o3bVar.c;
        this.c = charSequence3;
        charSequence4 = o3bVar.d;
        this.d = charSequence4;
        charSequence5 = o3bVar.e;
        this.e = charSequence5;
        bArr = o3bVar.f;
        this.f = bArr;
        num3 = o3bVar.g;
        this.g = num3;
        num4 = o3bVar.h;
        this.h = num4;
        num5 = o3bVar.i;
        this.i = num5;
        this.j = num;
        this.k = bool;
        num6 = o3bVar.l;
        this.l = num6;
        num7 = o3bVar.l;
        this.m = num7;
        num8 = o3bVar.m;
        this.n = num8;
        num9 = o3bVar.n;
        this.o = num9;
        num10 = o3bVar.o;
        this.p = num10;
        num11 = o3bVar.p;
        this.q = num11;
        num12 = o3bVar.q;
        this.r = num12;
        charSequence6 = o3bVar.r;
        this.s = charSequence6;
        charSequence7 = o3bVar.s;
        this.t = charSequence7;
        charSequence8 = o3bVar.t;
        this.u = charSequence8;
        charSequence9 = o3bVar.u;
        this.v = charSequence9;
        charSequence10 = o3bVar.v;
        this.w = charSequence10;
        this.x = num2;
    }
}
