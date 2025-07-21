package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import defpackage.yo5;
import defpackage.yp8;

/* loaded from: classes2.dex */
abstract class TagPayloadReader {
    protected final yp8 a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(yp8 yp8Var) {
        this.a = yp8Var;
    }

    public final boolean a(yo5 yo5Var, long j) {
        return b(yo5Var) && c(yo5Var, j);
    }

    protected abstract boolean b(yo5 yo5Var);

    protected abstract boolean c(yo5 yo5Var, long j);
}
