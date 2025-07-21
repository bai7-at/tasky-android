package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* loaded from: classes2.dex */
final class b implements i {
    b() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        long zan;
        zan = fastParser.zan(bufferedReader);
        return Long.valueOf(zan);
    }
}
