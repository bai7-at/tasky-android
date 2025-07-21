package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class ty7 extends h50 {
    private final String d = "spelling-bee";
    private final String e = "Spelling Bee";
    private ja7 f;

    private final ja7 k1() {
        ja7 ja7Var = this.f;
        zq3.e(ja7Var);
        return ja7Var;
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
        this.f = ja7.c(layoutInflater, viewGroup, false);
        ConstraintLayout root = k1().getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }
}
