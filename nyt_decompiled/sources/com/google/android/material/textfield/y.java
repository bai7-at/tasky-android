package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import defpackage.hf6;
import defpackage.vj6;

/* loaded from: classes3.dex */
class y extends s {
    private int e;
    private EditText f;
    private final View.OnClickListener g;

    y(r rVar, int i) {
        super(rVar);
        this.e = hf6.design_password_eye;
        this.g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.this.y(view);
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    private boolean w() {
        EditText editText = this.f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f.setTransformationMethod(null);
        } else {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i, int i2, int i3) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return vj6.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
