package defpackage;

import androidx.compose.ui.text.i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mx4 {
    public static final int a(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            jo5 jo5Var = (jo5) list.get(i3);
            char c = jo5Var.f() > i ? (char) 1 : jo5Var.b() <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int b(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            jo5 jo5Var = (jo5) list.get(i3);
            char c = jo5Var.g() > i ? (char) 1 : jo5Var.c() <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(List list, float f) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            jo5 jo5Var = (jo5) list.get(i2);
            char c = jo5Var.h() > f ? (char) 1 : jo5Var.a() <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void d(List list, long j, ss2 ss2Var) {
        int size = list.size();
        for (int a = a(list, i.l(j)); a < size; a++) {
            jo5 jo5Var = (jo5) list.get(a);
            if (jo5Var.f() >= i.k(j)) {
                return;
            }
            if (jo5Var.f() != jo5Var.b()) {
                ss2Var.invoke(jo5Var);
            }
        }
    }
}
