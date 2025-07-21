package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class nm7 extends b {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nm7 a() {
            return new nm7();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Dialog dialog, DialogInterface dialogInterface) {
        zq3.h(dialog, "$dialog");
        BottomSheetBehavior n = ((com.google.android.material.bottomsheet.a) dialog).n();
        n.s0(true);
        n.k0(0.7f);
        n.t0(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(nm7 nm7Var, View view) {
        zq3.h(nm7Var, "this$0");
        nm7Var.dismiss();
    }

    @Override // androidx.fragment.app.e
    public int getTheme() {
        return getResources().getConfiguration().orientation == 2 ? sm6.BottomSheetExperimentDialogTheme_Landscape : sm6.BottomSheetExperimentDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public LinearLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        iq2 c = iq2.c(layoutInflater, viewGroup, false);
        c.d.setNavigationOnClickListener(new View.OnClickListener() { // from class: lm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nm7.l1(nm7.this, view);
            }
        });
        LinearLayout root = c.getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // com.google.android.material.bottomsheet.b, defpackage.wk, androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        final Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mm7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                nm7.j1(onCreateDialog, dialogInterface);
            }
        });
        zq3.g(onCreateDialog, "also(...)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
