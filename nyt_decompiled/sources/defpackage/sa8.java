package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.y31;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class sa8 extends rs7 {
    private static final Pattern q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern r = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder o;
    private final ArrayList p;

    public sa8() {
        super("SubripDecoder");
        this.o = new StringBuilder();
        this.p = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private y31 B(Spanned spanned, String str) {
        char c;
        char c2;
        y31.b o = new y31.b().o(spanned);
        if (str == null) {
            return o.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            o.l(0);
        } else if (c == 3 || c == 4 || c == 5) {
            o.l(2);
        } else {
            o.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            o.i(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            o.i(0);
        } else {
            o.i(1);
        }
        return o.k(D(o.d())).h(D(o.c()), 0).a();
    }

    private Charset C(yo5 yo5Var) {
        Charset P = yo5Var.P();
        return P != null ? P : zj0.c;
    }

    static float D(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long E(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * AbraPackageKt.MS_IN_HOUR : 0L) + (Long.parseLong((String) ur.e(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) ur.e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        va4 va4Var = new va4();
        yo5 yo5Var = new yo5(bArr, i);
        Charset C = C(yo5Var);
        while (true) {
            String t = yo5Var.t(C);
            int i2 = 0;
            if (t == null) {
                break;
            }
            if (t.length() != 0) {
                try {
                    Integer.parseInt(t);
                    String t2 = yo5Var.t(C);
                    if (t2 == null) {
                        a84.j("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = q.matcher(t2);
                    if (matcher.matches()) {
                        va4Var.a(E(matcher, 1));
                        va4Var.a(E(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (String t3 = yo5Var.t(C); !TextUtils.isEmpty(t3); t3 = yo5Var.t(C)) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(F(t3, this.p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.o.toString());
                        while (true) {
                            if (i2 >= this.p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(y31.u);
                    } else {
                        a84.j("SubripDecoder", "Skipping invalid timing: " + t2);
                    }
                } catch (NumberFormatException unused) {
                    a84.j("SubripDecoder", "Skipping invalid index: " + t);
                }
            }
        }
        return new ta8((y31[]) arrayList.toArray(new y31[0]), va4Var.d());
    }
}
