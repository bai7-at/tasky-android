package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.c;
import com.google.common.collect.ImmutableMap;
import defpackage.bi8;
import defpackage.h47;
import defpackage.ia3;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class c {
    private static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static class b {
        public final String a;
        public final Map b;

        private b(String str, Map map) {
            this.a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$c, reason: collision with other inner class name */
    static final class C0193c {
        private static final Comparator e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e2;
                e2 = c.C0193c.e((c.C0193c) obj, (c.C0193c) obj2);
                return e2;
            }
        };
        private static final Comparator f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f2;
                f2 = c.C0193c.f((c.C0193c) obj, (c.C0193c) obj2);
                return f2;
            }
        };
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(C0193c c0193c, C0193c c0193c2) {
            int compare = Integer.compare(c0193c2.b, c0193c.b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c0193c.c.compareTo(c0193c2.c);
            return compareTo != 0 ? compareTo : c0193c.d.compareTo(c0193c2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(C0193c c0193c, C0193c c0193c2) {
            int compare = Integer.compare(c0193c2.a, c0193c.a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c0193c2.c.compareTo(c0193c.c);
            return compareTo != 0 ? compareTo : c0193c2.d.compareTo(c0193c.d);
        }

        private C0193c(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    private static final class d {
        private final List a = new ArrayList();
        private final List b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", ImmutableMap.o());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), ImmutableMap.o());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            hashMap.put(com.google.android.exoplayer2.ui.b.a("bg_" + intValue), z19.D("background-color:%s;", com.google.android.exoplayer2.ui.b.b(intValue)));
        }
        SparseArray c = c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < c.size()) {
            int keyAt = c.keyAt(i);
            sb.append(b(spanned.subSequence(i2, keyAt)));
            d dVar = (d) c.get(keyAt);
            Collections.sort(dVar.b, C0193c.f);
            Iterator it3 = dVar.b.iterator();
            while (it3.hasNext()) {
                sb.append(((C0193c) it3.next()).d);
            }
            Collections.sort(dVar.a, C0193c.e);
            Iterator it4 = dVar.a.iterator();
            while (it4.hasNext()) {
                sb.append(((C0193c) it4.next()).c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned, float f) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = e(obj, f);
            String d2 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                ur.e(d2);
                C0193c c0193c = new C0193c(spanStart, spanEnd, e, d2);
                f(sparseArray, spanStart).a.add(c0193c);
                f(sparseArray, spanEnd).b.add(c0193c);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof ia3) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof bi8)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof h47) {
                return "<rt>" + b(((h47) obj).a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return z19.D("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return z19.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof ia3) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return z19.D("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return z19.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return z19.D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof h47)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof bi8)) {
                return null;
            }
            bi8 bi8Var = (bi8) obj;
            return z19.D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(bi8Var.a, bi8Var.b), g(bi8Var.c));
        }
        int i = ((h47) obj).b;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray sparseArray, int i) {
        d dVar = (d) sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    private static String g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    private static String h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
