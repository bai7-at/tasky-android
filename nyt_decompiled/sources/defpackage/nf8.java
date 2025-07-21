package defpackage;

import android.database.Cursor;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import defpackage.mf8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class nf8 {
    private static final Map a(sc8 sc8Var, String str) {
        Cursor T0 = sc8Var.T0("PRAGMA table_info(`" + str + "`)");
        try {
            if (T0.getColumnCount() <= 0) {
                Map i = t.i();
                gm0.a(T0, null);
                return i;
            }
            int columnIndex = T0.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex2 = T0.getColumnIndex(TransferTable.COLUMN_TYPE);
            int columnIndex3 = T0.getColumnIndex("notnull");
            int columnIndex4 = T0.getColumnIndex("pk");
            int columnIndex5 = T0.getColumnIndex("dflt_value");
            Map c = t.c();
            while (T0.moveToNext()) {
                String string = T0.getString(columnIndex);
                String string2 = T0.getString(columnIndex2);
                boolean z = T0.getInt(columnIndex3) != 0;
                int i2 = T0.getInt(columnIndex4);
                String string3 = T0.getString(columnIndex5);
                zq3.g(string, AuthenticationTokenClaims.JSON_KEY_NAME);
                zq3.g(string2, TransferTable.COLUMN_TYPE);
                c.put(string, new mf8.a(string, string2, z, i2, string3, 2));
            }
            Map b = t.b(c);
            gm0.a(T0, null);
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gm0.a(T0, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c = i.c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            zq3.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            zq3.g(string2, "cursor.getString(toColumnIndex)");
            c.add(new mf8.d(i, i2, string, string2));
        }
        return i.M0(i.a(c));
    }

    private static final Set c(sc8 sc8Var, String str) {
        Cursor T0 = sc8Var.T0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = T0.getColumnIndex("id");
            int columnIndex2 = T0.getColumnIndex("seq");
            int columnIndex3 = T0.getColumnIndex("table");
            int columnIndex4 = T0.getColumnIndex("on_delete");
            int columnIndex5 = T0.getColumnIndex("on_update");
            List b = b(T0);
            T0.moveToPosition(-1);
            Set b2 = b0.b();
            while (T0.moveToNext()) {
                if (T0.getInt(columnIndex2) == 0) {
                    int i = T0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<mf8.d> arrayList3 = new ArrayList();
                    for (Object obj : b) {
                        if (((mf8.d) obj).c() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (mf8.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = T0.getString(columnIndex3);
                    zq3.g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = T0.getString(columnIndex4);
                    zq3.g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = T0.getString(columnIndex5);
                    zq3.g(string3, "cursor.getString(onUpdateColumnIndex)");
                    b2.add(new mf8.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a = b0.a(b2);
            gm0.a(T0, null);
            return a;
        } finally {
        }
    }

    private static final mf8.e d(sc8 sc8Var, String str, boolean z) {
        Cursor T0 = sc8Var.T0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = T0.getColumnIndex("seqno");
            int columnIndex2 = T0.getColumnIndex("cid");
            int columnIndex3 = T0.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex4 = T0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (T0.moveToNext()) {
                    if (T0.getInt(columnIndex2) >= 0) {
                        int i = T0.getInt(columnIndex);
                        String string = T0.getString(columnIndex3);
                        String str2 = T0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        zq3.g(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                zq3.g(values, "columnsMap.values");
                List X0 = i.X0(values);
                Collection values2 = treeMap2.values();
                zq3.g(values2, "ordersMap.values");
                mf8.e eVar = new mf8.e(str, z, X0, i.X0(values2));
                gm0.a(T0, null);
                return eVar;
            }
            gm0.a(T0, null);
            return null;
        } finally {
        }
    }

    private static final Set e(sc8 sc8Var, String str) {
        Cursor T0 = sc8Var.T0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = T0.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex2 = T0.getColumnIndex("origin");
            int columnIndex3 = T0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set b = b0.b();
                while (T0.moveToNext()) {
                    if (zq3.c(QueryKeys.TIME_ON_VIEW_IN_MINUTES, T0.getString(columnIndex2))) {
                        String string = T0.getString(columnIndex);
                        boolean z = true;
                        if (T0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        zq3.g(string, AuthenticationTokenClaims.JSON_KEY_NAME);
                        mf8.e d = d(sc8Var, string, z);
                        if (d == null) {
                            gm0.a(T0, null);
                            return null;
                        }
                        b.add(d);
                    }
                }
                Set a = b0.a(b);
                gm0.a(T0, null);
                return a;
            }
            gm0.a(T0, null);
            return null;
        } finally {
        }
    }

    public static final mf8 f(sc8 sc8Var, String str) {
        zq3.h(sc8Var, "database");
        zq3.h(str, "tableName");
        return new mf8(str, a(sc8Var, str), c(sc8Var, str), e(sc8Var, str));
    }
}
