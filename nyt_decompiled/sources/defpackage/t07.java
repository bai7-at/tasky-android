package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q22;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class t07 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.q22 a(com.apollographql.apollo.api.json.JsonReader r9) {
        /*
            r9.beginObject()
            java.lang.String r0 = ""
            r1 = 0
            r3 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        Lb:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L70
            java.lang.String r2 = r9.nextName()
            int r8 = r2.hashCode()
            switch(r8) {
                case -1809421292: goto L4b;
                case -1197189282: goto L3d;
                case 3433509: goto L2f;
                case 954925063: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r8 = "message"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L53
            java.lang.String r2 = r9.nextString()
            if (r2 != 0) goto L2d
            r3 = r0
            goto Lb
        L2d:
            r3 = r2
            goto Lb
        L2f:
            java.lang.String r8 = "path"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L38
            goto L53
        L38:
            java.util.List r5 = e(r9)
            goto Lb
        L3d:
            java.lang.String r8 = "locations"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L46
            goto L53
        L46:
            java.util.List r4 = c(r9)
            goto Lb
        L4b:
            java.lang.String r8 = "extensions"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L62
        L53:
            if (r7 != 0) goto L5a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
        L5a:
            java.lang.Object r8 = com.apollographql.apollo.api.json.a.d(r9)
            r7.put(r2, r8)
            goto Lb
        L62:
            java.lang.Object r2 = com.apollographql.apollo.api.json.a.d(r9)
            boolean r6 = r2 instanceof java.util.Map
            if (r6 == 0) goto L6e
            java.util.Map r2 = (java.util.Map) r2
            r6 = r2
            goto Lb
        L6e:
            r6 = r1
            goto Lb
        L70:
            r9.endObject()
            q22 r9 = new q22
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t07.a(com.apollographql.apollo.api.json.JsonReader):q22");
    }

    private static final q22.a b(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (zq3.c(nextName, "line")) {
                i = jsonReader.nextInt();
            } else if (zq3.c(nextName, "column")) {
                i2 = jsonReader.nextInt();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new q22.a(i, i2);
    }

    private static final List c(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonReader.Token.NULL) {
            return (List) jsonReader.U0();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static final List d(JsonReader jsonReader) {
        zq3.h(jsonReader, "<this>");
        if (jsonReader.peek() == JsonReader.Token.NULL) {
            jsonReader.U0();
            return i.l();
        }
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(a(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static final List e(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonReader.Token.NULL) {
            return (List) jsonReader.U0();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = a.a[jsonReader.peek().ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(Integer.valueOf(jsonReader.nextInt()));
            } else {
                String nextString = jsonReader.nextString();
                zq3.e(nextString);
                arrayList.add(nextString);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }
}
