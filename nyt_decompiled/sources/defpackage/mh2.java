package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.i;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class mh2 implements i.a {
    private final i.a a;
    private final List b;

    public mh2(i.a aVar, List list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public kh2 a(Uri uri, InputStream inputStream) {
        kh2 kh2Var = (kh2) this.a.a(uri, inputStream);
        List list = this.b;
        return (list == null || list.isEmpty()) ? kh2Var : (kh2) kh2Var.a(this.b);
    }
}
