package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
final class qlb implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult a;

    qlb(JsResult jsResult) {
        this.a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm();
    }
}
