package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
final class bmb implements View.OnAttachStateChangeListener {
    final /* synthetic */ kdb a;
    final /* synthetic */ emb b;

    bmb(emb embVar, kdb kdbVar) {
        this.a = kdbVar;
        this.b = embVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.I(view, this.a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
