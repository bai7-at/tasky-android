package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public final class bu3 {
    private Object[] a = new Object[8];
    private int[] b;
    private int c;

    private static final class a {
        public static final a a = new a();

        private a() {
        }
    }

    public bu3() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.b = iArr;
        this.c = -1;
    }

    private final void e() {
        int i = this.c * 2;
        Object[] copyOf = Arrays.copyOf(this.a, i);
        zq3.g(copyOf, "copyOf(this, newSize)");
        this.a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.b, i);
        zq3.g(copyOf2, "copyOf(this, newSize)");
        this.b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!zq3.c(serialDescriptor.d(), a.b.a)) {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(InstructionFileId.DOT);
                        sb.append(serialDescriptor.f(i3));
                    }
                } else if (this.b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != a.a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void b() {
        int i = this.c;
        int[] iArr = this.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.c = i - 1;
        }
        int i2 = this.c;
        if (i2 != -1) {
            this.c = i2 - 1;
        }
    }

    public final void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, QueryKeys.SITE_VISIT_DEPTH);
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.length) {
            e();
        }
        this.a[i] = serialDescriptor;
    }

    public final void d() {
        int[] iArr = this.b;
        int i = this.c;
        if (iArr[i] == -2) {
            this.a[i] = a.a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.b;
        int i = this.c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.c = i2;
            if (i2 == this.a.length) {
                e();
            }
        }
        Object[] objArr = this.a;
        int i3 = this.c;
        objArr[i3] = obj;
        this.b[i3] = -2;
    }

    public final void g(int i) {
        this.b[this.c] = i;
    }

    public String toString() {
        return a();
    }
}
