package defpackage;

import com.nytimes.android.growthui.common.models.config.OffersMessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public interface bd5 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final bd5 a(List list) {
            Object obj;
            Object obj2;
            OffersMessageType offersMessageType;
            zq3.h(list, "offerDetails");
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (ad5.a((zc5) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                list = arrayList;
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return b.a;
            }
            List list3 = list2;
            Iterator it2 = list3.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (ad5.a((zc5) obj2)) {
                    break;
                }
            }
            if (obj2 != null) {
                offersMessageType = OffersMessageType.FreeTrialMessage;
            } else {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (ad5.b((zc5) next)) {
                        obj = next;
                        break;
                    }
                }
                offersMessageType = obj != null ? OffersMessageType.SaleMessage : OffersMessageType.BauMessage;
            }
            return new c(new oh3(list2), offersMessageType);
        }
    }

    public static final class b implements bd5 {
        public static final b a = new b();

        private b() {
        }
    }

    public static final class c implements bd5 {
        private final oh3 a;
        private final OffersMessageType b;

        public c(oh3 oh3Var, OffersMessageType offersMessageType) {
            zq3.h(oh3Var, "offerDetails");
            zq3.h(offersMessageType, "messageType");
            this.a = oh3Var;
            this.b = offersMessageType;
        }

        public final OffersMessageType a() {
            return this.b;
        }

        public final oh3 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Ready(offerDetails=" + this.a + ", messageType=" + this.b + ")";
        }
    }
}
