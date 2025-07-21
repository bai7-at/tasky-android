package io.embrace.android.embracesdk.internal.network.http;

import android.annotation.TargetApi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
class EmbraceHttpUrlConnectionImpl<T extends HttpURLConnection> extends HttpURLConnection {
    private final EmbraceHttpUrlConnection embraceHttpUrlConnectionDelegate;

    public EmbraceHttpUrlConnectionImpl(T t, boolean z) {
        this(t, new EmbraceUrlConnectionDelegate(t, z));
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.embraceHttpUrlConnectionDelegate.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.embraceHttpUrlConnectionDelegate.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.embraceHttpUrlConnectionDelegate.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.embraceHttpUrlConnectionDelegate.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.embraceHttpUrlConnectionDelegate.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.embraceHttpUrlConnectionDelegate.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.embraceHttpUrlConnectionDelegate.getContentLength();
    }

    @Override // java.net.URLConnection
    @TargetApi(24)
    public long getContentLengthLong() {
        return this.embraceHttpUrlConnectionDelegate.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.embraceHttpUrlConnectionDelegate.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.embraceHttpUrlConnectionDelegate.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.embraceHttpUrlConnectionDelegate.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.embraceHttpUrlConnectionDelegate.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.embraceHttpUrlConnectionDelegate.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.embraceHttpUrlConnectionDelegate.getErrorStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    @TargetApi(24)
    public long getHeaderFieldLong(String str, long j) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.embraceHttpUrlConnectionDelegate.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.embraceHttpUrlConnectionDelegate.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.embraceHttpUrlConnectionDelegate.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.embraceHttpUrlConnectionDelegate.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.embraceHttpUrlConnectionDelegate.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.embraceHttpUrlConnectionDelegate.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.embraceHttpUrlConnectionDelegate.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.embraceHttpUrlConnectionDelegate.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.embraceHttpUrlConnectionDelegate.getUrl();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.embraceHttpUrlConnectionDelegate.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.embraceHttpUrlConnectionDelegate.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.embraceHttpUrlConnectionDelegate.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.embraceHttpUrlConnectionDelegate.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.embraceHttpUrlConnectionDelegate.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.embraceHttpUrlConnectionDelegate.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.embraceHttpUrlConnectionDelegate.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.embraceHttpUrlConnectionDelegate.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.embraceHttpUrlConnectionDelegate.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.embraceHttpUrlConnectionDelegate.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.embraceHttpUrlConnectionDelegate.usingProxy();
    }

    EmbraceHttpUrlConnectionImpl(T t, EmbraceUrlConnectionDelegate<T> embraceUrlConnectionDelegate) {
        super(t.getURL());
        this.embraceHttpUrlConnectionDelegate = embraceUrlConnectionDelegate;
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.embraceHttpUrlConnectionDelegate.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.embraceHttpUrlConnectionDelegate.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.embraceHttpUrlConnectionDelegate.setFixedLengthStreamingMode(j);
    }
}
