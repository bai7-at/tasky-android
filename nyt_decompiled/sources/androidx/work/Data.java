package androidx.work;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gm0;
import defpackage.h94;
import defpackage.ra1;
import defpackage.ss2;
import defpackage.vu3;
import defpackage.zq3;
import defpackage.zt6;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class Data {
    public static final b b = new b(null);
    public static final Data c = new a().a();
    private final Map a;

    public static final class a {
        private final Map a = new LinkedHashMap();

        private final a i(String str, Object obj) {
            this.a.put(str, obj);
            return this;
        }

        public final Data a() {
            Data data = new Data(this.a);
            Data.b.e(data);
            return data;
        }

        public final a b(String str, Object obj) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            Map map = this.a;
            if (obj == null) {
                obj = null;
            } else {
                vu3 b = zt6.b(obj.getClass());
                if (!(zq3.c(b, zt6.b(Boolean.TYPE)) ? true : zq3.c(b, zt6.b(Byte.TYPE)) ? true : zq3.c(b, zt6.b(Integer.TYPE)) ? true : zq3.c(b, zt6.b(Long.TYPE)) ? true : zq3.c(b, zt6.b(Float.TYPE)) ? true : zq3.c(b, zt6.b(Double.TYPE)) ? true : zq3.c(b, zt6.b(String.class)) ? true : zq3.c(b, zt6.b(Boolean[].class)) ? true : zq3.c(b, zt6.b(Byte[].class)) ? true : zq3.c(b, zt6.b(Integer[].class)) ? true : zq3.c(b, zt6.b(Long[].class)) ? true : zq3.c(b, zt6.b(Float[].class)) ? true : zq3.c(b, zt6.b(Double[].class)) ? true : zq3.c(b, zt6.b(String[].class)))) {
                    if (zq3.c(b, zt6.b(boolean[].class))) {
                        obj = ra1.h((boolean[]) obj);
                    } else if (zq3.c(b, zt6.b(byte[].class))) {
                        obj = ra1.i((byte[]) obj);
                    } else if (zq3.c(b, zt6.b(int[].class))) {
                        obj = ra1.l((int[]) obj);
                    } else if (zq3.c(b, zt6.b(long[].class))) {
                        obj = ra1.m((long[]) obj);
                    } else if (zq3.c(b, zt6.b(float[].class))) {
                        obj = ra1.k((float[]) obj);
                    } else {
                        if (!zq3.c(b, zt6.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + b);
                        }
                        obj = ra1.j((double[]) obj);
                    }
                }
            }
            map.put(str, obj);
            return this;
        }

        public final a c(Data data) {
            zq3.h(data, "data");
            d(data.a);
            return this;
        }

        public final a d(Map map) {
            zq3.h(map, "values");
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a e(String str, boolean z) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, Boolean.valueOf(z));
        }

        public final a f(String str, boolean[] zArr) {
            Boolean[] h;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(zArr, "value");
            Map map = this.a;
            h = ra1.h(zArr);
            map.put(str, h);
            return this;
        }

        public final a g(String str, byte b) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, Byte.valueOf(b));
        }

        public final a h(String str, byte[] bArr) {
            Byte[] i;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(bArr, "value");
            Map map = this.a;
            i = ra1.i(bArr);
            map.put(str, i);
            return this;
        }

        public final a j(String str, double d) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, Double.valueOf(d));
        }

        public final a k(String str, double[] dArr) {
            Double[] j;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(dArr, "value");
            Map map = this.a;
            j = ra1.j(dArr);
            map.put(str, j);
            return this;
        }

        public final a l(String str, int i) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, Integer.valueOf(i));
        }

        public final a m(String str, int[] iArr) {
            Integer[] l;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(iArr, "value");
            Map map = this.a;
            l = ra1.l(iArr);
            map.put(str, l);
            return this;
        }

        public final a n(String str, long j) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, Long.valueOf(j));
        }

        public final a o(String str, long[] jArr) {
            Long[] m;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(jArr, "value");
            Map map = this.a;
            m = ra1.m(jArr);
            map.put(str, m);
            return this;
        }

        public final a p(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            return i(str, str2);
        }

        public final a q(String str, String[] strArr) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(strArr, "value");
            return i(str, strArr);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b = (byte) (-21267);
            boolean z = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void c(DataInputStream dataInputStream) {
            short readShort = dataInputStream.readShort();
            if (readShort != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) readShort)).toString());
            }
            short readShort2 = dataInputStream.readShort();
            if (readShort2 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) readShort2)).toString());
        }

        private static final Object d(DataInputStream dataInputStream, byte b) {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int readInt = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[readInt];
                while (i < readInt) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return boolArr;
            }
            if (b == 9) {
                int readInt2 = dataInputStream.readInt();
                Byte[] bArr = new Byte[readInt2];
                while (i < readInt2) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return bArr;
            }
            if (b == 10) {
                int readInt3 = dataInputStream.readInt();
                Integer[] numArr = new Integer[readInt3];
                while (i < readInt3) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return numArr;
            }
            if (b == 11) {
                int readInt4 = dataInputStream.readInt();
                Long[] lArr = new Long[readInt4];
                while (i < readInt4) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return lArr;
            }
            if (b == 12) {
                int readInt5 = dataInputStream.readInt();
                Float[] fArr = new Float[readInt5];
                while (i < readInt5) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return fArr;
            }
            if (b == 13) {
                int readInt6 = dataInputStream.readInt();
                Double[] dArr = new Double[readInt6];
                while (i < readInt6) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return dArr;
            }
            if (b != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b));
            }
            int readInt7 = dataInputStream.readInt();
            String[] strArr = new String[readInt7];
            while (i < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (zq3.c(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                strArr[i] = readUTF;
                i++;
            }
            return strArr;
        }

        private static final void f(DataOutputStream dataOutputStream, Object[] objArr) {
            int i;
            vu3 b = zt6.b(objArr.getClass());
            if (zq3.c(b, zt6.b(Boolean[].class))) {
                i = 8;
            } else if (zq3.c(b, zt6.b(Byte[].class))) {
                i = 9;
            } else if (zq3.c(b, zt6.b(Integer[].class))) {
                i = 10;
            } else if (zq3.c(b, zt6.b(Long[].class))) {
                i = 11;
            } else if (zq3.c(b, zt6.b(Float[].class))) {
                i = 12;
            } else if (zq3.c(b, zt6.b(Double[].class))) {
                i = 13;
            } else {
                if (!zq3.c(b, zt6.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + zt6.b(objArr.getClass()).c());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void g(DataOutputStream dataOutputStream, String str, Object obj) {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + zt6.b(obj.getClass()).d());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void h(DataOutputStream dataOutputStream) {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final Data a(byte[] bArr) {
            String str;
            String str2;
            zq3.h(bArr, "bytes");
            if (bArr.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bArr.length == 0) {
                return Data.c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                int i = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i < readInt) {
                            String readUTF = objectInputStream.readUTF();
                            zq3.g(readUTF, "readUTF()");
                            linkedHashMap.put(readUTF, objectInputStream.readObject());
                            i++;
                        }
                        gm0.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int readInt2 = dataInputStream.readInt();
                        while (i < readInt2) {
                            Object d = d(dataInputStream, dataInputStream.readByte());
                            String readUTF2 = dataInputStream.readUTF();
                            zq3.g(readUTF2, TransferTable.COLUMN_KEY);
                            linkedHashMap.put(readUTF2, d);
                            i++;
                        }
                        gm0.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e) {
                str2 = ra1.a;
                h94.e().d(str2, "Error in Data#fromByteArray: ", e);
            } catch (ClassNotFoundException e2) {
                str = ra1.a;
                h94.e().d(str, "Error in Data#fromByteArray: ", e2);
            }
            return new Data(linkedHashMap);
        }

        public final byte[] e(Data data) {
            String str;
            zq3.h(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.i());
                    for (Map.Entry entry : data.a.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gm0.a(dataOutputStream, null);
                    zq3.g(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                str = ra1.a;
                h94.e().d(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        private b() {
        }
    }

    public Data(Data data) {
        zq3.h(data, "other");
        this.a = new HashMap(data.a);
    }

    public static final Data b(byte[] bArr) {
        return b.a(bArr);
    }

    public static final byte[] j(Data data) {
        return b.e(data);
    }

    public final boolean c(String str, boolean z) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object valueOf = Boolean.valueOf(z);
        Object obj = this.a.get(str);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final int d(String str, int i) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object valueOf = Integer.valueOf(i);
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final Map e() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.a);
        zq3.g(unmodifiableMap, "unmodifiableMap(values)");
        return unmodifiableMap;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !zq3.c(Data.class, obj.getClass())) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> keySet = this.a.keySet();
        if (!zq3.c(keySet, data.a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.a.get(str);
            Object obj3 = data.a.get(str);
            if (obj2 == null || obj3 == null) {
                z = obj2 == obj3;
            } else {
                if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (obj3 instanceof Object[]) {
                        z = kotlin.collections.d.d(objArr, (Object[]) obj3);
                    }
                }
                z = zq3.c(obj2, obj3);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final String f(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] g(String str) {
        Object[] objArr;
        zq3.h(str, TransferTable.COLUMN_KEY);
        final Object obj = this.a.get(str);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        ss2 ss2Var = new ss2() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = ss2Var.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    public final boolean h(String str, Class cls) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(cls, "klass");
        Object obj = this.a.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ kotlin.collections.d.b((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final int i() {
        return this.a.size();
    }

    public String toString() {
        String str = "Data {" + i.u0(this.a.entrySet(), null, null, null, 0, null, new ss2() { // from class: androidx.work.Data$toString$1$content$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry entry) {
                zq3.h(entry, "<name for destructuring parameter 0>");
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    zq3.g(value, "toString(this)");
                }
                sb.append(value);
                return sb.toString();
            }
        }, 31, null) + "}";
        zq3.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public Data(Map map) {
        zq3.h(map, "values");
        this.a = new HashMap(map);
    }
}
