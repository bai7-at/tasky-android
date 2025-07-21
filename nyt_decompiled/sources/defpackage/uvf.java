package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class uvf {
    private final gvf a;
    private final List b;
    private final Integer c;

    /* synthetic */ uvf(gvf gvfVar, List list, Integer num, svf svfVar) {
        this.a = gvfVar;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uvf)) {
            return false;
        }
        uvf uvfVar = (uvf) obj;
        if (this.a.equals(uvfVar.a) && this.b.equals(uvfVar.b)) {
            Integer num = this.c;
            Integer num2 = uvfVar.c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
