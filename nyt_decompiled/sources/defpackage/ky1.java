package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.b;

/* loaded from: classes4.dex */
public final class ky1 extends b {
    private vc2 b;
    private a c;

    public interface a {
        void i();

        void p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(ky1 ky1Var, View view) {
        zq3.h(ky1Var, "this$0");
        a aVar = ky1Var.c;
        if (aVar != null) {
            aVar.p();
        }
        ky1Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(ky1 ky1Var, View view) {
        zq3.h(ky1Var, "this$0");
        a aVar = ky1Var.c;
        if (aVar != null) {
            aVar.i();
        }
        ky1Var.dismiss();
    }

    public final void F(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "supportFragmentManager");
        super.show(fragmentManager, getTag());
    }

    @Override // androidx.fragment.app.e
    public int getTheme() {
        return vm6.Theme_Feedback_BottomSheetDialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LayoutInflater.Factory requireActivity = requireActivity();
        this.c = requireActivity instanceof a ? (a) requireActivity : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        vc2 c = vc2.c(layoutInflater, viewGroup, false);
        this.b = c;
        if (c != null) {
            return c.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.c = null;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        vc2 vc2Var = this.b;
        if (vc2Var != null && (textView2 = vc2Var.c) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: iy1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ky1.j1(ky1.this, view2);
                }
            });
        }
        vc2 vc2Var2 = this.b;
        if (vc2Var2 == null || (textView = vc2Var2.b) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: jy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ky1.k1(ky1.this, view2);
            }
        });
    }
}
