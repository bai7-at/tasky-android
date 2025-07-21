package com.nytimes.android.internal.pushmessaging.tagmanager;

import defpackage.by0;
import defpackage.et3;
import defpackage.tf8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* loaded from: classes4.dex */
public interface TagMetadataAPI {
    public static final a Companion = a.a;

    @et3(generateAdapter = true)
    public static final class TagGroup {
        private final String a;
        private final List b;

        public TagGroup(String str, List list) {
            zq3.h(str, "title");
            zq3.h(list, "tags");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagGroup)) {
                return false;
            }
            TagGroup tagGroup = (TagGroup) obj;
            return zq3.c(this.a, tagGroup.a) && zq3.c(this.b, tagGroup.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "TagGroup(title=" + this.a + ", tags=" + this.b + ")";
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final List a(List list) {
            zq3.h(list, "<this>");
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TagGroup tagGroup = (TagGroup) it2.next();
                for (InnerTag innerTag : tagGroup.a()) {
                    arrayList.add(new tf8(innerTag.c(), innerTag.e(), innerTag.d(), innerTag.a(), innerTag.b(), tagGroup.b()));
                }
            }
            return arrayList;
        }
    }

    @GET("messaging/notifications/tags/v1/{appId}/current.json")
    Object getTagMetadata(@Path("appId") String str, by0<? super Response<List<TagGroup>>> by0Var);

    @et3(generateAdapter = true)
    public static final class InnerTag {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final boolean e;

        public InnerTag(String str, String str2, String str3, boolean z, boolean z2) {
            zq3.h(str, "tag");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
        }

        public final boolean a() {
            return this.d;
        }

        public final boolean b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerTag)) {
                return false;
            }
            InnerTag innerTag = (InnerTag) obj;
            return zq3.c(this.a, innerTag.a) && zq3.c(this.b, innerTag.b) && zq3.c(this.c, innerTag.c) && this.d == innerTag.d && this.e == innerTag.e;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            return "InnerTag(tag=" + this.a + ", title=" + this.b + ", tagDescription=" + this.c + ", default=" + this.d + ", pushkinTag=" + this.e + ")";
        }

        public /* synthetic */ InnerTag(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
