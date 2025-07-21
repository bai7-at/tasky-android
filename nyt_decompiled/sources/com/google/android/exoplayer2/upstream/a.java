package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.s91;
import defpackage.sq8;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public interface a extends s91 {

    /* renamed from: com.google.android.exoplayer2.upstream.a$a, reason: collision with other inner class name */
    public interface InterfaceC0194a {
        a a();
    }

    long b(b bVar);

    void close();

    default Map f() {
        return Collections.emptyMap();
    }

    Uri getUri();

    void i(sq8 sq8Var);
}
