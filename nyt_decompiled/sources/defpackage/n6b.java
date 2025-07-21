package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n6b extends q6b {
    private final Map c;
    private final Context d;

    public n6b(wlb wlbVar, Map map) {
        super(wlbVar, "storePicture");
        this.c = map;
        this.d = wlbVar.zzi();
    }

    public final void i() {
        if (this.d == null) {
            c("Activity context is not available");
            return;
        }
        dyf.r();
        if (!new roa(this.d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        dyf.r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources e = dyf.q().e();
        dyf.r();
        AlertDialog.Builder j = wxf.j(this.d);
        j.setTitle(e != null ? e.getString(tj6.s1) : "Save image");
        j.setMessage(e != null ? e.getString(tj6.s2) : "Allow Ad to store image in Picture gallery?");
        j.setPositiveButton(e != null ? e.getString(tj6.s3) : "Accept", new l6b(this, str, lastPathSegment));
        j.setNegativeButton(e != null ? e.getString(tj6.s4) : "Decline", new m6b(this));
        j.create().show();
    }
}
