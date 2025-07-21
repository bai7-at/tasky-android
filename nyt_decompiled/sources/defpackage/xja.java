package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
final class xja implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ bka b;

    xja(bka bkaVar, View view) {
        this.a = view;
        this.b = bkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.a);
    }
}
