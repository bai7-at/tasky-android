package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;

/* loaded from: classes2.dex */
public abstract class d47 {
    public static b a(int i) {
        return new b(Uri.parse(z19.D("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i))));
    }
}
