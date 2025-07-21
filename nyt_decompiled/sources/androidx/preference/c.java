package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.preference.DialogPreference;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.e implements DialogInterface.OnClickListener {
    private DialogPreference a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private int f;
    private BitmapDrawable g;
    private int h;

    private static class a {
        static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void j1(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            k1();
        }
    }

    public DialogPreference d1() {
        if (this.a == null) {
            this.a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(requireArguments().getString(TransferTable.COLUMN_KEY));
        }
        return this.a;
    }

    protected boolean e1() {
        return false;
    }

    protected void f1(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.e;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    protected View g1(Context context) {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    public abstract void h1(boolean z);

    protected void i1(a.C0012a c0012a) {
    }

    protected void k1() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.h = i;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.d targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString(TransferTable.COLUMN_KEY);
        if (bundle != null) {
            this.b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
        this.a = dialogPreference;
        this.b = dialogPreference.O0();
        this.c = this.a.Q0();
        this.d = this.a.P0();
        this.e = this.a.N0();
        this.f = this.a.M0();
        Drawable L0 = this.a.L0();
        if (L0 == null || (L0 instanceof BitmapDrawable)) {
            this.g = (BitmapDrawable) L0;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(L0.getIntrinsicWidth(), L0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        L0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        L0.draw(canvas);
        this.g = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        this.h = -2;
        a.C0012a h = new a.C0012a(requireContext()).setTitle(this.b).d(this.g).l(this.c, this).h(this.d, this);
        View g1 = g1(requireContext());
        if (g1 != null) {
            f1(g1);
            h.setView(g1);
        } else {
            h.f(this.e);
        }
        i1(h);
        androidx.appcompat.app.a create = h.create();
        if (e1()) {
            j1(create);
        }
        return create;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        h1(this.h == -1);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
