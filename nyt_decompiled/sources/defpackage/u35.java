package defpackage;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.network.FileExtension;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import zendesk.core.Constants;

/* loaded from: classes.dex */
public class u35 {
    private final q35 a;
    private final vc4 b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            a = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public u35(q35 q35Var, vc4 vc4Var) {
        this.a = q35Var;
        this.b = vc4Var;
    }

    private LottieComposition a(Context context, String str, String str2) {
        q35 q35Var;
        Pair a2;
        xc4 y;
        if (str2 == null || (q35Var = this.a) == null || (a2 = q35Var.a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) a2.first;
        InputStream inputStream = (InputStream) a2.second;
        int i = a.a[fileExtension.ordinal()];
        if (i == 1) {
            y = jc4.y(context, new ZipInputStream(inputStream), str2);
        } else if (i != 2) {
            y = jc4.o(inputStream, str2);
        } else {
            try {
                y = jc4.o(new GZIPInputStream(inputStream), str2);
            } catch (IOException e) {
                y = new xc4((Throwable) e);
            }
        }
        if (y.b() != null) {
            return (LottieComposition) y.b();
        }
        return null;
    }

    private xc4 b(Context context, String str, String str2) {
        j94.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                pc4 a2 = this.b.a(str);
                if (!a2.isSuccessful()) {
                    xc4 xc4Var = new xc4((Throwable) new IllegalArgumentException(a2.error()));
                    try {
                        a2.close();
                    } catch (IOException e) {
                        j94.d("LottieFetchResult close failed ", e);
                    }
                    return xc4Var;
                }
                xc4 e2 = e(context, str, a2.a0(), a2.U(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(e2.b() != null);
                j94.a(sb.toString());
                try {
                    a2.close();
                } catch (IOException e3) {
                    j94.d("LottieFetchResult close failed ", e3);
                }
                return e2;
            } catch (Exception e4) {
                xc4 xc4Var2 = new xc4((Throwable) e4);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e5) {
                        j94.d("LottieFetchResult close failed ", e5);
                    }
                }
                return xc4Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e6) {
                    j94.d("LottieFetchResult close failed ", e6);
                }
            }
            throw th;
        }
    }

    private xc4 d(String str, InputStream inputStream, String str2) {
        q35 q35Var;
        return (str2 == null || (q35Var = this.a) == null) ? jc4.o(new GZIPInputStream(inputStream), null) : jc4.o(new GZIPInputStream(new FileInputStream(q35Var.g(str, inputStream, FileExtension.GZIP))), str);
    }

    private xc4 e(Context context, String str, InputStream inputStream, String str2, String str3) {
        xc4 g;
        FileExtension fileExtension;
        q35 q35Var;
        if (str2 == null) {
            str2 = Constants.APPLICATION_JSON;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            j94.a("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            g = g(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains(Mimetypes.MIMETYPE_GZIP) || str.split("\\?")[0].endsWith(".tgs")) {
            j94.a("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            g = d(str, inputStream, str3);
        } else {
            j94.a("Received json response.");
            fileExtension = FileExtension.JSON;
            g = f(str, inputStream, str3);
        }
        if (str3 != null && g.b() != null && (q35Var = this.a) != null) {
            q35Var.f(str, fileExtension);
        }
        return g;
    }

    private xc4 f(String str, InputStream inputStream, String str2) {
        q35 q35Var;
        return (str2 == null || (q35Var = this.a) == null) ? jc4.o(inputStream, null) : jc4.o(new FileInputStream(q35Var.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    private xc4 g(Context context, String str, InputStream inputStream, String str2) {
        q35 q35Var;
        return (str2 == null || (q35Var = this.a) == null) ? jc4.y(context, new ZipInputStream(inputStream), null) : jc4.y(context, new ZipInputStream(new FileInputStream(q35Var.g(str, inputStream, FileExtension.ZIP))), str);
    }

    public xc4 c(Context context, String str, String str2) {
        LottieComposition a2 = a(context, str, str2);
        if (a2 != null) {
            return new xc4(a2);
        }
        j94.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
