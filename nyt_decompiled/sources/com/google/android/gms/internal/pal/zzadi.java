package com.google.android.gms.internal.pal;

import defpackage.zx9;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzadi extends IOException {
    private zx9 zza;

    public zzadi(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzadh a() {
        return new zzadh("Protocol message tag had invalid wire type.");
    }

    static zzadi b() {
        return new zzadi("Protocol message end-group tag did not match expected tag.");
    }

    static zzadi c() {
        return new zzadi("Protocol message contained an invalid tag (zero).");
    }

    static zzadi d() {
        return new zzadi("Protocol message had invalid UTF-8.");
    }

    static zzadi e() {
        return new zzadi("CodedInputStream encountered a malformed varint.");
    }

    static zzadi f() {
        return new zzadi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzadi g() {
        return new zzadi("Failed to parse the message.");
    }

    static zzadi i() {
        return new zzadi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzadi h(zx9 zx9Var) {
        this.zza = zx9Var;
        return this;
    }

    public zzadi(String str) {
        super(str);
        this.zza = null;
    }
}
