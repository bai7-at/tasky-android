package defpackage;

import com.datadog.android.core.internal.persistence.a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class s60 {
    private final a a;
    private final List b;
    private final byte[] c;

    public s60(a aVar, List list, byte[] bArr) {
        zq3.h(aVar, "id");
        zq3.h(list, "data");
        this.a = aVar;
        this.b = list;
        this.c = bArr;
    }

    public final List a() {
        return this.b;
    }

    public final a b() {
        return this.a;
    }

    public final byte[] c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(s60.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type com.datadog.android.core.internal.persistence.BatchData");
        s60 s60Var = (s60) obj;
        if (!zq3.c(this.a, s60Var.a) || !zq3.c(this.b, s60Var.b)) {
            return false;
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            byte[] bArr2 = s60Var.c;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (s60Var.c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        byte[] bArr = this.c;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "BatchData(id=" + this.a + ", data=" + this.b + ", metadata=" + Arrays.toString(this.c) + ")";
    }
}
