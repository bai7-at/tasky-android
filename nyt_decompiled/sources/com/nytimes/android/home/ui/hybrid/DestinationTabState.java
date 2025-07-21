package com.nytimes.android.home.ui.hybrid;

import androidx.compose.foundation.pager.PagerState;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.an8;
import defpackage.e52;
import defpackage.qs2;
import defpackage.ue4;
import defpackage.zq3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DestinationTabState {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private final ET2Scope a;
    private String b;
    private String c;
    private List d;
    private PagerState e;
    private final HashSet f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(List list, int i) {
            if (list.isEmpty() || i > list.size()) {
                return "";
            }
            String lowerCase = ((String) list.get(i)).toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        private final String e(List list, String str, int i) {
            return (list.isEmpty() || i > list.size()) ? str : (String) list.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g(List list, String str, int i, String str2) {
            String str3;
            String e = e(list, str, i);
            Locale locale = Locale.ROOT;
            String lowerCase = e.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            if (str2 != null) {
                str3 = str2.toLowerCase(locale);
                zq3.g(str3, "toLowerCase(...)");
            } else {
                str3 = null;
            }
            return zq3.c(lowerCase, str3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(List list, String str, int i) {
            return i == f(list, str);
        }

        public final int f(List list, String str) {
            zq3.h(list, "tabs");
            zq3.h(str, "condition");
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                String str2 = (String) it2.next();
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                String lowerCase2 = str.toLowerCase(locale);
                zq3.g(lowerCase2, "toLowerCase(...)");
                if (zq3.c(lowerCase, lowerCase2)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
            return i;
        }

        private a() {
        }
    }

    public DestinationTabState(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
        this.b = "";
        this.c = "";
        this.d = i.l();
        this.f = new HashSet();
    }

    private final int b() {
        PagerState pagerState = this.e;
        if (pagerState != null) {
            return pagerState.w();
        }
        return 0;
    }

    public final void a(e52.c cVar, ue4 ue4Var) {
        zq3.h(cVar, "eventSubject");
        zq3.h(ue4Var, "extraData");
        this.f.add(new an8(cVar, ue4Var));
    }

    public final String c() {
        if (this.d.isEmpty()) {
            return this.c;
        }
        PagerState pagerState = this.e;
        if (pagerState == null) {
            return null;
        }
        String lowerCase = ((String) this.d.get(pagerState.P())).toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final boolean d(String str) {
        return Companion.g(this.d, this.b, b(), str);
    }

    public final boolean e() {
        return Companion.h(this.d, this.c, b());
    }

    public final String f(int i) {
        return Companion.d(this.d, i);
    }

    public final void g() {
        for (final an8 an8Var : this.f) {
            ET2PageScope.DefaultImpls.a(this.a, an8Var.b(), null, null, new qs2() { // from class: com.nytimes.android.home.ui.hybrid.DestinationTabState$sendCachedEvents$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return an8.this.a();
                }
            }, 6, null);
        }
        this.f.clear();
    }

    public final void h(List list, String str, String str2, PagerState pagerState) {
        zq3.h(list, "tabIds");
        zq3.h(str, "initialTabId");
        zq3.h(str2, "todayTabId");
        zq3.h(pagerState, "pagerState");
        this.d = list;
        this.b = str;
        this.c = str2;
        this.e = pagerState;
    }
}
