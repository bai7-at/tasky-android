package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ep5 {
    public static final a e = new a(null);
    public static final int f = 8;
    private String a;
    private yv2 b;
    private int c = -1;
    private int d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ep5(String str) {
        this.a = str;
    }

    public final char a(int i) {
        yv2 yv2Var = this.b;
        if (yv2Var != null && i >= this.c) {
            int e2 = yv2Var.e();
            int i2 = this.c;
            return i < e2 + i2 ? yv2Var.d(i - i2) : this.a.charAt(i - ((e2 - this.d) + i2));
        }
        return this.a.charAt(i);
    }

    public final int b() {
        yv2 yv2Var = this.b;
        return yv2Var == null ? this.a.length() : (this.a.length() - (this.d - this.c)) + yv2Var.e();
    }

    public final void c(int i, int i2, String str) {
        if (i > i2) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        yv2 yv2Var = this.b;
        if (yv2Var != null) {
            int i3 = this.c;
            int i4 = i - i3;
            int i5 = i2 - i3;
            if (i4 >= 0 && i5 <= yv2Var.e()) {
                yv2Var.g(i4, i5, str);
                return;
            }
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            c(i, i2, str);
            return;
        }
        int max = Math.max(255, str.length() + 128);
        char[] cArr = new char[max];
        int min = Math.min(i, 64);
        int min2 = Math.min(this.a.length() - i2, 64);
        int i6 = i - min;
        aw2.a(this.a, cArr, 0, i6, i);
        int i7 = max - min2;
        int i8 = min2 + i2;
        aw2.a(this.a, cArr, i7, i2, i8);
        zv2.b(str, cArr, min);
        this.b = new yv2(cArr, min + str.length(), i7);
        this.c = i6;
        this.d = i8;
    }

    public String toString() {
        yv2 yv2Var = this.b;
        if (yv2Var == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        yv2Var.a(sb);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
