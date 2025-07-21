package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzwg {
    public static final zzwg zza = new zzwg("\n", "  ");

    private zzwg(String str, String str2) {
        if (!"\n".matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!"  ".matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs allowed in indent.");
        }
    }
}
