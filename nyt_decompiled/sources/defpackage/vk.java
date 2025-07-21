package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.f4;
import defpackage.tv3;

/* loaded from: classes.dex */
public class vk extends xq0 implements kk {
    private mk d;
    private final tv3.a e;

    public vk(Context context, int i) {
        super(context, f(context, i));
        this.e = new tv3.a() { // from class: uk
            @Override // tv3.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return vk.this.g(keyEvent);
            }
        };
        mk e = e();
        e.Q(f(context, i));
        e.A(null);
    }

    private static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(nc6.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.xq0, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return tv3.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public mk e() {
        if (this.d == null) {
            this.d = mk.k(this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return e().l(i);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i) {
        return e().J(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().A(bundle);
    }

    @Override // defpackage.xq0, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().G();
    }

    @Override // defpackage.kk
    public void onSupportActionModeFinished(f4 f4Var) {
    }

    @Override // defpackage.kk
    public void onSupportActionModeStarted(f4 f4Var) {
    }

    @Override // defpackage.kk
    public f4 onWindowStartingSupportActionMode(f4.a aVar) {
        return null;
    }

    @Override // defpackage.xq0, android.app.Dialog
    public void setContentView(int i) {
        e().K(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    @Override // defpackage.xq0, android.app.Dialog
    public void setContentView(View view) {
        e().L(view);
    }

    @Override // defpackage.xq0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().M(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        e().R(getContext().getString(i));
    }
}
