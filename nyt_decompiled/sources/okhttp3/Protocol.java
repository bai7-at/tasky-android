package okhttp3;

import defpackage.zq3;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            zq3.h(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!zq3.c(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!zq3.c(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!zq3.c(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!zq3.c(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!zq3.c(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!zq3.c(str, protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
