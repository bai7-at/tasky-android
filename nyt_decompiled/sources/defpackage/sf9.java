package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class sf9 {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final yo5 a = new yo5();
    private final StringBuilder b = new StringBuilder();

    private void a(tf9 tf9Var, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                tf9Var.z((String) ur.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] V0 = z19.V0(str, "\\.");
        String str2 = V0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            tf9Var.y(str2.substring(0, indexOf2));
            tf9Var.x(str2.substring(indexOf2 + 1));
        } else {
            tf9Var.y(str2);
        }
        if (V0.length > 1) {
            tf9Var.w((String[]) z19.J0(V0, 1, V0.length));
        }
    }

    private static boolean b(yo5 yo5Var) {
        int f = yo5Var.f();
        int g = yo5Var.g();
        byte[] e = yo5Var.e();
        if (f + 2 > g) {
            return false;
        }
        int i = f + 1;
        if (e[f] != 47) {
            return false;
        }
        int i2 = f + 2;
        if (e[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= g) {
                yo5Var.V(g - yo5Var.f());
                return true;
            }
            if (((char) e[i2]) == '*' && ((char) e[i3]) == '/') {
                i2 += 2;
                g = i2;
            } else {
                i2 = i3;
            }
        }
    }

    private static boolean c(yo5 yo5Var) {
        char k = k(yo5Var, yo5Var.f());
        if (k != '\t' && k != '\n' && k != '\f' && k != '\r' && k != ' ') {
            return false;
        }
        yo5Var.V(1);
        return true;
    }

    private static void e(String str, tf9 tf9Var) {
        Matcher matcher = d.matcher(tr.e(str));
        if (!matcher.matches()) {
            a84.j("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) ur.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                tf9Var.t(3);
                break;
            case "em":
                tf9Var.t(2);
                break;
            case "px":
                tf9Var.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        tf9Var.s(Float.parseFloat((String) ur.e(matcher.group(1))));
    }

    private static String f(yo5 yo5Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int f = yo5Var.f();
        int g = yo5Var.g();
        while (f < g && !z) {
            char c2 = (char) yo5Var.e()[f];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                f++;
                sb.append(c2);
            }
        }
        yo5Var.V(f - yo5Var.f());
        return sb.toString();
    }

    static String g(yo5 yo5Var, StringBuilder sb) {
        n(yo5Var);
        if (yo5Var.a() == 0) {
            return null;
        }
        String f = f(yo5Var, sb);
        if (!"".equals(f)) {
            return f;
        }
        return "" + ((char) yo5Var.H());
    }

    private static String h(yo5 yo5Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int f = yo5Var.f();
            String g = g(yo5Var, sb);
            if (g == null) {
                return null;
            }
            if ("}".equals(g) || ";".equals(g)) {
                yo5Var.U(f);
                z = true;
            } else {
                sb2.append(g);
            }
        }
        return sb2.toString();
    }

    private static String i(yo5 yo5Var, StringBuilder sb) {
        n(yo5Var);
        if (yo5Var.a() < 5 || !"::cue".equals(yo5Var.E(5))) {
            return null;
        }
        int f = yo5Var.f();
        String g = g(yo5Var, sb);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            yo5Var.U(f);
            return "";
        }
        String l = "(".equals(g) ? l(yo5Var) : null;
        if (")".equals(g(yo5Var, sb))) {
            return l;
        }
        return null;
    }

    private static void j(yo5 yo5Var, tf9 tf9Var, StringBuilder sb) {
        n(yo5Var);
        String f = f(yo5Var, sb);
        if (!"".equals(f) && ":".equals(g(yo5Var, sb))) {
            n(yo5Var);
            String h = h(yo5Var, sb);
            if (h == null || "".equals(h)) {
                return;
            }
            int f2 = yo5Var.f();
            String g = g(yo5Var, sb);
            if (!";".equals(g)) {
                if (!"}".equals(g)) {
                    return;
                } else {
                    yo5Var.U(f2);
                }
            }
            if ("color".equals(f)) {
                tf9Var.q(bo0.b(h));
                return;
            }
            if ("background-color".equals(f)) {
                tf9Var.n(bo0.b(h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(f)) {
                if ("over".equals(h)) {
                    tf9Var.v(1);
                    return;
                } else {
                    if ("under".equals(h)) {
                        tf9Var.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f)) {
                if (!"all".equals(h) && !h.startsWith("digits")) {
                    z = false;
                }
                tf9Var.p(z);
                return;
            }
            if ("text-decoration".equals(f)) {
                if ("underline".equals(h)) {
                    tf9Var.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f)) {
                tf9Var.r(h);
                return;
            }
            if ("font-weight".equals(f)) {
                if ("bold".equals(h)) {
                    tf9Var.o(true);
                }
            } else if ("font-style".equals(f)) {
                if ("italic".equals(h)) {
                    tf9Var.u(true);
                }
            } else if ("font-size".equals(f)) {
                e(h, tf9Var);
            }
        }
    }

    private static char k(yo5 yo5Var, int i) {
        return (char) yo5Var.e()[i];
    }

    private static String l(yo5 yo5Var) {
        int f = yo5Var.f();
        int g = yo5Var.g();
        boolean z = false;
        while (f < g && !z) {
            int i = f + 1;
            z = ((char) yo5Var.e()[f]) == ')';
            f = i;
        }
        return yo5Var.E((f - 1) - yo5Var.f()).trim();
    }

    static void m(yo5 yo5Var) {
        while (!TextUtils.isEmpty(yo5Var.s())) {
        }
    }

    static void n(yo5 yo5Var) {
        while (true) {
            for (boolean z = true; yo5Var.a() > 0 && z; z = false) {
                if (!c(yo5Var) && !b(yo5Var)) {
                }
            }
            return;
        }
    }

    public List d(yo5 yo5Var) {
        this.b.setLength(0);
        int f = yo5Var.f();
        m(yo5Var);
        this.a.S(yo5Var.e(), yo5Var.f());
        this.a.U(f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = i(this.a, this.b);
            if (i == null || !"{".equals(g(this.a, this.b))) {
                return arrayList;
            }
            tf9 tf9Var = new tf9();
            a(tf9Var, i);
            String str = null;
            boolean z = false;
            while (!z) {
                int f2 = this.a.f();
                String g = g(this.a, this.b);
                boolean z2 = g == null || "}".equals(g);
                if (!z2) {
                    this.a.U(f2);
                    j(this.a, tf9Var, this.b);
                }
                str = g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(tf9Var);
            }
        }
    }
}
