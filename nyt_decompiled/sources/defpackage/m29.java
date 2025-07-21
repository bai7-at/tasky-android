package defpackage;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.d;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m29 {
    public static final m29 a = new m29();

    private m29() {
    }

    public static final File a() {
        if (c11.d(m29.class)) {
            return null;
        }
        try {
            File file = new File(w92.l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            c11.b(th, m29.class);
            return null;
        }
    }

    public static final Map c(File file) {
        Map map;
        Map map2 = null;
        if (c11.d(m29.class)) {
            return null;
        }
        try {
            zq3.h(file, TransferTable.COLUMN_FILE);
        } catch (Throwable th) {
            th = th;
            map = null;
        }
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, yj0.b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i4 = length - 1;
                if (i4 >= 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        strArr[i5] = names.getString(i5);
                        if (i6 > i4) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                d.F(strArr);
                HashMap hashMap = new HashMap();
                int i7 = 0;
                while (i7 < length) {
                    String str = strArr[i7];
                    i7++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i8 = length2 - 1;
                        int i9 = 1;
                        if (i8 >= 0) {
                            while (true) {
                                int i10 = i + 1;
                                try {
                                    int i11 = jSONArray.getInt(i);
                                    iArr[i] = i11;
                                    i9 *= i11;
                                    if (i10 > i8) {
                                        break;
                                    }
                                    i = i10;
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        }
                        int i12 = i9 * 4;
                        int i13 = i3 + i12;
                        if (i13 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i12);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        ld4 ld4Var = new ld4(iArr);
                        wrap2.asFloatBuffer().get(ld4Var.a(), 0, i9);
                        hashMap.put(str, ld4Var);
                        i3 = i13;
                        i = 0;
                        map2 = null;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
            c11.b(th, m29.class);
            return map;
        }
    }

    public final String b(String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(str, "str");
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = zq3.j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            Object[] array = new Regex("\\s+").g(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            zq3.g(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final int[] d(String str, int i) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(str, "texts");
            int[] iArr = new int[i];
            String b = b(str);
            Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
            zq3.g(forName, "forName(\"UTF-8\")");
            if (b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b.getBytes(forName);
            zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 < bytes.length) {
                        iArr[i2] = bytes[i2] & 255;
                    } else {
                        iArr[i2] = 0;
                    }
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return iArr;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }
}
