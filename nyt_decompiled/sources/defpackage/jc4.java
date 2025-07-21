package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.o;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract class jc4 {
    private static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};
    private static final byte[] d = {31, -117, 8};

    private static xc4 A(Context context, ZipInputStream zipInputStream, String str) {
        LottieComposition a2;
        FileOutputStream fileOutputStream;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = bc4.b().a(str);
            } catch (IOException e) {
                return new xc4((Throwable) e);
            }
        }
        if (a2 != null) {
            return new xc4(a2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        LottieComposition lottieComposition = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                lottieComposition = (LottieComposition) r(JsonReader.j(wd5.d(wd5.l(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th) {
                        j94.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th);
                    }
                    try {
                        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            j94.c("Failed to delete temp font file " + file.getAbsolutePath() + InstructionFileId.DOT);
                        }
                        hashMap2.put(str3, createFromFile);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (lottieComposition == null) {
            return new xc4((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            rc4 i = i(lottieComposition, (String) entry.getKey());
            if (i != null) {
                i.g(l29.l((Bitmap) entry.getValue(), i.f(), i.d()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (hm2 hm2Var : lottieComposition.g().values()) {
                if (hm2Var.a().equals(entry2.getKey())) {
                    hm2Var.e((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                j94.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = lottieComposition.j().entrySet().iterator();
            while (it2.hasNext()) {
                rc4 rc4Var = (rc4) ((Map.Entry) it2.next()).getValue();
                if (rc4Var == null) {
                    return null;
                }
                String c2 = rc4Var.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (c2.startsWith("data:") && c2.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(c2.substring(c2.indexOf(44) + 1), 0);
                        rc4Var.g(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                    } catch (IllegalArgumentException e2) {
                        j94.d("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            bc4.b().c(str, lottieComposition);
        }
        return new xc4(lottieComposition);
    }

    private static Boolean B(sd0 sd0Var) {
        return L(sd0Var, d);
    }

    private static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean D(sd0 sd0Var) {
        return L(sd0Var, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, LottieComposition lottieComposition) {
        Map map = a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xc4 J(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xc4 K(Context context, String str, String str2) {
        xc4 c2 = yx3.i(context).c(context, str, str2);
        if (str2 != null && c2.b() != null) {
            bc4.b().c(str2, (LottieComposition) c2.b());
        }
        return c2;
    }

    private static Boolean L(sd0 sd0Var, byte[] bArr) {
        try {
            sd0 peek = sd0Var.peek();
            for (byte b2 : bArr) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            j94.b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void M(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        lh4.a(arrayList.get(0));
        throw null;
    }

    private static String N(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(C(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static o h(final String str, Callable callable, Runnable runnable) {
        LottieComposition a2 = str == null ? null : bc4.b().a(str);
        o oVar = a2 != null ? new o(a2) : null;
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                oVar = (o) map.get(str);
            }
        }
        if (oVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return oVar;
        }
        o oVar2 = new o(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oVar2.d(new sc4() { // from class: hc4
                @Override // defpackage.sc4
                public final void onResult(Object obj) {
                    jc4.E(str, atomicBoolean, (LottieComposition) obj);
                }
            });
            oVar2.c(new sc4() { // from class: ic4
                @Override // defpackage.sc4
                public final void onResult(Object obj) {
                    jc4.F(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, oVar2);
                if (map2.size() == 1) {
                    M(false);
                }
            }
        }
        return oVar2;
    }

    private static rc4 i(LottieComposition lottieComposition, String str) {
        for (rc4 rc4Var : lottieComposition.j().values()) {
            if (rc4Var.c().equals(str)) {
                return rc4Var;
            }
        }
        return null;
    }

    public static o j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static o k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: fc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 m;
                m = jc4.m(applicationContext, str, str2);
                return m;
            }
        }, null);
    }

    public static xc4 l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static xc4 m(Context context, String str, String str2) {
        LottieComposition a2 = str2 == null ? null : bc4.b().a(str2);
        if (a2 != null) {
            return new xc4(a2);
        }
        try {
            sd0 d2 = wd5.d(wd5.l(context.getAssets().open(str)));
            return D(d2).booleanValue() ? y(context, new ZipInputStream(d2.t1()), str2) : B(d2).booleanValue() ? o(new GZIPInputStream(d2.t1()), str2) : o(d2.t1(), str2);
        } catch (IOException e) {
            return new xc4((Throwable) e);
        }
    }

    public static o n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: dc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 o;
                o = jc4.o(inputStream, str);
                return o;
            }
        }, new Runnable() { // from class: ec4
            @Override // java.lang.Runnable
            public final void run() {
                l29.c(inputStream);
            }
        });
    }

    public static xc4 o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    public static xc4 p(InputStream inputStream, String str, boolean z) {
        return q(JsonReader.j(wd5.d(wd5.l(inputStream))), str, z);
    }

    public static xc4 q(JsonReader jsonReader, String str, boolean z) {
        return r(jsonReader, str, z);
    }

    private static xc4 r(JsonReader jsonReader, String str, boolean z) {
        LottieComposition a2;
        try {
            if (str == null) {
                a2 = null;
            } else {
                try {
                    a2 = bc4.b().a(str);
                } catch (Exception e) {
                    xc4 xc4Var = new xc4((Throwable) e);
                    if (z) {
                        l29.c(jsonReader);
                    }
                    return xc4Var;
                }
            }
            if (a2 != null) {
                xc4 xc4Var2 = new xc4(a2);
                if (z) {
                    l29.c(jsonReader);
                }
                return xc4Var2;
            }
            LottieComposition a3 = kc4.a(jsonReader);
            if (str != null) {
                bc4.b().c(str, a3);
            }
            xc4 xc4Var3 = new xc4(a3);
            if (z) {
                l29.c(jsonReader);
            }
            return xc4Var3;
        } catch (Throwable th) {
            if (z) {
                l29.c(jsonReader);
            }
            throw th;
        }
    }

    public static o s(Context context, int i) {
        return t(context, i, N(context, i));
    }

    public static o t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: gc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 J;
                J = jc4.J(weakReference, applicationContext, i, str);
                return J;
            }
        }, null);
    }

    public static xc4 u(Context context, int i) {
        return v(context, i, N(context, i));
    }

    public static xc4 v(Context context, int i, String str) {
        LottieComposition a2 = str == null ? null : bc4.b().a(str);
        if (a2 != null) {
            return new xc4(a2);
        }
        try {
            sd0 d2 = wd5.d(wd5.l(context.getResources().openRawResource(i)));
            if (D(d2).booleanValue()) {
                return y(context, new ZipInputStream(d2.t1()), str);
            }
            if (!B(d2).booleanValue()) {
                return o(d2.t1(), str);
            }
            try {
                return o(new GZIPInputStream(d2.t1()), str);
            } catch (IOException e) {
                return new xc4((Throwable) e);
            }
        } catch (Resources.NotFoundException e2) {
            return new xc4((Throwable) e2);
        }
    }

    public static o w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static o x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: cc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 K;
                K = jc4.K(context, str, str2);
                return K;
            }
        }, null);
    }

    public static xc4 y(Context context, ZipInputStream zipInputStream, String str) {
        return z(context, zipInputStream, str, true);
    }

    public static xc4 z(Context context, ZipInputStream zipInputStream, String str, boolean z) {
        try {
            return A(context, zipInputStream, str);
        } finally {
            if (z) {
                l29.c(zipInputStream);
            }
        }
    }
}
