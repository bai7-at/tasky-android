package defpackage;

import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.File;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class if2 implements we4 {
    private final boolean b(Uri uri) {
        if (s.q(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !zq3.c(scheme, TransferTable.COLUMN_FILE)) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return h.K0(path, '/', false, 2, null) && s.h(uri) != null;
    }

    @Override // defpackage.we4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(Uri uri, uk5 uk5Var) {
        if (!b(uri)) {
            return null;
        }
        if (uri.getScheme() != null) {
            uri = uri.buildUpon().scheme(null).build();
        }
        return new File(uri.toString());
    }
}
