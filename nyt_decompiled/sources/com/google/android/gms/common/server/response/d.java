package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* loaded from: classes2.dex */
final class d implements i {
    d() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        double zaj;
        zaj = fastParser.zaj(bufferedReader);
        return Double.valueOf(zaj);
    }
}
