package defpackage;

import androidx.compose.ui.text.a;

/* loaded from: classes.dex */
public final class ar8 {
    private final a a;
    private final id5 b;

    public ar8(a aVar, id5 id5Var) {
        this.a = aVar;
        this.b = id5Var;
    }

    public final id5 a() {
        return this.b;
    }

    public final a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar8)) {
            return false;
        }
        ar8 ar8Var = (ar8) obj;
        return zq3.c(this.a, ar8Var.a) && zq3.c(this.b, ar8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
