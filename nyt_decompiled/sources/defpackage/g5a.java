package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.icing.zzx;
import java.util.List;

/* loaded from: classes3.dex */
public final class g5a implements jm, b8g {
    private static final String a = "g5a";

    public static Intent d(String str, Uri uri) {
        e(str, uri);
        if (uri != null && f(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (uri == null || !g(uri)) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 70);
            sb.append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        String str2 = pathSegments.get(0);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str2);
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath(pathSegments.get(i));
            }
        } else {
            String str3 = a;
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
            sb2.append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ");
            sb2.append(valueOf2);
            Log.e(str3, sb2.toString());
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    private static void e(String str, Uri uri) {
        if (uri != null && f(uri)) {
            String host = uri.getHost();
            if (host == null || !host.isEmpty()) {
                return;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 98);
            sb.append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (uri == null || !g(uri)) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 176);
            sb2.append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (str != null && !str.equals(uri.getHost())) {
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 150);
            sb3.append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ");
            sb3.append(valueOf3);
            throw new IllegalArgumentException(sb3.toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty() || pathSegments.get(0).isEmpty()) {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb4 = new StringBuilder(valueOf4.length() + 128);
            sb4.append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ");
            sb4.append(valueOf4);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    private static boolean f(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    private static boolean g(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    private final PendingResult h(GoogleApiClient googleApiClient, u3 u3Var, int i) {
        return c(googleApiClient, az9.a(u3Var, System.currentTimeMillis(), googleApiClient.getContext().getPackageName(), i));
    }

    @Override // defpackage.jm
    public final PendingResult a(GoogleApiClient googleApiClient, u3 u3Var) {
        return h(googleApiClient, u3Var, 2);
    }

    @Override // defpackage.jm
    public final PendingResult b(GoogleApiClient googleApiClient, u3 u3Var) {
        return h(googleApiClient, u3Var, 1);
    }

    public final PendingResult c(GoogleApiClient googleApiClient, zzx... zzxVarArr) {
        return googleApiClient.enqueue(new c0a(this, googleApiClient, zzxVarArr));
    }
}
