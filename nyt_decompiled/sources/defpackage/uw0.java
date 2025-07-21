package defpackage;

import androidx.paging.PagingSource;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.be7;
import defpackage.rd7;
import defpackage.tw0;
import defpackage.ud7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class uw0 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final TimeStampUtil a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public uw0(TimeStampUtil timeStampUtil) {
        zq3.h(timeStampUtil, "timestampUtil");
        this.a = timeStampUtil;
    }

    private final String a(ud7 ud7Var) {
        List a2;
        ud7.b bVar;
        ud7.a aVar = (ud7.a) i.m0(ud7Var.a());
        if (aVar == null || (a2 = aVar.a()) == null || (bVar = (ud7.b) i.m0(a2)) == null) {
            return null;
        }
        return bVar.c();
    }

    private final String b(tw0.i iVar) {
        String b2 = iVar != null ? iVar.b() : null;
        String a2 = iVar != null ? iVar.a() : null;
        if (zq3.c(b2, a2)) {
            return null;
        }
        return a2;
    }

    private final he7 d(tw0.h hVar) {
        Triple e = e(hVar);
        if (e == null) {
            return null;
        }
        String str = (String) e.a();
        String str2 = (String) e.b();
        String str3 = (String) e.c();
        Pair j = j(hVar);
        if (j == null) {
            return null;
        }
        String str4 = (String) j.a();
        String str5 = (String) j.b();
        if (h.P(str5, "stg.nytimes", false, 2, null) || h.P(str4, "stg.nytimes", false, 2, null)) {
            return null;
        }
        Pair f = f(hVar);
        return new he7(str, str3, (String) f.a(), str2, i(hVar), str4, str5, (Instant) f.b(), hVar.d(), false, false, 1536, null);
    }

    private final Triple e(tw0.h hVar) {
        rd7 a2 = hVar.a();
        if (a2 == null) {
            return null;
        }
        rd7.a a3 = a2.a();
        String a4 = a3 != null ? a3.a() : null;
        if (a4 == null || h.d0(a4)) {
            return null;
        }
        return new Triple(a4, zq3.c(a2.b(), "undefined") ? null : a2.b(), a2.c());
    }

    private final Pair f(tw0.h hVar) {
        String B;
        ee7 c = hVar.c();
        String str = "";
        if (c == null) {
            return new Pair("", null);
        }
        Instant a2 = c.a();
        if (a2 != null && (B = TimeStampUtil.B(this.a, a2, null, 2, null)) != null) {
            str = B;
        }
        return new Pair(str, a2);
    }

    private final List g(tw0.c cVar, boolean z) {
        tw0.f a2;
        tw0.g b2;
        tw0.b a3 = cVar.a();
        tw0.d a4 = (a3 == null || (a2 = a3.a()) == null || (b2 = a2.b()) == null) ? null : b2.a();
        String d = a4 != null ? a4.d() : null;
        return (a4 == null || d == null || d.length() == 0 || !z) ? i.l() : i.e(new he7(k(a4.a()), a4.b(), "", "", a4.c(), d, d, null, null, true, false, 1408, null));
    }

    private final String i(tw0.h hVar) {
        ud7 a2;
        String a3;
        be7.a a4 = hVar.b().a();
        return (a4 == null || (a2 = a4.a()) == null || (a3 = a(a2)) == null) ? "" : a3;
    }

    private final Pair j(tw0.h hVar) {
        ee7 c = hVar.c();
        if (c != null) {
            return new Pair(c.b(), c.c());
        }
        return null;
    }

    public final PagingSource.b c(tw0.c cVar, boolean z) {
        tw0.f a2;
        zq3.h(cVar, "queryResult");
        tw0.b a3 = cVar.a();
        return new PagingSource.b.C0106b(h(cVar, z), null, b((a3 == null || (a2 = a3.a()) == null) ? null : a2.c()));
    }

    public final List h(tw0.c cVar, boolean z) {
        tw0.f a2;
        List<tw0.e> a3;
        tw0.h a4;
        zq3.h(cVar, "queryResult");
        List g = g(cVar, z);
        tw0.b a5 = cVar.a();
        List list = null;
        if (a5 != null && (a2 = a5.a()) != null && (a3 = a2.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (tw0.e eVar : a3) {
                he7 d = (eVar == null || (a4 = eVar.a()) == null) ? null : d(a4);
                if (d != null) {
                    arrayList.add(d);
                }
            }
            list = arrayList;
        }
        if (list == null) {
            list = i.l();
        }
        return i.F0(g, list);
    }

    public final String k(String str) {
        String e;
        return (str == null || (e = new Regex("\\<.*?>").e(str, "")) == null) ? "" : e;
    }
}
