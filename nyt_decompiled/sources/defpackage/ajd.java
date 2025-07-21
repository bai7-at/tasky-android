package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes3.dex */
public final class ajd implements fqd {
    private final boolean a;

    public ajd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.a ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }
}
