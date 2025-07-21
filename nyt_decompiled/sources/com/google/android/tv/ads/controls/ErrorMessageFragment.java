package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.tv.ads.controls.ErrorMessageFragment;
import defpackage.cg6;
import defpackage.xb6;
import defpackage.yi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes3.dex */
public final class ErrorMessageFragment extends Fragment {
    public static final /* synthetic */ int c = 0;
    private ConstraintLayout a;
    private ConstraintLayout b;

    public ErrorMessageFragment() {
        super(yi6.fragment_error_message);
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.a.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.b.getTranslationX() / this.b.getWidth();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup.getClass();
        View inflate = layoutInflater.inflate(yi6.fragment_error_message, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(cg6.error_message_base_layout);
        constraintLayout.getClass();
        this.a = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(cg6.error_message_layout);
        constraintLayout2.getClass();
        this.b = constraintLayout2;
        this.a.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), xb6.animator_drawer_in);
        animatorSet.setTarget(this);
        animatorSet.start();
        final AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), xb6.animator_drawer_out);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new a(this));
        Button button = (Button) inflate.findViewById(cg6.error_message_back_button);
        button.getClass();
        button.setOnClickListener(new View.OnClickListener() { // from class: fq9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                AnimatorSet animatorSet3 = animatorSet2;
                int i = ErrorMessageFragment.c;
                animatorSet3.start();
            }
        });
        requireActivity().getOnBackPressedDispatcher().h(this, new b(this, true, animatorSet2));
        return inflate;
    }

    @Keep
    public void setBackgroundAlpha(float f) {
        this.a.setAlpha(f);
        this.a.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f) {
        this.b.setTranslationX(r0.getWidth() * f);
        this.b.invalidate();
    }
}
