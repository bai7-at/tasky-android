package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ch8 {
    private final qs2 a;
    private kt6 b;
    private qs2 c;
    private qs2 d;
    private qs2 e;
    private qs2 f;

    public ch8(qs2 qs2Var, kt6 kt6Var, qs2 qs2Var2, qs2 qs2Var3, qs2 qs2Var4, qs2 qs2Var5) {
        this.a = qs2Var;
        this.b = kt6Var;
        this.c = qs2Var2;
        this.d = qs2Var3;
        this.e = qs2Var4;
        this.f = qs2Var5;
    }

    private final void b(Menu menu, MenuItemOption menuItemOption, qs2 qs2Var) {
        if (qs2Var != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        } else {
            if (qs2Var != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void a(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final kt6 c() {
        return this.b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        zq3.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            qs2 qs2Var = this.c;
            if (qs2Var != null) {
                qs2Var.mo865invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            qs2 qs2Var2 = this.d;
            if (qs2Var2 != null) {
                qs2Var2.mo865invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            qs2 qs2Var3 = this.e;
            if (qs2Var3 != null) {
                qs2Var3.mo865invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            qs2 qs2Var4 = this.f;
            if (qs2Var4 != null) {
                qs2Var4.mo865invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.c != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.d != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.e != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.f == null) {
            return true;
        }
        a(menu, MenuItemOption.SelectAll);
        return true;
    }

    public final void f() {
        qs2 qs2Var = this.a;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(qs2 qs2Var) {
        this.c = qs2Var;
    }

    public final void i(qs2 qs2Var) {
        this.e = qs2Var;
    }

    public final void j(qs2 qs2Var) {
        this.d = qs2Var;
    }

    public final void k(qs2 qs2Var) {
        this.f = qs2Var;
    }

    public final void l(kt6 kt6Var) {
        this.b = kt6Var;
    }

    public final void m(Menu menu) {
        b(menu, MenuItemOption.Copy, this.c);
        b(menu, MenuItemOption.Paste, this.d);
        b(menu, MenuItemOption.Cut, this.e);
        b(menu, MenuItemOption.SelectAll, this.f);
    }

    public /* synthetic */ ch8(qs2 qs2Var, kt6 kt6Var, qs2 qs2Var2, qs2 qs2Var3, qs2 qs2Var4, qs2 qs2Var5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qs2Var, (i & 2) != 0 ? kt6.e.a() : kt6Var, (i & 4) != 0 ? null : qs2Var2, (i & 8) != 0 ? null : qs2Var3, (i & 16) != 0 ? null : qs2Var4, (i & 32) != 0 ? null : qs2Var5);
    }
}
