package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class bp6 {
    private static final a c = new a(null);
    private static final byte[] d = new byte[0];
    private final byte[] a;
    private final byte[] b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public bp6(byte[] bArr, byte[] bArr2) {
        zq3.h(bArr, "data");
        zq3.h(bArr2, "metadata");
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(bp6.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type com.datadog.android.api.storage.RawBatchEvent");
        bp6 bp6Var = (bp6) obj;
        return Arrays.equals(this.a, bp6Var.a) && Arrays.equals(this.b, bp6Var.b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        return "RawBatchEvent(data=" + Arrays.toString(this.a) + ", metadata=" + Arrays.toString(this.b) + ")";
    }

    public /* synthetic */ bp6(byte[] bArr, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? d : bArr2);
    }
}
