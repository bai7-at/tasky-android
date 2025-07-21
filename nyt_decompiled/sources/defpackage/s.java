package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.decode.DataSource;
import coil.intercept.RealInterceptorChain;
import coil.request.ViewTargetRequestManager;
import coil.size.Scale;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.oq1;
import defpackage.qr1;
import defpackage.yo3;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.text.h;
import okhttp3.Headers;

/* loaded from: classes.dex */
public abstract class s {
    private static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    private static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    private static final Headers c = new Headers.Builder().build();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            b = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            c = iArr3;
        }
    }

    public static final void a(qr1.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final Headers.Builder b(Headers.Builder builder, String str) {
        int a0 = h.a0(str, ':', 0, false, 6, null);
        if (a0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String substring = str.substring(0, a0);
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String obj = h.c1(substring).toString();
        String substring2 = str.substring(a0 + 1);
        zq3.g(substring2, "this as java.lang.String).substring(startIndex)");
        builder.addUnsafeNonAscii(obj, substring2);
        return builder;
    }

    public static final int c(Context context, double d) {
        int i;
        try {
            Object j = mx0.j(context, ActivityManager.class);
            zq3.e(j);
            ActivityManager activityManager = (ActivityManager) j;
            i = (context.getApplicationInfo().flags & Constants.MB) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object j = mx0.j(context, ActivityManager.class);
            zq3.e(j);
            return ((ActivityManager) j).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return b;
    }

    public static final d42 g(yo3.a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).f() : d42.b;
    }

    public static final String h(Uri uri) {
        return (String) i.m0(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || h.d0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(h.R0(h.T0(h.a1(h.a1(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final ViewTargetRequestManager l(View view) {
        Object tag = view.getTag(vf6.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(vf6.coil_request_manager);
                    ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                    if (viewTargetRequestManager2 != null) {
                        viewTargetRequestManager = viewTargetRequestManager2;
                    } else {
                        viewTargetRequestManager = new ViewTargetRequestManager(view);
                        view.addOnAttachStateChangeListener(viewTargetRequestManager);
                        view.setTag(vf6.coil_request_manager, viewTargetRequestManager);
                    }
                } finally {
                }
            }
        }
        return viewTargetRequestManager;
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final Scale n(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : a.b[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
    }

    public static final Bitmap.Config[] o() {
        return a;
    }

    public static final int p(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean q(Uri uri) {
        return zq3.c(uri.getScheme(), TransferTable.COLUMN_FILE) && zq3.c(h(uri), "android_asset");
    }

    public static final boolean r() {
        return zq3.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean t(yo3.a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).g();
    }

    public static final boolean u(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof a49);
    }

    public static final qo5 v(qo5 qo5Var) {
        return qo5Var == null ? qo5.c : qo5Var;
    }

    public static final zf8 w(zf8 zf8Var) {
        return zf8Var == null ? zf8.c : zf8Var;
    }

    public static final Headers x(Headers headers) {
        return headers == null ? c : headers;
    }

    public static final int y(String str, int i) {
        Long n = h.n(str);
        if (n == null) {
            return i;
        }
        long longValue = n.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int z(oq1 oq1Var, Scale scale) {
        if (oq1Var instanceof oq1.a) {
            return ((oq1.a) oq1Var).a;
        }
        int i = a.c[scale.ordinal()];
        if (i == 1) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
