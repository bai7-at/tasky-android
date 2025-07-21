package com.nytimes.xwords.hybrid.view.sudoku;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.ComposeView;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import com.nytimes.xwords.hybrid.view.error.ErrorScreenKt;
import defpackage.fo0;
import defpackage.gt2;
import defpackage.hd6;
import defpackage.qs2;
import defpackage.s22;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class SudokuErrorFragment extends s22 {
    private final String d = "sudoku";

    @Override // defpackage.s22
    public String c1() {
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(zr0.c(-1134503047, true, new gt2() { // from class: com.nytimes.xwords.hybrid.view.sudoku.SudokuErrorFragment$onCreateView$1$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                ErrorType b1;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1134503047, i, -1, "com.nytimes.xwords.hybrid.view.sudoku.SudokuErrorFragment.onCreateView.<anonymous>.<anonymous> (SudokuErrorFragment.kt:21)");
                }
                b1 = SudokuErrorFragment.this.b1();
                long a = fo0.a(hd6.sudokuPrimary, composer, 0);
                composer.z(-997502581);
                boolean S = composer.S(SudokuErrorFragment.this);
                final SudokuErrorFragment sudokuErrorFragment = SudokuErrorFragment.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.xwords.hybrid.view.sudoku.SudokuErrorFragment$onCreateView$1$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m856invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m856invoke() {
                            SudokuErrorFragment.this.requireActivity().getOnBackPressedDispatcher().l();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                ErrorScreenKt.e(null, b1, a, (qs2) A, composer, 0, 1);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        return composeView;
    }
}
