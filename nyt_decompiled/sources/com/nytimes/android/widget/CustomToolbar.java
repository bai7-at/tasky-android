package com.nytimes.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import defpackage.a49;
import defpackage.fo6;
import defpackage.fp2;
import defpackage.nc6;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public class CustomToolbar extends Toolbar {
    private Drawable defaultNavigationalIcon;
    private int displayOptions;
    private Drawable homeUpNavigationalIcon;
    private int titleTextAppearance;

    public CustomToolbar(Context context) {
        this(context, null);
    }

    private TextView getActionBarTextView() {
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            return (TextView) declaredField.get(this);
        } catch (IllegalAccessException unused) {
            Log.e("", "getActionBarTextView error");
            return null;
        } catch (NoSuchFieldException unused2) {
            Log.e("", "getActionBarTextView error");
            return null;
        }
    }

    private void updateNavigationIcon() {
        Drawable drawable;
        if ((this.displayOptions & 4) == 0 || (drawable = this.homeUpNavigationalIcon) == null) {
            drawable = this.defaultNavigationalIcon;
        }
        super.setNavigationIcon(drawable);
    }

    protected void setActionBarDisplayOptions(int i) {
        int i2 = this.displayOptions ^ i;
        this.displayOptions = i;
        if (i2 == 0 || (i2 & 4) == 0) {
            return;
        }
        updateNavigationIcon();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(a49.b(getContext().getResources(), i, getContext().getTheme()));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        TextView actionBarTextView = getActionBarTextView();
        if (actionBarTextView != null) {
            actionBarTextView.setPaintFlags(actionBarTextView.getPaintFlags() | 128);
            actionBarTextView.setContentDescription(charSequence);
        }
        if (this.titleTextAppearance == 0 || TextUtils.isEmpty(charSequence)) {
            super.setTitle(charSequence);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        fp2.c(getContext(), spannableStringBuilder, this.titleTextAppearance, 0, spannableStringBuilder.length());
        super.setTitle(spannableStringBuilder);
    }

    public CustomToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.toolbarStyle);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        this.defaultNavigationalIcon = drawable;
        updateNavigationIcon();
    }

    public CustomToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.displayOptions = 11;
        h0 v = h0.v(getContext(), attributeSet, fo6.Toolbar, i, 0);
        this.titleTextAppearance = v.n(fo6.Toolbar_titleTextAppearance, 0);
        v.w();
        h0 v2 = h0.v(context, null, new int[]{nc6.homeAsUpIndicator}, nc6.actionBarTheme, 0);
        this.homeUpNavigationalIcon = v2.g(0);
        v2.w();
    }
}
