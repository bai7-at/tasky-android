package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes3.dex */
final class rlb implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult a;

    rlb(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
