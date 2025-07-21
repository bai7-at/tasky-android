package defpackage;

import android.net.Uri;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes2.dex */
public final class jie {
    private static final Uri b;
    private final LogPrinter a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority(ImagesContract.LOCAL);
        b = builder.build();
    }
}
