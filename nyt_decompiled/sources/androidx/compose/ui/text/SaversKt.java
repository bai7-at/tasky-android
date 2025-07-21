package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.i;
import defpackage.dh8;
import defpackage.dk8;
import defpackage.ea7;
import defpackage.ek8;
import defpackage.fa7;
import defpackage.fd5;
import defpackage.fk8;
import defpackage.gt2;
import defpackage.gv1;
import defpackage.hd5;
import defpackage.i74;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ni8;
import defpackage.nn0;
import defpackage.no5;
import defpackage.ph8;
import defpackage.pj8;
import defpackage.pv8;
import defpackage.ss2;
import defpackage.uh8;
import defpackage.z49;
import defpackage.zq3;
import defpackage.zy8;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class SaversKt {
    private static final ea7 a = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, a aVar) {
            ea7 ea7Var;
            ea7 ea7Var2;
            ea7 ea7Var3;
            Object t = SaversKt.t(aVar.j());
            List f2 = aVar.f();
            ea7Var = SaversKt.b;
            Object u = SaversKt.u(f2, ea7Var, fa7Var);
            List d2 = aVar.d();
            ea7Var2 = SaversKt.b;
            Object u2 = SaversKt.u(d2, ea7Var2, fa7Var);
            List b2 = aVar.b();
            ea7Var3 = SaversKt.b;
            return kotlin.collections.i.h(t, u, u2, SaversKt.u(b2, ea7Var3, fa7Var));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke(Object obj) {
            ea7 ea7Var;
            ea7 ea7Var2;
            List list;
            List list2;
            ea7 ea7Var3;
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list3 = (List) obj;
            Object obj2 = list3.get(1);
            ea7Var = SaversKt.b;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = (zq3.c(obj2, bool) || obj2 == null) ? null : (List) ea7Var.b(obj2);
            Object obj3 = list3.get(2);
            ea7Var2 = SaversKt.b;
            List list6 = (zq3.c(obj3, bool) || obj3 == null) ? null : (List) ea7Var2.b(obj3);
            Object obj4 = list3.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            zq3.e(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj5 = list3.get(3);
            ea7Var3 = SaversKt.b;
            if (!zq3.c(obj5, bool) && obj5 != null) {
                list4 = (List) ea7Var3.b(obj5);
            }
            return new a(str, list, list2, list4);
        }
    });
    private static final ea7 b = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, List list) {
            ea7 ea7Var;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                a.b bVar = (a.b) list.get(i2);
                ea7Var = SaversKt.c;
                arrayList.add(SaversKt.u(bVar, ea7Var, fa7Var));
            }
            return arrayList;
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(Object obj) {
            ea7 ea7Var;
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                ea7Var = SaversKt.c;
                a.b bVar = null;
                if (!zq3.c(obj2, Boolean.FALSE) && obj2 != null) {
                    bVar = (a.b) ea7Var.b(obj2);
                }
                zq3.e(bVar);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    });
    private static final ea7 c = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, a.b bVar) {
            Object u;
            ea7 ea7Var;
            ea7 ea7Var2;
            Object e2 = bVar.e();
            AnnotationType annotationType = e2 instanceof no5 ? AnnotationType.Paragraph : e2 instanceof jy7 ? AnnotationType.Span : e2 instanceof z49 ? AnnotationType.VerbatimTts : e2 instanceof zy8 ? AnnotationType.Url : AnnotationType.String;
            int i2 = a.a[annotationType.ordinal()];
            if (i2 == 1) {
                Object e3 = bVar.e();
                zq3.f(e3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                u = SaversKt.u((no5) e3, SaversKt.f(), fa7Var);
            } else if (i2 == 2) {
                Object e4 = bVar.e();
                zq3.f(e4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                u = SaversKt.u((jy7) e4, SaversKt.s(), fa7Var);
            } else if (i2 == 3) {
                Object e5 = bVar.e();
                zq3.f(e5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                ea7Var = SaversKt.d;
                u = SaversKt.u((z49) e5, ea7Var, fa7Var);
            } else if (i2 == 4) {
                Object e6 = bVar.e();
                zq3.f(e6, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                ea7Var2 = SaversKt.e;
                u = SaversKt.u((zy8) e6, ea7Var2, fa7Var);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                u = SaversKt.t(bVar.e());
            }
            return kotlin.collections.i.h(SaversKt.t(annotationType), u, SaversKt.t(Integer.valueOf(bVar.f())), SaversKt.t(Integer.valueOf(bVar.d())), SaversKt.t(bVar.g()));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.b invoke(Object obj) {
            ea7 ea7Var;
            ea7 ea7Var2;
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            zq3.e(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            zq3.e(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            zq3.e(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            zq3.e(str);
            int i2 = a.a[annotationType.ordinal()];
            if (i2 == 1) {
                Object obj6 = list.get(1);
                ea7 f2 = SaversKt.f();
                if (!zq3.c(obj6, Boolean.FALSE) && obj6 != null) {
                    r0 = (no5) f2.b(obj6);
                }
                zq3.e(r0);
                return new a.b(r0, intValue, intValue2, str);
            }
            if (i2 == 2) {
                Object obj7 = list.get(1);
                ea7 s2 = SaversKt.s();
                if (!zq3.c(obj7, Boolean.FALSE) && obj7 != null) {
                    r0 = (jy7) s2.b(obj7);
                }
                zq3.e(r0);
                return new a.b(r0, intValue, intValue2, str);
            }
            if (i2 == 3) {
                Object obj8 = list.get(1);
                ea7Var = SaversKt.d;
                if (!zq3.c(obj8, Boolean.FALSE) && obj8 != null) {
                    r0 = (z49) ea7Var.b(obj8);
                }
                zq3.e(r0);
                return new a.b(r0, intValue, intValue2, str);
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj9 = list.get(1);
                r0 = obj9 != null ? (String) obj9 : null;
                zq3.e(r0);
                return new a.b(r0, intValue, intValue2, str);
            }
            Object obj10 = list.get(1);
            ea7Var2 = SaversKt.e;
            if (!zq3.c(obj10, Boolean.FALSE) && obj10 != null) {
                r0 = (zy8) ea7Var2.b(obj10);
            }
            zq3.e(r0);
            return new a.b(r0, intValue, intValue2, str);
        }
    });
    private static final ea7 d = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, z49 z49Var) {
            return SaversKt.t(z49Var.a());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z49 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            zq3.e(str);
            return new z49(str);
        }
    });
    private static final ea7 e = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, zy8 zy8Var) {
            return SaversKt.t(zy8Var.a());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zy8 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            zq3.e(str);
            return new zy8(str);
        }
    });
    private static final ea7 f = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, no5 no5Var) {
            return kotlin.collections.i.h(SaversKt.t(dh8.h(no5Var.h())), SaversKt.t(uh8.g(no5Var.i())), SaversKt.u(dk8.b(no5Var.e()), SaversKt.p(dk8.b), fa7Var), SaversKt.u(no5Var.j(), SaversKt.o(ni8.c), fa7Var));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final no5 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            dh8 dh8Var = obj2 != null ? (dh8) obj2 : null;
            zq3.e(dh8Var);
            int n2 = dh8Var.n();
            Object obj3 = list.get(1);
            uh8 uh8Var = obj3 != null ? (uh8) obj3 : null;
            zq3.e(uh8Var);
            int m2 = uh8Var.m();
            Object obj4 = list.get(2);
            ea7 p2 = SaversKt.p(dk8.b);
            Boolean bool = Boolean.FALSE;
            dk8 dk8Var = (zq3.c(obj4, bool) || obj4 == null) ? null : (dk8) p2.b(obj4);
            zq3.e(dk8Var);
            long k2 = dk8Var.k();
            Object obj5 = list.get(3);
            return new no5(n2, m2, k2, (zq3.c(obj5, bool) || obj5 == null) ? null : (ni8) SaversKt.o(ni8.c).b(obj5), null, null, 0, 0, null, 496, null);
        }
    });
    private static final ea7 g = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, jy7 jy7Var) {
            nn0 j2 = nn0.j(jy7Var.i());
            nn0.a aVar = nn0.b;
            Object u = SaversKt.u(j2, SaversKt.h(aVar), fa7Var);
            dk8 b2 = dk8.b(jy7Var.m());
            dk8.a aVar2 = dk8.b;
            return kotlin.collections.i.h(u, SaversKt.u(b2, SaversKt.p(aVar2), fa7Var), SaversKt.u(jy7Var.p(), SaversKt.r(o.b), fa7Var), SaversKt.t(jy7Var.n()), SaversKt.t(jy7Var.o()), SaversKt.t(-1), SaversKt.t(jy7Var.l()), SaversKt.u(dk8.b(jy7Var.q()), SaversKt.p(aVar2), fa7Var), SaversKt.u(jy7Var.g(), SaversKt.g(m60.b), fa7Var), SaversKt.u(jy7Var.w(), SaversKt.n(li8.c), fa7Var), SaversKt.u(jy7Var.r(), SaversKt.j(l74.c), fa7Var), SaversKt.u(nn0.j(jy7Var.f()), SaversKt.h(aVar), fa7Var), SaversKt.u(jy7Var.u(), SaversKt.m(ph8.b), fa7Var), SaversKt.u(jy7Var.t(), SaversKt.l(jo7.d), fa7Var));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jy7 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            nn0.a aVar = nn0.b;
            ea7 h2 = SaversKt.h(aVar);
            Boolean bool = Boolean.FALSE;
            nn0 nn0Var = (zq3.c(obj2, bool) || obj2 == null) ? null : (nn0) h2.b(obj2);
            zq3.e(nn0Var);
            long B = nn0Var.B();
            Object obj3 = list.get(1);
            dk8.a aVar2 = dk8.b;
            dk8 dk8Var = (zq3.c(obj3, bool) || obj3 == null) ? null : (dk8) SaversKt.p(aVar2).b(obj3);
            zq3.e(dk8Var);
            long k2 = dk8Var.k();
            Object obj4 = list.get(2);
            o oVar = (zq3.c(obj4, bool) || obj4 == null) ? null : (o) SaversKt.r(o.b).b(obj4);
            Object obj5 = list.get(3);
            l lVar = obj5 != null ? (l) obj5 : null;
            Object obj6 = list.get(4);
            m mVar = obj6 != null ? (m) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            dk8 dk8Var2 = (zq3.c(obj8, bool) || obj8 == null) ? null : (dk8) SaversKt.p(aVar2).b(obj8);
            zq3.e(dk8Var2);
            long k3 = dk8Var2.k();
            Object obj9 = list.get(8);
            m60 m60Var = (zq3.c(obj9, bool) || obj9 == null) ? null : (m60) SaversKt.g(m60.b).b(obj9);
            Object obj10 = list.get(9);
            li8 li8Var = (zq3.c(obj10, bool) || obj10 == null) ? null : (li8) SaversKt.n(li8.c).b(obj10);
            Object obj11 = list.get(10);
            l74 l74Var = (zq3.c(obj11, bool) || obj11 == null) ? null : (l74) SaversKt.j(l74.c).b(obj11);
            Object obj12 = list.get(11);
            nn0 nn0Var2 = (zq3.c(obj12, bool) || obj12 == null) ? null : (nn0) SaversKt.h(aVar).b(obj12);
            zq3.e(nn0Var2);
            long B2 = nn0Var2.B();
            Object obj13 = list.get(12);
            ph8 ph8Var = (zq3.c(obj13, bool) || obj13 == null) ? null : (ph8) SaversKt.m(ph8.b).b(obj13);
            Object obj14 = list.get(13);
            return new jy7(B, k2, oVar, lVar, mVar, (androidx.compose.ui.text.font.e) null, str, k3, m60Var, li8Var, l74Var, B2, ph8Var, (zq3.c(obj14, bool) || obj14 == null) ? null : (jo7) SaversKt.l(jo7.d).b(obj14), (f) null, (gv1) null, 49184, (DefaultConstructorMarker) null);
        }
    });
    private static final ea7 h = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, ph8 ph8Var) {
            return Integer.valueOf(ph8Var.e());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ph8 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new ph8(((Integer) obj).intValue());
        }
    });
    private static final ea7 i = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, li8 li8Var) {
            return kotlin.collections.i.h(Float.valueOf(li8Var.b()), Float.valueOf(li8Var.c()));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final li8 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new li8(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    private static final ea7 j = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, ni8 ni8Var) {
            dk8 b2 = dk8.b(ni8Var.b());
            dk8.a aVar = dk8.b;
            return kotlin.collections.i.h(SaversKt.u(b2, SaversKt.p(aVar), fa7Var), SaversKt.u(dk8.b(ni8Var.c()), SaversKt.p(aVar), fa7Var));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ni8 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            dk8.a aVar = dk8.b;
            ea7 p2 = SaversKt.p(aVar);
            Boolean bool = Boolean.FALSE;
            dk8 dk8Var = null;
            dk8 dk8Var2 = (zq3.c(obj2, bool) || obj2 == null) ? null : (dk8) p2.b(obj2);
            zq3.e(dk8Var2);
            long k2 = dk8Var2.k();
            Object obj3 = list.get(1);
            ea7 p3 = SaversKt.p(aVar);
            if (!zq3.c(obj3, bool) && obj3 != null) {
                dk8Var = (dk8) p3.b(obj3);
            }
            zq3.e(dk8Var);
            return new ni8(k2, dk8Var.k(), null);
        }
    });
    private static final ea7 k = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, o oVar) {
            return Integer.valueOf(oVar.p());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new o(((Integer) obj).intValue());
        }
    });
    private static final ea7 l = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        public final Object b(fa7 fa7Var, float f2) {
            return Float.valueOf(f2);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((fa7) obj, ((m60) obj2).h());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m60 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Float");
            return m60.b(m60.c(((Float) obj).floatValue()));
        }
    });
    private static final ea7 m = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        /* JADX WARN: Multi-variable type inference failed */
        public final Object b(fa7 fa7Var, long j2) {
            return kotlin.collections.i.h(SaversKt.t(Integer.valueOf(i.n(j2))), SaversKt.t(Integer.valueOf(i.i(j2))));
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((fa7) obj, ((i) obj2).r());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            zq3.e(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            zq3.e(num2);
            return i.b(pj8.b(intValue, num2.intValue()));
        }
    });
    private static final ea7 n = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, jo7 jo7Var) {
            return kotlin.collections.i.h(SaversKt.u(nn0.j(jo7Var.c()), SaversKt.h(nn0.b), fa7Var), SaversKt.u(fd5.d(jo7Var.d()), SaversKt.k(fd5.b), fa7Var), SaversKt.t(Float.valueOf(jo7Var.b())));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jo7 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ea7 h2 = SaversKt.h(nn0.b);
            Boolean bool = Boolean.FALSE;
            nn0 nn0Var = (zq3.c(obj2, bool) || obj2 == null) ? null : (nn0) h2.b(obj2);
            zq3.e(nn0Var);
            long B = nn0Var.B();
            Object obj3 = list.get(1);
            fd5 fd5Var = (zq3.c(obj3, bool) || obj3 == null) ? null : (fd5) SaversKt.k(fd5.b).b(obj3);
            zq3.e(fd5Var);
            long x = fd5Var.x();
            Object obj4 = list.get(2);
            Float f2 = obj4 != null ? (Float) obj4 : null;
            zq3.e(f2);
            return new jo7(B, x, f2.floatValue(), null);
        }
    });
    private static final ea7 o = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        public final Object b(fa7 fa7Var, long j2) {
            return pv8.a(j2);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((fa7) obj, ((nn0) obj2).B());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final nn0 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.ULong");
            return nn0.j(nn0.o(((pv8) obj).g()));
        }
    });
    private static final ea7 p = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        public final Object b(fa7 fa7Var, long j2) {
            return kotlin.collections.i.h(SaversKt.t(Float.valueOf(dk8.h(j2))), SaversKt.t(fk8.d(dk8.g(j2))));
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((fa7) obj, ((dk8) obj2).k());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final dk8 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f2 = obj2 != null ? (Float) obj2 : null;
            zq3.e(f2);
            float floatValue = f2.floatValue();
            Object obj3 = list.get(1);
            fk8 fk8Var = obj3 != null ? (fk8) obj3 : null;
            zq3.e(fk8Var);
            return dk8.b(ek8.a(floatValue, fk8Var.j()));
        }
    });
    private static final ea7 q = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        /* JADX WARN: Multi-variable type inference failed */
        public final Object b(fa7 fa7Var, long j2) {
            return fd5.l(j2, fd5.b.b()) ? Boolean.FALSE : kotlin.collections.i.h(SaversKt.t(Float.valueOf(fd5.o(j2))), SaversKt.t(Float.valueOf(fd5.p(j2))));
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((fa7) obj, ((fd5) obj2).x());
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final fd5 invoke(Object obj) {
            if (zq3.c(obj, Boolean.FALSE)) {
                return fd5.d(fd5.b.b());
            }
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f2 = obj2 != null ? (Float) obj2 : null;
            zq3.e(f2);
            float floatValue = f2.floatValue();
            Object obj3 = list.get(1);
            Float f3 = obj3 != null ? (Float) obj3 : null;
            zq3.e(f3);
            return fd5.d(hd5.a(floatValue, f3.floatValue()));
        }
    });
    private static final ea7 r = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, l74 l74Var) {
            List f2 = l74Var.f();
            ArrayList arrayList = new ArrayList(f2.size());
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(SaversKt.u((i74) f2.get(i2), SaversKt.i(i74.b), fa7Var));
            }
            return arrayList;
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l74 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                ea7 i3 = SaversKt.i(i74.b);
                i74 i74Var = null;
                if (!zq3.c(obj2, Boolean.FALSE) && obj2 != null) {
                    i74Var = (i74) i3.b(obj2);
                }
                zq3.e(i74Var);
                arrayList.add(i74Var);
            }
            return new l74(arrayList);
        }
    });
    private static final ea7 s = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, i74 i74Var) {
            return i74Var.b();
        }
    }, new ss2() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i74 invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.String");
            return new i74((String) obj);
        }
    });

    public static final ea7 e() {
        return a;
    }

    public static final ea7 f() {
        return f;
    }

    public static final ea7 g(m60.a aVar) {
        return l;
    }

    public static final ea7 h(nn0.a aVar) {
        return o;
    }

    public static final ea7 i(i74.a aVar) {
        return s;
    }

    public static final ea7 j(l74.a aVar) {
        return r;
    }

    public static final ea7 k(fd5.a aVar) {
        return q;
    }

    public static final ea7 l(jo7.a aVar) {
        return n;
    }

    public static final ea7 m(ph8.a aVar) {
        return h;
    }

    public static final ea7 n(li8.a aVar) {
        return i;
    }

    public static final ea7 o(ni8.a aVar) {
        return j;
    }

    public static final ea7 p(dk8.a aVar) {
        return p;
    }

    public static final ea7 q(i.a aVar) {
        return m;
    }

    public static final ea7 r(o.a aVar) {
        return k;
    }

    public static final ea7 s() {
        return g;
    }

    public static final Object t(Object obj) {
        return obj;
    }

    public static final Object u(Object obj, ea7 ea7Var, fa7 fa7Var) {
        Object a2;
        return (obj == null || (a2 = ea7Var.a(fa7Var, obj)) == null) ? Boolean.FALSE : a2;
    }
}
