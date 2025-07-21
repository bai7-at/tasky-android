package com.nytimes.android.features.settings;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.lk6;
import defpackage.mx0;
import defpackage.ss2;
import defpackage.xk6;
import defpackage.zq3;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PreferenceItemDecoration extends RecyclerView.n {
    private final boolean a;
    private final Drawable b;
    private final Drawable c;
    private final int d;
    private final int e;
    private Set f;

    public /* synthetic */ PreferenceItemDecoration(Context context, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, (i3 & 8) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        zq3.h(rect, "outRect");
        zq3.h(view, "view");
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        super.e(rect, view, recyclerView, zVar);
        View findViewById = view.findViewById(R.id.title);
        TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
        if (textView != null) {
            if (zq3.c(textView.getText(), view.getContext().getString(xk6.nightMode))) {
                rect.bottom = this.e;
            } else if (i.c0(this.f, textView.getText())) {
                rect.bottom = this.d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        View j;
        zq3.h(canvas, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        super.g(canvas, recyclerView, zVar);
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        if (this.a) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildViewHolder(childAt).t() != 0) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                zq3.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) layoutParams)).bottomMargin;
                View findViewById = childAt.findViewById(R.id.title);
                TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
                if (textView != null) {
                    if (zq3.c(textView.getText(), childAt.getContext().getString(xk6.nightMode))) {
                        int i2 = bottom + this.e;
                        this.c.setBounds(0, i2, width, this.c.getIntrinsicHeight() + i2);
                        this.c.draw(canvas);
                    } else if (i.c0(this.f, textView.getText())) {
                        int i3 = bottom + this.d;
                        this.c.setBounds(0, i3, width, this.c.getIntrinsicHeight() + i3);
                        this.c.draw(canvas);
                    } else {
                        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                        this.b.setBounds((viewGroup == null || (j = ViewExtensions.j(viewGroup, new ss2() { // from class: com.nytimes.android.features.settings.PreferenceItemDecoration$onDraw$1$left$1
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(View view) {
                                zq3.h(view, "it");
                                return Boolean.valueOf(view.getVisibility() != 8);
                            }
                        })) == null) ? 0 : j.getLeft(), bottom, width, this.b.getIntrinsicHeight() + bottom);
                        this.b.draw(canvas);
                    }
                }
            }
        }
    }

    public PreferenceItemDecoration(Context context, int i, int i2, boolean z) {
        zq3.h(context, "context");
        this.a = z;
        Drawable e = mx0.e(context, i);
        zq3.f(e, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        this.b = e;
        Drawable e2 = mx0.e(context, i2);
        zq3.f(e2, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        this.c = e2;
        this.d = DeviceUtils.b(14.0f);
        this.e = DeviceUtils.b(8.0f);
        HashSet hashSet = new HashSet();
        hashSet.add(context.getString(xk6.login_or_register));
        hashSet.add(context.getString(lk6.logout));
        hashSet.add(context.getString(xk6.nightMode));
        hashSet.add(context.getString(xk6.download_images_title));
        hashSet.add(context.getString(xk6.settings_report_delivery_problem));
        hashSet.add(context.getString(xk6.settings_visit_help_center));
        hashSet.add(context.getString(xk6.espanol_edition));
        this.f = hashSet;
    }
}
