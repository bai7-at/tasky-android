package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.navigation.NavigationSource;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class nr3 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NavigationSource.values().length];
            try {
                iArr[NavigationSource.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_SAVES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationSource.SAVED_SECTION_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationSource.SAVED_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_RECENTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_NEWSQUIZ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_BOOKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_FILTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_FLASHBACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_SHUFFLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NavigationSource.SECTION_FRONT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NavigationSource.XPN_PANEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NavigationSource.XPN_CTA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NavigationSource.GIFT_HUB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            a = iArr;
        }
    }

    public final void a(y25 y25Var, Activity activity) {
        zq3.h(y25Var, "item");
        zq3.h(activity, "activity");
        NavigationSource n = y25Var.n();
        NavigationSource navigationSource = NavigationSource.SAVED_SECTION_FRONT;
        if (n == navigationSource || y25Var.n() == NavigationSource.SECTION_FRONT) {
            activity.startActivityForResult(y25Var.n() == navigationSource ? is2.a.b(activity, y25Var.p(), y25Var.r()) : is2.a.c(activity, y25Var.p(), y25Var.l()), 20011);
        } else {
            activity.startActivity(is2.a.c(activity, y25Var.p(), "homepage"));
        }
    }

    public final void b(Throwable th) {
        zq3.h(th, "throwable");
        NYTLogger.h(th);
    }

    public final void c(y25 y25Var, Activity activity) {
        Intent g;
        zq3.h(y25Var, "item");
        zq3.h(activity, "activity");
        switch (a.a[y25Var.n().ordinal()]) {
            case 1:
                ys7 ys7Var = ys7.a;
                String m = y25Var.m();
                String p = y25Var.p();
                String m2 = y25Var.m();
                String q = y25Var.q();
                g = ys7Var.g(activity, m, p, m2, q == null ? "" : q);
                break;
            case 2:
            case 3:
            case 4:
                ys7 ys7Var2 = ys7.a;
                String p2 = y25Var.p();
                String q2 = y25Var.q();
                g = ys7Var2.i(activity, p2, q2 != null ? q2 : "");
                break;
            case 5:
                ys7 ys7Var3 = ys7.a;
                String p3 = y25Var.p();
                String q3 = y25Var.q();
                g = ys7Var3.b(activity, p3, q3 != null ? q3 : "");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                ys7 ys7Var4 = ys7.a;
                String m3 = y25Var.m();
                String p4 = y25Var.p();
                String m4 = y25Var.m();
                String q4 = y25Var.q();
                g = ys7Var4.h(activity, m3, p4, m4, q4 == null ? "" : q4);
                break;
            case 12:
            case 13:
            case 14:
                g = ys7.a.j(activity, y25Var.q(), y25Var.p(), y25Var.m(), y25Var.l());
                break;
            case 15:
                ys7 ys7Var5 = ys7.a;
                String p5 = y25Var.p();
                String q5 = y25Var.q();
                g = ys7Var5.i(activity, p5, q5 != null ? q5 : "");
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        tr8.a.b(g, activity, 20010);
    }
}
