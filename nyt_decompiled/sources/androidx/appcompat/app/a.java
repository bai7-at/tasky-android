package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import defpackage.nc6;
import defpackage.vk;

/* loaded from: classes.dex */
public class a extends vk implements DialogInterface {
    final AlertController f;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0012a {
        private final AlertController.b a;
        private final int b;

        public C0012a(Context context) {
            this(context, a.j(context, 0));
        }

        public C0012a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public C0012a b(boolean z) {
            this.a.r = z;
            return this;
        }

        public C0012a c(View view) {
            this.a.g = view;
            return this;
        }

        public a create() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.f);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0012a d(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0012a e(int i) {
            AlertController.b bVar = this.a;
            bVar.h = bVar.a.getText(i);
            return this;
        }

        public C0012a f(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public C0012a g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.J = onMultiChoiceClickListener;
            bVar.F = zArr;
            bVar.G = true;
            return this;
        }

        public Context getContext() {
            return this.a.a;
        }

        public C0012a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = charSequence;
            bVar.n = onClickListener;
            return this;
        }

        public C0012a i(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public C0012a j(DialogInterface.OnDismissListener onDismissListener) {
            this.a.t = onDismissListener;
            return this;
        }

        public C0012a k(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0012a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = charSequence;
            bVar.k = onClickListener;
            return this;
        }

        public C0012a m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public C0012a n(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public C0012a o(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        public a p() {
            a create = create();
            create.show();
            return create;
        }

        public C0012a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = bVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public C0012a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public C0012a setTitle(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public C0012a setView(View view) {
            AlertController.b bVar = this.a;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = false;
            return this;
        }

        public C0012a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, a.j(context, i)));
            this.b = i;
        }
    }

    protected a(Context context, int i) {
        super(context, j(context, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    static int j(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(nc6.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView i() {
        return this.f.d();
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f.f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.vk, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.p(charSequence);
    }
}
