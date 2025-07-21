package defpackage;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class y44 extends ho7 {
    private final List e;
    private final List f;
    private final long g;
    private final long h;
    private final int i;

    public /* synthetic */ y44(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    @Override // defpackage.ho7
    public Shader b(long j) {
        return io7.a(hd5.a(fd5.o(this.g) == Float.POSITIVE_INFINITY ? zt7.i(j) : fd5.o(this.g), fd5.p(this.g) == Float.POSITIVE_INFINITY ? zt7.g(j) : fd5.p(this.g)), hd5.a(fd5.o(this.h) == Float.POSITIVE_INFINITY ? zt7.i(j) : fd5.o(this.h), fd5.p(this.h) == Float.POSITIVE_INFINITY ? zt7.g(j) : fd5.p(this.h)), this.e, this.f, this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y44)) {
            return false;
        }
        y44 y44Var = (y44) obj;
        return zq3.c(this.e, y44Var.e) && zq3.c(this.f, y44Var.f) && fd5.l(this.g, y44Var.g) && fd5.l(this.h, y44Var.h) && rl8.f(this.i, y44Var.i);
    }

    public int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        List list = this.f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + fd5.q(this.g)) * 31) + fd5.q(this.h)) * 31) + rl8.g(this.i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (hd5.b(this.g)) {
            str = "start=" + ((Object) fd5.v(this.g)) + ", ";
        } else {
            str = "";
        }
        if (hd5.b(this.h)) {
            str2 = "end=" + ((Object) fd5.v(this.h)) + ", ";
        }
        return "LinearGradient(colors=" + this.e + ", stops=" + this.f + ", " + str + str2 + "tileMode=" + ((Object) rl8.h(this.i)) + ')';
    }

    private y44(List list, List list2, long j, long j2, int i) {
        this.e = list;
        this.f = list2;
        this.g = j;
        this.h = j2;
        this.i = i;
    }
}
