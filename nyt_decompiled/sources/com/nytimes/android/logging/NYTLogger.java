package com.nytimes.android.logging;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.i05;
import defpackage.n36;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class NYTLogger {
    public static final NYTLogger a = new NYTLogger();
    private static final Set b = new LinkedHashSet();
    private static final ThreadLocal c = new ThreadLocal();
    private static Set d;
    private static Set e;

    private NYTLogger() {
    }

    public static final void A(final String str, final Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$w$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.h(w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void B(final Throwable th) {
        zq3.h(th, QueryKeys.TOKEN);
        r(a, null, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$w$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str) {
                zq3.h(i05Var, "log");
                i05Var.j(th, NYTLogger.x(NYTLogger.a, str, null, 2, null), new Object[0]);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final void C(final Throwable th, final String str, final Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$w$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                Throwable th2 = th;
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.j(th2, w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    private final boolean b(Set set, String str) {
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (h.N(str, (String) it2.next(), true)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(Set set, String str) {
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (h.w(str, (String) it2.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public static final void d(final String str, final Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$d$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.d(w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void e(final Throwable th) {
        zq3.h(th, QueryKeys.TOKEN);
        r(a, null, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$d$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str) {
                zq3.h(i05Var, "log");
                i05Var.a(th, NYTLogger.x(NYTLogger.a, str, null, 2, null), new Object[0]);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final void f(final Throwable th, final String str, final Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$d$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                Throwable th2 = th;
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.a(th2, w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void g(final String str, final Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$e$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.g(w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void h(final Throwable th) {
        zq3.h(th, QueryKeys.TOKEN);
        r(a, null, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$e$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str) {
                zq3.h(i05Var, "log");
                i05Var.i(th, NYTLogger.x(NYTLogger.a, str, null, 2, null), new Object[0]);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final void i(final Throwable th, final String str, final Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$e$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                Throwable th2 = th;
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.i(th2, w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final Set j() {
        return e;
    }

    public static final Set k() {
        return d;
    }

    public static final void l(final String str, final Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$i$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.c(w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void m(final Throwable th) {
        zq3.h(th, QueryKeys.TOKEN);
        r(a, null, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$i$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str) {
                zq3.h(i05Var, "log");
                i05Var.e(th, NYTLogger.x(NYTLogger.a, str, null, 2, null), new Object[0]);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final void n(final Throwable th, final String str, final Object... objArr) {
        zq3.h(th, QueryKeys.TOKEN);
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$i$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                Throwable th2 = th;
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.e(th2, w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }

    public static final void o(i05... i05VarArr) {
        zq3.h(i05VarArr, "loggers");
        i.C(b, i05VarArr);
    }

    private final boolean p(String str, String str2) {
        Set set;
        Set set2;
        if (str == null || (set2 = d) == null || !c(set2, str)) {
            return (str2 == null || (set = e) == null || !b(set, str2)) ? false : true;
        }
        return true;
    }

    private final void q(String str, gt2 gt2Var) {
        String str2 = (String) c.get();
        if (!p(str2, str)) {
            for (i05 i05Var : b) {
                if (gt2Var != null) {
                    gt2Var.invoke(i05Var, str2);
                }
            }
        }
        c.remove();
    }

    static /* synthetic */ void r(NYTLogger nYTLogger, String str, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            gt2Var = null;
        }
        nYTLogger.q(str, gt2Var);
    }

    public static final void s(final Throwable th) {
        zq3.h(th, QueryKeys.TOKEN);
        r(a, null, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$report$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str) {
                zq3.h(i05Var, "log");
                i05Var.b(th, NYTLogger.x(NYTLogger.a, str, null, 2, null));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final void t(Set set) {
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            e = null;
        } else {
            e = set;
        }
    }

    public static final void u(Set set) {
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            d = null;
        } else {
            d = set;
        }
    }

    public static final void v(boolean z) {
        n36.a.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String w(String str, String str2) {
        if (str != null && str2 != null) {
            return str + ": " + str2;
        }
        if (str == null) {
            return str2 == null ? "" : str2;
        }
        return str + ": See Exception";
    }

    static /* synthetic */ String x(NYTLogger nYTLogger, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return nYTLogger.w(str, str2);
    }

    public static final void y(i05 i05Var) {
        zq3.h(i05Var, "logger");
        b.remove(i05Var);
    }

    public static final void z(final String str, final Object... objArr) {
        zq3.h(str, "message");
        zq3.h(objArr, "args");
        a.q(str, new gt2() { // from class: com.nytimes.android.logging.NYTLogger$v$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(i05 i05Var, String str2) {
                String w;
                zq3.h(i05Var, "log");
                w = NYTLogger.a.w(str2, str);
                Object[] objArr2 = objArr;
                i05Var.f(w, Arrays.copyOf(objArr2, objArr2.length));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((i05) obj, (String) obj2);
                return ww8.a;
            }
        });
    }
}
