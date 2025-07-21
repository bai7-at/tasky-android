package com.nytimes.android.poisonpill.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.android.poisonpill.view.PoisonPillOverlayViewImpl;
import defpackage.jk;
import defpackage.mi6;
import defpackage.ug6;
import defpackage.wy5;
import defpackage.xm6;
import defpackage.yy5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PoisonPillOverlayViewImpl extends com.nytimes.android.poisonpill.view.a implements yy5 {
    public static final a Companion = new a(null);
    private View f;
    private View g;
    private TextView h;
    private Button i;
    public wy5 presenter;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(PoisonPillOverlayViewImpl poisonPillOverlayViewImpl, View view) {
        zq3.h(poisonPillOverlayViewImpl, "this$0");
        poisonPillOverlayViewImpl.g1().e();
        poisonPillOverlayViewImpl.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(PoisonPillOverlayViewImpl poisonPillOverlayViewImpl, View view) {
        zq3.h(poisonPillOverlayViewImpl, "this$0");
        f activity = poisonPillOverlayViewImpl.getActivity();
        jk jkVar = activity instanceof jk ? (jk) activity : null;
        if (jkVar != null) {
            poisonPillOverlayViewImpl.g1().d(jkVar);
        }
    }

    @Override // defpackage.yy5
    public void F(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        show(fragmentManager, "PoisonPillOverlayView");
    }

    public final wy5 g1() {
        wy5 wy5Var = this.presenter;
        if (wy5Var != null) {
            return wy5Var;
        }
        zq3.z("presenter");
        return null;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        f activity;
        zq3.h(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        if (g1().c() || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, xm6.PoisonPill_FullScreenDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(mi6.poison_pill_overlay, viewGroup, false);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(ug6.dismissButton);
        zq3.g(findViewById, "findViewById(...)");
        this.f = findViewById;
        View findViewById2 = view.findViewById(ug6.dismissImg);
        zq3.g(findViewById2, "findViewById(...)");
        this.g = findViewById2;
        View findViewById3 = view.findViewById(ug6.pillCopy);
        zq3.g(findViewById3, "findViewById(...)");
        this.h = (TextView) findViewById3;
        View findViewById4 = view.findViewById(ug6.updateAppButton);
        zq3.g(findViewById4, "findViewById(...)");
        this.i = (Button) findViewById4;
        View view2 = this.f;
        TextView textView = null;
        if (view2 == null) {
            zq3.z("dismissButton");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: zy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PoisonPillOverlayViewImpl.h1(PoisonPillOverlayViewImpl.this, view3);
            }
        });
        Button button = this.i;
        if (button == null) {
            zq3.z("updateAppButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: az5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PoisonPillOverlayViewImpl.i1(PoisonPillOverlayViewImpl.this, view3);
            }
        });
        if (!g1().c()) {
            View view3 = this.f;
            if (view3 == null) {
                zq3.z("dismissButton");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.g;
            if (view4 == null) {
                zq3.z("dismissImg");
                view4 = null;
            }
            view4.setVisibility(8);
        }
        TextView textView2 = this.h;
        if (textView2 == null) {
            zq3.z("pillCopyTextView");
        } else {
            textView = textView2;
        }
        textView.setText(g1().b());
    }
}
