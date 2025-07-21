package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzkm extends IOException {
    public zzkm(String str) {
        super(str);
    }

    static zzkl a() {
        return new zzkl("Protocol message tag had invalid wire type.");
    }

    static zzkm b() {
        return new zzkm("Protocol message contained an invalid tag (zero).");
    }

    static zzkm c() {
        return new zzkm("Protocol message had invalid UTF-8.");
    }

    static zzkm d() {
        return new zzkm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzkm e() {
        return new zzkm("Failed to parse the message.");
    }

    static zzkm f() {
        return new zzkm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
