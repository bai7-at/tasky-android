package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.tv.ads.controls.WhyThisAdFragment;
import defpackage.cg6;
import defpackage.xb6;
import defpackage.xba;
import defpackage.yi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes3.dex */
public final class WhyThisAdFragment extends Fragment {
    public static final /* synthetic */ int d = 0;
    private ImageView a;
    private ConstraintLayout b;
    private ConstraintLayout c;

    public WhyThisAdFragment() {
        super(yi6.fragment_why_this_ad);
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.b.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.c.getTranslationX() / this.c.getWidth();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup.getClass();
        View inflate = layoutInflater.inflate(yi6.fragment_why_this_ad, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(cg6.why_this_ad_base_layout);
        constraintLayout.getClass();
        this.b = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(cg6.why_this_ad_layout);
        constraintLayout2.getClass();
        this.c = constraintLayout2;
        this.b.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), xb6.animator_drawer_in);
        animatorSet.setTarget(this);
        animatorSet.start();
        final AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), xb6.animator_drawer_out);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new d(this));
        Button button = (Button) inflate.findViewById(cg6.why_this_ad_back_button);
        button.getClass();
        button.setOnClickListener(new View.OnClickListener() { // from class: m5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                AnimatorSet animatorSet3 = animatorSet2;
                int i = WhyThisAdFragment.d;
                animatorSet3.start();
            }
        });
        requireActivity().getOnBackPressedDispatcher().h(this, new e(this, true, animatorSet2));
        ImageView imageView = (ImageView) inflate.findViewById(cg6.wta_image_view);
        imageView.getClass();
        this.a = imageView;
        String string = requireArguments().getString("wta_uri");
        string.getClass();
        String string2 = requireArguments().getString("wta_alt_text");
        if (!TextUtils.isEmpty(string2)) {
            this.a.setContentDescription(string2);
        }
        ((com.bumptech.glide.d) com.bumptech.glide.a.u(this).r(xba.a(string, "zTvAdsFrameworkz")).g()).l0(new c(this, this.a));
        return inflate;
    }

    @Keep
    public void setBackgroundAlpha(float f) {
        this.b.setAlpha(f);
        this.b.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f) {
        this.c.setTranslationX(r0.getWidth() * f);
        this.c.invalidate();
    }
}
