package com.google.android.gms.internal.ads;

import defpackage.w1f;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzhag extends IOException {
    private w1f zza;
    private boolean zzb;

    public zzhag(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzhaf a() {
        return new zzhaf("Protocol message tag had invalid wire type.");
    }

    static zzhag b() {
        return new zzhag("Protocol message end-group tag did not match expected tag.");
    }

    static zzhag c() {
        return new zzhag("Protocol message contained an invalid tag (zero).");
    }

    static zzhag d() {
        return new zzhag("Protocol message had invalid UTF-8.");
    }

    static zzhag e() {
        return new zzhag("CodedInputStream encountered a malformed varint.");
    }

    static zzhag f() {
        return new zzhag("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzhag g() {
        return new zzhag("Failed to parse the message.");
    }

    static zzhag i() {
        return new zzhag("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzhag j() {
        return new zzhag("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzhag h(w1f w1fVar) {
        this.zza = w1fVar;
        return this;
    }

    final void k() {
        this.zzb = true;
    }

    final boolean l() {
        return this.zzb;
    }

    public zzhag(String str) {
        super(str);
        this.zza = null;
    }
}
