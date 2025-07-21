package com.nytimes.android.eventtracker.model;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Viewport {
    public static final a Companion = new a(null);
    private final int a;
    private final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float b(int i) {
            return i / Resources.getSystem().getDisplayMetrics().density;
        }

        public final Viewport a(Context context) {
            zq3.h(context, "context");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = context.getSystemService("window");
            zq3.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            a aVar = Viewport.Companion;
            return new Viewport((int) aVar.b(displayMetrics.widthPixels), (int) aVar.b(displayMetrics.heightPixels));
        }

        private a() {
        }
    }

    public Viewport(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Viewport)) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return this.a == viewport.a && this.b == viewport.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Viewport(width=" + this.a + ", length=" + this.b + ")";
    }
}
