package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* loaded from: classes2.dex */
final class a implements i {
    a() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        int zal;
        zal = fastParser.zal(bufferedReader);
        return Integer.valueOf(zal);
    }
}
