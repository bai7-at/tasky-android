package com.instacart.library.truetime;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public class InvalidNtpServerResponseException extends IOException {
    public final float actualValue;
    public final float expectedValue;
    public final String property;

    InvalidNtpServerResponseException(String str) {
        super(str);
        this.property = "na";
        this.expectedValue = 0.0f;
        this.actualValue = 0.0f;
    }

    InvalidNtpServerResponseException(String str, String str2, float f, float f2) {
        super(String.format(Locale.getDefault(), str, str2, Float.valueOf(f), Float.valueOf(f2)));
        this.property = str2;
        this.actualValue = f;
        this.expectedValue = f2;
    }
}
