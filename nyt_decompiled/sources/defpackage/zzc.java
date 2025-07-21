package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class zzc {
    private CharSequence a;
    private Bitmap b;
    private Layout.Alignment c;
    private Layout.Alignment d;
    private float e;
    private int f;
    private int g;
    private float h;
    private int i;
    private int j;
    private float k;
    private float l;
    private float m;
    private int n;
    private float o;

    public zzc() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -3.4028235E38f;
        this.f = RecyclerView.UNDEFINED_DURATION;
        this.g = RecyclerView.UNDEFINED_DURATION;
        this.h = -3.4028235E38f;
        this.i = RecyclerView.UNDEFINED_DURATION;
        this.j = RecyclerView.UNDEFINED_DURATION;
        this.k = -3.4028235E38f;
        this.l = -3.4028235E38f;
        this.m = -3.4028235E38f;
        this.n = RecyclerView.UNDEFINED_DURATION;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.i;
    }

    public final zzc c(Bitmap bitmap) {
        this.b = bitmap;
        return this;
    }

    public final zzc d(float f) {
        this.m = f;
        return this;
    }

    public final zzc e(float f, int i) {
        this.e = f;
        this.f = i;
        return this;
    }

    public final zzc f(int i) {
        this.g = i;
        return this;
    }

    public final zzc g(Layout.Alignment alignment) {
        this.d = alignment;
        return this;
    }

    public final zzc h(float f) {
        this.h = f;
        return this;
    }

    public final zzc i(int i) {
        this.i = i;
        return this;
    }

    public final zzc j(float f) {
        this.o = f;
        return this;
    }

    public final zzc k(float f) {
        this.l = f;
        return this;
    }

    public final zzc l(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final zzc m(Layout.Alignment alignment) {
        this.c = alignment;
        return this;
    }

    public final zzc n(float f, int i) {
        this.k = f;
        this.j = i;
        return this;
    }

    public final zzc o(int i) {
        this.n = i;
        return this;
    }

    public final e2d p() {
        return new e2d(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, false, -16777216, this.n, this.o, null);
    }

    public final CharSequence q() {
        return this.a;
    }

    /* synthetic */ zzc(e2d e2dVar, byc bycVar) {
        this.a = e2dVar.a;
        this.b = e2dVar.d;
        this.c = e2dVar.b;
        this.d = e2dVar.c;
        this.e = e2dVar.e;
        this.f = e2dVar.f;
        this.g = e2dVar.g;
        this.h = e2dVar.h;
        this.i = e2dVar.i;
        this.j = e2dVar.l;
        this.k = e2dVar.m;
        this.l = e2dVar.j;
        this.m = e2dVar.k;
        this.n = e2dVar.n;
        this.o = e2dVar.o;
    }
}
