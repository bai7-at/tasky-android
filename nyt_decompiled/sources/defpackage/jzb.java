package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.pal.zzcw;

/* loaded from: classes3.dex */
public final class jzb {
    private static final String[] f = {"/aclk", "/pcs/click", "/dbm/clk"};
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private final String c = "ad.doubleclick.net";
    private String[] d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final qtb e;

    public jzb(qtb qtbVar) {
        this.e = qtbVar;
    }

    private final Uri h(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.c)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzcw("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i = indexOf + 1;
                        return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int indexOf2 = uri2.indexOf(encodedPath);
                    return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzcw("Query parameter already exists: ms");
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
            return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return h(uri, this.e.e(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context) {
        return h(uri, this.e.b(context));
    }

    public final void c(MotionEvent motionEvent) {
        this.e.g(motionEvent);
    }

    public final void d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void e(String str) {
        this.d = str.split(",");
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean g(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.a)) {
                if (uri.getPath().equals(this.b)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
