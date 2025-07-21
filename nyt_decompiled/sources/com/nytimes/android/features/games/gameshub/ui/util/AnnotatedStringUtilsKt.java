package com.nytimes.android.features.games.gameshub.ui.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.logging.NYTLogger;
import defpackage.du8;
import defpackage.gv1;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class AnnotatedStringUtilsKt {
    public static final androidx.compose.ui.text.a a(String str, String str2, Composer composer, int i, int i2) {
        composer.z(-653139190);
        String str3 = (i2 & 2) != 0 ? "**" : str2;
        if (b.G()) {
            b.S(-653139190, i, -1, "com.nytimes.android.features.games.gameshub.ui.util.buildAnnotatedBoldString (AnnotatedStringUtils.kt:11)");
        }
        if (str == null) {
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            c0064a.i("");
            androidx.compose.ui.text.a o = c0064a.o();
            if (b.G()) {
                b.R();
            }
            composer.R();
            return o;
        }
        try {
            String F = h.F(str, str3, "", false, 4, null);
            List F0 = h.F0(str, new String[]{str3}, false, 0, 6, null);
            if (F0.size() > 1) {
                List<List> f1 = i.f1(F0, 2, 2, false, 4, null);
                ArrayList<Pair> arrayList = new ArrayList(i.w(f1, 10));
                int i3 = 0;
                for (List list : f1) {
                    int length = ((String) list.get(0)).length() + i3;
                    i3 = ((String) list.get(1)).length() + length;
                    arrayList.add(du8.a(Integer.valueOf(length), Integer.valueOf(i3)));
                }
                a.C0064a c0064a2 = new a.C0064a(0, 1, null);
                c0064a2.i(F);
                for (Pair pair : arrayList) {
                    c0064a2.c(new jy7(0L, 0L, o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null), ((Number) pair.c()).intValue(), ((Number) pair.d()).intValue());
                }
                androidx.compose.ui.text.a o2 = c0064a2.o();
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return o2;
            }
        } catch (Exception unused) {
            NYTLogger.g("Could not annotate game card byline bolding format", new Object[0]);
        }
        a.C0064a c0064a3 = new a.C0064a(0, 1, null);
        c0064a3.i(str);
        androidx.compose.ui.text.a o3 = c0064a3.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o3;
    }

    public static final String b(String str, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "delimiter");
        return i.u0(h.F0(h.F(str, QueryKeys.END_MARKER, " ", false, 4, null), new String[]{str2}, false, 0, 6, null), str2, null, null, 0, null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.util.AnnotatedStringUtilsKt$capitalizeEnumWords$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(String str3) {
                zq3.h(str3, "word");
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                zq3.g(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                char titleCase = Character.toTitleCase(lowerCase.charAt(0));
                String substring = lowerCase.substring(1);
                zq3.g(substring, "substring(...)");
                return titleCase + substring;
            }
        }, 30, null);
    }

    public static /* synthetic */ String c(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = " ";
        }
        return b(str, str2);
    }
}
