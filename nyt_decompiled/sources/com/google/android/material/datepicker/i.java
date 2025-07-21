package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import defpackage.lf5;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
abstract class i extends Fragment {
    protected final LinkedHashSet a = new LinkedHashSet();

    i() {
    }

    boolean b1(lf5 lf5Var) {
        return this.a.add(lf5Var);
    }

    void c1() {
        this.a.clear();
    }
}
