package io.opentelemetry.context;

import defpackage.hx0;
import defpackage.qx0;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class a implements hx0 {
    private static final hx0 b = new a(new Object[0]);
    private final Object[] a;

    private a(Object[] objArr) {
        this.a = objArr;
    }

    static hx0 root() {
        return b;
    }

    @Override // defpackage.hx0
    public Object a(qx0 qx0Var) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == qx0Var) {
                return objArr[i + 1];
            }
            i += 2;
        }
    }

    @Override // defpackage.hx0
    public hx0 b(qx0 qx0Var, Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = qx0Var;
                copyOf[copyOf.length - 1] = obj;
                return new a(copyOf);
            }
            if (objArr[i] == qx0Var) {
                int i2 = i + 1;
                if (objArr[i2] == obj) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i2] = obj;
                return new a(objArr2);
            }
            i += 2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(this.a[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
