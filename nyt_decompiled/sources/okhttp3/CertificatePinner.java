package okhttp3;

import defpackage.ku8;
import defpackage.qs2;
import defpackage.zq3;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            zq3.h(str, "pattern");
            zq3.h(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(i.c1(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String pin(Certificate certificate) {
            zq3.h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).a();
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            zq3.h(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.c;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            zq3.g(encoded, "publicKey.encoded");
            return ByteString.a.f(aVar, encoded, 0, 0, 3, null).C();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            zq3.h(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.c;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            zq3.g(encoded, "publicKey.encoded");
            return ByteString.a.f(aVar, encoded, 0, 0, 3, null).D();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            zq3.h(str, "pattern");
            zq3.h(str2, "pin");
            if ((!h.K(str, "*.", false, 2, null) || h.b0(str, "*", 1, false, 4, null) != -1) && ((!h.K(str, "**.", false, 2, null) || h.b0(str, "*", 2, false, 4, null) != -1) && h.b0(str, "*", 0, false, 6, null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.pattern = canonicalHost;
            if (h.K(str2, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                ByteString.a aVar = ByteString.c;
                String substring = str2.substring(5);
                zq3.g(substring, "this as java.lang.String).substring(startIndex)");
                ByteString a = aVar.a(substring);
                if (a != null) {
                    this.hash = a;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            if (!h.K(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.hashAlgorithm = "sha256";
            ByteString.a aVar2 = ByteString.c;
            String substring2 = str2.substring(7);
            zq3.g(substring2, "this as java.lang.String).substring(startIndex)");
            ByteString a2 = aVar2.a(substring2);
            if (a2 != null) {
                this.hash = a2;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return zq3.c(this.pattern, pin.pattern) && zq3.c(this.hashAlgorithm, pin.hashAlgorithm) && zq3.c(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            zq3.h(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (zq3.c(str, "sha256")) {
                return zq3.c(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (zq3.c(str, "sha1")) {
                return zq3.c(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            zq3.h(str, "hostname");
            if (h.K(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!h.A(str, str.length() - length, this.pattern, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!h.K(this.pattern, "*.", false, 2, null)) {
                    return zq3.c(str, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!h.A(str, str.length() - length3, this.pattern, 1, length3, false, 16, null) || h.g0(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        zq3.h(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(final String str, final List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        zq3.h(str, "hostname");
        zq3.h(list, "peerCertificates");
        check$okhttp(str, new qs2() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<X509Certificate> mo865invoke() {
                List<Certificate> list2;
                CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
                if (certificateChainCleaner$okhttp == null || (list2 = certificateChainCleaner$okhttp.clean(list, str)) == null) {
                    list2 = list;
                }
                List<Certificate> list3 = list2;
                ArrayList arrayList = new ArrayList(i.w(list3, 10));
                for (Certificate certificate : list3) {
                    zq3.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(String str, qs2 qs2Var) {
        zq3.h(str, "hostname");
        zq3.h(qs2Var, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) qs2Var.mo865invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (zq3.c(hashAlgorithm, "sha256")) {
                    if (byteString == null) {
                        byteString = Companion.sha256Hash(x509Certificate);
                    }
                    if (zq3.c(pin.getHash(), byteString)) {
                        return;
                    }
                } else {
                    if (!zq3.c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteString2 == null) {
                        byteString2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (zq3.c(pin.getHash(), byteString2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (zq3.c(certificatePinner.pins, this.pins) && zq3.c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        zq3.h(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> l = i.l();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (l.isEmpty()) {
                    l = new ArrayList<>();
                }
                zq3.f(l, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                ku8.c(l).add(obj);
            }
        }
        return l;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        zq3.h(certificateChainCleaner, "certificateChainCleaner");
        return zq3.c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        zq3.h(str, "hostname");
        zq3.h(certificateArr, "peerCertificates");
        check(str, d.C0(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
