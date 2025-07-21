package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class w50 {
    final Context a;
    private hs7 b;
    private hs7 c;

    w50(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof lc8)) {
            return menuItem;
        }
        lc8 lc8Var = (lc8) menuItem;
        if (this.b == null) {
            this.b = new hs7();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(lc8Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        eq4 eq4Var = new eq4(this.a, lc8Var);
        this.b.put(lc8Var, eq4Var);
        return eq4Var;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        hs7 hs7Var = this.b;
        if (hs7Var != null) {
            hs7Var.clear();
        }
        hs7 hs7Var2 = this.c;
        if (hs7Var2 != null) {
            hs7Var2.clear();
        }
    }

    final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (((lc8) this.b.i(i2)).getGroupId() == i) {
                this.b.l(i2);
                i2--;
            }
            i2++;
        }
    }

    final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((lc8) this.b.i(i2)).getItemId() == i) {
                this.b.l(i2);
                return;
            }
        }
    }
}
