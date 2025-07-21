package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c08;
import defpackage.y31;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a08 extends rs7 {
    private static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean o;
    private final b08 p;
    private Map q;
    private float r;
    private float s;

    public a08(List list) {
        super("SsaDecoder");
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.o = false;
            this.p = null;
            return;
        }
        this.o = true;
        String E = z19.E((byte[]) list.get(0));
        ur.a(E.startsWith("Format:"));
        this.p = (b08) ur.e(b08.a(E));
        H(new yo5((byte[]) list.get(1)), zj0.c);
    }

    private static int B(long j, List list, List list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static float C(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static y31 D(String str, c08 c08Var, c08.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        y31.b o = new y31.b().o(spannableString);
        if (c08Var != null) {
            if (c08Var.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(c08Var.c.intValue()), 0, spannableString.length(), 33);
            }
            if (c08Var.j == 3 && c08Var.d != null) {
                spannableString.setSpan(new BackgroundColorSpan(c08Var.d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = c08Var.e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                o.q(f3 / f2, 1);
            }
            boolean z = c08Var.f;
            if (z && c08Var.g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c08Var.g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c08Var.h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c08Var.i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.a;
        if (i == -1) {
            i = c08Var != null ? c08Var.b : -1;
        }
        o.p(N(i)).l(M(i)).i(L(i));
        PointF pointF = bVar.b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            o.k(C(o.d()));
            o.h(C(o.c()), 0);
        } else {
            o.k(pointF.x / f);
            o.h(bVar.b.y / f2, 0);
        }
        return o.a();
    }

    private Charset E(yo5 yo5Var) {
        Charset P = yo5Var.P();
        return P != null ? P : zj0.c;
    }

    private void F(String str, b08 b08Var, List list, List list2) {
        int i;
        ur.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", b08Var.e);
        if (split.length != b08Var.e) {
            a84.j("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long K = K(split[b08Var.a]);
        if (K == -9223372036854775807L) {
            a84.j("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long K2 = K(split[b08Var.b]);
        if (K2 == -9223372036854775807L) {
            a84.j("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.q;
        c08 c08Var = (map == null || (i = b08Var.c) == -1) ? null : (c08) map.get(split[i].trim());
        String str2 = split[b08Var.d];
        y31 D = D(c08.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c08Var, c08.b.b(str2), this.r, this.s);
        int B = B(K2, list2, list);
        for (int B2 = B(K, list2, list); B2 < B; B2++) {
            ((List) list.get(B2)).add(D);
        }
    }

    private void G(yo5 yo5Var, List list, List list2, Charset charset) {
        b08 b08Var = this.o ? this.p : null;
        while (true) {
            String t2 = yo5Var.t(charset);
            if (t2 == null) {
                return;
            }
            if (t2.startsWith("Format:")) {
                b08Var = b08.a(t2);
            } else if (t2.startsWith("Dialogue:")) {
                if (b08Var == null) {
                    a84.j("SsaDecoder", "Skipping dialogue line before complete format: " + t2);
                } else {
                    F(t2, b08Var, list, list2);
                }
            }
        }
    }

    private void H(yo5 yo5Var, Charset charset) {
        while (true) {
            String t2 = yo5Var.t(charset);
            if (t2 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(t2)) {
                I(yo5Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(t2)) {
                this.q = J(yo5Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(t2)) {
                a84.g("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(t2)) {
                return;
            }
        }
    }

    private void I(yo5 yo5Var, Charset charset) {
        while (true) {
            String t2 = yo5Var.t(charset);
            if (t2 == null) {
                return;
            }
            if (yo5Var.a() != 0 && yo5Var.h(charset) == '[') {
                return;
            }
            String[] split = t2.split(":");
            if (split.length == 2) {
                String e = tr.e(split[0].trim());
                e.hashCode();
                if (e.equals("playresx")) {
                    this.r = Float.parseFloat(split[1].trim());
                } else if (e.equals("playresy")) {
                    try {
                        this.s = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map J(yo5 yo5Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c08.a aVar = null;
        while (true) {
            String t2 = yo5Var.t(charset);
            if (t2 == null || (yo5Var.a() != 0 && yo5Var.h(charset) == '[')) {
                break;
            }
            if (t2.startsWith("Format:")) {
                aVar = c08.a.a(t2);
            } else if (t2.startsWith("Style:")) {
                if (aVar == null) {
                    a84.j("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + t2);
                } else {
                    c08 b = c08.b(t2, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) z19.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) z19.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) z19.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) z19.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int L(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                a84.j("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    private static int M(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                a84.j("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    private static Layout.Alignment N(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                a84.j("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yo5 yo5Var = new yo5(bArr, i);
        Charset E = E(yo5Var);
        if (!this.o) {
            H(yo5Var, E);
        }
        G(yo5Var, arrayList, arrayList2, E);
        return new d08(arrayList, arrayList2);
    }
}
