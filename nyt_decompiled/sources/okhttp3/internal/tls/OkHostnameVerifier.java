package okhttp3.internal.tls;

import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.r19;
import defpackage.zq3;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.i;
import kotlin.text.h;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* loaded from: classes5.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        zq3.g(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        zq3.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return i.l();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && zq3.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return i.l();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) r19.b(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = subjectAltNames.iterator();
        while (it2.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = subjectAltNames.iterator();
        while (it2.hasNext()) {
            if (zq3.c(canonicalHost, HostnamesKt.toCanonicalHost((String) it2.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        zq3.h(x509Certificate, "certificate");
        return i.F0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        zq3.h(str, "host");
        zq3.h(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            zq3.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        zq3.h(str, "host");
        zq3.h(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !h.K(str, InstructionFileId.DOT, false, 2, null) && !h.v(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !h.K(str2, InstructionFileId.DOT, false, 2, null) && !h.v(str2, "..", false, 2, null)) {
            if (!h.v(str, InstructionFileId.DOT, false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!h.v(str2, InstructionFileId.DOT, false, 2, null)) {
                str2 = str2 + '.';
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!h.P(asciiToLowercase, "*", false, 2, null)) {
                return zq3.c(str3, asciiToLowercase);
            }
            if (!h.K(asciiToLowercase, "*.", false, 2, null) || h.a0(asciiToLowercase, '*', 1, false, 4, null) != -1 || str3.length() < asciiToLowercase.length() || zq3.c("*.", asciiToLowercase)) {
                return false;
            }
            String substring = asciiToLowercase.substring(1);
            zq3.g(substring, "this as java.lang.String).substring(startIndex)");
            if (!h.v(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || h.g0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }
}
