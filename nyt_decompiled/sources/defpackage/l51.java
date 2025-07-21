package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.comscore.streaming.ContentDistributionModel;

/* loaded from: classes.dex */
public class l51 {
    String a;
    private int b;
    private int c;
    private float d;
    private String e;
    boolean f;

    public l51(l51 l51Var) {
        this.c = RecyclerView.UNDEFINED_DURATION;
        this.d = Float.NaN;
        this.e = null;
        this.a = l51Var.a;
        this.b = l51Var.b;
        this.c = l51Var.c;
        this.d = l51Var.d;
        this.e = l51Var.e;
        this.f = l51Var.f;
    }

    public static String a(int i) {
        return "#" + ("00000000" + Integer.toHexString(i)).substring(r2.length() - 8);
    }

    public l51 b() {
        return new l51(this);
    }

    public boolean c() {
        return this.f;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.e;
    }

    public int h() {
        return this.b;
    }

    public void i(float f) {
        this.d = f;
    }

    public void j(int i) {
        this.c = i;
    }

    public String toString() {
        String str = this.a + ':';
        switch (this.b) {
            case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                return str + this.c;
            case ContentDistributionModel.TV_AND_ONLINE /* 901 */:
                return str + this.d;
            case ContentDistributionModel.EXCLUSIVELY_ONLINE /* 902 */:
                return str + a(this.c);
            case 903:
                return str + this.e;
            case 904:
                return str + Boolean.valueOf(this.f);
            case 905:
                return str + this.d;
            default:
                return str + "????";
        }
    }

    public l51(String str, int i, int i2) {
        this.c = RecyclerView.UNDEFINED_DURATION;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    public l51(String str, int i, float f) {
        this.c = RecyclerView.UNDEFINED_DURATION;
        this.e = null;
        this.a = str;
        this.b = i;
        this.d = f;
    }
}
