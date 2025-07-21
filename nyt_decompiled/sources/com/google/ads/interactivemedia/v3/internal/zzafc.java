package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzafc extends IOException {
    private zzafz zza;

    public zzafc(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzafb zza() {
        return new zzafb("Protocol message tag had invalid wire type.");
    }

    static zzafc zzb() {
        return new zzafc("Protocol message end-group tag did not match expected tag.");
    }

    static zzafc zzc() {
        return new zzafc("Protocol message contained an invalid tag (zero).");
    }

    static zzafc zzd() {
        return new zzafc("Protocol message had invalid UTF-8.");
    }

    static zzafc zze() {
        return new zzafc("CodedInputStream encountered a malformed varint.");
    }

    static zzafc zzf() {
        return new zzafc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzafc zzg() {
        return new zzafc("Failed to parse the message.");
    }

    static zzafc zzi() {
        return new zzafc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzafc zzh(zzafz zzafzVar) {
        this.zza = zzafzVar;
        return this;
    }

    public zzafc(String str) {
        super(str);
        this.zza = null;
    }
}
