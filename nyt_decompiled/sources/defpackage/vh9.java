package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class vh9 {
    public static final a a = new a(null);
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return vh9.b;
        }

        public final int b() {
            return vh9.d;
        }

        public final int c() {
            return vh9.c;
        }

        public final int d() {
            return vh9.e;
        }

        public final int e() {
            return vh9.i;
        }

        public final int f() {
            return vh9.h;
        }

        public final int g() {
            return vh9.m;
        }

        private a() {
        }
    }

    static {
        int h2 = h(8);
        b = h2;
        int h3 = h(4);
        c = h3;
        int h4 = h(2);
        d = h4;
        int h5 = h(1);
        e = h5;
        f = l(h2, h5);
        g = l(h3, h4);
        int h6 = h(16);
        h = h6;
        int h7 = h(32);
        i = h7;
        int l2 = l(h2, h4);
        j = l2;
        int l3 = l(h3, h5);
        k = l3;
        l = l(l2, l3);
        m = l(h6, h7);
    }

    private static int h(int i2) {
        return i2;
    }

    public static final boolean i(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean j(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static final int l(int i2, int i3) {
        return h(i2 | i3);
    }

    public static String m(int i2) {
        return "WindowInsetsSides(" + n(i2) + ')';
    }

    private static final String n(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = f;
        if ((i2 & i3) == i3) {
            o(sb, "Start");
        }
        int i4 = j;
        if ((i2 & i4) == i4) {
            o(sb, "Left");
        }
        int i5 = h;
        if ((i2 & i5) == i5) {
            o(sb, "Top");
        }
        int i6 = g;
        if ((i2 & i6) == i6) {
            o(sb, "End");
        }
        int i7 = k;
        if ((i2 & i7) == i7) {
            o(sb, "Right");
        }
        int i8 = i;
        if ((i2 & i8) == i8) {
            o(sb, "Bottom");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void o(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
