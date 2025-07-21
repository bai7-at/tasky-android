package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cr6;
import defpackage.dd9;
import defpackage.s;
import defpackage.s02;
import defpackage.sr6;
import defpackage.t02;
import defpackage.ur6;
import defpackage.y48;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface MemoryCache {

    public static final class a {
        private final Context a;
        private double b;
        private int c;
        private boolean d = true;
        private boolean e = true;

        public a(Context context) {
            this.a = context;
            this.b = s.e(context);
        }

        public final MemoryCache a() {
            y48 s02Var;
            dd9 ur6Var = this.e ? new ur6() : new t02();
            if (this.d) {
                double d = this.b;
                int c = d > 0.0d ? s.c(this.a, d) : this.c;
                s02Var = c > 0 ? new sr6(c, ur6Var) : new s02(ur6Var);
            } else {
                s02Var = new s02(ur6Var);
            }
            return new cr6(s02Var, ur6Var);
        }
    }

    public static final class b {
        private final Bitmap a;
        private final Map b;

        public b(Bitmap bitmap, Map map) {
            this.a = bitmap;
            this.b = map;
        }

        public final Bitmap a() {
            return this.a;
        }

        public final Map b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
        }
    }

    void a(int i);

    b b(Key key);

    void c(Key key, b bVar);

    public static final class Key implements Parcelable {
        private final Map<String, String> extras;
        private final String key;
        private static final b Companion = new b(null);

        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                zq3.e(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    zq3.e(readString2);
                    String readString3 = parcel.readString();
                    zq3.e(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Key(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i) {
                return new Key[i];
            }
        }

        private static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public Key(String str, Map map) {
            this.key = str;
            this.extras = map;
        }

        public static /* synthetic */ Key b(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.key;
            }
            if ((i & 2) != 0) {
                map = key.extras;
            }
            return key.a(str, map);
        }

        public final Key a(String str, Map map) {
            return new Key(str, map);
        }

        public final Map c() {
            return this.extras;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (zq3.c(this.key, key.key) && zq3.c(this.extras, key.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry<String, String> entry : this.extras.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? t.i() : map);
        }
    }
}
