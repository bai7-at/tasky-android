package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
final class plb implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult a;

    plb(JsResult jsResult) {
        this.a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
