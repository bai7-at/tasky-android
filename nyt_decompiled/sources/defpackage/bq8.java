package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bq8 {
    public final int a;
    private final aq8[] b;
    private int c;

    public bq8(aq8... aq8VarArr) {
        this.b = aq8VarArr;
        this.a = aq8VarArr.length;
    }

    public aq8 a(int i) {
        return this.b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bq8.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((bq8) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
