package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.s11;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class a21 {
    private static final i91 a = new kt3().j(zz.a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Object a(JsonReader jsonReader);
    }

    private static s11 A(JsonReader jsonReader) {
        s11.b b = s11.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "ndkPayload":
                    b.f(y(jsonReader));
                    break;
                case "sdkVersion":
                    b.h(jsonReader.nextString());
                    break;
                case "buildVersion":
                    b.b(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    b.d(jsonReader.nextString());
                    break;
                case "installationUuid":
                    b.e(jsonReader.nextString());
                    break;
                case "platform":
                    b.g(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    b.c(jsonReader.nextString());
                    break;
                case "session":
                    b.i(B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.a();
    }

    private static s11.e B(JsonReader jsonReader) {
        s11.e.b a2 = s11.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "startedAt":
                    a2.l(jsonReader.nextLong());
                    break;
                case "identifier":
                    a2.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    a2.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    a2.d(m(jsonReader));
                    break;
                case "events":
                    a2.f(k(jsonReader, new a() { // from class: v11
                        @Override // a21.a
                        public final Object a(JsonReader jsonReader2) {
                            s11.e.d n;
                            n = a21.n(jsonReader2);
                            return n;
                        }
                    }));
                    break;
                case "os":
                    a2.k(z(jsonReader));
                    break;
                case "app":
                    a2.b(i(jsonReader));
                    break;
                case "user":
                    a2.m(C(jsonReader));
                    break;
                case "generator":
                    a2.g(jsonReader.nextString());
                    break;
                case "crashed":
                    a2.c(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    a2.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.f C(JsonReader jsonReader) {
        s11.e.f.a a2 = s11.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("identifier")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.a i(JsonReader jsonReader) {
        s11.e.a.AbstractC0522a a2 = s11.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "identifier":
                    a2.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    a2.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    a2.c(jsonReader.nextString());
                    break;
                case "version":
                    a2.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    a2.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.a j(JsonReader jsonReader) {
        s11.a.AbstractC0521a a2 = s11.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "pid":
                    a2.c(jsonReader.nextInt());
                    break;
                case "pss":
                    a2.e(jsonReader.nextLong());
                    break;
                case "rss":
                    a2.g(jsonReader.nextLong());
                    break;
                case "timestamp":
                    a2.h(jsonReader.nextLong());
                    break;
                case "processName":
                    a2.d(jsonReader.nextString());
                    break;
                case "reasonCode":
                    a2.f(jsonReader.nextInt());
                    break;
                case "traceFile":
                    a2.i(jsonReader.nextString());
                    break;
                case "importance":
                    a2.b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static nh3 k(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return nh3.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.c l(JsonReader jsonReader) {
        s11.c.a a2 = s11.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(TransferTable.COLUMN_KEY)) {
                a2.b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                a2.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.c m(JsonReader jsonReader) {
        s11.e.c.a a2 = s11.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "simulator":
                    a2.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    a2.e(jsonReader.nextString());
                    break;
                case "ram":
                    a2.h(jsonReader.nextLong());
                    break;
                case "arch":
                    a2.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    a2.d(jsonReader.nextLong());
                    break;
                case "cores":
                    a2.c(jsonReader.nextInt());
                    break;
                case "model":
                    a2.f(jsonReader.nextString());
                    break;
                case "state":
                    a2.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    a2.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.e.d n(JsonReader jsonReader) {
        s11.e.d.b a2 = s11.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "device":
                    a2.c(q(jsonReader));
                    break;
                case "app":
                    a2.b(o(jsonReader));
                    break;
                case "log":
                    a2.d(u(jsonReader));
                    break;
                case "type":
                    a2.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    a2.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.a o(JsonReader jsonReader) {
        s11.e.d.a.AbstractC0523a a2 = s11.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "background":
                    a2.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    a2.d(r(jsonReader));
                    break;
                case "internalKeys":
                    a2.e(k(jsonReader, new a() { // from class: u11
                        @Override // a21.a
                        public final Object a(JsonReader jsonReader2) {
                            s11.c l;
                            l = a21.l(jsonReader2);
                            return l;
                        }
                    }));
                    break;
                case "customAttributes":
                    a2.c(k(jsonReader, new a() { // from class: u11
                        @Override // a21.a
                        public final Object a(JsonReader jsonReader2) {
                            s11.c l;
                            l = a21.l(jsonReader2);
                            return l;
                        }
                    }));
                    break;
                case "uiOrientation":
                    a2.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.e.d.a.b.AbstractC0524a p(JsonReader jsonReader) {
        s11.e.d.a.b.AbstractC0524a.AbstractC0525a a2 = s11.e.d.a.b.AbstractC0524a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "name":
                    a2.c(jsonReader.nextString());
                    break;
                case "size":
                    a2.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    a2.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    a2.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.c q(JsonReader jsonReader) {
        s11.e.d.c.a a2 = s11.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "batteryLevel":
                    a2.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    a2.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    a2.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    a2.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    a2.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    a2.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.a.b r(JsonReader jsonReader) {
        s11.e.d.a.b.AbstractC0526b a2 = s11.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appExitInfo":
                    a2.b(j(jsonReader));
                    break;
                case "threads":
                    a2.f(k(jsonReader, new a() { // from class: x11
                        @Override // a21.a
                        public final Object a(JsonReader jsonReader2) {
                            s11.e.d.a.b.AbstractC0530e w;
                            w = a21.w(jsonReader2);
                            return w;
                        }
                    }));
                    break;
                case "signal":
                    a2.e(v(jsonReader));
                    break;
                case "binaries":
                    a2.c(k(jsonReader, new a() { // from class: y11
                        @Override // a21.a
                        public final Object a(JsonReader jsonReader2) {
                            s11.e.d.a.b.AbstractC0524a p;
                            p = a21.p(jsonReader2);
                            return p;
                        }
                    }));
                    break;
                case "exception":
                    a2.d(s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.a.b.c s(JsonReader jsonReader) {
        s11.e.d.a.b.c.AbstractC0527a a2 = s11.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a2.c(k(jsonReader, new z11()));
                    break;
                case "reason":
                    a2.e(jsonReader.nextString());
                    break;
                case "type":
                    a2.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    a2.b(s(jsonReader));
                    break;
                case "overflowCount":
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.e.d.a.b.AbstractC0530e.AbstractC0532b t(JsonReader jsonReader) {
        s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a a2 = s11.e.d.a.b.AbstractC0530e.AbstractC0532b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "offset":
                    a2.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    a2.f(jsonReader.nextString());
                    break;
                case "pc":
                    a2.e(jsonReader.nextLong());
                    break;
                case "file":
                    a2.b(jsonReader.nextString());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.AbstractC0534d u(JsonReader jsonReader) {
        s11.e.d.AbstractC0534d.a a2 = s11.e.d.AbstractC0534d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("content")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.d.a.b.AbstractC0528d v(JsonReader jsonReader) {
        s11.e.d.a.b.AbstractC0528d.AbstractC0529a a2 = s11.e.d.a.b.AbstractC0528d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "address":
                    a2.b(jsonReader.nextLong());
                    break;
                case "code":
                    a2.c(jsonReader.nextString());
                    break;
                case "name":
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.e.d.a.b.AbstractC0530e w(JsonReader jsonReader) {
        s11.e.d.a.b.AbstractC0530e.AbstractC0531a a2 = s11.e.d.a.b.AbstractC0530e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a2.b(k(jsonReader, new z11()));
                    break;
                case "name":
                    a2.d(jsonReader.nextString());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s11.d.b x(JsonReader jsonReader) {
        s11.d.b.a a2 = s11.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                a2.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.d y(JsonReader jsonReader) {
        s11.d.a a2 = s11.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a2.b(k(jsonReader, new a() { // from class: w11
                    @Override // a21.a
                    public final Object a(JsonReader jsonReader2) {
                        s11.d.b x;
                        x = a21.x(jsonReader2);
                        return x;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                a2.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static s11.e.AbstractC0535e z(JsonReader jsonReader) {
        s11.e.AbstractC0535e.a a2 = s11.e.AbstractC0535e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildVersion":
                    a2.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    a2.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    a2.e(jsonReader.nextString());
                    break;
                case "platform":
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    public s11 D(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                s11 A = A(jsonReader);
                jsonReader.close();
                return A;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String E(s11 s11Var) {
        return a.b(s11Var);
    }

    public s11.e.d g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                s11.e.d n = n(jsonReader);
                jsonReader.close();
                return n;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String h(s11.e.d dVar) {
        return a.b(dVar);
    }
}
