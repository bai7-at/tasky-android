package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
final class olb implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult a;

    olb(JsResult jsResult) {
        this.a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
