package io.embrace.android.embracesdk.internal.network.http;

import android.annotation.TargetApi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes5.dex */
interface EmbraceHttpUrlConnection {
    void addRequestProperty(String str, String str2);

    void connect() throws IOException;

    void disconnect();

    boolean getAllowUserInteraction();

    int getConnectTimeout();

    Object getContent() throws IOException;

    Object getContent(Class<?>[] clsArr) throws IOException;

    String getContentEncoding();

    int getContentLength();

    @TargetApi(24)
    long getContentLengthLong();

    String getContentType();

    long getDate();

    boolean getDefaultUseCaches();

    boolean getDoInput();

    boolean getDoOutput();

    InputStream getErrorStream();

    String getHeaderField(int i);

    String getHeaderField(String str);

    long getHeaderFieldDate(String str, long j);

    int getHeaderFieldInt(String str, int i);

    String getHeaderFieldKey(int i);

    @TargetApi(24)
    long getHeaderFieldLong(String str, long j);

    Map<String, List<String>> getHeaderFields();

    long getIfModifiedSince();

    InputStream getInputStream() throws IOException;

    boolean getInstanceFollowRedirects();

    long getLastModified();

    Principal getLocalPrincipal();

    OutputStream getOutputStream() throws IOException;

    Principal getPeerPrincipal() throws SSLPeerUnverifiedException;

    Permission getPermission() throws IOException;

    int getReadTimeout();

    String getRequestMethod();

    Map<String, List<String>> getRequestProperties();

    String getRequestProperty(String str);

    int getResponseCode() throws IOException;

    String getResponseMessage() throws IOException;

    URL getUrl();

    boolean getUseCaches();

    void setAllowUserInteraction(boolean z);

    void setChunkedStreamingMode(int i);

    void setConnectTimeout(int i);

    void setDefaultUseCaches(boolean z);

    void setDoInput(boolean z);

    void setDoOutput(boolean z);

    void setFixedLengthStreamingMode(int i);

    void setFixedLengthStreamingMode(long j);

    void setIfModifiedSince(long j);

    void setInstanceFollowRedirects(boolean z);

    void setReadTimeout(int i);

    void setRequestMethod(String str) throws ProtocolException;

    void setRequestProperty(String str, String str2);

    void setUseCaches(boolean z);

    String toString();

    boolean usingProxy();
}
