package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a3;
import defpackage.h3;

/* loaded from: classes3.dex */
abstract class s {
    final TextInputLayout a;
    final r b;
    final Context c;
    final CheckableImageButton d;

    s(r rVar) {
        this.a = rVar.a;
        this.b = rVar;
        this.c = rVar.getContext();
        this.d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    a3.a h() {
        return null;
    }

    boolean i(int i) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, h3 h3Var) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z) {
    }

    final void r() {
        this.b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
