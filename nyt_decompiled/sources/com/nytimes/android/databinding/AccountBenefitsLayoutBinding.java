package com.nytimes.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.eg6;
import defpackage.f99;
import defpackage.g99;
import defpackage.wh6;

/* loaded from: classes4.dex */
public final class AccountBenefitsLayoutBinding implements f99 {
    public final Toolbar accountBenefitsToolbarId;
    public final ImageView checkIcon;
    public final FrameLayout notificationsContainer;
    private final CoordinatorLayout rootView;
    public final Button saveAndContinue;
    public final AppCompatTextView supportingMessage;
    public final AppCompatTextView thankYouMessage;

    private AccountBenefitsLayoutBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, ImageView imageView, FrameLayout frameLayout, Button button, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = coordinatorLayout;
        this.accountBenefitsToolbarId = toolbar;
        this.checkIcon = imageView;
        this.notificationsContainer = frameLayout;
        this.saveAndContinue = button;
        this.supportingMessage = appCompatTextView;
        this.thankYouMessage = appCompatTextView2;
    }

    public static AccountBenefitsLayoutBinding bind(View view) {
        int i = eg6.account_benefits_toolbar_id;
        Toolbar toolbar = (Toolbar) g99.a(view, i);
        if (toolbar != null) {
            i = eg6.check_icon;
            ImageView imageView = (ImageView) g99.a(view, i);
            if (imageView != null) {
                i = eg6.notifications_container;
                FrameLayout frameLayout = (FrameLayout) g99.a(view, i);
                if (frameLayout != null) {
                    i = eg6.save_and_continue;
                    Button button = (Button) g99.a(view, i);
                    if (button != null) {
                        i = eg6.supporting_message;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) g99.a(view, i);
                        if (appCompatTextView != null) {
                            i = eg6.thank_you_message;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) g99.a(view, i);
                            if (appCompatTextView2 != null) {
                                return new AccountBenefitsLayoutBinding((CoordinatorLayout) view, toolbar, imageView, frameLayout, button, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AccountBenefitsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AccountBenefitsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(wh6.account_benefits_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.f99
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
