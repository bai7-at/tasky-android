package com.google.zxing;

/* loaded from: classes3.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        c = notFoundException;
        notFoundException.setStackTrace(ReaderException.b);
    }

    private NotFoundException() {
    }
}
