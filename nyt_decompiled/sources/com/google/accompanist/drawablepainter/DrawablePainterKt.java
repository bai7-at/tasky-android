package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import defpackage.c04;
import defpackage.du7;
import defpackage.qs2;
import defpackage.zt7;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;

/* loaded from: classes2.dex */
public abstract class DrawablePainterKt {
    private static final c04 a = c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Handler mo865invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? zt7.b.a() : du7.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) a.getValue();
    }
}
