package io.embrace.android.embracesdk.comms.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
interface EmbraceConnection {
    void connect() throws IOException;

    InputStream getErrorStream();

    String getHeaderField(String str);

    Map<String, List<String>> getHeaderFields();

    InputStream getInputStream() throws IOException;

    OutputStream getOutputStream() throws IOException;

    String getRequestMethod();

    int getResponseCode() throws IOException;

    String getResponseMessage() throws IOException;

    SSLSocketFactory getSSLSocketFactory();

    EmbraceUrl getURL();

    boolean isHttps();

    void setConnectTimeout(Integer num);

    void setDoOutput(Boolean bool);

    void setReadTimeout(Integer num);

    void setRequestMethod(String str) throws ProtocolException;

    void setRequestProperty(String str, String str2);

    void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory);
}
