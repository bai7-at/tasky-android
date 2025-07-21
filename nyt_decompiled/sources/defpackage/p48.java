package defpackage;

/* loaded from: classes.dex */
public abstract class p48 {
    public static final String[] a = new String[0];

    public static final void a(StringBuilder sb, int i) {
        zq3.h(sb, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
