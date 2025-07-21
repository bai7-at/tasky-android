package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.comscore.streaming.ContentDistributionModel;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ig9 {
    public static float u = Float.NaN;
    public ConstraintWidget a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final HashMap s;
    public String t;

    public ig9(ConstraintWidget constraintWidget) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = constraintWidget;
    }

    private static void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    private static void b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    private void e(StringBuilder sb, ConstraintAnchor.Type type2) {
        ConstraintAnchor o = this.a.o(type2);
        if (o == null || o.f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(type2.name());
        sb.append(": ['");
        String str = o.f.h().o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(o.f.k().name());
        sb.append("', '");
        sb.append(o.g);
        sb.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    public StringBuilder d(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, "left", this.b);
        b(sb, "top", this.c);
        b(sb, "right", this.d);
        b(sb, "bottom", this.e);
        a(sb, "pivotX", this.f);
        a(sb, "pivotY", this.g);
        a(sb, "rotationX", this.h);
        a(sb, "rotationY", this.i);
        a(sb, "rotationZ", this.j);
        a(sb, "translationX", this.k);
        a(sb, "translationY", this.l);
        a(sb, "translationZ", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.o);
        a(sb, "alpha", this.p);
        b(sb, "visibility", this.r);
        a(sb, "interpolatedPos", this.q);
        if (this.a != null) {
            for (ConstraintAnchor.Type type2 : ConstraintAnchor.Type.values()) {
                e(sb, type2);
            }
        }
        if (z) {
            a(sb, "phone_orientation", u);
        }
        if (z) {
            a(sb, "phone_orientation", u);
        }
        if (this.s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.s.keySet()) {
                l51 l51Var = (l51) this.s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (l51Var.h()) {
                    case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                        sb.append(l51Var.e());
                        sb.append(",\n");
                        break;
                    case ContentDistributionModel.TV_AND_ONLINE /* 901 */:
                    case 905:
                        sb.append(l51Var.d());
                        sb.append(",\n");
                        break;
                    case ContentDistributionModel.EXCLUSIVELY_ONLINE /* 902 */:
                        sb.append("'");
                        sb.append(l51.a(l51Var.e()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(l51Var.g());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(l51Var.c());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void f(String str, int i, float f) {
        if (this.s.containsKey(str)) {
            ((l51) this.s.get(str)).i(f);
        } else {
            this.s.put(str, new l51(str, i, f));
        }
    }

    public void g(String str, int i, int i2) {
        if (this.s.containsKey(str)) {
            ((l51) this.s.get(str)).j(i2);
        } else {
            this.s.put(str, new l51(str, i, i2));
        }
    }

    public ig9 h() {
        ConstraintWidget constraintWidget = this.a;
        if (constraintWidget != null) {
            this.b = constraintWidget.E();
            this.c = this.a.S();
            this.d = this.a.N();
            this.e = this.a.r();
            i(this.a.n);
        }
        return this;
    }

    public void i(ig9 ig9Var) {
        this.f = ig9Var.f;
        this.g = ig9Var.g;
        this.h = ig9Var.h;
        this.i = ig9Var.i;
        this.j = ig9Var.j;
        this.k = ig9Var.k;
        this.l = ig9Var.l;
        this.m = ig9Var.m;
        this.n = ig9Var.n;
        this.o = ig9Var.o;
        this.p = ig9Var.p;
        this.r = ig9Var.r;
        this.s.clear();
        for (l51 l51Var : ig9Var.s.values()) {
            this.s.put(l51Var.f(), l51Var.b());
        }
    }

    public ig9(ig9 ig9Var) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = ig9Var.a;
        this.b = ig9Var.b;
        this.c = ig9Var.c;
        this.d = ig9Var.d;
        this.e = ig9Var.e;
        i(ig9Var);
    }
}
