package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
class pl8 {
    private static final te2 f = new te2();
    private final te2 a;
    private final ol8 b;
    private final to c;
    private final ContentResolver d;
    private final List e;

    pl8(List list, ol8 ol8Var, to toVar, ContentResolver contentResolver) {
        this(list, f, ol8Var, toVar, contentResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            ol8 r5 = r5.b     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            android.database.Cursor r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            if (r5 == 0) goto L1f
            boolean r2 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r2 == 0) goto L1f
            r2 = 0
            java.lang.String r6 = r5.getString(r2)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r5.close()
            return r6
        L1a:
            r6 = move-exception
            r1 = r5
            goto L4a
        L1d:
            r2 = move-exception
            goto L29
        L1f:
            if (r5 == 0) goto L24
            r5.close()
        L24:
            return r1
        L25:
            r6 = move-exception
            goto L4a
        L27:
            r2 = move-exception
            r5 = r1
        L29:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r3.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Failed to query for thumbnail for Uri: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1a
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            android.util.Log.d(r0, r6, r2)     // Catch: java.lang.Throwable -> L1a
        L44:
            if (r5 == 0) goto L49
            r5.close()
        L49:
            return r1
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl8.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.a.a(file) && 0 < this.a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.d.openInputStream(uri);
                int b = a.b(this.e, inputStream, this.c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) {
        String b = b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.a.b(b);
        if (!c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    pl8(List list, te2 te2Var, ol8 ol8Var, to toVar, ContentResolver contentResolver) {
        this.a = te2Var;
        this.b = ol8Var;
        this.c = toVar;
        this.d = contentResolver;
        this.e = list;
    }
}
