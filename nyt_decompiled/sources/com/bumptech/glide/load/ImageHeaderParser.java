package com.bumptech.glide.load;

import defpackage.to;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    int a(InputStream inputStream, to toVar);

    ImageType b(ByteBuffer byteBuffer);

    ImageType c(InputStream inputStream);
}
