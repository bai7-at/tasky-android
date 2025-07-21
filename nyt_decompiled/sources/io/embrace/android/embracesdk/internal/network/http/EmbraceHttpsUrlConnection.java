package io.embrace.android.embracesdk.internal.network.http;

import java.security.cert.Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
interface EmbraceHttpsUrlConnection extends EmbraceHttpUrlConnection {
    String getCipherSuite();

    HostnameVerifier getHostnameVerifier();

    Certificate[] getLocalCertificates();

    Certificate[] getServerCertificates() throws SSLPeerUnverifiedException;

    SSLSocketFactory getSslSocketFactory();

    void setHostnameVerifier(HostnameVerifier hostnameVerifier);

    void setSslSocketFactory(SSLSocketFactory sSLSocketFactory);
}
