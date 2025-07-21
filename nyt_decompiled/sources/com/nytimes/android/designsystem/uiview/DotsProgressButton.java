package com.nytimes.android.designsystem.uiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.du8;
import defpackage.kt1;
import defpackage.lt1;
import defpackage.pn6;
import defpackage.zq3;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class DotsProgressButton extends FrameLayout {
    private final String a;
    private final Integer b;
    private final ImageView c;
    private final TextView d;
    private final Drawable e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        zq3.h(context, "context");
    }

    private final Pair a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pn6.DotsProgressButton);
        zq3.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Integer num = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == pn6.DotsProgressButton_text) {
                str = obtainStyledAttributes.getString(index);
            } else if (index == pn6.DotsProgressButton_icon) {
                num = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
            }
        }
        obtainStyledAttributes.recycle();
        return du8.a(str, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        Pair a = a(attributeSet);
        String str = (String) a.a();
        Integer num = (Integer) a.b();
        this.a = str;
        this.b = num;
        if (num != null) {
            kt1 c = kt1.c(LayoutInflater.from(context), this, true);
            zq3.g(c, "inflate(...)");
            ImageView root = c.getRoot();
            zq3.g(root, "getRoot(...)");
            this.c = root;
            root.setImageResource(num.intValue());
            this.d = null;
        } else {
            lt1 b = lt1.b(LayoutInflater.from(context), this);
            zq3.g(b, "inflate(...)");
            ImageView root2 = b.c.getRoot();
            zq3.g(root2, "getRoot(...)");
            this.c = root2;
            TextView textView = b.b;
            this.d = textView;
            textView.setText(str);
        }
        this.e = getBackground();
    }
}
