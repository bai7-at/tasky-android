package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* loaded from: classes.dex */
public class jq4 extends b64 implements dq4 {
    private dq4 f0;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    public static class c extends gw1 {
        final int n;
        final int r;
        private dq4 s;
        private MenuItem t;

        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.n = 21;
                this.r = 22;
            } else {
                this.n = 22;
                this.r = 21;
            }
        }

        @Override // defpackage.gw1
        public /* bridge */ /* synthetic */ int d(int i, int i2, int i3, int i4, int i5) {
            return super.d(i, i2, i3, i4, i5);
        }

        @Override // defpackage.gw1
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i) {
            return super.e(motionEvent, i);
        }

        @Override // defpackage.gw1, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // defpackage.gw1, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // defpackage.gw1, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // defpackage.gw1, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // defpackage.gw1, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            d dVar;
            int i;
            int pointToPosition;
            int i2;
            if (this.s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    i = 0;
                }
                g item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= dVar.getCount()) ? null : dVar.getItem(i2);
                MenuItem menuItem = this.t;
                if (menuItem != item) {
                    e b = dVar.b();
                    if (menuItem != null) {
                        this.s.o(b, menuItem);
                    }
                    this.t = item;
                    if (item != null) {
                        this.s.d(b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.r) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (d) adapter).b().e(false);
            return true;
        }

        @Override // defpackage.gw1, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(dq4 dq4Var) {
            this.s = dq4Var;
        }

        @Override // defpackage.gw1, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public jq4(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void S(Object obj) {
        a.a(this.e0, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.e0, (Transition) obj);
    }

    public void U(dq4 dq4Var) {
        this.f0 = dq4Var;
    }

    public void V(boolean z) {
        b.a(this.e0, z);
    }

    @Override // defpackage.dq4
    public void d(e eVar, MenuItem menuItem) {
        dq4 dq4Var = this.f0;
        if (dq4Var != null) {
            dq4Var.d(eVar, menuItem);
        }
    }

    @Override // defpackage.dq4
    public void o(e eVar, MenuItem menuItem) {
        dq4 dq4Var = this.f0;
        if (dq4Var != null) {
            dq4Var.o(eVar, menuItem);
        }
    }

    @Override // defpackage.b64
    gw1 s(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
