package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.v;
import defpackage.dl;
import defpackage.sf4;
import defpackage.yf4;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends dl {
    @Override // defpackage.dl
    protected d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // defpackage.dl
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.dl
    protected f e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // defpackage.dl
    protected q k(Context context, AttributeSet attributeSet) {
        return new sf4(context, attributeSet);
    }

    @Override // defpackage.dl
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new yf4(context, attributeSet);
    }
}
