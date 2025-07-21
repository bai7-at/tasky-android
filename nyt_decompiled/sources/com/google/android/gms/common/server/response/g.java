package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.math.BigInteger;

/* loaded from: classes2.dex */
final class g implements i {
    g() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        BigInteger zat;
        zat = fastParser.zat(bufferedReader);
        return zat;
    }
}
