package defpackage;

import android.view.View;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes3.dex */
final class j6b implements View.OnClickListener {
    final /* synthetic */ k6b a;

    j6b(k6b k6bVar) {
        this.a = k6bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        this.a.h(true);
    }
}
