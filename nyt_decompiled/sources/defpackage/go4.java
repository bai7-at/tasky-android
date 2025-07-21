package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
abstract class go4 implements eo4 {
    private String a;
    private int b;
    private int c;

    go4(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        go4 go4Var = (go4) obj;
        return (this.b < 0 || go4Var.b < 0) ? TextUtils.equals(this.a, go4Var.a) && this.c == go4Var.c : TextUtils.equals(this.a, go4Var.a) && this.b == go4Var.b && this.c == go4Var.c;
    }

    public int hashCode() {
        return ic5.b(this.a, Integer.valueOf(this.c));
    }
}
