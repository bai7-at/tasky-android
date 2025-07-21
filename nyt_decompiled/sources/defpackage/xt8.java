package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class xt8 {
    public static void a(Spannable spannable, int i, int i2, yt8 yt8Var, vt8 vt8Var, Map map, int i3) {
        vt8 e;
        yt8 f;
        int i4;
        if (yt8Var.l() != -1) {
            spannable.setSpan(new StyleSpan(yt8Var.l()), i, i2, 33);
        }
        if (yt8Var.s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (yt8Var.t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (yt8Var.q()) {
            ky7.a(spannable, new ForegroundColorSpan(yt8Var.c()), i, i2, 33);
        }
        if (yt8Var.p()) {
            ky7.a(spannable, new BackgroundColorSpan(yt8Var.b()), i, i2, 33);
        }
        if (yt8Var.d() != null) {
            ky7.a(spannable, new TypefaceSpan(yt8Var.d()), i, i2, 33);
        }
        if (yt8Var.o() != null) {
            ai8 ai8Var = (ai8) ur.e(yt8Var.o());
            int i5 = ai8Var.a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = ai8Var.b;
            }
            int i6 = ai8Var.c;
            if (i6 == -2) {
                i6 = 1;
            }
            ky7.a(spannable, new bi8(i5, i4, i6), i, i2, 33);
        }
        int j = yt8Var.j();
        if (j == 2) {
            vt8 d = d(vt8Var, map);
            if (d != null && (e = e(d, map)) != null) {
                if (e.g() != 1 || e.f(0).b == null) {
                    a84.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) z19.j(e.f(0).b);
                    yt8 f2 = f(e.f, e.l(), map);
                    int i7 = f2 != null ? f2.i() : -1;
                    if (i7 == -1 && (f = f(d.f, d.l(), map)) != null) {
                        i7 = f.i();
                    }
                    spannable.setSpan(new h47(str, i7), i, i2, 33);
                }
            }
        } else if (j == 3 || j == 4) {
            spannable.setSpan(new cm1(), i, i2, 33);
        }
        if (yt8Var.n()) {
            ky7.a(spannable, new ia3(), i, i2, 33);
        }
        int f3 = yt8Var.f();
        if (f3 == 1) {
            ky7.a(spannable, new AbsoluteSizeSpan((int) yt8Var.e(), true), i, i2, 33);
        } else if (f3 == 2) {
            ky7.a(spannable, new RelativeSizeSpan(yt8Var.e()), i, i2, 33);
        } else {
            if (f3 != 3) {
                return;
            }
            ky7.a(spannable, new RelativeSizeSpan(yt8Var.e() / 100.0f), i, i2, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static vt8 d(vt8 vt8Var, Map map) {
        while (vt8Var != null) {
            yt8 f = f(vt8Var.f, vt8Var.l(), map);
            if (f != null && f.j() == 1) {
                return vt8Var;
            }
            vt8Var = vt8Var.j;
        }
        return null;
    }

    private static vt8 e(vt8 vt8Var, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(vt8Var);
        while (!arrayDeque.isEmpty()) {
            vt8 vt8Var2 = (vt8) arrayDeque.pop();
            yt8 f = f(vt8Var2.f, vt8Var2.l(), map);
            if (f != null && f.j() == 3) {
                return vt8Var2;
            }
            for (int g = vt8Var2.g() - 1; g >= 0; g--) {
                arrayDeque.push(vt8Var2.f(g));
            }
        }
        return null;
    }

    public static yt8 f(yt8 yt8Var, String[] strArr, Map map) {
        int i = 0;
        if (yt8Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (yt8) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                yt8 yt8Var2 = new yt8();
                int length = strArr.length;
                while (i < length) {
                    yt8Var2.a((yt8) map.get(strArr[i]));
                    i++;
                }
                return yt8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return yt8Var.a((yt8) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    yt8Var.a((yt8) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return yt8Var;
    }
}
