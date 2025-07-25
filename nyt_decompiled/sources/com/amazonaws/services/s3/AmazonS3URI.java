package com.amazonaws.services.s3;

import com.amazonaws.services.s3.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class AmazonS3URI {
    private static final Pattern ENDPOINT_PATTERN = Pattern.compile("^(.+\\.)?s3[.-]([a-z0-9-]+)\\.");
    private static final Pattern VERSION_ID_PATTERN = Pattern.compile("[&;]");
    private final String bucket;
    private final boolean isPathStyle;
    private final String key;
    private final String region;
    private final URI uri;
    private final String versionId;

    public AmazonS3URI(String str) {
        this(str, true);
    }

    private static void appendDecoded(StringBuilder sb, String str, int i) {
        if (i <= str.length() - 3) {
            char charAt = str.charAt(i + 1);
            sb.append((char) (fromHex(str.charAt(i + 2)) | (fromHex(charAt) << 4)));
            return;
        }
        throw new IllegalStateException("Invalid percent-encoded string:\"" + str + "\".");
    }

    private static String decode(String str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '%') {
                return decode(str, i);
            }
        }
        return str;
    }

    private static int fromHex(char c) {
        if (c < '0') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c + "' in escape sequence.");
        }
        if (c <= '9') {
            return c - '0';
        }
        if (c < 'A') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c + "' in escape sequence.");
        }
        if (c <= 'F') {
            return c - '7';
        }
        if (c < 'a') {
            throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c + "' in escape sequence.");
        }
        if (c <= 'f') {
            return c - 'W';
        }
        throw new IllegalStateException("Invalid percent-encoded string: bad character '" + c + "' in escape sequence.");
    }

    private static String parseVersionId(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : VERSION_ID_PATTERN.split(str)) {
            if (str2.startsWith("versionId=")) {
                return decode(str2.substring(10));
            }
        }
        return null;
    }

    private static String preprocessUrlStr(String str, boolean z) {
        if (!z) {
            return str;
        }
        try {
            return URLEncoder.encode(str, Constants.DEFAULT_ENCODING).replace("%3A", ":").replace("%2F", "/").replace("+", " ");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmazonS3URI amazonS3URI = (AmazonS3URI) obj;
        if (this.isPathStyle != amazonS3URI.isPathStyle || !this.uri.equals(amazonS3URI.uri)) {
            return false;
        }
        String str = this.bucket;
        if (str == null ? amazonS3URI.bucket != null : !str.equals(amazonS3URI.bucket)) {
            return false;
        }
        String str2 = this.key;
        if (str2 == null ? amazonS3URI.key != null : !str2.equals(amazonS3URI.key)) {
            return false;
        }
        String str3 = this.versionId;
        if (str3 == null ? amazonS3URI.versionId != null : !str3.equals(amazonS3URI.versionId)) {
            return false;
        }
        String str4 = this.region;
        return str4 != null ? str4.equals(amazonS3URI.region) : amazonS3URI.region == null;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKey() {
        return this.key;
    }

    public String getRegion() {
        return this.region;
    }

    public URI getURI() {
        return this.uri;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        int hashCode = ((this.uri.hashCode() * 31) + (this.isPathStyle ? 1 : 0)) * 31;
        String str = this.bucket;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.key;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.versionId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.region;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean isPathStyle() {
        return this.isPathStyle;
    }

    public String toString() {
        return this.uri.toString();
    }

    public AmazonS3URI(String str, boolean z) {
        this(URI.create(preprocessUrlStr(str, z)), z);
    }

    public AmazonS3URI(URI uri) {
        this(uri, false);
    }

    private AmazonS3URI(URI uri, boolean z) {
        if (uri != null) {
            this.uri = uri;
            if ("s3".equalsIgnoreCase(uri.getScheme())) {
                this.region = null;
                this.versionId = null;
                this.isPathStyle = false;
                String authority = uri.getAuthority();
                this.bucket = authority;
                if (authority != null) {
                    if (uri.getPath().length() <= 1) {
                        this.key = null;
                        return;
                    } else {
                        this.key = uri.getPath().substring(1);
                        return;
                    }
                }
                throw new IllegalArgumentException("Invalid S3 URI: no bucket: " + uri);
            }
            String host = uri.getHost();
            if (host != null) {
                Matcher matcher = ENDPOINT_PATTERN.matcher(host);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    if (group != null && !group.isEmpty()) {
                        this.isPathStyle = false;
                        this.bucket = group.substring(0, group.length() - 1);
                        String path = uri.getPath();
                        if (path != null && !path.isEmpty() && !"/".equals(uri.getPath())) {
                            this.key = uri.getPath().substring(1);
                        } else {
                            this.key = null;
                        }
                    } else {
                        this.isPathStyle = true;
                        String path2 = z ? uri.getPath() : uri.getRawPath();
                        if ("/".equals(path2)) {
                            this.bucket = null;
                            this.key = null;
                        } else {
                            int indexOf = path2.indexOf(47, 1);
                            if (indexOf == -1) {
                                this.bucket = decode(path2.substring(1));
                                this.key = null;
                            } else if (indexOf == path2.length() - 1) {
                                this.bucket = decode(path2.substring(1, indexOf));
                                this.key = null;
                            } else {
                                this.bucket = decode(path2.substring(1, indexOf));
                                this.key = decode(path2.substring(indexOf + 1));
                            }
                        }
                    }
                    this.versionId = parseVersionId(uri.getRawQuery());
                    if ("amazonaws".equals(matcher.group(2))) {
                        this.region = null;
                        return;
                    } else {
                        this.region = matcher.group(2);
                        return;
                    }
                }
                throw new IllegalArgumentException("Invalid S3 URI: hostname does not appear to be a valid S3 endpoint: " + uri);
            }
            throw new IllegalArgumentException("Invalid S3 URI: no hostname: " + uri);
        }
        throw new IllegalArgumentException("uri cannot be null");
    }

    private static String decode(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        appendDecoded(sb, str, i);
        int i2 = i + 3;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '%') {
                appendDecoded(sb, str, i2);
                i2 += 2;
            } else {
                sb.append(str.charAt(i2));
            }
            i2++;
        }
        return sb.toString();
    }
}
