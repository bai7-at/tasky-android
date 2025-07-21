package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.FacebookException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class w15 {
    public static final w15 a = new w15();
    private static final String b;
    private static File c;

    public static final class a {
        private final UUID a;
        private final Bitmap b;
        private final Uri c;
        private final String d;
        private final String e;
        private boolean f;
        private boolean g;

        public a(UUID uuid, Bitmap bitmap, Uri uri) {
            zq3.h(uuid, "callId");
            this.a = uuid;
            this.b = bitmap;
            this.c = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (h.w("content", scheme, true)) {
                    this.f = true;
                    String authority = uri.getAuthority();
                    this.g = (authority == null || h.K(authority, "media", false, 2, null)) ? false : true;
                } else if (h.w(TransferTable.COLUMN_FILE, uri.getScheme(), true)) {
                    this.g = true;
                } else if (!g29.a0(uri)) {
                    throw new FacebookException(zq3.q("Unsupported scheme for media Uri : ", scheme));
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.g = true;
            }
            String uuid2 = this.g ? UUID.randomUUID().toString() : null;
            this.e = uuid2;
            this.d = !this.g ? String.valueOf(uri) : f92.a.a(w92.m(), uuid, uuid2);
        }

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final Bitmap c() {
            return this.b;
        }

        public final UUID d() {
            return this.a;
        }

        public final Uri e() {
            return this.c;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean g() {
            return this.f;
        }
    }

    static {
        String name = w15.class.getName();
        zq3.g(name, "NativeAppCallAttachmentStore::class.java.name");
        b = name;
    }

    private w15() {
    }

    public static final void a(Collection collection) {
        File g;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (c == null) {
            b();
        }
        f();
        ArrayList<File> arrayList = new ArrayList();
        try {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (aVar.f() && (g = g(aVar.d(), aVar.a(), true)) != null) {
                    arrayList.add(g);
                    if (aVar.c() != null) {
                        a.j(aVar.c(), g);
                    } else if (aVar.e() != null) {
                        a.k(aVar.e(), aVar.g(), g);
                    }
                }
            }
        } catch (IOException e) {
            Log.e(b, zq3.q("Got unexpected exception:", e));
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e);
        }
    }

    public static final void b() {
        File h = h();
        if (h == null) {
            return;
        }
        lf2.m(h);
    }

    public static final void c(UUID uuid) {
        zq3.h(uuid, "callId");
        File i = i(uuid, false);
        if (i == null) {
            return;
        }
        lf2.m(i);
    }

    public static final a d(UUID uuid, Bitmap bitmap) {
        zq3.h(uuid, "callId");
        zq3.h(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null);
    }

    public static final a e(UUID uuid, Uri uri) {
        zq3.h(uuid, "callId");
        zq3.h(uri, "attachmentUri");
        return new a(uuid, null, uri);
    }

    public static final File f() {
        File h = h();
        if (h != null) {
            h.mkdirs();
        }
        return h;
    }

    public static final File g(UUID uuid, String str, boolean z) {
        zq3.h(uuid, "callId");
        File i = i(uuid, z);
        if (i == null) {
            return null;
        }
        try {
            return new File(i, URLEncoder.encode(str, Constants.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File h() {
        File file;
        synchronized (w15.class) {
            try {
                if (c == null) {
                    c = new File(w92.l().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
                }
                file = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public static final File i(UUID uuid, boolean z) {
        zq3.h(uuid, "callId");
        if (c == null) {
            return null;
        }
        File file = new File(c, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final void j(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            g29.j(fileOutputStream);
        }
    }

    private final void k(Uri uri, boolean z, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            g29.p(!z ? new FileInputStream(uri.getPath()) : w92.l().getContentResolver().openInputStream(uri), fileOutputStream);
            g29.j(fileOutputStream);
        } catch (Throwable th) {
            g29.j(fileOutputStream);
            throw th;
        }
    }
}
