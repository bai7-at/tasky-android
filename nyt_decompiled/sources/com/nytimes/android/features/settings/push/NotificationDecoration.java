package com.nytimes.android.features.settings.push;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.extensions.ViewExtensions;
import defpackage.de6;
import defpackage.ea5;
import defpackage.ie6;
import defpackage.mx0;
import defpackage.ss2;
import defpackage.t33;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NotificationDecoration extends RecyclerView.n {
    private Drawable a;
    private int b;

    public NotificationDecoration(Context context) {
        zq3.h(context, "context");
        Drawable e = mx0.e(context, ie6.section_front_separator);
        zq3.e(e);
        this.a = e;
        this.b = context.getResources().getDimensionPixelSize(de6.section_front_divider_width_and_height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(View view, RecyclerView recyclerView) {
        RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(view);
        zq3.f(childViewHolder, "null cannot be cast to non-null type com.xwray.groupie.GroupieViewHolder");
        return ((t33) childViewHolder).Z() instanceof ea5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        zq3.h(rect, "outRect");
        zq3.h(view, "view");
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        rect.set(0, this.b, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, final RecyclerView recyclerView, RecyclerView.z zVar) {
        zq3.h(canvas, "canvas");
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        View j = ViewExtensions.j(recyclerView, new ss2() { // from class: com.nytimes.android.features.settings.push.NotificationDecoration$onDrawOver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(View view) {
                boolean k;
                zq3.h(view, "it");
                k = NotificationDecoration.this.k(view, recyclerView);
                return Boolean.valueOf(k);
            }
        });
        if (j != null) {
            ViewGroup.LayoutParams layoutParams = j.getLayoutParams();
            zq3.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.p pVar = (RecyclerView.p) layoutParams;
            int top = j.getTop() - ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            this.a.setBounds(j.getLeft() - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, top, j.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, this.b + top);
            this.a.draw(canvas);
        }
    }
}
