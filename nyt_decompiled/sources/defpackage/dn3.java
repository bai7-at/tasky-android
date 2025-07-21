package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a;

/* loaded from: classes.dex */
public final class dn3 {
    private int a;

    public dn3(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), a.a(16));
        zq3.g(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public /* synthetic */ dn3(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
