package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import kotlin.collections.d;

/* loaded from: classes.dex */
public abstract class q41 {
    public static final Cursor a(Cursor cursor) {
        zq3.h(cursor, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type2 = cursor.getType(i);
                    if (type2 == 0) {
                        objArr[i] = null;
                    } else if (type2 == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type2 == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type2 == 3) {
                        objArr[i] = cursor.getString(i);
                    } else {
                        if (type2 != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = cursor.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            gm0.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor cursor, String str) {
        zq3.h(cursor, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int d(Cursor cursor, String str) {
        String str2;
        zq3.h(cursor, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        int c = c(cursor, str);
        if (c >= 0) {
            return c;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            zq3.g(columnNames, "c.columnNames");
            str2 = d.r0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
