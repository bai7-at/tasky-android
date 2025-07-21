package com.google.android.gms.internal.play_billing;

import defpackage.sbc;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzci extends IOException {
    private sbc zza;

    public zzci(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzch a() {
        return new zzch("Protocol message tag had invalid wire type.");
    }

    static zzci b() {
        return new zzci("Protocol message contained an invalid tag (zero).");
    }

    static zzci c() {
        return new zzci("Protocol message had invalid UTF-8.");
    }

    static zzci d() {
        return new zzci("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzci e() {
        return new zzci("Failed to parse the message.");
    }

    static zzci g() {
        return new zzci("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzci f(sbc sbcVar) {
        this.zza = sbcVar;
        return this;
    }

    public zzci(String str) {
        super(str);
        this.zza = null;
    }
}
