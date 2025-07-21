package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.WindowState;
import defpackage.fn2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
abstract class rm2 {
    private static final Comparator a = new Comparator() { // from class: qm2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = rm2.g((byte[]) obj, (byte[]) obj2);
            return g;
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {
        private final ContentProviderClient a;

        b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // rm2.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // rm2.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List d(sm2 sm2Var, Resources resources) {
        return sm2Var.b() != null ? sm2Var.b() : um2.c(resources, sm2Var.c());
    }

    static fn2.a e(Context context, sm2 sm2Var, CancellationSignal cancellationSignal) {
        ProviderInfo f = f(context.getPackageManager(), sm2Var, context.getResources());
        return f == null ? fn2.a.a(1, null) : fn2.a.a(0, h(context, sm2Var, f.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, sm2 sm2Var, Resources resources) {
        String e = sm2Var.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        }
        if (!resolveContentProvider.packageName.equals(sm2Var.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + sm2Var.f());
        }
        List b2 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b2, a);
        List d = d(sm2Var, resources);
        for (int i = 0; i < d.size(); i++) {
            ArrayList arrayList = new ArrayList((Collection) d.get(i));
            Collections.sort(arrayList, a);
            if (c(b2, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    static fn2.b[] h(Context context, sm2 sm2Var, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList;
        Uri withAppendedId;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(TransferTable.COLUMN_FILE).build();
        a a2 = a.a(context, build);
        Cursor cursor = null;
        try {
            cursor = a2.b(build, new String[]{TransferTable.COLUMN_ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{sm2Var.g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(TransferTable.COLUMN_ID);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i3 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : WindowState.NORMAL;
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            fn2.b a3 = fn2.b.a(withAppendedId, i2, i3, z, i);
                            arrayList3 = arrayList;
                            arrayList3.add(a3);
                        }
                    }
                    z = false;
                    fn2.b a32 = fn2.b.a(withAppendedId, i2, i3, z, i);
                    arrayList3 = arrayList;
                    arrayList3.add(a32);
                }
                arrayList2 = arrayList3;
            }
            if (cursor != null) {
                cursor.close();
            }
            a2.close();
            return (fn2.b[]) arrayList2.toArray(new fn2.b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            a2.close();
            throw th;
        }
    }
}
