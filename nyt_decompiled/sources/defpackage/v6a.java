package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.chartbeat.androidsdk.QueryKeys;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class v6a {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r4.equals(com.chartbeat.androidsdk.QueryKeys.VIEW_TITLE) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6a.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static zzc b(String str) {
        u6a u6aVar = new u6a();
        h(str, u6aVar);
        return u6aVar.a();
    }

    public static o6a c(b9e b9eVar, List list) {
        Charset charset = ege.c;
        String N = b9eVar.N(charset);
        if (N != null) {
            Pattern pattern = a;
            Matcher matcher = pattern.matcher(N);
            if (matcher.matches()) {
                return e(null, matcher, b9eVar, list);
            }
            String N2 = b9eVar.N(charset);
            if (N2 != null) {
                Matcher matcher2 = pattern.matcher(N2);
                if (matcher2.matches()) {
                    return e(N.trim(), matcher2, b9eVar, list);
                }
            }
        }
        return null;
    }

    private static int d(List list, String str, s6a s6aVar) {
        List f = f(list, str, s6aVar);
        for (int i = 0; i < f.size(); i++) {
            i6a i6aVar = ((t6a) f.get(i)).b;
            if (i6aVar.f() != -1) {
                return i6aVar.f();
            }
        }
        return -1;
    }

    private static o6a e(String str, Matcher matcher, b9e b9eVar, List list) {
        u6a u6aVar = new u6a();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            u6aVar.a = x6a.b(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            u6aVar.b = x6a.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            h(group3, u6aVar);
            StringBuilder sb = new StringBuilder();
            String N = b9eVar.N(ege.c);
            while (!TextUtils.isEmpty(N)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(N.trim());
                N = b9eVar.N(ege.c);
            }
            u6aVar.c = a(str, sb.toString(), list);
            return new o6a(u6aVar.a().p(), u6aVar.a, u6aVar.b);
        } catch (NumberFormatException unused) {
            ezd.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List f(List list, String str, s6a s6aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i6a i6aVar = (i6a) list.get(i);
            int g = i6aVar.g(str, s6aVar.a, s6aVar.d, s6aVar.c);
            if (g > 0) {
                arrayList.add(new t6a(g, i6aVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void g(String str, s6a s6aVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        Comparator comparator;
        s6a s6aVar2;
        s6a s6aVar3;
        s6a s6aVar4;
        int i;
        int i2 = s6aVar.b;
        int length = spannableStringBuilder.length();
        String str2 = s6aVar.a;
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals(QueryKeys.VIEW_TITLE)) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 5;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals(QueryKeys.TIME_ON_VIEW_IN_MINUTES)) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals(QueryKeys.INTERNAL_REFERRER)) {
                c2 = 6;
            }
            c2 = 65535;
        } else {
            if (str2.equals(QueryKeys.USER_ID)) {
                c2 = 3;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int d2 = d(list2, str, s6aVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = r6a.c;
                Collections.sort(arrayList, comparator);
                int i4 = s6aVar.b;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    s6aVar2 = ((r6a) arrayList.get(i5)).a;
                    if ("rt".equals(s6aVar2.a)) {
                        r6a r6aVar = (r6a) arrayList.get(i5);
                        s6aVar3 = r6aVar.a;
                        int d3 = d(list2, str, s6aVar3);
                        if (d3 == i3) {
                            d3 = d2 != i3 ? d2 : 1;
                        }
                        s6aVar4 = r6aVar.a;
                        int i7 = s6aVar4.b - i6;
                        i = r6aVar.b;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new s7d(subSequence.toString(), d3), i4, i7, 33);
                        i6 += subSequence.length();
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : s6aVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List f = f(list2, str, s6aVar);
        for (int i9 = 0; i9 < f.size(); i9++) {
            i6a i6aVar = ((t6a) f.get(i9)).b;
            if (i6aVar != null) {
                if (i6aVar.h() != -1) {
                    u8d.a(spannableStringBuilder, new StyleSpan(i6aVar.h()), i2, length, 33);
                }
                if (i6aVar.A()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (i6aVar.z()) {
                    u8d.a(spannableStringBuilder, new ForegroundColorSpan(i6aVar.d()), i2, length, 33);
                }
                if (i6aVar.y()) {
                    u8d.a(spannableStringBuilder, new BackgroundColorSpan(i6aVar.c()), i2, length, 33);
                }
                if (i6aVar.s() != null) {
                    u8d.a(spannableStringBuilder, new TypefaceSpan(i6aVar.s()), i2, length, 33);
                }
                int e = i6aVar.e();
                if (e == 1) {
                    u8d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) i6aVar.b(), true), i2, length, 33);
                } else if (e == 2) {
                    u8d.a(spannableStringBuilder, new RelativeSizeSpan(i6aVar.b()), i2, length, 33);
                } else if (e == 3) {
                    u8d.a(spannableStringBuilder, new RelativeSizeSpan(i6aVar.b() / 100.0f), i2, length, 33);
                }
                if (i6aVar.x()) {
                    spannableStringBuilder.setSpan(new q6d(), i2, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void h(String str, u6a u6aVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c2 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            i2 = 0;
                        } else if (c2 == 1 || c2 == 2) {
                            i2 = 1;
                        } else if (c2 != 3) {
                            ezd.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i2 = RecyclerView.UNDEFINED_DURATION;
                        }
                        u6aVar.g = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        u6aVar.e = x6a.a(group2);
                        u6aVar.f = 0;
                    } else {
                        u6aVar.e = Integer.parseInt(group2);
                        u6aVar.f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2 && c2 != 3) {
                                if (c2 == 4) {
                                    i = 3;
                                } else if (c2 != 5) {
                                    ezd.f("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    u6aVar.d = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            i = 0;
                        } else if (c2 != 2 && c2 != 3) {
                            if (c2 == 4 || c2 == 5) {
                                i = 2;
                            } else {
                                ezd.f("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = RecyclerView.UNDEFINED_DURATION;
                            }
                        }
                        u6aVar.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    u6aVar.h = x6a.a(group2);
                } else if ("size".equals(group)) {
                    u6aVar.j = x6a.a(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c2 = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            ezd.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = RecyclerView.UNDEFINED_DURATION;
                        } else {
                            i = 2;
                        }
                    }
                    u6aVar.k = i;
                } else {
                    ezd.f("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                ezd.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
