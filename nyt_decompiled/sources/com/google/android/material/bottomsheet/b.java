package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.wk;

/* loaded from: classes3.dex */
public class b extends wk {
    private boolean a;

    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    private class C0203b extends BottomSheetBehavior.g {
        private C0203b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            if (i == 5) {
                b.this.e1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        if (this.a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void f1(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.a = z;
        if (bottomSheetBehavior.Q() == 5) {
            e1();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).p();
        }
        bottomSheetBehavior.y(new C0203b());
        bottomSheetBehavior.t0(5);
    }

    private boolean g1(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior n = aVar.n();
        if (!n.W() || !aVar.o()) {
            return false;
        }
        f1(n, z);
        return true;
    }

    @Override // androidx.fragment.app.e
    public void dismiss() {
        if (g1(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.e
    public void dismissAllowingStateLoss() {
        if (g1(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // defpackage.wk, androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
