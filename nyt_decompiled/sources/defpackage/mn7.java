package defpackage;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mn7 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final Activity a;
    private final td4 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public mn7(Activity activity, td4 td4Var) {
        zq3.h(activity, "activity");
        zq3.h(td4Var, "mainActivityNavigator");
        this.a = activity;
        this.b = td4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(mn7 mn7Var, qs2 qs2Var, MenuItem menuItem) {
        zq3.h(mn7Var, "this$0");
        zq3.h(qs2Var, "$onNavigationPerformed");
        zq3.h(menuItem, "it");
        mn7Var.b.f(mn7Var.a);
        qs2Var.mo865invoke();
        return true;
    }

    public final void b(Menu menu, final qs2 qs2Var) {
        zq3.h(menu, "menu");
        zq3.h(qs2Var, "onNavigationPerformed");
        menu.add(0, 0, 0, "Settings").setIcon(ie6.ic_account).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ln7
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean c2;
                c2 = mn7.c(mn7.this, qs2Var, menuItem);
                return c2;
            }
        }).setShowAsAction(2);
    }
}
