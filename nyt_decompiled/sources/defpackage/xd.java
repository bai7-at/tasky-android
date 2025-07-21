package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import androidx.compose.ui.text.a;

/* loaded from: classes.dex */
public final class xd implements sl0 {
    private final ClipboardManager a;

    public xd(ClipboardManager clipboardManager) {
        this.a = clipboardManager;
    }

    @Override // defpackage.sl0
    public a a() {
        ClipData primaryClip = this.a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return yd.a(itemAt != null ? itemAt.getText() : null);
    }

    @Override // defpackage.sl0
    public boolean b() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // defpackage.sl0
    public void c(a aVar) {
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", yd.b(aVar)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            defpackage.zq3.f(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd.<init>(android.content.Context):void");
    }
}
