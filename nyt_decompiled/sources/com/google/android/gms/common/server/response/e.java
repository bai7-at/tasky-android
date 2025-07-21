package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* loaded from: classes2.dex */
final class e implements i {
    e() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* bridge */ /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        boolean zay;
        zay = fastParser.zay(bufferedReader, false);
        return Boolean.valueOf(zay);
    }
}
