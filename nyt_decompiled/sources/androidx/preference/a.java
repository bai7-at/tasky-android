package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes.dex */
public class a extends c {
    private EditText i;
    private CharSequence j;
    private final Runnable k = new RunnableC0108a();
    private long l = -1;

    /* renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    class RunnableC0108a implements Runnable {
        RunnableC0108a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o1();
        }
    }

    private EditTextPreference l1() {
        return (EditTextPreference) d1();
    }

    private boolean m1() {
        long j = this.l;
        return j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis();
    }

    public static a n1(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString(TransferTable.COLUMN_KEY, str);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void p1(boolean z) {
        this.l = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.c
    protected boolean e1() {
        return true;
    }

    @Override // androidx.preference.c
    protected void f1(View view) {
        super.f1(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.i = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.i.setText(this.j);
        EditText editText2 = this.i;
        editText2.setSelection(editText2.getText().length());
        l1().U0();
    }

    @Override // androidx.preference.c
    public void h1(boolean z) {
        if (z) {
            String obj = this.i.getText().toString();
            EditTextPreference l1 = l1();
            if (l1.b(obj)) {
                l1.W0(obj);
            }
        }
    }

    @Override // androidx.preference.c
    protected void k1() {
        p1(true);
        o1();
    }

    void o1() {
        if (m1()) {
            EditText editText = this.i;
            if (editText == null || !editText.isFocused()) {
                p1(false);
            } else if (((InputMethodManager) this.i.getContext().getSystemService("input_method")).showSoftInput(this.i, 0)) {
                p1(false);
            } else {
                this.i.removeCallbacks(this.k);
                this.i.postDelayed(this.k, 50L);
            }
        }
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = l1().V0();
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }
}
