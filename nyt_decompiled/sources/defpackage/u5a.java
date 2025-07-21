package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgaa;
import com.nytimes.android.abra.models.AbraPackageKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u5a implements t4a {
    private static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder a = new StringBuilder();
    private final ArrayList b = new ArrayList();
    private final b9e c = new b9e();

    public static float b(int i) {
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

    private static long c(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * AbraPackageKt.MS_IN_HOUR : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i, int i2, s4a s4aVar, pgd pgdVar) {
        String str;
        char c;
        char c2;
        int i3;
        e2d p;
        u5a u5aVar = this;
        u5aVar.c.i(bArr, i + i2);
        u5aVar.c.k(i);
        Charset b = u5aVar.c.b();
        if (b == null) {
            b = ege.c;
        }
        while (true) {
            String N = u5aVar.c.N(b);
            if (N == null) {
                return;
            }
            if (N.length() != 0) {
                try {
                    Integer.parseInt(N);
                    String N2 = u5aVar.c.N(b);
                    if (N2 == null) {
                        ezd.f("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = d.matcher(N2);
                    if (matcher.matches()) {
                        long c3 = c(matcher, 1);
                        long c4 = c(matcher, 6);
                        int i4 = 0;
                        u5aVar.a.setLength(0);
                        u5aVar.b.clear();
                        String N3 = u5aVar.c.N(b);
                        while (!TextUtils.isEmpty(N3)) {
                            if (u5aVar.a.length() > 0) {
                                u5aVar.a.append("<br>");
                            }
                            StringBuilder sb = u5aVar.a;
                            ArrayList arrayList = u5aVar.b;
                            String trim = N3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = e.matcher(trim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i5;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i5 += length;
                            }
                            sb.append(sb2.toString());
                            N3 = u5aVar.c.N(b);
                            i4 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(u5aVar.a.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 < u5aVar.b.size()) {
                                str = (String) u5aVar.b.get(i6);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i6++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzc zzcVar = new zzc();
                        zzcVar.l(fromHtml);
                        if (str == null) {
                            p = zzcVar.p();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c = 0;
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
                                zzcVar.i(0);
                            } else if (c == 3 || c == 4 || c == 5) {
                                zzcVar.i(2);
                            } else {
                                zzcVar.i(1);
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
                            if (c2 == 0 || c2 == 1) {
                                i3 = 2;
                            } else if (c2 != 2) {
                                if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    zzcVar.f(0);
                                } else {
                                    zzcVar.f(1);
                                }
                                zzcVar.h(b(zzcVar.b()));
                                zzcVar.e(b(zzcVar.a()), 0);
                                p = zzcVar.p();
                            } else {
                                i3 = 2;
                            }
                            zzcVar.f(i3);
                            zzcVar.h(b(zzcVar.b()));
                            zzcVar.e(b(zzcVar.a()), 0);
                            p = zzcVar.p();
                        }
                        pgdVar.zza(new m4a(zzgaa.u(p), c3, c4 - c3));
                    } else {
                        ezd.f("SubripParser", "Skipping invalid timing: ".concat(N2));
                    }
                } catch (NumberFormatException unused) {
                    ezd.f("SubripParser", "Skipping invalid index: ".concat(N));
                }
            }
            u5aVar = this;
        }
    }
}
