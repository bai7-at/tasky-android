package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
final class h implements i {
    h() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        BigDecimal zas;
        zas = fastParser.zas(bufferedReader);
        return zas;
    }
}
