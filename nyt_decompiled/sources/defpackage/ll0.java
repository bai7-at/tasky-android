package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class ll0 {
    private static final long a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return vv3.e(wv3.b(keyEvent), vv3.a.b()) && d(keyEvent);
    }

    public static final boolean c(ct0 ct0Var) {
        return e((View) dt0.a(ct0Var, AndroidCompositionLocals_androidKt.k()));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int b = mw3.b(wv3.a(keyEvent));
        return b == 23 || b == 66 || b == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return vv3.e(wv3.b(keyEvent), vv3.a.a()) && d(keyEvent);
    }
}
