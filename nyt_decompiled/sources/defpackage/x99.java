package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;

/* loaded from: classes4.dex */
public abstract class x99 {
    public static final /* synthetic */ void b(final View view, final long j) {
        zq3.h(view, "<this>");
        view.setVisibility(4);
        view.post(new Runnable() { // from class: w99
            @Override // java.lang.Runnable
            public final void run() {
                x99.c(view, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, long j) {
        zq3.h(view, "$this_circularRevealed");
        if (view.isAttachedToWindow()) {
            view.setVisibility(0);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + view.getRight()) / 2, (view.getTop() + view.getBottom()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
            createCircularReveal.setDuration(j);
            createCircularReveal.start();
        }
    }

    public static final /* synthetic */ int d(View view, boolean z) {
        zq3.h(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if (!(context instanceof Activity) || !z) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static final /* synthetic */ Point e(View view) {
        zq3.h(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final /* synthetic */ void f(View view, boolean z) {
        zq3.h(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }
}
