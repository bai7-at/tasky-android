package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class nu3 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        z38 z38Var = z38.a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        zq3.g(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
