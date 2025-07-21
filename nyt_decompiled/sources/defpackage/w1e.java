package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.internal.ads.zzavj;

/* loaded from: classes3.dex */
public final class w1e {
    private final gfa a;

    public w1e(gfa gfaVar) {
        this.a = gfaVar;
    }

    private static final Uri b(Uri uri, String str) {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzavj("Parameter already exists: dc_ms");
                            }
                            String uri2 = uri.toString();
                            int indexOf = uri2.indexOf(";adurl");
                            if (indexOf != -1) {
                                int i = indexOf + 1;
                                StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                                sb.append("dc_ms");
                                sb.append("=");
                                sb.append(str);
                                sb.append(";");
                                sb.append((CharSequence) uri2, i, uri2.length());
                                return Uri.parse(sb.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int indexOf2 = uri2.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append("=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                            return Uri.parse(sb2.toString());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzavj("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavj("Query parameter already exists: ms");
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i2 = indexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
        sb3.append("ms");
        sb3.append("=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) uri3, i2, uri3.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return b(uri, this.a.c().e(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }
}
