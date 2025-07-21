package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import defpackage.f4;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ic8 extends ActionMode {
    final Context a;
    final f4 b;

    public static class a implements f4.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList c = new ArrayList();
        final hs7 d = new hs7();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            oq4 oq4Var = new oq4(this.b, (jc8) menu);
            this.d.put(menu, oq4Var);
            return oq4Var;
        }

        @Override // f4.a
        public boolean a(f4 f4Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(f4Var), new eq4(this.b, (lc8) menuItem));
        }

        @Override // f4.a
        public void b(f4 f4Var) {
            this.a.onDestroyActionMode(e(f4Var));
        }

        @Override // f4.a
        public boolean c(f4 f4Var, Menu menu) {
            return this.a.onCreateActionMode(e(f4Var), f(menu));
        }

        @Override // f4.a
        public boolean d(f4 f4Var, Menu menu) {
            return this.a.onPrepareActionMode(e(f4Var), f(menu));
        }

        public ActionMode e(f4 f4Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ic8 ic8Var = (ic8) this.c.get(i);
                if (ic8Var != null && ic8Var.b == f4Var) {
                    return ic8Var;
                }
            }
            ic8 ic8Var2 = new ic8(this.b, f4Var);
            this.c.add(ic8Var2);
            return ic8Var2;
        }
    }

    public ic8(Context context, f4 f4Var) {
        this.a = context;
        this.b = f4Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new oq4(this.a, (jc8) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
