package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.am2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t72 extends w2 {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    private static final am2.a r = new a();
    private static final am2.b s = new b();
    private final AccessibilityManager h;
    private final View i;
    private c j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int k = RecyclerView.UNDEFINED_DURATION;
    int l = RecyclerView.UNDEFINED_DURATION;
    private int m = RecyclerView.UNDEFINED_DURATION;

    class a implements am2.a {
        a() {
        }

        @Override // am2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h3 h3Var, Rect rect) {
            h3Var.k(rect);
        }
    }

    class b implements am2.b {
        b() {
        }

        @Override // am2.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h3 a(py7 py7Var, int i) {
            return (h3) py7Var.n(i);
        }

        @Override // am2.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(py7 py7Var) {
            return py7Var.m();
        }
    }

    private class c extends i3 {
        c() {
        }

        @Override // defpackage.i3
        public h3 b(int i) {
            return h3.V(t72.this.I(i));
        }

        @Override // defpackage.i3
        public h3 d(int i) {
            int i2 = i == 2 ? t72.this.k : t72.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.i3
        public boolean f(int i, int i2, Bundle bundle) {
            return t72.this.Q(i, i2, bundle);
        }
    }

    public t72(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (k99.v(view) == 0) {
            k99.v0(view, 1);
        }
    }

    private void A(int i, Rect rect) {
        I(i).k(rect);
    }

    private static Rect E(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean F(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int G(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean H(int i, Rect rect) {
        h3 h3Var;
        py7 z = z();
        int i2 = this.l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        h3 h3Var2 = i2 == Integer.MIN_VALUE ? null : (h3) z.e(i2);
        if (i == 1 || i == 2) {
            h3Var = (h3) am2.d(z, s, r, h3Var2, i, k99.x(this.i) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                A(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.i, i, rect2);
            }
            h3Var = (h3) am2.c(z, s, r, h3Var2, rect2, i);
        }
        if (h3Var != null) {
            i3 = z.h(z.g(h3Var));
        }
        return U(i3);
    }

    private boolean R(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? K(i, i2, bundle) : o(i) : T(i) : p(i) : U(i);
    }

    private boolean S(int i, Bundle bundle) {
        return k99.a0(this.i, i, bundle);
    }

    private boolean T(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        this.k = i;
        this.i.invalidate();
        V(i, 32768);
        return true;
    }

    private void W(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        V(i, 128);
        V(i2, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
    }

    private boolean o(int i) {
        if (this.k != i) {
            return false;
        }
        this.k = RecyclerView.UNDEFINED_DURATION;
        this.i.invalidate();
        V(i, 65536);
        return true;
    }

    private boolean q() {
        int i = this.l;
        return i != Integer.MIN_VALUE && K(i, 16, null);
    }

    private AccessibilityEvent r(int i, int i2) {
        return i != -1 ? s(i, i2) : t(i2);
    }

    private AccessibilityEvent s(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        h3 I = I(i);
        obtain.getText().add(I.y());
        obtain.setContentDescription(I.r());
        obtain.setScrollable(I.P());
        obtain.setPassword(I.O());
        obtain.setEnabled(I.I());
        obtain.setChecked(I.F());
        M(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(I.o());
        j3.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent t(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private h3 u(int i) {
        h3 U = h3.U();
        U.m0(true);
        U.o0(true);
        U.e0("android.view.View");
        Rect rect = n;
        U.a0(rect);
        U.b0(rect);
        U.A0(this.i);
        O(i, U);
        if (U.y() == null && U.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        U.k(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i2 = U.i();
        if ((i2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        U.y0(this.i.getContext().getPackageName());
        U.J0(this.i, i);
        if (this.k == i) {
            U.Z(true);
            U.a(128);
        } else {
            U.Z(false);
            U.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            U.a(2);
        } else if (U.J()) {
            U.a(1);
        }
        U.p0(z);
        this.i.getLocationOnScreen(this.g);
        U.l(this.d);
        if (this.d.equals(rect)) {
            U.k(this.d);
            if (U.b != -1) {
                h3 U2 = h3.U();
                for (int i3 = U.b; i3 != -1; i3 = U2.b) {
                    U2.B0(this.i, -1);
                    U2.a0(n);
                    O(i3, U2);
                    U2.k(this.e);
                    Rect rect2 = this.d;
                    Rect rect3 = this.e;
                    rect2.offset(rect3.left, rect3.top);
                }
                U2.Y();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                U.b0(this.d);
                if (F(this.d)) {
                    U.S0(true);
                }
            }
        }
        return U;
    }

    private h3 v() {
        h3 W = h3.W(this.i);
        k99.Y(this.i, W);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (W.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return W;
    }

    private py7 z() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        py7 py7Var = new py7();
        for (int i = 0; i < arrayList.size(); i++) {
            py7Var.i(((Integer) arrayList.get(i)).intValue(), u(((Integer) arrayList.get(i)).intValue()));
        }
        return py7Var;
    }

    public final int B() {
        return this.l;
    }

    protected abstract int C(float f, float f2);

    protected abstract void D(List list);

    h3 I(int i) {
        return i == -1 ? v() : u(i);
    }

    public final void J(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            p(i2);
        }
        if (z) {
            H(i, rect);
        }
    }

    protected abstract boolean K(int i, int i2, Bundle bundle);

    protected void L(AccessibilityEvent accessibilityEvent) {
    }

    protected void M(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void N(h3 h3Var);

    protected abstract void O(int i, h3 h3Var);

    protected abstract void P(int i, boolean z);

    boolean Q(int i, int i2, Bundle bundle) {
        return i != -1 ? R(i, i2, bundle) : S(i2, bundle);
    }

    public final boolean U(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            p(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        P(i, true);
        V(i, 8);
        return true;
    }

    public final boolean V(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, r(i, i2));
    }

    @Override // defpackage.w2
    public i3 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.w2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        L(accessibilityEvent);
    }

    @Override // defpackage.w2
    public void g(View view, h3 h3Var) {
        super.g(view, h3Var);
        N(h3Var);
    }

    public final boolean p(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        P(i, false);
        V(i, 8);
        return true;
    }

    public final boolean w(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = C(motionEvent.getX(), motionEvent.getY());
            W(C);
            return C != Integer.MIN_VALUE;
        }
        if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        }
        W(RecyclerView.UNDEFINED_DURATION);
        return true;
    }

    public final boolean x(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return H(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return H(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int G = G(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && H(G, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q();
        return true;
    }

    public final int y() {
        return this.k;
    }
}
