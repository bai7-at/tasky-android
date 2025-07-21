package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
abstract class a {
    final Picasso a;
    final p b;
    final WeakReference c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C0471a extends WeakReference {
        final a a;

        C0471a(a aVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = aVar;
        }
    }

    a(Picasso picasso, Object obj, p pVar, int i, int i2, int i3, Drawable drawable, String str, Object obj2, boolean z) {
        this.a = picasso;
        this.b = pVar;
        this.c = obj == null ? null : new C0471a(this, obj, picasso.j);
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj2 == null ? this : obj2;
    }

    void a() {
        this.l = true;
    }

    abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    abstract void c(Exception exc);

    String d() {
        return this.i;
    }

    int e() {
        return this.e;
    }

    int f() {
        return this.f;
    }

    Picasso g() {
        return this.a;
    }

    Picasso.Priority h() {
        return this.b.t;
    }

    p i() {
        return this.b;
    }

    Object j() {
        return this.j;
    }

    Object k() {
        WeakReference weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.l;
    }

    boolean m() {
        return this.k;
    }
}
