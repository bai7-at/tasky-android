package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public final class si9 extends h50 {
    private final String d = "wordle";
    private final String e = "Wordle";
    private ti9 f;

    private final ti9 k1() {
        ti9 ti9Var = this.f;
        zq3.e(ti9Var);
        return ti9Var;
    }

    @Override // defpackage.h50
    public AppCompatButton d1() {
        AppCompatButton appCompatButton = k1().b;
        zq3.g(appCompatButton, "backBtn");
        return appCompatButton;
    }

    @Override // defpackage.h50
    public AppCompatTextView f1() {
        AppCompatTextView appCompatTextView = k1().c;
        zq3.g(appCompatTextView, "errorTextNotice");
        return appCompatTextView;
    }

    @Override // defpackage.h50
    public String g1() {
        return this.e;
    }

    @Override // defpackage.h50
    public String h1() {
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        this.f = ti9.c(layoutInflater, viewGroup, false);
        return k1().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }
}
