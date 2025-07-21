package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class gw3 {
    public static final gw3 c = new gw3("COMPOSITION");
    private final List a;
    private hw3 b;

    public gw3(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        return ((String) this.a.get(r1.size() - 1)).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public gw3 a(String str) {
        gw3 gw3Var = new gw3(this);
        gw3Var.a.add(str);
        return gw3Var;
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = (String) this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) this.a.get(i + 1)).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.a.size() - 1) {
            return false;
        }
        return ((String) this.a.get(i2)).equals(str);
    }

    public hw3 d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.a.get(i)).equals("**")) {
            return (i != this.a.size() - 1 && ((String) this.a.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gw3 gw3Var = (gw3) obj;
        if (!this.a.equals(gw3Var.a)) {
            return false;
        }
        hw3 hw3Var = this.b;
        return hw3Var != null ? hw3Var.equals(gw3Var.b) : gw3Var.b == null;
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return ((String) this.a.get(i)).equals(str) || ((String) this.a.get(i)).equals("**") || ((String) this.a.get(i)).equals("*");
    }

    public boolean h(String str, int i) {
        return "__container".equals(str) || i < this.a.size() - 1 || ((String) this.a.get(i)).equals("**");
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hw3 hw3Var = this.b;
        return hashCode + (hw3Var != null ? hw3Var.hashCode() : 0);
    }

    public gw3 i(hw3 hw3Var) {
        gw3 gw3Var = new gw3(this);
        gw3Var.b = hw3Var;
        return gw3Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    private gw3(gw3 gw3Var) {
        this.a = new ArrayList(gw3Var.a);
        this.b = gw3Var.b;
    }
}
